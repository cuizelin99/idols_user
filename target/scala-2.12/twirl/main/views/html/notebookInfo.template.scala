
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

object notebookInfo extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template9[String,String,String,String,String,RequestHeader,Messages,WebJarsUtil,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*9.2*/(firstName: String, lastName: String, email: String, username: String, pass: String)(implicit request: RequestHeader, messages: Messages, webJarsUtil: WebJarsUtil, assets: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*9.187*/("""

"""),_display_(/*11.2*/main("Account Information")/*11.29*/ {_display_(Seq[Any](format.raw/*11.31*/("""
	"""),format.raw/*12.2*/("""<div class="text" style="color: #1b9993;">
    Hello """),_display_(/*13.12*/firstName),format.raw/*13.21*/(""" """),_display_(/*13.23*/lastName),format.raw/*13.31*/(""" """),format.raw/*13.32*/("""("""),_display_(/*13.34*/email),format.raw/*13.39*/("""), <BR>
    Please use the following account information to sign in.
    Username: <b>"""),_display_(/*15.19*/username),format.raw/*15.27*/("""</b> 
    Password: <b>"""),_display_(/*16.19*/pass),format.raw/*16.23*/("""</b>
    </div>
""")))}),format.raw/*18.2*/("""
"""))
      }
    }
  }

  def render(firstName:String,lastName:String,email:String,username:String,pass:String,request:RequestHeader,messages:Messages,webJarsUtil:WebJarsUtil,assets:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(firstName,lastName,email,username,pass)(request,messages,webJarsUtil,assets)

  def f:((String,String,String,String,String) => (RequestHeader,Messages,WebJarsUtil,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (firstName,lastName,email,username,pass) => (request,messages,webJarsUtil,assets) => apply(firstName,lastName,email,username,pass)(request,messages,webJarsUtil,assets)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 28 17:13:04 CDT 2021
                  SOURCE: /Users/petercui/workspace/idols/idols_user/app/views/notebookInfo.scala.html
                  HASH: b533d9d12153c1c4a2b37e5a00b20742278fdb85
                  MATRIX: 432->1|465->29|502->61|543->97|586->135|625->169|662->201|1083->239|1364->424|1395->429|1431->456|1471->458|1501->461|1583->516|1613->525|1642->527|1671->535|1700->536|1729->538|1755->543|1871->632|1900->640|1952->665|1977->669|2026->688
                  LINES: 17->1|18->2|19->3|20->4|21->5|22->6|23->7|28->9|33->9|35->11|35->11|35->11|36->12|37->13|37->13|37->13|37->13|37->13|37->13|37->13|39->15|39->15|40->16|40->16|42->18
                  -- GENERATED --
              */
          