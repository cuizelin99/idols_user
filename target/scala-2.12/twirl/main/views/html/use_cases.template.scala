
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

object use_cases extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.auth.User,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.auth.User, cases: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.41*/("""

"""),_display_(/*3.2*/idols_main("Use Cases", Some(user))/*3.37*/ {_display_(Seq[Any](format.raw/*3.39*/("""

	"""),_display_(/*5.3*/if(user.role == models.auth.Roles.AdminRole)/*5.47*/ {_display_(Seq[Any](format.raw/*5.49*/("""
		"""),format.raw/*6.3*/("""<div class="text"><a href=""""),_display_(/*6.31*/controllers/*6.42*/.routes.HomeController.show_generate_user()),format.raw/*6.85*/("""">Use Case: Generate Random Users</a></div>
		<div class="text"><a href=""""),_display_(/*7.31*/controllers/*7.42*/.routes.HomeController.show_job_management()),format.raw/*7.86*/("""">Use Case: Manage User Jobs</a></div>
		<div class="text"><a href=""""),_display_(/*8.31*/controllers/*8.42*/.routes.HomeController.show_submit_script()),format.raw/*8.85*/("""">Use Case: Submit Scripts</a></div>
	
	""")))}),format.raw/*10.3*/("""
	
	
	"""),format.raw/*13.2*/("""<div class="text"><a href=""""),_display_(/*13.30*/controllers/*13.41*/.routes.WorkflowController.showWorkflow()),format.raw/*13.82*/("""">Use Case: Set Up Workflow</a></div>


""")))}),format.raw/*16.2*/("""
"""))
      }
    }
  }

  def render(user:models.auth.User,cases:String): play.twirl.api.HtmlFormat.Appendable = apply(user,cases)

  def f:((models.auth.User,String) => play.twirl.api.HtmlFormat.Appendable) = (user,cases) => apply(user,cases)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 28 17:13:04 CDT 2021
                  SOURCE: /Users/petercui/workspace/idols/idols_user/app/views/use_cases.scala.html
                  HASH: 19b5fd5fa0419232b21262f6086232214b9d99f6
                  MATRIX: 750->1|884->40|912->43|955->78|994->80|1023->84|1075->128|1114->130|1143->133|1197->161|1216->172|1279->215|1379->289|1398->300|1462->344|1557->413|1576->424|1639->467|1710->508|1743->514|1798->542|1818->553|1880->594|1951->635
                  LINES: 21->1|26->1|28->3|28->3|28->3|30->5|30->5|30->5|31->6|31->6|31->6|31->6|32->7|32->7|32->7|33->8|33->8|33->8|35->10|38->13|38->13|38->13|38->13|41->16
                  -- GENERATED --
              */
          