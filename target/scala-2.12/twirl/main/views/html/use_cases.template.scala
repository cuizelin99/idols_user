
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
	
	"""),format.raw/*5.2*/("""<div style="border:3px solid;margin-top: 20px;">
	
	"""),_display_(/*7.3*/if(user.role == models.auth.Roles.AdminRole)/*7.47*/ {_display_(Seq[Any](format.raw/*7.49*/("""
		"""),format.raw/*8.3*/("""<p style="font-size:24px;margin-left: 16px;"> Admin Use Cases: </p>
		<div class="text"><a href=""""),_display_(/*9.31*/controllers/*9.42*/.routes.HomeController.show_generate_user()),format.raw/*9.85*/("""">Use Case: Generate Random Users</a></div>
		<div class="text"><a href=""""),_display_(/*10.31*/controllers/*10.42*/.routes.HomeController.show_job_management()),format.raw/*10.86*/("""">Use Case: Manage User Jobs</a></div>
		<div class="text"><a href=""""),_display_(/*11.31*/controllers/*11.42*/.routes.HomeController.show_submit_script()),format.raw/*11.85*/("""">Use Case: Submit Scripts</a></div>
	
	""")))}),format.raw/*13.3*/("""
	"""),format.raw/*14.2*/("""</div>
	
	<div class="text" border:3px solid;margin-top: 20px;"><a href=""""),_display_(/*16.66*/controllers/*16.77*/.routes.WorkflowController.showWorkflow()),format.raw/*16.118*/("""">Use Case: Set Up Workflow</a></div>
	
	<div style="border:3px solid;margin-top: 20px;">
		<p style="font-size:24px;margin-left: 16px;"> The following use cases are from public/workflows/saved_workflows </p>
	
	"""),_display_(/*21.3*/for(index <- 0 until head_list.length) yield /*21.41*/ {_display_(Seq[Any](format.raw/*21.43*/("""
		"""),format.raw/*22.3*/("""<div style="text-align: left;">
	    	<p class="text" id="usecase"""),_display_(/*23.35*/index),format.raw/*23.40*/("""" style="text-align: left;"><a href=""""),_display_(/*23.78*/controllers/*23.89*/.routes.WorkflowController.showWorkflowDynamically(json_files(index))),format.raw/*23.158*/("""">"""),_display_(/*23.161*/head_list(index)),format.raw/*23.177*/("""</a></p>
	    	<button type="button" id="download_workflow"""),_display_(/*24.51*/index),format.raw/*24.56*/("""" style="margin-left: 16px;">Download</button>
	    <button type="button" id="remove_workflow"""),_display_(/*25.48*/index),format.raw/*25.53*/("""">Remove</button>	
	    </div>
	""")))}),format.raw/*27.3*/("""
	"""),format.raw/*28.2*/("""</div>
	
	
	


""")))}),format.raw/*34.2*/("""


"""),format.raw/*37.1*/("""<script>
	"""),_display_(/*38.3*/for(index <- 0 until head_list.length) yield /*38.41*/{_display_(Seq[Any](format.raw/*38.42*/("""
	"""),format.raw/*39.2*/("""document.getElementById("download_workflow"""),_display_(/*39.45*/index),format.raw/*39.50*/("""").onclick = function () """),format.raw/*39.75*/("""{"""),format.raw/*39.76*/("""
		"""),format.raw/*40.3*/("""location.href = "/downloadselectedworkflow/"""),_display_(/*40.47*/json_files(index)),format.raw/*40.64*/("""";
	"""),format.raw/*41.2*/("""}"""),format.raw/*41.3*/(""";
	document.getElementById("remove_workflow"""),_display_(/*42.43*/index),format.raw/*42.48*/("""").onclick = function () """),format.raw/*42.73*/("""{"""),format.raw/*42.74*/("""
		"""),format.raw/*43.3*/("""location.href = "/removeworkflow/"""),_display_(/*43.37*/json_files(index)),format.raw/*43.54*/("""";
	"""),format.raw/*44.2*/("""}"""),format.raw/*44.3*/(""";
	""")))}),format.raw/*45.3*/("""
"""),format.raw/*46.1*/("""</script>"""))
      }
    }
  }

  def render(user:models.auth.User,cases:String,json_files:Array[String],head_list:Array[String]): play.twirl.api.HtmlFormat.Appendable = apply(user,cases,json_files,head_list)

  def f:((models.auth.User,String,Array[String],Array[String]) => play.twirl.api.HtmlFormat.Appendable) = (user,cases,json_files,head_list) => apply(user,cases,json_files,head_list)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 12 15:52:45 CDT 2021
                  SOURCE: /Users/petercui/workspace/idols/idols_user/app/views/use_cases.scala.html
                  HASH: 74838326634c0cc32f5e6d97711720c00a37da8a
                  MATRIX: 778->1|965->93|993->96|1036->131|1075->133|1105->137|1183->190|1235->234|1274->236|1303->239|1427->337|1446->348|1509->391|1610->465|1630->476|1695->520|1791->589|1811->600|1875->643|1946->684|1975->686|2076->760|2096->771|2159->812|2398->1025|2452->1063|2492->1065|2522->1068|2615->1134|2641->1139|2706->1177|2726->1188|2817->1257|2848->1260|2886->1276|2972->1335|2998->1340|3119->1434|3145->1439|3208->1472|3237->1474|3283->1490|3313->1493|3350->1504|3404->1542|3443->1543|3472->1545|3542->1588|3568->1593|3621->1618|3650->1619|3680->1622|3751->1666|3789->1683|3820->1687|3848->1688|3919->1732|3945->1737|3998->1762|4027->1763|4057->1766|4118->1800|4156->1817|4187->1821|4215->1822|4249->1826|4277->1827
                  LINES: 21->1|26->1|28->3|28->3|28->3|30->5|32->7|32->7|32->7|33->8|34->9|34->9|34->9|35->10|35->10|35->10|36->11|36->11|36->11|38->13|39->14|41->16|41->16|41->16|46->21|46->21|46->21|47->22|48->23|48->23|48->23|48->23|48->23|48->23|48->23|49->24|49->24|50->25|50->25|52->27|53->28|59->34|62->37|63->38|63->38|63->38|64->39|64->39|64->39|64->39|64->39|65->40|65->40|65->40|66->41|66->41|67->42|67->42|67->42|67->42|68->43|68->43|68->43|69->44|69->44|70->45|71->46
                  -- GENERATED --
              */
          