package models

import scala.collection.mutable.ListBuffer
import play.api.libs.json._
import models.tasks.Task

case class Workflow() {

  var head: String = "" // head of this workflow
  var description: String = "" // description of this workflow
  var tasks = scala.collection.mutable.ArrayBuffer[Task]() // an array of tasks of this workflow
  var jsonString: StringBuffer = new StringBuffer

  /**
   * add a task to this workflow's tasks array
   * @param task: the Task to add
   */
  def add_task(task: Task) {
    tasks.append(task)
  }

  /**
   * get the array of tasks of this workflow
   * @return tasks
   */
  def get_tasks(): scala.collection.mutable.ArrayBuffer[Task] = {
    return tasks
  }

  /**
   * reset all data of current workflow
   */
  def reset() {
    head = ""
    description = ""
    tasks = scala.collection.mutable.ArrayBuffer[Task]()
    jsonString = new StringBuffer
  }

  /**
   * get head variable
   */
  def get_head(): String = {
    return "" + head
  }

  /**
   * export current workflow into a json object
   * @return a JsValue - json object that represents this workflow
   */

  // let individual task export its own json
  def export_JSON(): JsValue = {
    jsonString.append("{ \"head\":\"" + head + "\",")
    jsonString.append("\"description\":\"" + description + "\",")
    jsonString.append("\"tasks\": [")
    // add the array of tasks
    for (task <- tasks) {
      jsonString.append(task.get_json().toString())
      jsonString.append(",")

    }
    if (tasks.length > 0)
      // delete the comma at the end
      jsonString.setLength(jsonString.length() - 1)
    jsonString.append("]}")
    return Json.parse(jsonString.toString())
  }

  def can_generate(json: JsValue): Boolean = {
    return (json \ "head").isInstanceOf[JsDefined] && (json \ "tasks").isInstanceOf[JsDefined]
  }

  /**
   * build current workflow based on json object
   * @param json: the json object used to build
   */
  def import_JSON(json: JsValue, user: models.auth.User) {
    head = (json \ "head").as[String].replace("\"", "")
    description = (json \ "description").as[String].replace("\"", "")
    var index = 0
    // create a new Task until reach the end of array
    while ((json \ "tasks" \ index).isInstanceOf[JsDefined]) {
      var task_type = "models.tasks." + (json \ "tasks" \ index \ "task_type").as[String].replace("\"", "")
      var access_level = if ((json \ "tasks" \ index \ "access_level").as[String].replace("\"", "").equals("Admin")) models.auth.Roles.AdminRole else models.auth.Roles.UserRole
      if ((access_level == models.auth.Roles.AdminRole && user.role == models.auth.Roles.AdminRole) || access_level == models.auth.Roles.UserRole) {
        // build task based on task types
        var task = Class.forName(task_type).getConstructor(classOf[JsValue]).newInstance((json \ "tasks" \ index).get)
        add_task(task.asInstanceOf[Task])
        //        task_type match {
        //          case "fileUpload" => add_task(new UploadTask((json \ "tasks" \ index).get))
        //          case "checkHadoop" => add_task(new checkClusterTask(task_name, task_type))
        //          case "runWordCount" => add_task(new runWordCountTask(task_name, task_type))
        //          case "checkJobStatus" => add_task(new checkHadoopJobStatusTask(task_name, task_type))
        //          case "showResult" => add_task(new showResultTask(task_name, task_type))
        //          case "startZeppelin" => add_task(new startZeppelinTask(task_name, task_type))
        //          case "runMPI" => add_task(new runMPITask(task_name, task_type))
        //        }
      }
      index += 1
    }
  }
}