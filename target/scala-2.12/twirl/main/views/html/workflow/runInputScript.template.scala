
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

object runInputScript extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.tasks.RunInputScriptTask,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(task: models.tasks.RunInputScriptTask, index: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""
    
    """),_display_(/*3.6*/helper/*3.12*/.form(action = routes.WorkflowController.runTask(index), 'id -> "form".concat(index.toString))/*3.106*/  {_display_(Seq[Any](format.raw/*3.109*/("""
    	
    	
	    """),format.raw/*6.6*/("""<ul style="list-style:none">
	    
	     		<li>
			    	<div id="input"""),_display_(/*9.24*/index),format.raw/*9.29*/("""" class="indivsteps">
				</div>
			    </li>	

		        <li>
			    	<div id="script"""),_display_(/*14.25*/index),format.raw/*14.30*/("""" class="indivsteps">
						Script
					</div>
					<p>
					    <input type="text" id="file_path"""),_display_(/*18.43*/index),format.raw/*18.48*/("""" name="file_path" size="80" value=""""),_display_(/*18.85*/task/*18.89*/.path),format.raw/*18.94*/("""" required>
			    		    """),format.raw/*19.24*/("""
					    """),format.raw/*20.159*/(""" 
			    	"""),format.raw/*21.9*/("""</p>
			    </li>	
		    

	    		<li>
			    <div class="indivsteps">
					Show contents
				</div>
			    <p>
			    	<button type="submit" id="submit"""),_display_(/*30.42*/index),format.raw/*30.47*/("""" name="action" value="edit">Show</button>
			    </p>
		    </li>

		<div class="status_none" id="status_edit"""),_display_(/*34.44*/index),format.raw/*34.49*/(""""> </div>    

		 
		<textarea id="textarea"""),_display_(/*37.26*/index),format.raw/*37.31*/("""" rows="20" cols="100" name="text_area" ></textarea>
		
	    		<li>
			    <div class="indivsteps">
			    Save edits to file and/or Run script in the text area above
				</div>
			    <p>
			    	<button type="submit" id="submit_save"""),_display_(/*44.47*/index),format.raw/*44.52*/("""" name="action" value="save" style="width:80px" disabled>Save file</button>
			    	&nbsp; 
			    	<button type="submit" id="submit_run"""),_display_(/*46.46*/index),format.raw/*46.51*/("""" name="action" value="run" style="width:80px">Run script</button>
			    	<button type="submit" id="running"""),_display_(/*47.43*/index),format.raw/*47.48*/("""" style="display:none" style="width:80px" disabled >Running...</button>
			    </p>	
		   </li> 
		   
		 </ul>
		 
		 <div class="status_none" id="status_save"""),_display_(/*53.45*/index),format.raw/*53.50*/(""""> </div>

		   
  	    <script>
  	   
  	   var input = JSON.parse('"""),_display_(/*58.32*/task/*58.36*/.inputs),format.raw/*58.43*/("""'.replace(/&quot;/g, '\"'));
  	   var i;
  	   var key = Object.keys(input);
		for (i = 0; i < key.length; i++) """),format.raw/*61.36*/("""{"""),format.raw/*61.37*/(""" 
			"""),format.raw/*62.4*/("""var k = key[i];
			var v = input[k];
			console.log(k + " " + v);
		    document.getElementById('input' +  """),_display_(/*65.43*/index),format.raw/*65.48*/(""").insertAdjacentHTML("beforeend", "<p><label id='par' style='padding-right:10px'></label>    <input type=\"text\" id='val' style='width: 300px'></input></p>");
			document.getElementById('par').id = i + 'para' + """),_display_(/*66.54*/index),format.raw/*66.59*/(""";
			document.getElementById('val').name = '$' + (i + 1);
			document.getElementById('val').id = i + 'val' + """),_display_(/*68.53*/index),format.raw/*68.58*/(""";
			document.getElementById(i + 'para' + """),_display_(/*69.42*/index),format.raw/*69.47*/(""").innerHTML = k;
			document.getElementById(i + 'val' + """),_display_(/*70.41*/index),format.raw/*70.46*/(""").value = v;
		"""),format.raw/*71.3*/("""}"""),format.raw/*71.4*/("""
  	    
  	    
		    """),format.raw/*74.7*/("""$('#form"""),_display_(/*74.16*/index),format.raw/*74.21*/("""')
		    .ajaxForm("""),format.raw/*75.17*/("""{"""),format.raw/*75.18*/("""
		    	"""),format.raw/*76.8*/("""url : '"""),_display_(/*76.16*/routes/*76.22*/.WorkflowController.runTask(index)),format.raw/*76.56*/("""', 
		    	type : 'post',
		    	
		    	beforeSubmit: function(arr, $form, options)"""),format.raw/*79.51*/("""{"""),format.raw/*79.52*/("""
			    	"""),format.raw/*80.9*/("""document.getElementById('submit_run' +  """),_display_(/*80.50*/index),format.raw/*80.55*/(""").onmouseup = function() """),format.raw/*80.80*/("""{"""),format.raw/*80.81*/("""myFunction()"""),format.raw/*80.93*/("""}"""),format.raw/*80.94*/(""";
	
					function myFunction() """),format.raw/*82.28*/("""{"""),format.raw/*82.29*/("""
							"""),format.raw/*83.8*/("""console.log("*********");
							document.getElementById('submit_run' +  """),_display_(/*84.49*/index),format.raw/*84.54*/(""").style = "display:none";
							document.getElementById('running' +  """),_display_(/*85.46*/index),format.raw/*85.51*/(""").style = "display:inline";
	    					document.getElementById('status_save' + """),_display_(/*86.52*/index),format.raw/*86.57*/(""").innerHTML = ""
					"""),format.raw/*87.6*/("""}"""),format.raw/*87.7*/(""";
					console.log("change");
					return true;					
		    	"""),format.raw/*90.8*/("""}"""),format.raw/*90.9*/(""",		    	
		        		        
		        success : function (response) """),format.raw/*92.41*/("""{"""),format.raw/*92.42*/("""
		        		"""),format.raw/*93.13*/("""if (!response.startsWith("Saved as") && !response.startsWith("Run"))"""),format.raw/*93.81*/("""{"""),format.raw/*93.82*/("""
		        			"""),format.raw/*94.14*/("""console.log(response)
		        			document.getElementById('status_edit' + """),_display_(/*95.55*/index),format.raw/*95.60*/(""").className = "status_none";
		           		document.getElementById('status_edit' + """),_display_(/*96.57*/index),format.raw/*96.62*/(""").innerHTML = "";
		        			document.getElementById('textarea'+ """),_display_(/*97.51*/index),format.raw/*97.56*/(""").value = response;
		        		"""),format.raw/*98.13*/("""}"""),format.raw/*98.14*/("""        	
		           	
		           	"""),format.raw/*100.15*/("""if (response.startsWith("Saved as"))"""),format.raw/*100.51*/("""{"""),format.raw/*100.52*/("""
		           		"""),format.raw/*101.16*/("""document.getElementById('status_save' + """),_display_(/*101.57*/index),format.raw/*101.62*/(""").className = "status_success";
		           		document.getElementById('status_save' + """),_display_(/*102.57*/index),format.raw/*102.62*/(""").innerHTML = response;
		           				           	"""),format.raw/*103.30*/("""}"""),format.raw/*103.31*/("""
		           	"""),format.raw/*104.15*/("""if (response.startsWith("Run"))"""),format.raw/*104.46*/("""{"""),format.raw/*104.47*/("""
		           		"""),format.raw/*105.16*/("""document.getElementById('status_save' + """),_display_(/*105.57*/index),format.raw/*105.62*/(""").className = "status_success";
		           		document.getElementById('status_save' + """),_display_(/*106.57*/index),format.raw/*106.62*/(""").innerHTML = response;
		           		document.getElementById('status_' + """),_display_(/*107.53*/index),format.raw/*107.58*/(""").className = "status_success";
						document.getElementById('status_' + """),_display_(/*108.44*/index),format.raw/*108.49*/(""").innerHTML = response;
						document.getElementById('submit_run' +  """),_display_(/*109.48*/index),format.raw/*109.53*/(""").style = "display:inline";
						document.getElementById('running' +  """),_display_(/*110.45*/index),format.raw/*110.50*/(""").style = "display:none";
	
	           			
		           	"""),format.raw/*113.15*/("""}"""),format.raw/*113.16*/("""
		           	
		        """),format.raw/*115.11*/("""}"""),format.raw/*115.12*/(""",
		        error : function (xhr, status, error) """),format.raw/*116.49*/("""{"""),format.raw/*116.50*/("""
		        	   """),format.raw/*117.15*/("""if (xhr.responseText=="Failed: It is a directory. " || xhr.responseText=="Failed: Path does not exist. ")"""),format.raw/*117.120*/("""{"""),format.raw/*117.121*/("""
		        	   		"""),format.raw/*118.17*/("""document.getElementById('status_edit' + """),_display_(/*118.58*/index),format.raw/*118.63*/(""").className = "status_error";
		           		document.getElementById('status_edit' + """),_display_(/*119.57*/index),format.raw/*119.62*/(""").innerHTML = xhr.responseText;  	   
		        	   
		        	   """),format.raw/*121.15*/("""}"""),format.raw/*121.16*/("""else"""),format.raw/*121.20*/("""{"""),format.raw/*121.21*/("""
		           		"""),format.raw/*122.16*/("""document.getElementById('status_save' + """),_display_(/*122.57*/index),format.raw/*122.62*/(""").className = "status_error";
		           		document.getElementById('status_save' + """),_display_(/*123.57*/index),format.raw/*123.62*/(""").innerHTML = xhr.responseText;
		           		document.getElementById('status_' + """),_display_(/*124.53*/index),format.raw/*124.58*/(""").className = "status_error";
			   	   		document.getElementById('status_' + """),_display_(/*125.50*/index),format.raw/*125.55*/(""").innerHTML = xhr.responseText;
			   	   		document.getElementById('submit_run' +  """),_display_(/*126.54*/index),format.raw/*126.59*/(""").style = "display:inline";
						document.getElementById('running' +  """),_display_(/*127.45*/index),format.raw/*127.50*/(""").style = "display:none";
	           	   		     	   
		        	   
		        	   """),format.raw/*130.15*/("""}"""),format.raw/*130.16*/("""
		        """),format.raw/*131.11*/("""}"""),format.raw/*131.12*/(""",
		        
		    """),format.raw/*133.7*/("""}"""),format.raw/*133.8*/(""");
		</script>     

     """)))}),format.raw/*136.7*/("""  """))
      }
    }
  }

  def render(task:models.tasks.RunInputScriptTask,index:Integer): play.twirl.api.HtmlFormat.Appendable = apply(task,index)

  def f:((models.tasks.RunInputScriptTask,Integer) => play.twirl.api.HtmlFormat.Appendable) = (task,index) => apply(task,index)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 28 17:13:04 CDT 2021
                  SOURCE: /Users/petercui/workspace/idols/idols_user/app/views/workflow/runInputScript.scala.html
                  HASH: d722aebae4d5bbb24445f5fd386f96cd94f7161e
                  MATRIX: 780->1|930->56|966->67|980->73|1083->167|1124->170|1168->188|1265->259|1290->264|1404->351|1430->356|1555->454|1581->459|1645->496|1658->500|1684->505|1737->540|1776->699|1813->709|1993->862|2019->867|2157->978|2183->983|2254->1027|2280->1032|2542->1267|2568->1272|2732->1409|2758->1414|2894->1523|2920->1528|3107->1688|3133->1693|3231->1764|3244->1768|3272->1775|3413->1888|3442->1889|3474->1894|3609->2002|3635->2007|3875->2220|3901->2225|4038->2335|4064->2340|4134->2383|4160->2388|4244->2445|4270->2450|4312->2465|4340->2466|4390->2489|4426->2498|4452->2503|4499->2522|4528->2523|4563->2531|4598->2539|4613->2545|4668->2579|4780->2663|4809->2664|4845->2673|4913->2714|4939->2719|4992->2744|5021->2745|5061->2757|5090->2758|5149->2789|5178->2790|5213->2798|5314->2872|5340->2877|5438->2948|5464->2953|5570->3032|5596->3037|5645->3059|5673->3060|5760->3120|5788->3121|5886->3191|5915->3192|5956->3205|6052->3273|6081->3274|6123->3288|6226->3364|6252->3369|6364->3454|6390->3459|6485->3527|6511->3532|6571->3564|6600->3565|6668->3604|6733->3640|6763->3641|6808->3657|6877->3698|6904->3703|7020->3791|7047->3796|7129->3849|7159->3850|7203->3865|7263->3896|7293->3897|7338->3913|7407->3954|7434->3959|7550->4047|7577->4052|7681->4128|7708->4133|7811->4208|7838->4213|7937->4284|7964->4289|8064->4361|8091->4366|8178->4424|8208->4425|8263->4451|8293->4452|8372->4502|8402->4503|8446->4518|8581->4623|8612->4624|8658->4641|8727->4682|8754->4687|8868->4773|8895->4778|8991->4845|9021->4846|9054->4850|9084->4851|9129->4867|9198->4908|9225->4913|9339->4999|9366->5004|9478->5088|9505->5093|9612->5172|9639->5177|9752->5262|9779->5267|9879->5339|9906->5344|10018->5427|10048->5428|10088->5439|10118->5440|10165->5459|10194->5460|10252->5487
                  LINES: 21->1|26->1|28->3|28->3|28->3|28->3|31->6|34->9|34->9|39->14|39->14|43->18|43->18|43->18|43->18|43->18|44->19|45->20|46->21|55->30|55->30|59->34|59->34|62->37|62->37|69->44|69->44|71->46|71->46|72->47|72->47|78->53|78->53|83->58|83->58|83->58|86->61|86->61|87->62|90->65|90->65|91->66|91->66|93->68|93->68|94->69|94->69|95->70|95->70|96->71|96->71|99->74|99->74|99->74|100->75|100->75|101->76|101->76|101->76|101->76|104->79|104->79|105->80|105->80|105->80|105->80|105->80|105->80|105->80|107->82|107->82|108->83|109->84|109->84|110->85|110->85|111->86|111->86|112->87|112->87|115->90|115->90|117->92|117->92|118->93|118->93|118->93|119->94|120->95|120->95|121->96|121->96|122->97|122->97|123->98|123->98|125->100|125->100|125->100|126->101|126->101|126->101|127->102|127->102|128->103|128->103|129->104|129->104|129->104|130->105|130->105|130->105|131->106|131->106|132->107|132->107|133->108|133->108|134->109|134->109|135->110|135->110|138->113|138->113|140->115|140->115|141->116|141->116|142->117|142->117|142->117|143->118|143->118|143->118|144->119|144->119|146->121|146->121|146->121|146->121|147->122|147->122|147->122|148->123|148->123|149->124|149->124|150->125|150->125|151->126|151->126|152->127|152->127|155->130|155->130|156->131|156->131|158->133|158->133|161->136
                  -- GENERATED --
              */
          