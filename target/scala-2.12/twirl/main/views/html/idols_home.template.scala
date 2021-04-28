
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

object idols_home extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/idols_main("Welcome to IDOLS")/*2.32*/ {_display_(Seq[Any](format.raw/*2.34*/("""

	"""),format.raw/*4.2*/("""<div class="text" style="color: #1b9993;">
		<p>
		IDOLS is a web application framework that allows user to customize the web application including dynamically compose different workflows and generate new users on demand through simple configuration files. 
		To enhance the accessibility of large cyberinfrastructure to users from diverse domain fields, the framework includes a set of pre-built task modules to help bridge users with remote hardware and software resources.
		</p>
	
		<p>
		<img src=""""),_display_(/*11.14*/controllers/*11.25*/.routes.Assets.versioned("images/architecture_overview.png")),format.raw/*11.85*/("""" height="400px" alt="Archietecture Overview">
		</p>
		
		<p>
		Special Features: 
			<ul style="list-style: none">
				<li>
					Customized web application through configuration files.
				</li>
				<li>
					On-demand user credential creation and management.
				</li>
				<li>
					Scalable to additional use cases and resources. 
				</li>
			</ul>
			
		</p>
		
		
		<p>
		Sample Tasks
		</p>
		<p>
		<img src=""""),_display_(/*35.14*/controllers/*35.25*/.routes.Assets.versioned("images/tasks.png")),format.raw/*35.69*/("""" height="200px" alt="Implemented Tasks">
		</p>
		<p>
		These are samples of commonly used tasks that can be used to create a workflow. 
		The workflow can be specified through a json configuration file.
		</p>
		
		<p>
		Sample Workflow Configuration File
		</p>
		<p>
		<img src=""""),_display_(/*46.14*/controllers/*46.25*/.routes.Assets.versioned("images/workflow_config.png")),format.raw/*46.79*/("""" height="400px" alt="Sample Workflow Configuration File">
		</p>
		
		
		<p>
		To get started with the application, request a temporary account <a href=""""),_display_(/*51.78*/controllers/*51.89*/.routes.RequestController.view()),format.raw/*51.121*/("""" style="	text-decoration: underline">here</a>
		</p>
		
		</div> 
	
	
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
                  DATE: Wed Apr 28 17:13:03 CDT 2021
                  SOURCE: /Users/petercui/workspace/idols/idols_user/app/views/idols_home.scala.html
                  HASH: 33aa1285978303173ee4b19f6df29b0178bdcb18
                  MATRIX: 816->2|854->32|893->34|922->37|1453->541|1473->552|1554->612|1999->1030|2019->1041|2084->1085|2395->1369|2415->1380|2490->1434|2672->1589|2692->1600|2746->1632
                  LINES: 26->2|26->2|26->2|28->4|35->11|35->11|35->11|59->35|59->35|59->35|70->46|70->46|70->46|75->51|75->51|75->51
                  -- GENERATED --
              */
          