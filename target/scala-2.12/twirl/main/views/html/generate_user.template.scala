
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

object generate_user extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.auth.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.auth.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.26*/("""

"""),_display_(/*3.2*/idols_main("Generate Random Users", Some(user))/*3.49*/ {_display_(Seq[Any](format.raw/*3.51*/("""

"""),format.raw/*5.1*/("""<h2>Generate Random Users</h2>

"""),_display_(/*7.2*/helper/*7.8*/.form(action = controllers.routes.HomeController.generate_user(), 'enctype -> "multipart/form-data")/*7.108*/ {_display_(Seq[Any](format.raw/*7.110*/("""

	"""),format.raw/*9.2*/("""<p>
		<div class="indivsteps">
	    <input type="number" id="num" name="num"> Enter number of random users to generate
	    </div>
	    </p>
	    <p>
	    		<button type="submit">Generate</button>
	  </p>
	 
	""")))}),format.raw/*18.3*/("""
""")))}),format.raw/*19.2*/("""
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
                  DATE: Wed Apr 28 17:13:03 CDT 2021
                  SOURCE: /Users/petercui/workspace/idols/idols_user/app/views/generate_user.scala.html
                  HASH: 4ae7c89d676af2bbff26465372b7c3e9c9b3a13b
                  MATRIX: 747->1|866->25|894->28|949->75|988->77|1016->79|1074->112|1087->118|1196->218|1236->220|1265->223|1505->433|1537->435
                  LINES: 21->1|26->1|28->3|28->3|28->3|30->5|32->7|32->7|32->7|32->7|34->9|43->18|44->19
                  -- GENERATED --
              */
          