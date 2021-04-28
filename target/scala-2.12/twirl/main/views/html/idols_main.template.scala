
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

object idols_main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Option[models.auth.User],Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: Option[models.auth.User] = None)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.71*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*6.62*/("""
        """),format.raw/*7.9*/("""<title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" href=""""),_display_(/*8.39*/controllers/*8.50*/.routes.Assets.versioned("stylesheets/style.css")),format.raw/*8.99*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/controllers/*9.65*/.routes.Assets.versioned("stylesheets/main.css")),format.raw/*9.113*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.59*/controllers/*10.70*/.routes.Assets.versioned("images/favicon.png")),format.raw/*10.116*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*11.55*/controllers/*11.66*/.routes.Assets.versioned("stylesheets/datatables.min.css")),format.raw/*11.124*/("""">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">


        <script src=""""),_display_(/*15.23*/controllers/*15.34*/.routes.Assets.versioned("javascripts/main.js")),format.raw/*15.81*/("""" type="text/javascript"></script>
	    <script src=""""),_display_(/*16.20*/controllers/*16.31*/.routes.Assets.versioned("javascripts/jquery-3.5.1.js")),format.raw/*16.86*/(""""></script>
	    <script src=""""),_display_(/*17.20*/controllers/*17.31*/.routes.Assets.versioned("javascripts/jstree.js")),format.raw/*17.80*/(""""></script>
	    <script src=""""),_display_(/*18.20*/controllers/*18.31*/.routes.Assets.versioned("javascripts/jquery.form.js")),format.raw/*18.85*/(""""></script>
	    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

	    <script type="text/javascript" language="javascript" src=""""),_display_(/*21.65*/controllers/*21.76*/.routes.Assets.versioned("javascripts/datatables.min.js")),format.raw/*21.133*/(""""></script>
	    <script type="text/javascript" language="javascript" src=""""),_display_(/*22.65*/controllers/*22.76*/.routes.Assets.versioned("javascripts/datatables.select.min.js")),format.raw/*22.140*/(""""></script>
	    <script type="text/javascript" language="javascript" src=""""),_display_(/*23.65*/controllers/*23.76*/.routes.Assets.versioned("javascripts/datatables.buttons.min.js")),format.raw/*23.141*/(""""></script>
	    
	    <script type="text/javascript" language="javascript" src=""""),_display_(/*25.65*/controllers/*25.76*/.routes.Assets.versioned("javascripts/mindmup-editabletable.js")),format.raw/*25.140*/(""""></script>
	    

    </head>
    
    <body>
  
    
    	<h1>Welcome to IDOLS</h1>
    	
	  	<div class="topnav">
	  		<div class="topnav-left">
				<a href=""""),_display_(/*37.15*/controllers/*37.26*/.routes.HomeController.home),format.raw/*37.53*/("""">Home</a>
			  	<a href=""""),_display_(/*38.17*/controllers/*38.28*/.routes.HomeController.use_cases),format.raw/*38.60*/("""">Use Cases</a>
			  	<a href=""""),_display_(/*39.17*/controllers/*39.28*/.routes.HomeController.contact),format.raw/*39.58*/("""">Contact</a>
		  	</div>
		  	<div class="topnav-right">
		  	<a href=""""),_display_(/*42.16*/controllers/*42.27*/.routes.ApplicationController.signOut),format.raw/*42.64*/("""">Sign Out</a>
				"""),_display_(/*43.6*/user/*43.10*/.map/*43.14*/ { u =>_display_(Seq[Any](format.raw/*43.21*/("""
	            		"""),format.raw/*44.16*/("""<a href=""""),_display_(/*44.26*/controllers/*44.37*/.routes.ApplicationController.index),format.raw/*44.72*/("""">"""),_display_(/*44.75*/u/*44.76*/.name),format.raw/*44.81*/("""</a>
	            	""")))}/*45.16*/.getOrElse/*45.26*/ {_display_(Seq[Any](format.raw/*45.28*/("""
	           		"""),format.raw/*46.15*/("""<a href=""""),_display_(/*46.25*/controllers/*46.36*/.routes.SignInController.view),format.raw/*46.65*/("""">Sign In</a>
	            """)))}),format.raw/*47.15*/("""
        		"""),format.raw/*48.11*/("""</div>
		</div>
		
		 
		
        """),format.raw/*54.32*/("""
        """),_display_(/*55.10*/content),format.raw/*55.17*/("""

    """),format.raw/*57.5*/("""</body>
    
</html>"""))
      }
    }
  }

  def render(title:String,user:Option[models.auth.User],content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,Option[models.auth.User]) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 28 17:13:03 CDT 2021
                  SOURCE: /Users/petercui/workspace/idols/idols_user/app/views/idols_main.scala.html
                  HASH: e18a68bfe35c6cae67a65143b8ae50e56504ebcc
                  MATRIX: 764->1|928->70|956->72|1035->177|1070->186|1104->194|1129->199|1202->246|1221->257|1290->306|1372->362|1391->373|1460->421|1548->482|1568->493|1636->539|1720->596|1740->607|1820->665|1983->801|2003->812|2071->859|2152->913|2172->924|2248->979|2306->1010|2326->1021|2396->1070|2454->1101|2474->1112|2549->1166|2750->1340|2770->1351|2849->1408|2952->1484|2972->1495|3058->1559|3161->1635|3181->1646|3268->1711|3377->1793|3397->1804|3483->1868|3672->2030|3692->2041|3740->2068|3794->2095|3814->2106|3867->2138|3926->2170|3946->2181|3997->2211|4097->2284|4117->2295|4175->2332|4221->2352|4234->2356|4247->2360|4292->2367|4336->2383|4373->2393|4393->2404|4449->2439|4479->2442|4489->2443|4515->2448|4554->2468|4573->2478|4613->2480|4656->2495|4693->2505|4713->2516|4763->2545|4822->2573|4861->2584|4923->2708|4960->2718|4988->2725|5021->2731
                  LINES: 21->1|26->1|28->3|31->6|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|35->10|35->10|35->10|36->11|36->11|36->11|40->15|40->15|40->15|41->16|41->16|41->16|42->17|42->17|42->17|43->18|43->18|43->18|46->21|46->21|46->21|47->22|47->22|47->22|48->23|48->23|48->23|50->25|50->25|50->25|62->37|62->37|62->37|63->38|63->38|63->38|64->39|64->39|64->39|67->42|67->42|67->42|68->43|68->43|68->43|68->43|69->44|69->44|69->44|69->44|69->44|69->44|69->44|70->45|70->45|70->45|71->46|71->46|71->46|71->46|72->47|73->48|78->54|79->55|79->55|81->57
                  -- GENERATED --
              */
          