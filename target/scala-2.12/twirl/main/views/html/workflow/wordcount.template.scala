
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

object wordcount extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.tasks.runWordCountTask,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(task: models.tasks.runWordCountTask, index: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.55*/("""


    
    """),_display_(/*5.6*/helper/*5.12*/.form(action = controllers.routes.WorkflowController.runTask(index), 'id -> "form".concat(index.toString))/*5.118*/  {_display_(Seq[Any](format.raw/*5.121*/("""
    	
    	
	    """),format.raw/*8.6*/("""<ul style="list-style:none">
	    	<li>
		    	<div class="indivsteps">
					Script path
				</div>
				<p>
		    		<input type="text" id="script_path"""),_display_(/*14.44*/index),format.raw/*14.49*/("""" name="script_path" size="80" value="/work/03076/rhuang/wrangler/run_wc.sh" required>
		    		"""),format.raw/*15.19*/("""
		    		"""),format.raw/*16.156*/("""
		    	"""),format.raw/*17.8*/("""</p>
		    </li>
		    
		    <li>
		    	<div class="indivsteps">
					Input file path
				</div>
				<p>file:
					<input type="text" id="input_file_path"""),_display_(/*25.45*/index),format.raw/*25.50*/("""" name="input_file_path" size="80" value="/work/03076/rhuang/wrangler/book.txt" required> 
		    		"""),format.raw/*26.19*/("""
		    		"""),format.raw/*27.219*/(""" 
		    	"""),format.raw/*28.8*/("""</p>
		    </li>
		    
		    <li>
		    	<div class="indivsteps">
					Output HDFS directory
				</div>
				<p> /user/$USER/
		    		<input type="text" id="output_path"""),_display_(/*36.44*/index),format.raw/*36.49*/("""" name="output_path" size="80" value="wc_out_0001" required>
		    		"""),format.raw/*37.19*/("""
		    		"""),format.raw/*38.158*/(""" 
		    	"""),format.raw/*39.8*/("""</p>
		    </li>
	    

	    	<li>
			    <div class="indivsteps">
					Submit application
				</div>
			    <p>
			    	<button type="submit" id="submit"""),_display_(/*48.42*/index),format.raw/*48.47*/("""">Submit</button>
			    </p>
		    </li>

		    
		 </ul>
		 
		<div class="status" id="status"""),_display_(/*55.34*/index),format.raw/*55.39*/(""""></div>
    
	    <script>
		    $('#form"""),_display_(/*58.16*/index),format.raw/*58.21*/("""')
		    .ajaxForm("""),format.raw/*59.17*/("""{"""),format.raw/*59.18*/("""
		        """),format.raw/*60.11*/("""url : '"""),_display_(/*60.19*/controllers/*60.30*/.routes.WorkflowController.runTask(index)),format.raw/*60.71*/("""', 
		        success : function (response) """),format.raw/*61.41*/("""{"""),format.raw/*61.42*/("""
		        	"""),format.raw/*62.12*/("""document.getElementById('status' + """),_display_(/*62.48*/index),format.raw/*62.53*/(""").className = "status_success";
		           	document.getElementById('status' + """),_display_(/*63.51*/index),format.raw/*63.56*/(""").innerHTML = response;
		        """),format.raw/*64.11*/("""}"""),format.raw/*64.12*/(""",
		        error : function (xhr, status, error) """),format.raw/*65.49*/("""{"""),format.raw/*65.50*/("""
		           """),format.raw/*66.14*/("""document.getElementById('status' + """),_display_(/*66.50*/index),format.raw/*66.55*/(""").className = "status_error";
		           document.getElementById('status' + """),_display_(/*67.50*/index),format.raw/*67.55*/(""").innerHTML = xhr.responseText;
		        """),format.raw/*68.11*/("""}"""),format.raw/*68.12*/(""",
		        
		    """),format.raw/*70.7*/("""}"""),format.raw/*70.8*/(""");
		</script>	
		 

	         
     """)))}),format.raw/*75.7*/("""  
"""))
      }
    }
  }

  def render(task:models.tasks.runWordCountTask,index:Integer): play.twirl.api.HtmlFormat.Appendable = apply(task,index)

  def f:((models.tasks.runWordCountTask,Integer) => play.twirl.api.HtmlFormat.Appendable) = (task,index) => apply(task,index)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 28 17:13:05 CDT 2021
                  SOURCE: /Users/petercui/workspace/idols/idols_user/app/views/workflow/wordcount.scala.html
                  HASH: b0fdaebea2652e8771fd856a083e57e1b09d13ea
                  MATRIX: 773->1|921->54|959->67|973->73|1088->179|1129->182|1173->200|1351->351|1377->356|1500->461|1538->617|1573->625|1756->781|1782->786|1909->895|1947->1114|1983->1123|2179->1292|2205->1297|2302->1376|2340->1534|2376->1543|2557->1697|2583->1702|2706->1798|2732->1803|2802->1846|2828->1851|2875->1870|2904->1871|2943->1882|2978->1890|2998->1901|3060->1942|3132->1986|3161->1987|3201->1999|3264->2035|3290->2040|3399->2122|3425->2127|3487->2161|3516->2162|3594->2212|3623->2213|3665->2227|3728->2263|3754->2268|3860->2347|3886->2352|3956->2394|3985->2395|4031->2414|4059->2415|4127->2453
                  LINES: 21->1|26->1|30->5|30->5|30->5|30->5|33->8|39->14|39->14|40->15|41->16|42->17|50->25|50->25|51->26|52->27|53->28|61->36|61->36|62->37|63->38|64->39|73->48|73->48|80->55|80->55|83->58|83->58|84->59|84->59|85->60|85->60|85->60|85->60|86->61|86->61|87->62|87->62|87->62|88->63|88->63|89->64|89->64|90->65|90->65|91->66|91->66|91->66|92->67|92->67|93->68|93->68|95->70|95->70|100->75
                  -- GENERATED --
              */
          