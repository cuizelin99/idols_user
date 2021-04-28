
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
/*1.2*/import play.api.data.Form
/*2.2*/import play.api.i18n.Messages
/*3.2*/import play.api.mvc.RequestHeader
/*4.2*/import org.webjars.play.WebJarsUtil
/*5.2*/import controllers.AssetsFinder
/*6.2*/import forms.RequestForm.Data
/*7.2*/import b3.inline.fieldConstructor

object request extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Form[Data],RequestHeader,Messages,WebJarsUtil,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*9.2*/(requestForm: Form[Data])(implicit request: RequestHeader, messages: Messages, webJarsUtil: WebJarsUtil, assets: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*9.128*/("""

"""),_display_(/*11.2*/main("Request Training Account")/*11.34*/ {_display_(Seq[Any](format.raw/*11.36*/("""

    """),format.raw/*13.5*/("""<fieldset class="col-md-6 col-md-offset-3">
        <legend>Request a training account</legend>
        """),_display_(/*15.10*/helper/*15.16*/.form(action = controllers.routes.RequestController.submit())/*15.77*/ {_display_(Seq[Any](format.raw/*15.79*/("""
            """),_display_(/*16.14*/helper/*16.20*/.CSRF.formField),format.raw/*16.35*/("""
            """),_display_(/*17.14*/b3/*17.16*/.text(requestForm("firstName"), '_hiddenLabel -> messages("first.name"), 'placeholder -> messages("first.name"), 'class -> "form-control input-lg")),format.raw/*17.163*/("""
            """),_display_(/*18.14*/b3/*18.16*/.text(requestForm("lastName"), '_hiddenLabel -> messages("last.name"), 'placeholder -> messages("last.name"), 'class -> "form-control input-lg")),format.raw/*18.160*/("""
            """),_display_(/*19.14*/b3/*19.16*/.text(requestForm("email"), '_hiddenLabel -> messages("email"), 'placeholder -> messages("email"), 'class -> "form-control input-lg")),format.raw/*19.149*/("""
            """),_display_(/*20.14*/b3/*20.16*/.text(requestForm("institution"), '_hiddenLabel -> messages("institution"), 'placeholder -> messages("institution"), 'class -> "form-control input-lg")),format.raw/*20.167*/("""
            """),format.raw/*21.13*/("""<div class="form-group">
                <div>
                    <button id="submit" type="submit" value="submit" class="btn btn-lg btn-primary btn-block">"""),_display_(/*23.112*/messages("request")),format.raw/*23.131*/("""</button>
                </div>
            </div>
        """)))}),format.raw/*26.10*/("""
    """),format.raw/*27.5*/("""</fieldset>

""")))}))
      }
    }
  }

  def render(requestForm:Form[Data],request:RequestHeader,messages:Messages,webJarsUtil:WebJarsUtil,assets:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(requestForm)(request,messages,webJarsUtil,assets)

  def f:((Form[Data]) => (RequestHeader,Messages,WebJarsUtil,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (requestForm) => (request,messages,webJarsUtil,assets) => apply(requestForm)(request,messages,webJarsUtil,assets)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 28 17:13:04 CDT 2021
                  SOURCE: /Users/petercui/workspace/idols/idols_user/app/views/request.scala.html
                  HASH: 0cca04467e44de5dac5dc2667b646b6530a3c611
                  MATRIX: 432->1|465->29|502->61|543->97|586->135|625->169|662->201|1054->239|1276->365|1307->370|1348->402|1388->404|1423->412|1557->519|1572->525|1642->586|1682->588|1724->603|1739->609|1775->624|1817->639|1828->641|1997->788|2039->803|2050->805|2216->949|2258->964|2269->966|2424->1099|2466->1114|2477->1116|2650->1267|2692->1281|2880->1441|2921->1460|3016->1524|3049->1530
                  LINES: 17->1|18->2|19->3|20->4|21->5|22->6|23->7|28->9|33->9|35->11|35->11|35->11|37->13|39->15|39->15|39->15|39->15|40->16|40->16|40->16|41->17|41->17|41->17|42->18|42->18|42->18|43->19|43->19|43->19|44->20|44->20|44->20|45->21|47->23|47->23|50->26|51->27
                  -- GENERATED --
              */
          