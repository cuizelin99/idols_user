
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

object contact extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/idols_main("Contact Us")/*1.26*/ {_display_(Seq[Any](format.raw/*1.28*/("""
"""),format.raw/*2.1*/("""<div class="text" style="color: #1b9993;">
	<p>We'd love to hear from you.</p> 
	<p>To provide feedback, please fill in the following form.</p> 
	
	"""),_display_(/*6.3*/helper/*6.9*/.form(action = controllers.routes.HomeController.send_feedback(), 'id -> "contact_form")/*6.97*/ {_display_(Seq[Any](format.raw/*6.99*/("""
		"""),format.raw/*7.3*/("""<p>
		<input type="text" name="name" placeholder="Your Name" style="width: 300px">
		</p>
		<p>
		<input type="text" name="email" placeholder="Your Email Address" style="width: 300px">
		</p>
		<p>
		<input type="text" name="feedback" placeholder="Feedback" style="width: 300px; height: 200px">
		</p>
		<p>
		<button type="submit">Send Feedback</button> 
		</p>
		</div>
		<p><div class="text" id="status" style="color: #1b9993;"></div></p> 
		
		<script>
		 $('#contact_form')
		    .ajaxForm("""),format.raw/*24.17*/("""{"""),format.raw/*24.18*/("""
		        """),format.raw/*25.11*/("""url : '"""),_display_(/*25.19*/controllers/*25.30*/.routes.HomeController.send_feedback()),format.raw/*25.68*/("""', 
		        success : function (response) """),format.raw/*26.41*/("""{"""),format.raw/*26.42*/("""
					"""),format.raw/*27.6*/("""document.getElementById("status").innerHTML = "We have received your feedback, thank you for your support!";
		        """),format.raw/*28.11*/("""}"""),format.raw/*28.12*/(""",
		        error : function (xhr, status, error) """),format.raw/*29.49*/("""{"""),format.raw/*29.50*/("""
					"""),format.raw/*30.6*/("""document.getElementById("status").innerHTML = "Unable to send feedback";
		        """),format.raw/*31.11*/("""}"""),format.raw/*31.12*/(""",

		    """),format.raw/*33.7*/("""}"""),format.raw/*33.8*/(""");
		 
		var xmlHttp = new XMLHttpRequest();
		xmlHttp.onreadystatechange = function() """),format.raw/*36.43*/("""{"""),format.raw/*36.44*/("""
			"""),format.raw/*37.4*/("""if (xmlHttp.readyState == 4 && xmlHttp.status == 200) """),format.raw/*37.58*/("""{"""),format.raw/*37.59*/("""
				"""),format.raw/*38.5*/("""document.getElementById("status").innerHTML = "We have received your feedback, thank you for your support!";
			"""),format.raw/*39.4*/("""}"""),format.raw/*39.5*/("""
		"""),format.raw/*40.3*/("""}"""),format.raw/*40.4*/("""
		"""),format.raw/*41.3*/("""xmlHttp.open("POST", "/contact", true);
		xmlHttp.send();
		</script>
	""")))}),format.raw/*44.3*/("""
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 28 17:13:04 CDT 2021
                  SOURCE: /Users/petercui/workspace/idols/idols_user/app/views/contact.scala.html
                  HASH: ec2dbed8c5f990522e67a25fd1f1a50ac3bfe7eb
                  MATRIX: 813->1|845->25|884->27|911->28|1085->177|1098->183|1194->271|1233->273|1262->276|1785->771|1814->772|1853->783|1888->791|1908->802|1967->840|2039->884|2068->885|2101->891|2248->1010|2277->1011|2355->1061|2384->1062|2417->1068|2528->1151|2557->1152|2593->1161|2621->1162|2736->1249|2765->1250|2796->1254|2878->1308|2907->1309|2939->1314|3078->1426|3106->1427|3136->1430|3164->1431|3194->1434|3296->1506
                  LINES: 26->1|26->1|26->1|27->2|31->6|31->6|31->6|31->6|32->7|49->24|49->24|50->25|50->25|50->25|50->25|51->26|51->26|52->27|53->28|53->28|54->29|54->29|55->30|56->31|56->31|58->33|58->33|61->36|61->36|62->37|62->37|62->37|63->38|64->39|64->39|65->40|65->40|66->41|69->44
                  -- GENERATED --
              */
          