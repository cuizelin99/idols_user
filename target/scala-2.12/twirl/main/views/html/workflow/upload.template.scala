
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

object upload extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.tasks.UploadTask,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(task: models.tasks.UploadTask, index: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.49*/("""

"""),_display_(/*3.2*/helper/*3.8*/.form(action = controllers.routes.WorkflowController.runTask(index), 'enctype -> "multipart/form-data", 'id -> "form".concat(index.toString))/*3.149*/ {_display_(Seq[Any](format.raw/*3.151*/("""
    
    """),format.raw/*5.5*/("""<ul style="list-style:none">
    	<li>
			<div class="indivsteps">
				Choose """),_display_(/*8.13*/task/*8.17*/.task_name),format.raw/*8.27*/(""" """),format.raw/*8.28*/("""File
			</div>
		    <p>
		    	<input type="file" name=""""),_display_(/*11.34*/task/*11.38*/.task_name),format.raw/*11.48*/("""" value=""""),_display_(/*11.58*/task/*11.62*/.task_name),format.raw/*11.72*/("""">
			</p>
    		
    	</li>
    
    	<li>
	    	<div class="indivsteps">
				Define root directory
			</div>
			<p>
	    		<input type="text" id="root"""),_display_(/*21.36*/index),format.raw/*21.41*/("""" name="root" value=""""),_display_(/*21.63*/task/*21.67*/.root),format.raw/*21.72*/("""" style="width: 150px"> <button type="button" value="directory"""),_display_(/*21.135*/task/*21.139*/.task_name),format.raw/*21.149*/("""" onclick="openTree('"""),_display_(/*21.171*/index),format.raw/*21.176*/("""', document.getElementById('root' + """),_display_(/*21.213*/index),format.raw/*21.218*/(""").value)">Expand Directory</button>
	    	</p>
	    </li>
    
	    <li>
		    <div class="indivsteps">
				Choose or Enter directory to upload the file
			</div>
		    <p>
			    	<input name="dir" id="directory"""),_display_(/*30.41*/index),format.raw/*30.46*/("""" type="text" value=""""),_display_(/*30.68*/task/*30.72*/.root),format.raw/*30.77*/("""" style="width: 300px">
			    	<div class="dirTree" id="container"""),_display_(/*31.44*/index),format.raw/*31.49*/(""""></div>
		    </p>
		    <p>
		    		<button type="button" id="back"""),_display_(/*34.40*/index),format.raw/*34.45*/("""" onclick="openTree("""),_display_(/*34.66*/index),format.raw/*34.71*/(""", document.getElementById('directory'+ """),_display_(/*34.111*/index),format.raw/*34.116*/(""").value.substring(0, document.getElementById('directory' + """),_display_(/*34.176*/index),format.raw/*34.181*/(""").value.lastIndexOf('/')))" style="display: none;">Go to parent directory</button> <button type="button" id="forward"""),_display_(/*34.298*/index),format.raw/*34.303*/("""" onclick="openTree('"""),_display_(/*34.325*/index),format.raw/*34.330*/("""', document.getElementById('directory' + """),_display_(/*34.372*/index),format.raw/*34.377*/(""").value)" style="display: none;">Expand chosen directory</button>
		    </p>
	    </li>
    
	    <li>
		    <div class="indivsteps">
				Upload individual file
			</div>
		    <p>
		    		<button type="submit" id="submit"""),_display_(/*43.42*/index),format.raw/*43.47*/("""">Upload</button>
		    </p>
	    </li>
    </ul>
    

    <div class="status_none" id="status"""),_display_(/*49.41*/index),format.raw/*49.46*/(""""></div>
    

    <script>
	    $('#form"""),_display_(/*53.15*/index),format.raw/*53.20*/("""')
	    .ajaxForm("""),format.raw/*54.16*/("""{"""),format.raw/*54.17*/("""
	        """),format.raw/*55.10*/("""url : '"""),_display_(/*55.18*/controllers/*55.29*/.routes.WorkflowController.runTask(index)),format.raw/*55.70*/("""', 
	        success : function (response) """),format.raw/*56.40*/("""{"""),format.raw/*56.41*/("""

	        		"""),format.raw/*58.12*/("""document.getElementById('status' + """),_display_(/*58.48*/index),format.raw/*58.53*/(""").className = "status_success";
	           	document.getElementById('status' + """),_display_(/*59.50*/index),format.raw/*59.55*/(""").innerHTML = response;
	           	document.getElementById('status_' + """),_display_(/*60.51*/index),format.raw/*60.56*/(""").className = "status_success";
				document.getElementById('status_' + """),_display_(/*61.42*/index),format.raw/*61.47*/(""").innerHTML = response;

	        """),format.raw/*63.10*/("""}"""),format.raw/*63.11*/(""",
	        error : function (xhr, status, error) """),format.raw/*64.48*/("""{"""),format.raw/*64.49*/("""
	           """),format.raw/*65.13*/("""document.getElementById('status' + """),_display_(/*65.49*/index),format.raw/*65.54*/(""").className = "status_error";
	           document.getElementById('status' + """),_display_(/*66.49*/index),format.raw/*66.54*/(""").innerHTML = xhr.responseText;
	           document.getElementById('status_' + """),_display_(/*67.50*/index),format.raw/*67.55*/(""").className = "status_error";
			   document.getElementById('status_' + """),_display_(/*68.44*/index),format.raw/*68.49*/(""").innerHTML = xhr.responseText;
	        """),format.raw/*69.10*/("""}"""),format.raw/*69.11*/(""",

	    """),format.raw/*71.6*/("""}"""),format.raw/*71.7*/(""");
	</script>	
""")))}),format.raw/*73.2*/("""
	

"""))
      }
    }
  }

  def render(task:models.tasks.UploadTask,index:Integer): play.twirl.api.HtmlFormat.Appendable = apply(task,index)

  def f:((models.tasks.UploadTask,Integer) => play.twirl.api.HtmlFormat.Appendable) = (task,index) => apply(task,index)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 28 17:13:04 CDT 2021
                  SOURCE: /Users/petercui/workspace/idols/idols_user/app/views/workflow/upload.scala.html
                  HASH: b3473f5fb091d2a9dbfcde98d17d63f5c2ade689
                  MATRIX: 764->1|906->48|934->51|947->57|1097->198|1137->200|1173->210|1278->289|1290->293|1320->303|1348->304|1433->362|1446->366|1477->376|1514->386|1527->390|1558->400|1738->553|1764->558|1813->580|1826->584|1852->589|1943->652|1957->656|1989->666|2039->688|2066->693|2131->730|2158->735|2398->948|2424->953|2473->975|2486->979|2512->984|2606->1051|2632->1056|2728->1125|2754->1130|2802->1151|2828->1156|2896->1196|2923->1201|3011->1261|3038->1266|3183->1383|3210->1388|3260->1410|3287->1415|3357->1457|3384->1462|3633->1684|3659->1689|3782->1785|3808->1790|3877->1832|3903->1837|3949->1855|3978->1856|4016->1866|4051->1874|4071->1885|4133->1926|4204->1969|4233->1970|4274->1983|4337->2019|4363->2024|4471->2105|4497->2110|4598->2184|4624->2189|4724->2262|4750->2267|4812->2301|4841->2302|4918->2351|4947->2352|4988->2365|5051->2401|5077->2406|5182->2484|5208->2489|5316->2570|5342->2575|5442->2648|5468->2653|5537->2694|5566->2695|5601->2703|5629->2704|5675->2720
                  LINES: 21->1|26->1|28->3|28->3|28->3|28->3|30->5|33->8|33->8|33->8|33->8|36->11|36->11|36->11|36->11|36->11|36->11|46->21|46->21|46->21|46->21|46->21|46->21|46->21|46->21|46->21|46->21|46->21|46->21|55->30|55->30|55->30|55->30|55->30|56->31|56->31|59->34|59->34|59->34|59->34|59->34|59->34|59->34|59->34|59->34|59->34|59->34|59->34|59->34|59->34|68->43|68->43|74->49|74->49|78->53|78->53|79->54|79->54|80->55|80->55|80->55|80->55|81->56|81->56|83->58|83->58|83->58|84->59|84->59|85->60|85->60|86->61|86->61|88->63|88->63|89->64|89->64|90->65|90->65|90->65|91->66|91->66|92->67|92->67|93->68|93->68|94->69|94->69|96->71|96->71|98->73
                  -- GENERATED --
              */
          