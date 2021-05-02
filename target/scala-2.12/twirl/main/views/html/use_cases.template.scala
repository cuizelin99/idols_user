
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object use_cases extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[models.auth.User,String,Array[String],Array[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.auth.User, cases: String, json_files: Array[String], head_list: Array[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.94*/("""

"""),_display_(/*3.2*/idols_main("Use Cases", Some(user))/*3.37*/ {_display_(Seq[Any](format.raw/*3.39*/("""

	"""),_display_(/*5.3*/if(user.role == models.auth.Roles.AdminRole)/*5.47*/ {_display_(Seq[Any](format.raw/*5.49*/("""
		"""),format.raw/*6.3*/("""<div class="text"><a href=""""),_display_(/*6.31*/controllers/*6.42*/.routes.HomeController.show_generate_user()),format.raw/*6.85*/("""">Use Case: Generate Random Users</a></div>
		<div class="text"><a href=""""),_display_(/*7.31*/controllers/*7.42*/.routes.HomeController.show_job_management()),format.raw/*7.86*/("""">Use Case: Manage User Jobs</a></div>
		<div class="text"><a href=""""),_display_(/*8.31*/controllers/*8.42*/.routes.HomeController.show_submit_script()),format.raw/*8.85*/("""">Use Case: Submit Scripts</a></div>
	
	""")))}),format.raw/*10.3*/("""
	
	"""),_display_(/*12.3*/for(index <- 0 until head_list.length) yield /*12.41*/ {_display_(Seq[Any](format.raw/*12.43*/("""
	    	"""),format.raw/*13.7*/("""<div class="text" id="usecase"""),_display_(/*13.37*/index),format.raw/*13.42*/(""""><a href=""""),_display_(/*13.54*/controllers/*13.65*/.routes.WorkflowController.showWorkflowDynamically(json_files(index))),format.raw/*13.134*/("""">"""),_display_(/*13.137*/head_list(index)),format.raw/*13.153*/("""</a></div>
	""")))}),format.raw/*14.3*/("""
	
	
	"""),format.raw/*17.2*/("""<div class="text"><a href=""""),_display_(/*17.30*/controllers/*17.41*/.routes.WorkflowController.showWorkflow()),format.raw/*17.82*/("""">Use Case: Set Up Workflow</a></div>


""")))}),format.raw/*20.2*/("""
"""))
      }
    }
  }

  def render(user:models.auth.User,cases:String,json_files:Array[String],head_list:Array[String]): play.twirl.api.HtmlFormat.Appendable = apply(user,cases,json_files,head_list)

  def f:((models.auth.User,String,Array[String],Array[String]) => play.twirl.api.HtmlFormat.Appendable) = (user,cases,json_files,head_list) => apply(user,cases,json_files,head_list)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun May 02 17:13:24 CDT 2021
                  SOURCE: /Users/petercui/workspace/idols/idols_user/app/views/use_cases.scala.html
                  HASH: 238016555634b57037711daa4d309f9f22c42744
                  MATRIX: 778->1|965->93|993->96|1036->131|1075->133|1104->137|1156->181|1195->183|1224->186|1278->214|1297->225|1360->268|1460->342|1479->353|1543->397|1638->466|1657->477|1720->520|1791->561|1822->566|1876->604|1916->606|1950->613|2007->643|2033->648|2072->660|2092->671|2183->740|2214->743|2252->759|2295->772|2328->778|2383->806|2403->817|2465->858|2536->899
                  LINES: 21->1|26->1|28->3|28->3|28->3|30->5|30->5|30->5|31->6|31->6|31->6|31->6|32->7|32->7|32->7|33->8|33->8|33->8|35->10|37->12|37->12|37->12|38->13|38->13|38->13|38->13|38->13|38->13|38->13|38->13|39->14|42->17|42->17|42->17|42->17|45->20
                  -- GENERATED --
              */
          