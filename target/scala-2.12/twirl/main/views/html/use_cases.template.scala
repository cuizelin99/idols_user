
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
	
	
	<div style="border:3px solid;margin-top: 20px;">
		<p style="font-size:24px;margin-left: 16px;"> The following use cases are from public/workflows/saved_workflows </p>
	<div class="text"><a href=""""),_display_(/*19.30*/controllers/*19.41*/.routes.WorkflowController.showWorkflow()),format.raw/*19.82*/("""">Use Case: Set Up Workflow</a></div>
	"""),_display_(/*20.3*/for(index <- 0 until head_list.length) yield /*20.41*/ {_display_(Seq[Any](format.raw/*20.43*/("""
		"""),format.raw/*21.3*/("""<div style="text-align: left;">
	    	<p class="text" id="usecase"""),_display_(/*22.35*/index),format.raw/*22.40*/("""" style="text-align: left;"><a href=""""),_display_(/*22.78*/controllers/*22.89*/.routes.WorkflowController.showWorkflowDynamically(json_files(index))),format.raw/*22.158*/("""">"""),_display_(/*22.161*/head_list(index)),format.raw/*22.177*/("""</a></p>
	    	<button type="button" id="download_workflow"""),_display_(/*23.51*/index),format.raw/*23.56*/("""" style="margin-left: 16px;">Download</button>
	    <button type="button" id="remove_workflow"""),_display_(/*24.48*/index),format.raw/*24.53*/("""">Remove</button>	
	    </div>
	""")))}),format.raw/*26.3*/("""
	"""),format.raw/*27.2*/("""</div>
	
	
	


""")))}),format.raw/*33.2*/("""


"""),format.raw/*36.1*/("""<script>
	"""),_display_(/*37.3*/for(index <- 0 until head_list.length) yield /*37.41*/{_display_(Seq[Any](format.raw/*37.42*/("""
	"""),format.raw/*38.2*/("""document.getElementById("download_workflow"""),_display_(/*38.45*/index),format.raw/*38.50*/("""").onclick = function () """),format.raw/*38.75*/("""{"""),format.raw/*38.76*/("""
		"""),format.raw/*39.3*/("""location.href = "/downloadselectedworkflow/"""),_display_(/*39.47*/json_files(index)),format.raw/*39.64*/("""";
	"""),format.raw/*40.2*/("""}"""),format.raw/*40.3*/(""";
	document.getElementById("remove_workflow"""),_display_(/*41.43*/index),format.raw/*41.48*/("""").onclick = function () """),format.raw/*41.73*/("""{"""),format.raw/*41.74*/("""
		"""),format.raw/*42.3*/("""location.href = "/removeworkflow/"""),_display_(/*42.37*/json_files(index)),format.raw/*42.54*/("""";
	"""),format.raw/*43.2*/("""}"""),format.raw/*43.3*/(""";
	""")))}),format.raw/*44.3*/("""
"""),format.raw/*45.1*/("""</script>"""))
      }
    }
  }

  def render(user:models.auth.User,cases:String,json_files:Array[String],head_list:Array[String]): play.twirl.api.HtmlFormat.Appendable = apply(user,cases,json_files,head_list)

  def f:((models.auth.User,String,Array[String],Array[String]) => play.twirl.api.HtmlFormat.Appendable) = (user,cases,json_files,head_list) => apply(user,cases,json_files,head_list)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue May 04 15:39:52 CDT 2021
                  SOURCE: /Users/petercui/workspace/idols/idols_user/app/views/use_cases.scala.html
                  HASH: 24f7e48d16051b21e8e90426e0082d5ef84088c9
                  MATRIX: 778->1|965->93|993->96|1036->131|1075->133|1105->137|1183->190|1235->234|1274->236|1303->239|1427->337|1446->348|1509->391|1610->465|1630->476|1695->520|1791->589|1811->600|1875->643|1946->684|1975->686|2211->895|2231->906|2293->947|2359->987|2413->1025|2453->1027|2483->1030|2576->1096|2602->1101|2667->1139|2687->1150|2778->1219|2809->1222|2847->1238|2933->1297|2959->1302|3080->1396|3106->1401|3169->1434|3198->1436|3244->1452|3274->1455|3311->1466|3365->1504|3404->1505|3433->1507|3503->1550|3529->1555|3582->1580|3611->1581|3641->1584|3712->1628|3750->1645|3781->1649|3809->1650|3880->1694|3906->1699|3959->1724|3988->1725|4018->1728|4079->1762|4117->1779|4148->1783|4176->1784|4210->1788|4238->1789
                  LINES: 21->1|26->1|28->3|28->3|28->3|30->5|32->7|32->7|32->7|33->8|34->9|34->9|34->9|35->10|35->10|35->10|36->11|36->11|36->11|38->13|39->14|44->19|44->19|44->19|45->20|45->20|45->20|46->21|47->22|47->22|47->22|47->22|47->22|47->22|47->22|48->23|48->23|49->24|49->24|51->26|52->27|58->33|61->36|62->37|62->37|62->37|63->38|63->38|63->38|63->38|63->38|64->39|64->39|64->39|65->40|65->40|66->41|66->41|66->41|66->41|67->42|67->42|67->42|68->43|68->43|69->44|70->45
                  -- GENERATED --
              */
          