package models.tasks
import play.api.mvc._
import sys.process._
import models.tasks.helperFunctions._
import scala.collection.Seq
import play.api.libs.json._
import play.api.data._
import play.api.i18n._
import java.nio.file.Paths
import java.io.File
import scala.io.Source
import play.api.libs.Files

import javax.inject.Inject

class showJSONTask @Inject() (json: JsValue) extends Task(json) {
  //  var file : File
  //  var target : String
  //

  val output_path = (json \ "file_path").as[String].replace("\"", "")

  //  if (!(json \ "show_type").asOpt[String].isEmpty) {
  //    show_type = (json \ "file_type").as[String].replace("\"", "")
  //  }

  def run(body: AnyContent, session: Int): String = {
    showOutput(body)
  }

  //  def getVideo(path: String, name: String) = Action {
  //    println("get file: " + name + " at Path: " + path)
  //    Ok.sendFile(new File(path + name.replace("%20", " ")))
  //  }

  /**
   * check Cluster info, node list, etc.
   */
  def showOutput(body: AnyContent): String = {
    var feedback = ""

    val userInput = body.asFormUrlEncoded

    val output_path_json_input = userInput.get("output_path")(0)

    //    if ((json \ "show_type").asOpt[String].isEmpty) {
    //      show_type = userInput.get("action")(0)
    //    }

    // interpret ~/, $USER, $HOME, $WORK
    val output_path_json = Process(Seq("bash", "-c", "echo " + output_path_json_input)).!!.split("\n")(0).replace(" ", "\\ ")
    println(output_path_json)

    //When the target of showResultTask is a JSON file
    if (new java.io.File(output_path_json).exists) {
      if (new java.io.File(output_path_json).isFile()) {
        var json_result = ""
        val jsonString = Source.fromFile(output_path_json).getLines.mkString
        //val resultString = jsonString.substring(jsonString.indexOf('[') + 1, jsonString.lastIndexOf(']'))
        feedback = "JSON_show:" + jsonString

        //print out feedback
        //println("FEEDBACK:: " + feedback)
      }
      if (new java.io.File(output_path_json).isDirectory()) {
        feedback = "Failed: It is a directory. "
      }

    } else {
      feedback = "Failed: Path does not exist. "
    }

    feedback

  }

}