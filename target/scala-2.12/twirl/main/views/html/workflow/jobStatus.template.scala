
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

object jobStatus extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.tasks.checkHadoopJobStatusTask,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(task: models.tasks.checkHadoopJobStatusTask, index: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.63*/("""


    
    """),_display_(/*5.6*/helper/*5.12*/.form(action = controllers.routes.WorkflowController.runTask(index), 'id -> "form".concat(index.toString))/*5.118*/  {_display_(Seq[Any](format.raw/*5.121*/("""
    	
    	
	    """),format.raw/*8.6*/("""<ul style="list-style:none">
	    	<li>
		    	<div class="indivsteps">
					Reservation name
				</div>
				<p>
		    		<input type="text" id="reservation"""),_display_(/*14.44*/index),format.raw/*14.49*/("""" name="reservation" value="hadoop+Idols+2431" required> 
		    	</p>
		    </li>
	    
		    <li>
		    
		    <li>
		    	<div class="indivsteps">
					Job Status
				</div>
				<p>
		    		        <select name="job_status" required>
							  <option value="ALL">ALL</option>
							  <option value="NEW">NEW</option>
							  <option value="NEW_SAVING">NEW_SAVING</option>
							  <option value="SUBMITTED">SUBMITTED</option>
							  <option value="RUNNING" selected="selected">RUNNING</option>
							  <option value="FINISHED">FINISHED</option>
							  <option value="FAILED">FAILED</option>
							  <option value="KILLED">KILLED</option>
							</select> 
		    	</p>
		    </li>
	    
		    <li>
		    
	    	<li>
			    <div class="indivsteps">
					Get job status
				</div>
			    <p>
			    	<button type="submit" id="submit"""),_display_(/*45.42*/index),format.raw/*45.47*/("""">Submit</button>
			    </p>
		    </li>

		    
		 </ul>
		 
		<div class="status" id="status"""),_display_(/*52.34*/index),format.raw/*52.39*/(""""></div>
    
	    <script>
		    $('#form"""),_display_(/*55.16*/index),format.raw/*55.21*/("""')
		    .ajaxForm("""),format.raw/*56.17*/("""{"""),format.raw/*56.18*/("""
		        """),format.raw/*57.11*/("""url : '"""),_display_(/*57.19*/controllers/*57.30*/.routes.WorkflowController.runTask(index)),format.raw/*57.71*/("""', 
		        success : function (response) """),format.raw/*58.41*/("""{"""),format.raw/*58.42*/("""
		        	"""),format.raw/*59.12*/("""document.getElementById('status' + """),_display_(/*59.48*/index),format.raw/*59.53*/(""").className = "status_success";
		           	document.getElementById('status' + """),_display_(/*60.51*/index),format.raw/*60.56*/(""").innerHTML = response;
		        """),format.raw/*61.11*/("""}"""),format.raw/*61.12*/(""",
		        error : function (xhr, status, error) """),format.raw/*62.49*/("""{"""),format.raw/*62.50*/("""
		           """),format.raw/*63.14*/("""document.getElementById('status' + """),_display_(/*63.50*/index),format.raw/*63.55*/(""").className = "status_error";
		           document.getElementById('status' + """),_display_(/*64.50*/index),format.raw/*64.55*/(""").innerHTML = xhr.responseText;
		        """),format.raw/*65.11*/("""}"""),format.raw/*65.12*/(""",
		        
		    """),format.raw/*67.7*/("""}"""),format.raw/*67.8*/(""");
		</script>	
		 

	         
     """)))}),format.raw/*72.7*/("""  
     

   
  



 """))
      }
    }
  }

  def render(task:models.tasks.checkHadoopJobStatusTask,index:Integer): play.twirl.api.HtmlFormat.Appendable = apply(task,index)

  def f:((models.tasks.checkHadoopJobStatusTask,Integer) => play.twirl.api.HtmlFormat.Appendable) = (task,index) => apply(task,index)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 28 17:13:04 CDT 2021
                  SOURCE: /Users/petercui/workspace/idols/idols_user/app/views/workflow/jobStatus.scala.html
                  HASH: 272cd1cf3034266065cf95d3cb8cd3d4362af5c5
                  MATRIX: 781->1|937->62|975->75|989->81|1104->187|1145->190|1189->208|1372->364|1398->369|2265->1209|2291->1214|2414->1310|2440->1315|2510->1358|2536->1363|2583->1382|2612->1383|2651->1394|2686->1402|2706->1413|2768->1454|2840->1498|2869->1499|2909->1511|2972->1547|2998->1552|3107->1634|3133->1639|3195->1673|3224->1674|3302->1724|3331->1725|3373->1739|3436->1775|3462->1780|3568->1859|3594->1864|3664->1906|3693->1907|3739->1926|3767->1927|3835->1965
                  LINES: 21->1|26->1|30->5|30->5|30->5|30->5|33->8|39->14|39->14|70->45|70->45|77->52|77->52|80->55|80->55|81->56|81->56|82->57|82->57|82->57|82->57|83->58|83->58|84->59|84->59|84->59|85->60|85->60|86->61|86->61|87->62|87->62|88->63|88->63|88->63|89->64|89->64|90->65|90->65|92->67|92->67|97->72
                  -- GENERATED --
              */
          