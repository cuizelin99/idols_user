
package views.html.workflow

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

object zeppelin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[models.tasks.startZeppelinTask,Integer,models.auth.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(task: models.tasks.startZeppelinTask, index: Integer, user: models.auth.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.80*/("""


    
    """),_display_(/*5.6*/helper/*5.12*/.form(action = controllers.routes.WorkflowController.runTask(index), 'id -> "form".concat(index.toString))/*5.118*/  {_display_(Seq[Any](format.raw/*5.121*/("""
    	
    	
	    """),format.raw/*8.6*/("""<ul style="list-style:none">
	    	<li>
		    	<div class="indivsteps">
					Reservation name
			</div>
			<p>
		    		<input type="text" id="reservation"""),_display_(/*14.44*/index),format.raw/*14.49*/("""" name="reservation" value=""""),_display_(/*14.78*/task/*14.82*/.reservationName),format.raw/*14.98*/("""" required> 
		    	</p>

		    	<div class="indivsteps">
					TACC user name
			</div>		    	
			<p>
		    		<input type="text" id="taccName"""),_display_(/*21.41*/index),format.raw/*21.46*/("""" name="taccName" value="tacc name" required> 
		    	</p>
		    	
		    </li>
	    
		    <li>
	    	<li>
			    <div class="indivsteps">
					Start Zeppelin
				</div>
			    <p>Click the submit button once; wait 10 seconds for Zeppelin UI URL to show up</p>
			    <p>
			    	<button type="submit" id="submit"""),_display_(/*33.42*/index),format.raw/*33.47*/("""">Submit</button>
			    </p>

		    </li>

		    
		 </ul>
		 
		<div class="status_none" id="status"""),_display_(/*41.39*/index),format.raw/*41.44*/(""""></div>
    
	    <script>
		    $('#form"""),_display_(/*44.16*/index),format.raw/*44.21*/("""')
		    .ajaxForm("""),format.raw/*45.17*/("""{"""),format.raw/*45.18*/("""
		        """),format.raw/*46.11*/("""url : '"""),_display_(/*46.19*/controllers/*46.30*/.routes.WorkflowController.runTask(index)),format.raw/*46.71*/("""', 
		        success : function (response) """),format.raw/*47.41*/("""{"""),format.raw/*47.42*/("""
		        	"""),format.raw/*48.12*/("""document.getElementById('status' + """),_display_(/*48.48*/index),format.raw/*48.53*/(""").className = "status_success";
		           	document.getElementById('status' + """),_display_(/*49.51*/index),format.raw/*49.56*/(""").innerHTML = response;
		        """),format.raw/*50.11*/("""}"""),format.raw/*50.12*/(""",
		        error : function (xhr, status, error) """),format.raw/*51.49*/("""{"""),format.raw/*51.50*/("""
		           """),format.raw/*52.14*/("""document.getElementById('status' + """),_display_(/*52.50*/index),format.raw/*52.55*/(""").className = "status_error";
		           document.getElementById('status' + """),_display_(/*53.50*/index),format.raw/*53.55*/(""").innerHTML = xhr.responseText;
		        """),format.raw/*54.11*/("""}"""),format.raw/*54.12*/(""",
		        
		    """),format.raw/*56.7*/("""}"""),format.raw/*56.8*/(""");
		</script>	
		 

	         
     """)))}),format.raw/*61.7*/("""  
     

   
  



 """))
      }
    }
  }

  def render(task:models.tasks.startZeppelinTask,index:Integer,user:models.auth.User): play.twirl.api.HtmlFormat.Appendable = apply(task,index,user)

  def f:((models.tasks.startZeppelinTask,Integer,models.auth.User) => play.twirl.api.HtmlFormat.Appendable) = (task,index,user) => apply(task,index,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 28 17:13:04 CDT 2021
                  SOURCE: /Users/petercui/workspace/idols/idols_user/app/views/workflow/zeppelin.scala.html
                  HASH: 30bceeac4b3a16d08821f484843dc62335addf70
                  MATRIX: 790->1|963->79|1001->92|1015->98|1130->204|1171->207|1215->225|1396->379|1422->384|1478->413|1491->417|1528->433|1697->575|1723->580|2063->893|2089->898|2218->1000|2244->1005|2314->1048|2340->1053|2387->1072|2416->1073|2455->1084|2490->1092|2510->1103|2572->1144|2644->1188|2673->1189|2713->1201|2776->1237|2802->1242|2911->1324|2937->1329|2999->1363|3028->1364|3106->1414|3135->1415|3177->1429|3240->1465|3266->1470|3372->1549|3398->1554|3468->1596|3497->1597|3543->1616|3571->1617|3639->1655
                  LINES: 21->1|26->1|30->5|30->5|30->5|30->5|33->8|39->14|39->14|39->14|39->14|39->14|46->21|46->21|58->33|58->33|66->41|66->41|69->44|69->44|70->45|70->45|71->46|71->46|71->46|71->46|72->47|72->47|73->48|73->48|73->48|74->49|74->49|75->50|75->50|76->51|76->51|77->52|77->52|77->52|78->53|78->53|79->54|79->54|81->56|81->56|86->61
                  -- GENERATED --
              */
          