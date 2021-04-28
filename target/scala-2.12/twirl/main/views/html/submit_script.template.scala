
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

object submit_script extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.auth.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.auth.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.26*/("""

"""),_display_(/*3.2*/idols_main("Run script for users", Some(user))/*3.48*/ {_display_(Seq[Any](format.raw/*3.50*/("""

"""),format.raw/*5.1*/("""<p>
<input type="text" id="path" style="width: 300px">
</p>

<p>
<button id="remote" onClick="runRemote()">Run this script for all users</button>
</p>

	
<script>
function runRemote() """),format.raw/*15.22*/("""{"""),format.raw/*15.23*/("""
 	"""),format.raw/*16.3*/("""var xmlHttp = new XMLHttpRequest();
 	var json = '"""),format.raw/*17.15*/("""{"""),format.raw/*17.16*/(""""action" : "remote", "path" : "' + document.getElementById("path").value + '""""),format.raw/*17.93*/("""}"""),format.raw/*17.94*/("""'
	xmlHttp.onreadystatechange = function() """),format.raw/*18.42*/("""{"""),format.raw/*18.43*/("""
		"""),format.raw/*19.3*/("""if (xmlHttp.readyState == 4 && xmlHttp.status == 200) """),format.raw/*19.57*/("""{"""),format.raw/*19.58*/("""
			"""),format.raw/*20.4*/("""console.log(this.responseText)
		"""),format.raw/*21.3*/("""}"""),format.raw/*21.4*/("""
	"""),format.raw/*22.2*/("""}"""),format.raw/*22.3*/("""
	"""),format.raw/*23.2*/("""xmlHttp.open("POST", "/submit_script", true);
	xmlHttp.send(json);
"""),format.raw/*25.1*/("""}"""),format.raw/*25.2*/("""

"""),format.raw/*27.1*/("""function runRemote() """),format.raw/*27.22*/("""{"""),format.raw/*27.23*/("""
 	"""),format.raw/*28.3*/("""var xmlHttp = new XMLHttpRequest();
 	var json = '"""),format.raw/*29.15*/("""{"""),format.raw/*29.16*/(""""path" : "' + document.getElementById("path").value + '""""),format.raw/*29.72*/("""}"""),format.raw/*29.73*/("""'
	xmlHttp.onreadystatechange = function() """),format.raw/*30.42*/("""{"""),format.raw/*30.43*/("""
		"""),format.raw/*31.3*/("""if (xmlHttp.readyState == 4 && xmlHttp.status == 200) """),format.raw/*31.57*/("""{"""),format.raw/*31.58*/("""
			"""),format.raw/*32.4*/("""console.log(this.responseText)
		"""),format.raw/*33.3*/("""}"""),format.raw/*33.4*/("""
	"""),format.raw/*34.2*/("""}"""),format.raw/*34.3*/("""
	"""),format.raw/*35.2*/("""xmlHttp.open("POST", "/submit_script", true);
	xmlHttp.send(json);
"""),format.raw/*37.1*/("""}"""),format.raw/*37.2*/("""


"""),format.raw/*40.1*/("""</script>
""")))}),format.raw/*41.2*/("""
"""))
      }
    }
  }

  def render(user:models.auth.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.auth.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 28 17:13:04 CDT 2021
                  SOURCE: /Users/petercui/workspace/idols/idols_user/app/views/submit_script.scala.html
                  HASH: 2854bbbf20c72456a4e431069758b9070f05cce2
                  MATRIX: 747->1|866->25|894->28|948->74|987->76|1015->78|1227->262|1256->263|1286->266|1364->316|1393->317|1498->394|1527->395|1598->438|1627->439|1657->442|1739->496|1768->497|1799->501|1859->534|1887->535|1916->537|1944->538|1973->540|2067->607|2095->608|2124->610|2173->631|2202->632|2232->635|2310->685|2339->686|2423->742|2452->743|2523->786|2552->787|2582->790|2664->844|2693->845|2724->849|2784->882|2812->883|2841->885|2869->886|2898->888|2992->955|3020->956|3050->959|3091->970
                  LINES: 21->1|26->1|28->3|28->3|28->3|30->5|40->15|40->15|41->16|42->17|42->17|42->17|42->17|43->18|43->18|44->19|44->19|44->19|45->20|46->21|46->21|47->22|47->22|48->23|50->25|50->25|52->27|52->27|52->27|53->28|54->29|54->29|54->29|54->29|55->30|55->30|56->31|56->31|56->31|57->32|58->33|58->33|59->34|59->34|60->35|62->37|62->37|65->40|66->41
                  -- GENERATED --
              */
          