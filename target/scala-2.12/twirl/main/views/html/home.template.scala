
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
/*1.2*/import play.api.i18n.Messages
/*2.2*/import play.api.mvc.RequestHeader
/*3.2*/import org.webjars.play.WebJarsUtil
/*4.2*/import controllers.AssetsFinder

object home extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[models.auth.User,RequestHeader,Messages,WebJarsUtil,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(user: models.auth.User)(implicit request: RequestHeader, messages: Messages, webJarsUtil: WebJarsUtil, assets: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.127*/("""

"""),_display_(/*8.2*/main(messages("home.title"), Some(user))/*8.42*/ {_display_(Seq[Any](format.raw/*8.44*/("""
    """),format.raw/*9.5*/("""<div class="user col-md-6 col-md-offset-3">
        <div class="row">
            <hr class="col-md-12" />
            <h4 class="col-md-8">"""),_display_(/*12.35*/messages("welcome.signed.in")),format.raw/*12.64*/("""</h4>
            <div class="col-md-4 text-right">
                <img src=""""),_display_(/*14.28*/user/*14.32*/.avatarURL.getOrElse(assets.path("images/silhouette.png"))),format.raw/*14.90*/("""" height="40px" />
            </div>
            <hr class="col-md-12" />
        </div>
        <div class="row data">
            <div class="col-md-12">
                <div class="row">
                    <p class="col-md-6"><strong>"""),_display_(/*21.50*/messages("first.name")),format.raw/*21.72*/(""":</strong></p><p class="col-md-6">"""),_display_(/*21.107*/user/*21.111*/.firstName.getOrElse("None")),format.raw/*21.139*/("""</p>
                </div>
                <div class="row">
                    <p class="col-md-6"><strong>"""),_display_(/*24.50*/messages("last.name")),format.raw/*24.71*/(""":</strong></p><p class="col-md-6">"""),_display_(/*24.106*/user/*24.110*/.lastName.getOrElse("None")),format.raw/*24.137*/("""</p>
                </div>
                <div class="row">
                    <p class="col-md-6"><strong>"""),_display_(/*27.50*/messages("full.name")),format.raw/*27.71*/(""":</strong></p><p class="col-md-6">"""),_display_(/*27.106*/user/*27.110*/.fullName.getOrElse("None")),format.raw/*27.137*/("""</p>
                </div>
                <div class="row">
                    <p class="col-md-6"><strong>"""),_display_(/*30.50*/messages("Username/Email")),format.raw/*30.76*/(""":</strong></p><p class="col-md-6">"""),_display_(/*30.111*/user/*30.115*/.username.getOrElse("None")),format.raw/*30.142*/("""</p>
                </div>
            </div>
        </div>
    </div>
""")))}),format.raw/*35.2*/("""
"""))
      }
    }
  }

  def render(user:models.auth.User,request:RequestHeader,messages:Messages,webJarsUtil:WebJarsUtil,assets:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(user)(request,messages,webJarsUtil,assets)

  def f:((models.auth.User) => (RequestHeader,Messages,WebJarsUtil,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (user) => (request,messages,webJarsUtil,assets) => apply(user)(request,messages,webJarsUtil,assets)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 28 17:13:04 CDT 2021
                  SOURCE: /Users/petercui/workspace/idols/idols_user/app/views/home.scala.html
                  HASH: c8084bf346ad3310c867472ec8594381d627a9d2
                  MATRIX: 432->1|469->32|510->67|553->104|946->138|1167->263|1195->266|1243->306|1282->308|1313->313|1481->454|1531->483|1637->562|1650->566|1729->624|1996->864|2039->886|2102->921|2116->925|2166->953|2304->1064|2346->1085|2409->1120|2423->1124|2472->1151|2610->1262|2652->1283|2715->1318|2729->1322|2778->1349|2916->1460|2963->1486|3026->1521|3040->1525|3089->1552|3193->1626
                  LINES: 17->1|18->2|19->3|20->4|25->6|30->6|32->8|32->8|32->8|33->9|36->12|36->12|38->14|38->14|38->14|45->21|45->21|45->21|45->21|45->21|48->24|48->24|48->24|48->24|48->24|51->27|51->27|51->27|51->27|51->27|54->30|54->30|54->30|54->30|54->30|59->35
                  -- GENERATED --
              */
          