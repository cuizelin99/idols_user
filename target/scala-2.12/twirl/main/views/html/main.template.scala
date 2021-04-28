
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
/*3.2*/import play.twirl.api.Html
/*4.2*/import org.webjars.play.WebJarsUtil
/*5.2*/import controllers.AssetsFinder

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template7[String,Option[models.auth.User],Html,RequestHeader,Messages,AssetsFinder,WebJarsUtil,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(title: String, user: Option[models.auth.User] = None)(content: Html)(implicit request: RequestHeader, messages: Messages, assets: AssetsFinder, webJarsUtil: WebJarsUtil):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.172*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <!-- <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/assets/*15.65*/.path("images/favicon.png")),format.raw/*15.92*/("""">
        <title>"""),_display_(/*16.17*/title),format.raw/*16.22*/("""</title> -->
<!--         <link href="//fonts.googleapis.com/css?family=Roboto|Montserrat:400,700|Open+Sans:400,300,600" rel="stylesheet">
        <link href="//cdnjs.cloudflare.com/ajax/libs/ionicons/1.5.2/css/ionicons.min.css" rel="stylesheet"> -->
        
        <meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate" />
		<meta http-equiv="Pragma" content="no-cache" />
		<meta http-equiv="Expires" content="0" />

        """),_display_(/*24.10*/Html(webJarsUtil.css("bootstrap-theme.min.css"))),format.raw/*24.58*/("""
		"""),_display_(/*25.4*/Html(webJarsUtil.css("bootstrap.min.css"))),format.raw/*25.46*/("""
        
        """),format.raw/*27.9*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*27.54*/controllers/*27.65*/.routes.Assets.versioned("stylesheets/main.css")),format.raw/*27.113*/("""">

    </head>
    <body>
    
	<h1>Welcome to IDOLS</h1>
	  	<div class="topnav">
	  		<div class="topnav-left">
				<a href=""""),_display_(/*35.15*/controllers/*35.26*/.routes.HomeController.home),format.raw/*35.53*/("""">Home</a>
			  	<a href=""""),_display_(/*36.17*/controllers/*36.28*/.routes.HomeController.use_cases),format.raw/*36.60*/("""">Use Cases</a>
			  	<a href=""""),_display_(/*37.17*/controllers/*37.28*/.routes.HomeController.contact),format.raw/*37.58*/("""">Contact</a>
		  	</div>
		  	<div class="topnav-right">
				"""),_display_(/*40.6*/user/*40.10*/.map/*40.14*/ { u =>_display_(Seq[Any](format.raw/*40.21*/("""
					"""),format.raw/*41.6*/("""<a href=""""),_display_(/*41.16*/controllers/*41.27*/.routes.ApplicationController.signOut),format.raw/*41.64*/("""" onclick="signOut();">Sign Out</a>
	            		<a href=""""),_display_(/*42.26*/controllers/*42.37*/.routes.ApplicationController.index),format.raw/*42.72*/("""">"""),_display_(/*42.75*/u/*42.76*/.name),format.raw/*42.81*/("""</a>
	            	""")))}/*43.16*/.getOrElse/*43.26*/ {_display_(Seq[Any](format.raw/*43.28*/("""
	           		"""),format.raw/*44.15*/("""<a href=""""),_display_(/*44.25*/controllers/*44.36*/.routes.SignInController.view),format.raw/*44.65*/("""">Sign In</a>
	            """)))}),format.raw/*45.15*/("""
        		"""),format.raw/*46.11*/("""</div>
		</div>
        <main class="container">
            <div class="starter-template row">
                """),_display_(/*50.18*/request/*50.25*/.flash.get("error").map/*50.48*/ { msg =>_display_(Seq[Any](format.raw/*50.57*/("""
                    """),format.raw/*51.21*/("""<div class="col-md-6 col-md-offset-3 alert alert-danger">
                        <a href="#" class="close" data-dismiss="alert">&times;</a>
                        <strong>"""),_display_(/*53.34*/messages("error")),format.raw/*53.51*/("""</strong> """),_display_(/*53.62*/msg),format.raw/*53.65*/("""
                    """),format.raw/*54.21*/("""</div>
                """)))}),format.raw/*55.18*/("""
                """),_display_(/*56.18*/request/*56.25*/.flash.get("info").map/*56.47*/ { msg =>_display_(Seq[Any](format.raw/*56.56*/("""
                    """),format.raw/*57.21*/("""<div class="col-md-6 col-md-offset-3 alert alert-info">
                        <a href="#" class="close" data-dismiss="alert">&times;</a>
                        <strong>"""),_display_(/*59.34*/messages("info")),format.raw/*59.50*/("""</strong> """),_display_(/*59.61*/msg),format.raw/*59.64*/("""
                    """),format.raw/*60.21*/("""</div>
                """)))}),format.raw/*61.18*/("""
                """),_display_(/*62.18*/request/*62.25*/.flash.get("success").map/*62.50*/ { msg =>_display_(Seq[Any](format.raw/*62.59*/("""
                    """),format.raw/*63.21*/("""<div class="col-md-6 col-md-offset-3 alert alert-success">
                        <a href="#" class="close" data-dismiss="alert">&times;</a>
                        <strong>"""),_display_(/*65.34*/messages("success")),format.raw/*65.53*/("""</strong> """),_display_(/*65.64*/msg),format.raw/*65.67*/("""
                    """),format.raw/*66.21*/("""</div>
                """)))}),format.raw/*67.18*/("""
                """),_display_(/*68.18*/content),format.raw/*68.25*/("""
            """),format.raw/*69.13*/("""</div>
        </main>
        
        	    
	<meta name="google-signin-scope" content="profile email">
    <meta name="google-signin-client_id" content="496377681477-ebhtjhotd0nfsjt1rp358u4i59osfms0.apps.googleusercontent.com">
    <script src="https://apis.google.com/js/platform.js" async defer></script>
    <script>
	  function signOut() """),format.raw/*77.23*/("""{"""),format.raw/*77.24*/("""
	    """),format.raw/*78.6*/("""var auth2 = gapi.auth2.getAuthInstance();
	    auth2.signOut().then(function () """),format.raw/*79.39*/("""{"""),format.raw/*79.40*/("""
	      """),format.raw/*80.8*/("""console.log('User signed out.');
	    """),format.raw/*81.6*/("""}"""),format.raw/*81.7*/(""");
	  """),format.raw/*82.4*/("""}"""),format.raw/*82.5*/("""
	"""),format.raw/*83.2*/("""</script>
        
        
<!--         """),_display_(/*86.15*/Html(webJarsUtil.script("jquery.min.js"))),format.raw/*86.56*/("""
        """),_display_(/*87.10*/Html(webJarsUtil.script("bootstrap.min.js"))),format.raw/*87.54*/("""
        """),format.raw/*88.9*/("""<script src="https://cdnjs.cloudflare.com/ajax/libs/zxcvbn/4.2.0/zxcvbn.js"></script>
        <script src=""""),_display_(/*89.23*/assets/*89.29*/.path("javascripts/zxcvbnShim.js")),format.raw/*89.63*/(""""></script> -->

    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,user:Option[models.auth.User],content:Html,request:RequestHeader,messages:Messages,assets:AssetsFinder,webJarsUtil:WebJarsUtil): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)(request,messages,assets,webJarsUtil)

  def f:((String,Option[models.auth.User]) => (Html) => (RequestHeader,Messages,AssetsFinder,WebJarsUtil) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => (request,messages,assets,webJarsUtil) => apply(title,user)(content)(request,messages,assets,webJarsUtil)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 28 17:13:04 CDT 2021
                  SOURCE: /Users/petercui/workspace/idols/idols_user/app/views/main.scala.html
                  HASH: 998b5e17470e9ad2cef499dfbb2c58d29a6f3ba6
                  MATRIX: 432->1|469->32|510->67|544->95|587->132|1000->166|1266->336|1294->338|1598->615|1613->621|1661->648|1707->667|1733->672|2214->1126|2283->1174|2313->1178|2376->1220|2421->1238|2493->1283|2513->1294|2583->1342|2739->1471|2759->1482|2807->1509|2861->1536|2881->1547|2934->1579|2993->1611|3013->1622|3064->1652|3153->1715|3166->1719|3179->1723|3224->1730|3257->1736|3294->1746|3314->1757|3372->1794|3460->1855|3480->1866|3536->1901|3566->1904|3576->1905|3602->1910|3641->1930|3660->1940|3700->1942|3743->1957|3780->1967|3800->1978|3850->2007|3909->2035|3948->2046|4088->2159|4104->2166|4136->2189|4183->2198|4232->2219|4433->2393|4471->2410|4509->2421|4533->2424|4582->2445|4637->2469|4682->2487|4698->2494|4729->2516|4776->2525|4825->2546|5024->2718|5061->2734|5099->2745|5123->2748|5172->2769|5227->2793|5272->2811|5288->2818|5322->2843|5369->2852|5418->2873|5620->3048|5660->3067|5698->3078|5722->3081|5771->3102|5826->3126|5871->3144|5899->3151|5940->3164|6312->3508|6341->3509|6374->3515|6482->3595|6511->3596|6546->3604|6611->3642|6639->3643|6672->3649|6700->3650|6729->3652|6798->3694|6860->3735|6897->3745|6962->3789|6998->3798|7133->3906|7148->3912|7203->3946
                  LINES: 17->1|18->2|19->3|20->4|21->5|26->7|31->7|33->9|39->15|39->15|39->15|40->16|40->16|48->24|48->24|49->25|49->25|51->27|51->27|51->27|51->27|59->35|59->35|59->35|60->36|60->36|60->36|61->37|61->37|61->37|64->40|64->40|64->40|64->40|65->41|65->41|65->41|65->41|66->42|66->42|66->42|66->42|66->42|66->42|67->43|67->43|67->43|68->44|68->44|68->44|68->44|69->45|70->46|74->50|74->50|74->50|74->50|75->51|77->53|77->53|77->53|77->53|78->54|79->55|80->56|80->56|80->56|80->56|81->57|83->59|83->59|83->59|83->59|84->60|85->61|86->62|86->62|86->62|86->62|87->63|89->65|89->65|89->65|89->65|90->66|91->67|92->68|92->68|93->69|101->77|101->77|102->78|103->79|103->79|104->80|105->81|105->81|106->82|106->82|107->83|110->86|110->86|111->87|111->87|112->88|113->89|113->89|113->89
                  -- GENERATED --
              */
          