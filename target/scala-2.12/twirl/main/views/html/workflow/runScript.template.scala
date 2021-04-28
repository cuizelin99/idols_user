
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

object runScript extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.tasks.runScriptTask,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(task: models.tasks.runScriptTask, index: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.52*/("""


    
    """),_display_(/*5.6*/helper/*5.12*/.form(action = routes.WorkflowController.runTask(index), 'id -> "form".concat(index.toString))/*5.106*/  {_display_(Seq[Any](format.raw/*5.109*/("""
    	
    	
	    """),format.raw/*8.6*/("""<ul style="list-style:none">


		        <li>
			    	<div class="indivsteps">
						File path
					</div>
					<p>
					    <input type="text" id="file_path"""),_display_(/*16.43*/index),format.raw/*16.48*/("""" name="file_path" size="80" value=""""),_display_(/*16.85*/task/*16.89*/.path),format.raw/*16.94*/("""" required>
			    		    """),format.raw/*17.24*/("""
					    """),format.raw/*18.159*/(""" 
			    	"""),format.raw/*19.9*/("""</p>
			    </li>	
		    

	    		<li>
			    <div class="indivsteps">
					Show contents
				</div>
			    <p>
			    	<button type="submit" id="submit"""),_display_(/*28.42*/index),format.raw/*28.47*/("""" name="action" value="edit">Show</button>
			    </p>
		    </li>

		<div class="status_none" id="status_edit"""),_display_(/*32.44*/index),format.raw/*32.49*/(""""> </div>    

		 
		<textarea id="textarea"""),_display_(/*35.26*/index),format.raw/*35.31*/("""" rows="20" cols="100" name="text_area"></textarea>
		
	    		<li>
			    <div class="indivsteps">
			    Save edits to file and/or Run script in the text area above
				</div>
			    <p>
			    	<button type="submit" id="submit_save"""),_display_(/*42.47*/index),format.raw/*42.52*/("""" name="action" value="save" style="width:80px" disabled>Save file</button>
			    	&nbsp; 
			    	<button type="submit" id="submit_run"""),_display_(/*44.46*/index),format.raw/*44.51*/("""" name="action" value="run" style="width:80px" disabled>Run script</button>
			    	<button type="submit" id="running"""),_display_(/*45.43*/index),format.raw/*45.48*/("""" style="display:none" style="width:80px" disabled >Running...</button>
			    	
			   <script>
			    	

				</script>
				
			    </p>	
		   </li> 
		   
		 </ul>
		 
		 	    
		   <div class="status_none" id="status_save"""),_display_(/*58.47*/index),format.raw/*58.52*/(""""> </div>

		   
  	    <script>
		    $('#form"""),_display_(/*62.16*/index),format.raw/*62.21*/("""')
		    .ajaxForm("""),format.raw/*63.17*/("""{"""),format.raw/*63.18*/("""
		    	"""),format.raw/*64.8*/("""url : '"""),_display_(/*64.16*/routes/*64.22*/.WorkflowController.runTask(index)),format.raw/*64.56*/("""', 
		    	type : 'post',
		    	
		    	beforeSubmit: function(arr, $form, options)"""),format.raw/*67.51*/("""{"""),format.raw/*67.52*/("""
			    	"""),format.raw/*68.9*/("""document.getElementById('submit_run' +  """),_display_(/*68.50*/index),format.raw/*68.55*/(""").onmouseup = function() """),format.raw/*68.80*/("""{"""),format.raw/*68.81*/("""myFunction()"""),format.raw/*68.93*/("""}"""),format.raw/*68.94*/(""";
	
					function myFunction() """),format.raw/*70.28*/("""{"""),format.raw/*70.29*/("""
							"""),format.raw/*71.8*/("""console.log("*********");
							document.getElementById('submit_run' +  """),_display_(/*72.49*/index),format.raw/*72.54*/(""").style = "display:none";
							document.getElementById('running' +  """),_display_(/*73.46*/index),format.raw/*73.51*/(""").style = "display:inline";
	    					document.getElementById('status_save' + """),_display_(/*74.52*/index),format.raw/*74.57*/(""").innerHTML = ""
					"""),format.raw/*75.6*/("""}"""),format.raw/*75.7*/(""";
					console.log("change");
					return true;					
		    	"""),format.raw/*78.8*/("""}"""),format.raw/*78.9*/(""",		    	
		        		        
		        success : function (response) """),format.raw/*80.41*/("""{"""),format.raw/*80.42*/("""
		        		"""),format.raw/*81.13*/("""if (!response.startsWith("Saved as") && !response.startsWith("Run"))"""),format.raw/*81.81*/("""{"""),format.raw/*81.82*/("""
		        			"""),format.raw/*82.14*/("""console.log(response)
		        			document.getElementById('status_edit' + """),_display_(/*83.55*/index),format.raw/*83.60*/(""").className = "status_none";
		           		document.getElementById('status_edit' + """),_display_(/*84.57*/index),format.raw/*84.62*/(""").innerHTML = "";
		        			document.getElementById('textarea'+ """),_display_(/*85.51*/index),format.raw/*85.56*/(""").value = response;
		        		"""),format.raw/*86.13*/("""}"""),format.raw/*86.14*/("""        	
		           	
		           	"""),format.raw/*88.15*/("""if (response.startsWith("Saved as"))"""),format.raw/*88.51*/("""{"""),format.raw/*88.52*/("""
		           		"""),format.raw/*89.16*/("""document.getElementById('status_save' + """),_display_(/*89.57*/index),format.raw/*89.62*/(""").className = "status_success";
		           		document.getElementById('status_save' + """),_display_(/*90.57*/index),format.raw/*90.62*/(""").innerHTML = response;
		           				           	"""),format.raw/*91.30*/("""}"""),format.raw/*91.31*/("""
		           	"""),format.raw/*92.15*/("""if (response.startsWith("Run"))"""),format.raw/*92.46*/("""{"""),format.raw/*92.47*/("""
		           		"""),format.raw/*93.16*/("""document.getElementById('status_save' + """),_display_(/*93.57*/index),format.raw/*93.62*/(""").className = "status_success";
		           		document.getElementById('status_save' + """),_display_(/*94.57*/index),format.raw/*94.62*/(""").innerHTML = response;
						document.getElementById('submit_run' +  """),_display_(/*95.48*/index),format.raw/*95.53*/(""").style = "display:inline";
						document.getElementById('running' +  """),_display_(/*96.45*/index),format.raw/*96.50*/(""").style = "display:none";
	
	           			runAll();
		           	"""),format.raw/*99.15*/("""}"""),format.raw/*99.16*/("""
		           	
		        """),format.raw/*101.11*/("""}"""),format.raw/*101.12*/(""",
		        error : function (xhr, status, error) """),format.raw/*102.49*/("""{"""),format.raw/*102.50*/("""
		        	   """),format.raw/*103.15*/("""if (xhr.responseText=="Failed: It is a directory. " || xhr.responseText=="Failed: Path does not exist. ")"""),format.raw/*103.120*/("""{"""),format.raw/*103.121*/("""
		        	   		"""),format.raw/*104.17*/("""document.getElementById('status_edit' + """),_display_(/*104.58*/index),format.raw/*104.63*/(""").className = "status_error";
		           		document.getElementById('status_edit' + """),_display_(/*105.57*/index),format.raw/*105.62*/(""").innerHTML = xhr.responseText;  	   
		        	   
		        	   """),format.raw/*107.15*/("""}"""),format.raw/*107.16*/("""else"""),format.raw/*107.20*/("""{"""),format.raw/*107.21*/("""
		           		"""),format.raw/*108.16*/("""document.getElementById('status_save' + """),_display_(/*108.57*/index),format.raw/*108.62*/(""").className = "status_error";
		           		document.getElementById('status_save' + """),_display_(/*109.57*/index),format.raw/*109.62*/(""").innerHTML = xhr.responseText;
		           		document.getElementById('status_' + """),_display_(/*110.53*/index),format.raw/*110.58*/(""").className = "status_error";
			   	   		document.getElementById('status_' + """),_display_(/*111.50*/index),format.raw/*111.55*/(""").innerHTML = xhr.responseText;
			   	   		document.getElementById('submit_run' +  """),_display_(/*112.54*/index),format.raw/*112.59*/(""").style = "display:inline";
						document.getElementById('running' +  """),_display_(/*113.45*/index),format.raw/*113.50*/(""").style = "display:none";
	           	   		runAll();       	   
		        	   
		        	   """),format.raw/*116.15*/("""}"""),format.raw/*116.16*/("""
		        		

		        """),format.raw/*119.11*/("""}"""),format.raw/*119.12*/(""",
		        
		    """),format.raw/*121.7*/("""}"""),format.raw/*121.8*/(""");
		</script>
		
				         

     """)))}),format.raw/*126.7*/("""  
     

   
  



 
"""))
      }
    }
  }

  def render(task:models.tasks.runScriptTask,index:Integer): play.twirl.api.HtmlFormat.Appendable = apply(task,index)

  def f:((models.tasks.runScriptTask,Integer) => play.twirl.api.HtmlFormat.Appendable) = (task,index) => apply(task,index)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 28 17:13:04 CDT 2021
                  SOURCE: /Users/petercui/workspace/idols/idols_user/app/views/workflow/runScript.scala.html
                  HASH: ba5506e1f1bb61801b0b96e06c19f42dfd35aa1f
                  MATRIX: 770->1|915->51|953->64|967->70|1070->164|1111->167|1155->185|1340->343|1366->348|1430->385|1443->389|1469->394|1522->429|1561->588|1598->598|1778->751|1804->756|1942->867|1968->872|2039->916|2065->921|2326->1155|2352->1160|2516->1297|2542->1302|2687->1420|2713->1425|2964->1649|2990->1654|3065->1702|3091->1707|3138->1726|3167->1727|3202->1735|3237->1743|3252->1749|3307->1783|3419->1867|3448->1868|3484->1877|3552->1918|3578->1923|3631->1948|3660->1949|3700->1961|3729->1962|3788->1993|3817->1994|3852->2002|3953->2076|3979->2081|4077->2152|4103->2157|4209->2236|4235->2241|4284->2263|4312->2264|4399->2324|4427->2325|4525->2395|4554->2396|4595->2409|4691->2477|4720->2478|4762->2492|4865->2568|4891->2573|5003->2658|5029->2663|5124->2731|5150->2736|5210->2768|5239->2769|5306->2808|5370->2844|5399->2845|5443->2861|5511->2902|5537->2907|5652->2995|5678->3000|5759->3053|5788->3054|5831->3069|5890->3100|5919->3101|5963->3117|6031->3158|6057->3163|6172->3251|6198->3256|6296->3327|6322->3332|6421->3404|6447->3409|6542->3476|6571->3477|6626->3503|6656->3504|6735->3554|6765->3555|6809->3570|6944->3675|6975->3676|7021->3693|7090->3734|7117->3739|7231->3825|7258->3830|7354->3897|7384->3898|7417->3902|7447->3903|7492->3919|7561->3960|7588->3965|7702->4051|7729->4056|7841->4140|7868->4145|7975->4224|8002->4229|8115->4314|8142->4319|8242->4391|8269->4396|8392->4490|8422->4491|8476->4516|8506->4517|8553->4536|8582->4537|8652->4576
                  LINES: 21->1|26->1|30->5|30->5|30->5|30->5|33->8|41->16|41->16|41->16|41->16|41->16|42->17|43->18|44->19|53->28|53->28|57->32|57->32|60->35|60->35|67->42|67->42|69->44|69->44|70->45|70->45|83->58|83->58|87->62|87->62|88->63|88->63|89->64|89->64|89->64|89->64|92->67|92->67|93->68|93->68|93->68|93->68|93->68|93->68|93->68|95->70|95->70|96->71|97->72|97->72|98->73|98->73|99->74|99->74|100->75|100->75|103->78|103->78|105->80|105->80|106->81|106->81|106->81|107->82|108->83|108->83|109->84|109->84|110->85|110->85|111->86|111->86|113->88|113->88|113->88|114->89|114->89|114->89|115->90|115->90|116->91|116->91|117->92|117->92|117->92|118->93|118->93|118->93|119->94|119->94|120->95|120->95|121->96|121->96|124->99|124->99|126->101|126->101|127->102|127->102|128->103|128->103|128->103|129->104|129->104|129->104|130->105|130->105|132->107|132->107|132->107|132->107|133->108|133->108|133->108|134->109|134->109|135->110|135->110|136->111|136->111|137->112|137->112|138->113|138->113|141->116|141->116|144->119|144->119|146->121|146->121|151->126
                  -- GENERATED --
              */
          