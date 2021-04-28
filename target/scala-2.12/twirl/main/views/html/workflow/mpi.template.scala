
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

object mpi extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.tasks.runMPITask,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(task: models.tasks.runMPITask, index: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.49*/("""


    
    """),_display_(/*5.6*/helper/*5.12*/.form(action = controllers.routes.WorkflowController.runTask(index), 'id -> "form".concat(index.toString))/*5.118*/  {_display_(Seq[Any](format.raw/*5.121*/("""
    	
    	
	    """),format.raw/*8.6*/("""<ul style="list-style:none">
	    	<li>
		    	<div class="indivsteps">
					job.mpi Directory 
				</div>
				<p>
		    		<input type="text" id="dir"""),_display_(/*14.36*/index),format.raw/*14.41*/("""" name="dir" size="80" value="/work/03076/rhuang/wrangler/SimpleMPIStampede" required>
		    	</p>
		    </li>
		    
		    <li>
		    	<div class="indivsteps">
					Script name
				</div>
			<p>
			<table>
 			 <tr>
					<td width="20%">MPI main script: <input type="text" id="mpi_script"""),_display_(/*25.73*/index),format.raw/*25.78*/("""" name="mpi_script" size="20" value="MPIrunScript_test" required></td> 
					<td width="20%">Split script: <input type="text" id="split_script"""),_display_(/*26.72*/index),format.raw/*26.77*/("""" name="split_script" size="20" value="split.csh" required></td> 
					<td width="20%">Combine script: <input type="text" id="combine_script"""),_display_(/*27.76*/index),format.raw/*27.81*/("""" name="combine_script" size="20" value="combine.csh" required></td> 
			</tr>
			</table>
			</p>
		    </li>
		    
		    <li>
		    	<div class="indivsteps">
					Batch script variables
				</div>
			<p>
			<table>
 			 <tr>
				     <td width="20%">Job name: <input type="text" id="job_name"""),_display_(/*40.68*/index),format.raw/*40.73*/("""" name="job_name" size="10" value="MPI" required></td>
				     <td width="20%">Number of nodes: <input type="number" id="num_nodes"""),_display_(/*41.78*/index),format.raw/*41.83*/("""" name="num_nodes" min="1" max="100" value="2" required></td>
				     <td width="20%">Total number of tasks: <input type="number" id="total_tasks"""),_display_(/*42.86*/index),format.raw/*42.91*/("""" name="total_tasks" min="1" max="10000" value="12" required></td>
				     <td width="20%">Queue name: <input type="text" id="queue_name"""),_display_(/*43.72*/index),format.raw/*43.77*/("""" name="queue_name" size="10" value="normal" required></td>
			</tr>
 			 <tr>
		    		<td width="20%">stdout name: <input type="text" id="stdout_name"""),_display_(/*46.73*/index),format.raw/*46.78*/("""" name="stdout_name" size="10" value="mpi.out" required></td>
		    		<td width="20%">Run time(hh:mm:ss): <input type="text" id="run_time"""),_display_(/*47.77*/index),format.raw/*47.82*/("""" name="run_time" size="10" value="00:30:00" required></td>
		    		<td width="20%">Allocation: <input type="text" id="allocation"""),_display_(/*48.71*/index),format.raw/*48.76*/("""" name="allocation" size="10" value="Idols" required></td>
			</tr>
			</table>
			</p>
		    	
		    </li>
	    

	    	<li>
			    <div class="indivsteps">
					Submit MPI job
				</div>
			    <p>
			    	<button type="submit" id="submit"""),_display_(/*61.42*/index),format.raw/*61.47*/("""">Submit</button>
			    </p>
		    </li>

		    
		 </ul>
		 
		<div class="status" id="status"""),_display_(/*68.34*/index),format.raw/*68.39*/(""""></div>
    
	    <script>
		    $('#form"""),_display_(/*71.16*/index),format.raw/*71.21*/("""')
		    .ajaxForm("""),format.raw/*72.17*/("""{"""),format.raw/*72.18*/("""
		        """),format.raw/*73.11*/("""url : '"""),_display_(/*73.19*/controllers/*73.30*/.routes.WorkflowController.runTask(index)),format.raw/*73.71*/("""', 
		        success : function (response) """),format.raw/*74.41*/("""{"""),format.raw/*74.42*/("""
		        	"""),format.raw/*75.12*/("""document.getElementById('status' + """),_display_(/*75.48*/index),format.raw/*75.53*/(""").className = "status_success";
		           	document.getElementById('status' + """),_display_(/*76.51*/index),format.raw/*76.56*/(""").innerHTML = response;
		        """),format.raw/*77.11*/("""}"""),format.raw/*77.12*/(""",
		        error : function (xhr, status, error) """),format.raw/*78.49*/("""{"""),format.raw/*78.50*/("""
		           """),format.raw/*79.14*/("""document.getElementById('status' + """),_display_(/*79.50*/index),format.raw/*79.55*/(""").className = "status_error";
		           document.getElementById('status' + """),_display_(/*80.50*/index),format.raw/*80.55*/(""").innerHTML = xhr.responseText;
		        """),format.raw/*81.11*/("""}"""),format.raw/*81.12*/(""",
		        
		    """),format.raw/*83.7*/("""}"""),format.raw/*83.8*/(""");
		</script>	
		 

	         
     """)))}),format.raw/*88.7*/("""  
"""))
      }
    }
  }

  def render(task:models.tasks.runMPITask,index:Integer): play.twirl.api.HtmlFormat.Appendable = apply(task,index)

  def f:((models.tasks.runMPITask,Integer) => play.twirl.api.HtmlFormat.Appendable) = (task,index) => apply(task,index)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 28 17:13:05 CDT 2021
                  SOURCE: /Users/petercui/workspace/idols/idols_user/app/views/workflow/mpi.scala.html
                  HASH: a6d64c5cfc9176765d24038f6c6b16955d6f1ea4
                  MATRIX: 761->1|903->48|941->61|955->67|1070->173|1111->176|1155->194|1332->344|1358->349|1674->638|1700->643|1870->786|1896->791|2064->932|2090->937|2412->1232|2438->1237|2597->1369|2623->1374|2797->1521|2823->1526|2988->1664|3014->1669|3192->1820|3218->1825|3383->1963|3409->1968|3566->2098|3592->2103|3860->2344|3886->2349|4009->2445|4035->2450|4105->2493|4131->2498|4178->2517|4207->2518|4246->2529|4281->2537|4301->2548|4363->2589|4435->2633|4464->2634|4504->2646|4567->2682|4593->2687|4702->2769|4728->2774|4790->2808|4819->2809|4897->2859|4926->2860|4968->2874|5031->2910|5057->2915|5163->2994|5189->2999|5259->3041|5288->3042|5334->3061|5362->3062|5430->3100
                  LINES: 21->1|26->1|30->5|30->5|30->5|30->5|33->8|39->14|39->14|50->25|50->25|51->26|51->26|52->27|52->27|65->40|65->40|66->41|66->41|67->42|67->42|68->43|68->43|71->46|71->46|72->47|72->47|73->48|73->48|86->61|86->61|93->68|93->68|96->71|96->71|97->72|97->72|98->73|98->73|98->73|98->73|99->74|99->74|100->75|100->75|100->75|101->76|101->76|102->77|102->77|103->78|103->78|104->79|104->79|104->79|105->80|105->80|106->81|106->81|108->83|108->83|113->88
                  -- GENERATED --
              */
          