package controllers

import play.api.libs.Files
import javax.inject._
import play.api._
import play.api.mvc._

import java.io._
import java.nio.file._

import scala.io.Source
import models.tasks.Task

import models.Workflow
import models.DirectoryStructure

import play.api.libs.json._

import java.util.ArrayList
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

import com.mohiva.play.silhouette.api.actions.SecuredRequest
import com.mohiva.play.silhouette.api.actions.UserAwareRequest
import com.mohiva.play.silhouette.api.{ LogoutEvent, Silhouette }
import org.webjars.play.WebJarsUtil
import play.api.i18n.I18nSupport
import play.api.mvc.{ AbstractController, AnyContent, ControllerComponents }
import utils.auth.DefaultEnv
import scala.concurrent.{ ExecutionContext, Future }
import ExecutionContext.Implicits.global

import scala.sys.process._
import play.api.routing._

@Singleton
class WorkflowController @Inject() (
  components: ControllerComponents,
  silhouette: Silhouette[DefaultEnv], configuration: play.api.Configuration)(
  implicit
  webJarsUtil: WebJarsUtil,
  assets: AssetsFinder) extends AbstractController(components) with I18nSupport {

  var tasks = scala.collection.mutable.ArrayBuffer[Task]() // an ArrayList of Tasks
  var directories = new ArrayList[DirectoryStructure]() // an ArrayList of Directory Structures
  var workflow = new Workflow() // one workflow per user
  var workflow_json = configuration.underlying.getString("script.workflow.json")

  var new_workflow = new Workflow()
  var temp_workflow = new Workflow()
  val working_directory = Paths.get(configuration.underlying.getString("working.directory"))

  var audio_directory = "/home/idols/resources/audio_data/all_three_transcribed";

  /**
   * Sample Workflows
   */

  /**
   * An Action to render the Workflow page.
   */
  def showWorkflow() = silhouette.SecuredAction.async { implicit request: SecuredRequest[DefaultEnv, AnyContent] =>
    generate_workflow(workflow_json, request.identity)
    Future.successful(Ok(views.html.workflow.workflow(request.identity, workflow.head, tasks.toArray)))
  }

  def getAudio(name: String) = Action {
    println("get file: " + name + " at Path: " + audio_directory)
    Ok.sendFile(new File(audio_directory + name.replace("%20", " ")))
  }

  /**
   * Generate a workflow based on information retrieved from workflow_json file
   * @param workflow_json: the json file containing workflow information
   */
  def generate_workflow(workflow_json: String, user: models.auth.User) {
    // Verifies that this workflow can be generated
    var success = true
    try {
      new_workflow.reset()
      new_workflow.import_JSON(Json.parse(Source.fromFile(workflow_json).getLines().mkString), user)
    } catch {
      case e: Exception => {
        success = false
        e.printStackTrace()
        println("EXCEPTION!!!!")
      }
    }

    if (success) {
      // reset all data in current workflow
      workflow.reset()
      // update workflow based on the json object
      workflow.import_JSON(Json.parse(Source.fromFile(workflow_json).getLines().mkString), user)
    }

    // build task based on current workflow
    buildTasks()
  }

  /**
   * Build tasks
   * Create a new task with name and type
   * Add the task to task ArrayList
   */

  def buildTasks() {
    // update tasks
    tasks = workflow.get_tasks()
  }

  /**
   * An Action to render the Workflow page.
   * @param path: the path to the json file whose workflow is to be shown
   */
  def showWorkflowDynamically(path: String) = silhouette.SecuredAction.async { implicit request: SecuredRequest[DefaultEnv, AnyContent] =>
    generate_workflow(path, request.identity)
    Future.successful(Ok(views.html.workflow.workflow(request.identity, workflow.head, tasks.toArray)))
  }

  /**
   * Save current workflow as a json file in public directory
   */
  def save_workflow() = silhouette.SecuredAction.async {
    println(Json.prettyPrint(workflow.export_JSON()))
    println(os.pwd)
    val head = workflow.get_head()
    println(head)
    val destFile = head.replaceAll("\\s", "") + ".json"
    println(destFile)
    os.write(os.pwd / "public" / "workflows" / "saved_workflows" / destFile, Json.prettyPrint(workflow.export_JSON()))
    Future.successful(Ok(Json.prettyPrint(workflow.export_JSON())))
  }

  /**
   * Download current workflow as a json file
   */
  def download_workflow() = silhouette.SecuredAction.async {
    println(Json.prettyPrint(workflow.export_JSON()))
    Future.successful(Ok(Json.prettyPrint(workflow.export_JSON())))
  }

  /**
   * Download selected workflow as a json file
   * @param fileName: the path to the workflow json file to be downloaded
   */
  def download_selected_workflow(fileName: String) = silhouette.SecuredAction.async { implicit request: SecuredRequest[DefaultEnv, AnyContent] =>
    workflow.reset()
    workflow.import_JSON(Json.parse(Source.fromFile(fileName).getLines().mkString), request.identity)
    println(Json.prettyPrint(workflow.export_JSON()))
    Future.successful(Ok(Json.prettyPrint(workflow.export_JSON())))
  }

  /**
   * Remove selected workflow as a json file
   * @param fileName: the path to the workflow json file to be removed
   */
  def remove_selected_workflow(fileName: String) = silhouette.SecuredAction.async { implicit request: SecuredRequest[DefaultEnv, AnyContent] =>
    if (os.exists(os.Path(fileName)))
      os.remove(os.Path(fileName))
    val cases = Source.fromFile(configuration.underlying.getString("use.cases")).getLines().mkString
    val workflow_files = os.list(os.pwd / "public" / "workflows" / "saved_workflows")
    val json_files = scala.collection.mutable.ArrayBuffer.empty[String]
    for (file <- workflow_files)
      if (file.toString().endsWith(".json")) {
        json_files += file.toString()
        println(file)
      }
    val head_list = scala.collection.mutable.ArrayBuffer.empty[String]
    for (json_file <- json_files) {
      temp_workflow.reset()
      temp_workflow.import_JSON(Json.parse(Source.fromFile(json_file).getLines().mkString), request.identity)
      head_list += "Use Case: " + temp_workflow.get_head()
    }
    Future.successful(Ok(views.html.use_cases(request.identity, cases, json_files.toArray, head_list.toArray)))
  }

  /**
   * Generate directory tree - create a new tree when none of the existing
   * tree matches the one we want
   * @param rootPath:  path to the root of the directory tree
   * @return the String representation of the directory tree as JsValue
   */
  def generateTree(rootPath: String) = silhouette.SecuredAction.async {
    val root = Paths.get(rootPath)
    if (!root.isAbsolute()) {
      Future.successful(BadRequest("Error: Root path must be absolute"))
    } else {
      //      if (!root.startsWith(working_directory)) {
      //        Future.successful(BadRequest("Error: No permission to access this directory"))
      //      } else {

      var result: DirectoryStructure = null
      if (directories.size() == 0) {
        // No dirTree saved yet, create the tree and save it
        result = new DirectoryStructure(rootPath)
        directories.add(result)
      } else {

        // loop through existing directory trees to search for one with the same root
        for (index <- 0 until directories.size()) {
          var dirTree = directories.get(index)
          if (rootPath.equals(dirTree.root.name))
            result = dirTree
        }
        if (result == null) {
          // None of directory trees starts with this root path, create a new one
          result = new DirectoryStructure(rootPath)
          directories.add(result)
        }
      }
      println("GenerateTree JsValue:: " + result.getJsValue());
      Future.successful(Ok(result.getJsValue()))
      //}
    }
  }

  /**
   * Refresh directory tree from given JSON file
   * @param rootPath: the path of the JSON file which can be expressed as a directory
   */
  def refreshTree(rootPath: String) = silhouette.SecuredAction.async {
    val root = Paths.get(rootPath)
    if (!root.isAbsolute()) {
      Future.successful(BadRequest("Error: Root path must be absolute"))
    } else {
      //      if (!root.startsWith(working_directory)) {
      //        Future.successful(BadRequest("Error: No permission to access this directory"))
      //      } else {

      var result: DirectoryStructure = null
      if (directories.size() == 0) {
        // No dirTree saved yet, create the tree and save it
        result = new DirectoryStructure(rootPath)
        directories.add(result)
      } else {

        // loop through existing directory trees to search for one with the same root
        for (index <- 0 until directories.size()) {
          var dirTree = directories.get(index)
          if (rootPath.equals(dirTree.root.name)) {
            dirTree = new DirectoryStructure(rootPath)
            result = dirTree
          }
        }
        if (result == null) {
          // None of directory trees starts with this root path, create a new one
          result = new DirectoryStructure(rootPath)
          directories.add(result)
        }
      }
      println("GenerateTree JsValue:: " + result.getJsValue());
      Future.successful(Ok(result.getJsValue()))
      //}
    }
  }

  /**
   * Generate directory tree from given JSON file
   * @param rootPath: the path of the JSON file which can be expressed as a directory
   */
  def generateTreeFromJSON(rootPath: String) = silhouette.SecuredAction.async {
    var tree_json = Source.fromFile(rootPath).getLines().mkString
    println("GenerateTree Js String:: " + tree_json);
    val tree_js: JsValue = Json.parse(tree_json)
    println("GenerateTree JsValue:: " + tree_js);
    Future.successful(Ok(tree_js))
  }

  /**
   * Download the file given by path
   * @param path: the path of the file to be downloaded
   */
  def downloadFile(path: String) = silhouette.SecuredAction.async {
    Future.successful(Ok.sendFile(new java.io.File(path)))
  }

  /**
   * Run the task
   * @param index: the index of the task in our array of tasks
   * @return the feed back from running the task
   */
  def runTask(index: Integer) = silhouette.SecuredAction.async { implicit request: SecuredRequest[DefaultEnv, AnyContent] =>
    //def runTask(index: Integer) = silhouette.SecuredAction.async { implicit request: SecuredRequest[DefaultEnv, AnyContent] =>
    val body = request.body
    val session = request.session.hashCode()

    if (index == -1) {
      // task: create new workflow with uploaded workflow file
      println(body.asMultipartFormData.get.file("new_workflow"))
      body.asMultipartFormData.get.file("new_workflow").map { new_workflow =>
        workflow_json = new_workflow.ref.getAbsolutePath
        Future.successful(Redirect(routes.WorkflowController.showWorkflow()))
        //Future.successful(Redirect(routes.WorkflowController.showWorkflow()))
      }.getOrElse {
        Future.successful(BadRequest("Something Went Wrong :("))
        //Future.successful(BadRequest("Something Went Wrong :("))
      }
    } else {
      //      val credential = utils.AccountAllocator.accountMapping(request.identity.username)
      val task = tasks(index)
      var feedback: String = ""

      feedback = task.run(body, session)

      if (feedback.substring(0, 6) == "Failed") {
        println("Failed")
        println(feedback)
        Future.successful(BadRequest(feedback))
      } else {
        println("Successful")
        println(feedback)
        Future.successful(Ok(feedback))
      }
      //      //feedback.substring(0, 6) match { case "Failed" => Future.successful(BadRequest(feedback)); case _ => Future.successful(Ok(feedback)) }
    }

  }
  /**
   * Show the description of a task on webpage
   * @param index: the index of the task in our array of tasks
   */
  def getTaskDescription(index: Integer) = silhouette.SecuredAction.async {
    val task = tasks(index)
    Future.successful(Ok(task.get_description()))
  }

  var submitted = false
  
  /**
   * Submit the newly edited JSON file to the VM
   */
  def submit_JSON() = silhouette.SecuredAction.async { implicit request: SecuredRequest[DefaultEnv, AnyContent] =>
    if (submitted) {
      Future.successful(Ok("Already submitted, please wait for it to finish"))
    }

    submitted = true
    val input = request.body.asText.get
    println("INPUT:: " + input)
    val path = input.substring(0, input.indexOf("["))
    val json_string = input.substring(input.indexOf("["))

    var new_file_name = path.reverse.replaceFirst("/", "edit_".reverse + "/").reverse
    var timestamp = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH:mm").format(LocalDateTime.now)
    new_file_name = new_file_name.replaceFirst("edit", timestamp)
    println(new_file_name)
    val file = new File(new_file_name)
    val bw = new BufferedWriter(new FileWriter(file))
    bw.write(json_string)
    bw.close()

    submitted = false
    Future.successful(Ok("Finished submission"))
  }

  //  def runAllTask() = {
  //    tasks.foreach(t => t.run())
  //  }

  //  def configureTask(t : Task, map : Map[String, Any]) ={
  //    t.configure(map)
  //  }

  //def buildTasksFromConfiguraiton(configfilename: String)={}

}