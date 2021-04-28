
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

object showResult extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.tasks.showResultTask,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(task: models.tasks.showResultTask, index: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.53*/("""
  
    """),_display_(/*3.6*/helper/*3.12*/.form(action = controllers.routes.WorkflowController.runTask(index), 'id -> "form".concat(index.toString))/*3.118*/  {_display_(Seq[Any](format.raw/*3.121*/("""
   	    	
	    """),format.raw/*5.6*/("""<ul style="list-style:none">
	    
	    		<li>
	    			<div class="indivsteps" id="fileType"""),_display_(/*8.46*/index),format.raw/*8.51*/("""" style="display:none">
						File Type
						<select id="file_type"""),_display_(/*10.29*/index),format.raw/*10.34*/("""" name="file_type">
						    <option value="empty"></option>
				    			<option value="image">image</option>
				    			<option value="audio">audio</option>
				    			<option value="text">text</option>
				    			<option value="JSON">JSON</option>			    			
				    		</select>
				</div>
	    		</li>
	    		
	    		<div id="directory_widget"""),_display_(/*20.34*/index),format.raw/*20.39*/("""" style="display:inline">
					    	
			<li>
	    			<div class="indivsteps">
					Define root directory to start exploring
				</div>
				<p>
	    				<input type="text" id="root"""),_display_(/*27.38*/index),format.raw/*27.43*/("""" name="root" value=""""),_display_(/*27.65*/task/*27.69*/.output_path),format.raw/*27.81*/("""" style="width: 400px" > <button type="button" value="directory"""),_display_(/*27.145*/task/*27.149*/.task_name),format.raw/*27.159*/("""" onclick="openTree('"""),_display_(/*27.181*/index),format.raw/*27.186*/("""', document.getElementById('root' + """),_display_(/*27.223*/index),format.raw/*27.228*/(""").value)">View</button> <button type="button" value="directory"""),_display_(/*27.291*/task/*27.295*/.task_name),format.raw/*27.305*/("""" onclick="openTreeRefresh('"""),_display_(/*27.334*/index),format.raw/*27.339*/("""', document.getElementById('root' + """),_display_(/*27.376*/index),format.raw/*27.381*/(""").value)">Refresh</button>
	    			</p>
	   		</li>
    
	   	 	<li>
		    		<div class="indivsteps">
					File Path
				</div>
		    		<p>
			    		<input name="output_path" id="directory"""),_display_(/*36.50*/index),format.raw/*36.55*/("""" type="text" value=""""),_display_(/*36.77*/task/*36.81*/.output_path),format.raw/*36.93*/("""" style="width: 400px" readonly>
			    		<div class="dirTree" id="container"""),_display_(/*37.45*/index),format.raw/*37.50*/(""""></div>
		    		</p>
		    		<p>
		    			<button type="button" id="back"""),_display_(/*40.41*/index),format.raw/*40.46*/("""" onclick="openTree("""),_display_(/*40.67*/index),format.raw/*40.72*/(""", document.getElementById('directory'+ """),_display_(/*40.112*/index),format.raw/*40.117*/(""").value.substring(0, document.getElementById('directory' + """),_display_(/*40.177*/index),format.raw/*40.182*/(""").value.lastIndexOf('/')))" style="display: none;">Go to parent directory</button> <button type="button" id="forward"""),_display_(/*40.299*/index),format.raw/*40.304*/("""" onclick="openTree('"""),_display_(/*40.326*/index),format.raw/*40.331*/("""', document.getElementById('directory' + """),_display_(/*40.373*/index),format.raw/*40.378*/(""").value)" style="display: none;">Expand chosen directory</button> 
		    		</p>
	    		</li>
	    		</div>
	    		
	    		
	   		<div id="image_widget"""),_display_(/*46.29*/index),format.raw/*46.34*/("""" style="display:none">
				    	<p>
					    	<button type="submit" id="show_image"""),_display_(/*48.48*/index),format.raw/*48.53*/("""" name="action" value="show_image" >Show</button>
					    	<button type="submit" id="running_image"""),_display_(/*49.51*/index),format.raw/*49.56*/("""" style="display:none" style="width:80px" disabled >Running...</button>
			        </p>
			    		<img src=""""),_display_(/*51.21*/controllers/*51.32*/.routes.Assets.versioned("images/tweets_map.png")),format.raw/*51.81*/("""" id="image"""),_display_(/*51.93*/index),format.raw/*51.98*/("""" style="display:none"  />		        
	    				<p>
						<button type="submit" id="download_image"""),_display_(/*53.48*/index),format.raw/*53.53*/("""" name="action" value="download_image" onclick="download(document.getElementById('directory'+ """),_display_(/*53.148*/index),format.raw/*53.153*/(""").value)">Download</button>
					<p>
    			</div>
    		
    		
	    		<div id="audio_widget"""),_display_(/*58.30*/index),format.raw/*58.35*/("""" style="display:none">
	    				<p>
					    	<button type="button" id="show_audio"""),_display_(/*60.48*/index),format.raw/*60.53*/("""" name="action" value="show_audio" onclick="showAudio(document.getElementById('directory'+ """),_display_(/*60.145*/index),format.raw/*60.150*/(""").value, """),_display_(/*60.160*/index),format.raw/*60.165*/(""")">Show</button>
			        </p>
				    
			        <audio controls="" id="audio_controls"""),_display_(/*63.50*/index),format.raw/*63.55*/("""" style="display:none">
			        <source src=""""),_display_(/*64.26*/controllers/*64.37*/.routes.Assets.versioned("audio_data/174-84280.wav")),format.raw/*64.89*/("""" type="audio/wav" id="audio"""),_display_(/*64.118*/index),format.raw/*64.123*/("""" />
					</audio>	        
	    				<p>
						<button type="submit" id="download_audio"""),_display_(/*67.48*/index),format.raw/*67.53*/("""" name="action" value="download_audio" onclick="download(document.getElementById('directory'+ """),_display_(/*67.148*/index),format.raw/*67.153*/(""").value)">Download</button>
					<p>
	    		</div>
	    		
	    		<div id="JSON_widget"""),_display_(/*71.29*/index),format.raw/*71.34*/("""" style="display:none">
	    				<p>
					    	<button type="submit" id="show_JSON"""),_display_(/*73.47*/index),format.raw/*73.52*/("""" name="action" value="show_JSON">Show</button>
			        </p> 
	    		</div>
	    		
	    		<div id="text_widget"""),_display_(/*77.29*/index),format.raw/*77.34*/("""" style="display:none">
		    			<div class="indivsteps" style="display:none">
							Hadoop File System
					<select id="file_system"""),_display_(/*80.30*/index),format.raw/*80.35*/("""" name="file_system" >
			    			<option value="no">no</option>
			    			<option value="yes">yes</option>				    			
			    		</select>					    		
					</div>
					"""),_display_(/*85.7*/{/*
			        	<div class="indivsteps">
						Top
					</div>
					<p>
			    			<input type="number" id="top_n@index" name="top_n" min="1" max="200" value="10" required> row
			    	    </p>
			    	    */}),format.raw/*92.16*/("""
				    """),format.raw/*93.9*/("""<div class="indivsteps">
						Show Contents
					</div>
				    <p>
				    	<button type="submit" id="show_text"""),_display_(/*97.46*/index),format.raw/*97.51*/("""" name="action" value="show_text">Show</button>
				    </p>
			    	    	<p>
							<button type="submit" id="download_text"""),_display_(/*100.48*/index),format.raw/*100.53*/("""" name="action" value="download_text" onclick="download(document.getElementById('directory'+ """),_display_(/*100.147*/index),format.raw/*100.152*/(""").value)">Download</button>
					<p>	    		
	    		</div> 
	    		
	    		<div id = "init"""),_display_(/*104.24*/index),format.raw/*104.29*/("""" style = "display:none"></div>   
	    		
	    		<div class="status" id="status"""),_display_(/*106.39*/index),format.raw/*106.44*/(""""></div>
		</ul>	
		
    
	    <script>
	    document.getElementById('init' + """),_display_(/*111.40*/index),format.raw/*111.45*/(""").innerHTML = show_display();
	    
	    function showAudio(path, idx) """),format.raw/*113.36*/("""{"""),format.raw/*113.37*/("""
		    """),format.raw/*114.7*/("""console.log(path);
	    		var src = "/audio_data/" + path.substring(path.lastIndexOf('/') );
	    		console.log(idx);
	    		console.log(src);
	    		var audio = document.getElementById('audio_controls' + idx)
	    		document.getElementById('audio' + idx).src = src
	    		audio.load()
	    		audio.play()
		    document.getElementById('audio_controls' + idx).style = "display:inline";
	    """),format.raw/*123.6*/("""}"""),format.raw/*123.7*/("""
	    
	    """),format.raw/*125.6*/("""function showJSON(path, idx)"""),format.raw/*125.34*/("""{"""),format.raw/*125.35*/("""
	    		"""),format.raw/*126.8*/("""console.log(path);
	    		$.getJSON(path, function(data)"""),format.raw/*127.38*/("""{"""),format.raw/*127.39*/("""
	    		"""),format.raw/*128.8*/("""var 	json_data = '';
	    		$.each(data, function(key, value)"""),format.raw/*129.41*/("""{"""),format.raw/*129.42*/("""
	    			"""),format.raw/*130.9*/("""json_data += '<tr>';
	    			json_data += '<td>' + value.label + '</td>';
	    			json_data += '</tr>';
	    		"""),format.raw/*133.8*/("""}"""),format.raw/*133.9*/(""");
	    		document.getElementById('json_table'+ idx).appendChild(json_data);
	    		document.getElementById('json_table'+ idx).style = "display:inline";
	    	"""),format.raw/*136.7*/("""}"""),format.raw/*136.8*/(""");
	    """),format.raw/*137.6*/("""}"""),format.raw/*137.7*/("""
	    
	    """),format.raw/*139.6*/("""function download(path) """),format.raw/*139.30*/("""{"""),format.raw/*139.31*/("""
	    		"""),format.raw/*140.8*/("""console.log(path);
	    	    window.open("/download?path=" + path);
	    """),format.raw/*142.6*/("""}"""),format.raw/*142.7*/("""
	    
	    """),format.raw/*144.6*/("""function  show_display()"""),format.raw/*144.30*/("""{"""),format.raw/*144.31*/("""
	    		"""),format.raw/*145.8*/("""if (""""),_display_(/*145.14*/task/*145.18*/.show_type),format.raw/*145.28*/(""""=="show_image")"""),format.raw/*145.44*/("""{"""),format.raw/*145.45*/("""
	    			"""),format.raw/*146.9*/("""document.getElementById('image' + """),_display_(/*146.44*/index),format.raw/*146.49*/(""").style = "display:none"
	    		    document.getElementById('text_widget' + """),_display_(/*147.53*/index),format.raw/*147.58*/(""").style = "display:none";
	    		    document.getElementById('status' + """),_display_(/*148.48*/index),format.raw/*148.53*/(""").style = "display:none";
	    			document.getElementById('image_widget' + """),_display_(/*149.51*/index),format.raw/*149.56*/(""").style = "display:inline";
	    			document.getElementById('audio_widget' + """),_display_(/*150.51*/index),format.raw/*150.56*/(""").style = "display:none";
	    			document.getElementById('JSON_widget' + """),_display_(/*151.50*/index),format.raw/*151.55*/(""").style = "display:none";
	    		"""),format.raw/*152.8*/("""}"""),format.raw/*152.9*/(""" """),format.raw/*152.10*/("""else if (""""),_display_(/*152.21*/task/*152.25*/.show_type),format.raw/*152.35*/(""""=="show_audio") """),format.raw/*152.52*/("""{"""),format.raw/*152.53*/("""
	    			"""),format.raw/*153.9*/("""document.getElementById('audio_controls' + """),_display_(/*153.53*/index),format.raw/*153.58*/(""").style = "display:none"
	    			document.getElementById('image_widget' + """),_display_(/*154.51*/index),format.raw/*154.56*/(""").style = "display:none";
	    			document.getElementById('status' + """),_display_(/*155.45*/index),format.raw/*155.50*/(""").style = "display:none";
	    		    document.getElementById('text_widget' + """),_display_(/*156.53*/index),format.raw/*156.58*/(""").style = "display:none";
	    		    	document.getElementById('audio_widget' + """),_display_(/*157.55*/index),format.raw/*157.60*/(""").style = "display:inline";
	    		    	document.getElementById('JSON_widget' + """),_display_(/*158.54*/index),format.raw/*158.59*/(""").style = "display:none";
	    		"""),format.raw/*159.8*/("""}"""),format.raw/*159.9*/(""" """),format.raw/*159.10*/("""else if (""""),_display_(/*159.21*/task/*159.25*/.show_type),format.raw/*159.35*/(""""=="show_text")"""),format.raw/*159.50*/("""{"""),format.raw/*159.51*/("""
	    			"""),format.raw/*160.9*/("""document.getElementById('audio_controls' + """),_display_(/*160.53*/index),format.raw/*160.58*/(""").style = "display:none"
	    			document.getElementById('image_widget' + """),_display_(/*161.51*/index),format.raw/*161.56*/(""").style = "display:none";
	    			document.getElementById('status' + """),_display_(/*162.45*/index),format.raw/*162.50*/(""").style = "display:none";
	    		    document.getElementById('text_widget' + """),_display_(/*163.53*/index),format.raw/*163.58*/(""").style = "display:inline";
	    			document.getElementById('audio_widget' + """),_display_(/*164.51*/index),format.raw/*164.56*/(""").style = "display:none";
	    			document.getElementById('JSON_widget' + """),_display_(/*165.50*/index),format.raw/*165.55*/(""").style = "display:none";
	    		"""),format.raw/*166.8*/("""}"""),format.raw/*166.9*/(""" """),format.raw/*166.10*/("""else if (""""),_display_(/*166.21*/task/*166.25*/.show_type),format.raw/*166.35*/(""""=="show_JSON")"""),format.raw/*166.50*/("""{"""),format.raw/*166.51*/("""
	    			"""),format.raw/*167.9*/("""document.getElementById('audio_controls' + """),_display_(/*167.53*/index),format.raw/*167.58*/(""").style = "display:none"
	    			document.getElementById('image_widget' + """),_display_(/*168.51*/index),format.raw/*168.56*/(""").style = "display:none";
	    			document.getElementById('status' + """),_display_(/*169.45*/index),format.raw/*169.50*/(""").style = "display:none";
	    		    document.getElementById('text_widget' + """),_display_(/*170.53*/index),format.raw/*170.58*/(""").style = "display:none";
	    			document.getElementById('audio_widget' + """),_display_(/*171.51*/index),format.raw/*171.56*/(""").style = "display:none";
	    			document.getElementById('JSON_widget' + """),_display_(/*172.50*/index),format.raw/*172.55*/(""").style = "display:inline";
	    		"""),format.raw/*173.8*/("""}"""),format.raw/*173.9*/(""" """),format.raw/*173.10*/("""else """),format.raw/*173.15*/("""{"""),format.raw/*173.16*/("""
	    		    """),format.raw/*174.12*/("""document.getElementById('fileType' + """),_display_(/*174.50*/index),format.raw/*174.55*/(""").style = "display:inline";
	    		    document.querySelector('#file_type' + """),_display_(/*175.51*/index),format.raw/*175.56*/(""").onchange = function() """),format.raw/*175.80*/("""{"""),format.raw/*175.81*/("""	    
			    		"""),format.raw/*176.10*/("""if (this.value=="image")"""),format.raw/*176.34*/("""{"""),format.raw/*176.35*/("""
			    			"""),format.raw/*177.11*/("""document.getElementById('image' + """),_display_(/*177.46*/index),format.raw/*177.51*/(""").style = "display:none"
			    		    document.getElementById('text_widget' + """),_display_(/*178.55*/index),format.raw/*178.60*/(""").style = "display:none";
			    		    document.getElementById('status' + """),_display_(/*179.50*/index),format.raw/*179.55*/(""").style = "display:none";
			    			document.getElementById('image_widget' + """),_display_(/*180.53*/index),format.raw/*180.58*/(""").style = "display:inline";
			    			document.getElementById('audio_widget' + """),_display_(/*181.53*/index),format.raw/*181.58*/(""").style = "display:none";
			    			document.getElementById('JSON_widget' + """),_display_(/*182.52*/index),format.raw/*182.57*/(""").style = "display:none";
			    		"""),format.raw/*183.10*/("""}"""),format.raw/*183.11*/(""" """),format.raw/*183.12*/("""else if (this.value=="audio") """),format.raw/*183.42*/("""{"""),format.raw/*183.43*/("""
			    			"""),format.raw/*184.11*/("""document.getElementById('audio_controls' + """),_display_(/*184.55*/index),format.raw/*184.60*/(""").style = "display:none"
			    			document.getElementById('image_widget' + """),_display_(/*185.53*/index),format.raw/*185.58*/(""").style = "display:none";
			    			document.getElementById('status' + """),_display_(/*186.47*/index),format.raw/*186.52*/(""").style = "display:none";
			    		    document.getElementById('text_widget' + """),_display_(/*187.55*/index),format.raw/*187.60*/(""").style = "display:none";
			    		    	document.getElementById('audio_widget' + """),_display_(/*188.57*/index),format.raw/*188.62*/(""").style = "display:inline";
			    		    	document.getElementById('JSON_widget' + """),_display_(/*189.56*/index),format.raw/*189.61*/(""").style = "display:none";
			    		"""),format.raw/*190.10*/("""}"""),format.raw/*190.11*/(""" """),format.raw/*190.12*/("""else if (this.value=="text")"""),format.raw/*190.40*/("""{"""),format.raw/*190.41*/("""
			    			"""),format.raw/*191.11*/("""document.getElementById('audio_controls' + """),_display_(/*191.55*/index),format.raw/*191.60*/(""").style = "display:none"
			    			document.getElementById('image_widget' + """),_display_(/*192.53*/index),format.raw/*192.58*/(""").style = "display:none";
			    			document.getElementById('status' + """),_display_(/*193.47*/index),format.raw/*193.52*/(""").style = "display:none";
			    		    document.getElementById('text_widget' + """),_display_(/*194.55*/index),format.raw/*194.60*/(""").style = "display:inline";
			    			document.getElementById('audio_widget' + """),_display_(/*195.53*/index),format.raw/*195.58*/(""").style = "display:none";
			    			document.getElementById('JSON_widget' + """),_display_(/*196.52*/index),format.raw/*196.57*/(""").style = "display:none";
			    		"""),format.raw/*197.10*/("""}"""),format.raw/*197.11*/(""" """),format.raw/*197.12*/("""else if (this.value=="JSON")"""),format.raw/*197.40*/("""{"""),format.raw/*197.41*/("""
			    			"""),format.raw/*198.11*/("""document.getElementById('audio_controls' + """),_display_(/*198.55*/index),format.raw/*198.60*/(""").style = "display:none"
			    			document.getElementById('image_widget' + """),_display_(/*199.53*/index),format.raw/*199.58*/(""").style = "display:none";
			    			document.getElementById('status' + """),_display_(/*200.47*/index),format.raw/*200.52*/(""").style = "display:none";
			    		    document.getElementById('text_widget' + """),_display_(/*201.55*/index),format.raw/*201.60*/(""").style = "display:none";
			    			document.getElementById('audio_widget' + """),_display_(/*202.53*/index),format.raw/*202.58*/(""").style = "display:none";
			    			document.getElementById('JSON_widget' + """),_display_(/*203.52*/index),format.raw/*203.57*/(""").style = "display:inline";
			    		"""),format.raw/*204.10*/("""}"""),format.raw/*204.11*/(""" """),format.raw/*204.12*/("""else """),format.raw/*204.17*/("""{"""),format.raw/*204.18*/("""
			    		    """),format.raw/*205.14*/("""document.getElementById('image_widget' + """),_display_(/*205.56*/index),format.raw/*205.61*/(""").style = "display:none";
			    		    document.getElementById('text_widget' + """),_display_(/*206.55*/index),format.raw/*206.60*/(""").style = "display:none";
			    		    document.getElementById('status' + """),_display_(/*207.50*/index),format.raw/*207.55*/(""").style = "display:none";
			    			document.getElementById('audio_widget' + """),_display_(/*208.53*/index),format.raw/*208.58*/(""").style = "display:none";
			    			document.getElementById('JSON_widget' + """),_display_(/*209.52*/index),format.raw/*209.57*/(""").style = "display:none";
			    		"""),format.raw/*210.10*/("""}"""),format.raw/*210.11*/("""	    		
			    """),format.raw/*211.8*/("""}"""),format.raw/*211.9*/("""
	    		"""),format.raw/*212.8*/("""}"""),format.raw/*212.9*/("""
	    """),format.raw/*213.6*/("""}"""),format.raw/*213.7*/("""
	    
	   
	    
		    """),format.raw/*217.7*/("""$('#form"""),_display_(/*217.16*/index),format.raw/*217.21*/("""')
		    .ajaxForm("""),format.raw/*218.17*/("""{"""),format.raw/*218.18*/("""
		    
		        """),format.raw/*220.11*/("""url : '"""),_display_(/*220.19*/controllers/*220.30*/.routes.WorkflowController.runTask(index)),format.raw/*220.71*/("""',		        
		        type : 'post',
		    	
		    		beforeSubmit: function(arr, $form, options)"""),format.raw/*223.52*/("""{"""),format.raw/*223.53*/("""
		    				        		        """),format.raw/*224.29*/("""console.log("before sub")
		    		
				    	document.getElementById('show_image' +  """),_display_(/*226.51*/index),format.raw/*226.56*/(""").onmouseup = function() """),format.raw/*226.81*/("""{"""),format.raw/*226.82*/("""myFunction()"""),format.raw/*226.94*/("""}"""),format.raw/*226.95*/(""";
		
						function myFunction() """),format.raw/*228.29*/("""{"""),format.raw/*228.30*/("""
								"""),format.raw/*229.9*/("""document.getElementById('show_image' +  """),_display_(/*229.50*/index),format.raw/*229.55*/(""").style = "display:none";
								document.getElementById('running_image' +  """),_display_(/*230.53*/index),format.raw/*230.58*/(""").style = "display:inline";
		    						document.getElementById('image' + """),_display_(/*231.48*/index),format.raw/*231.53*/(""").style = "display:none"
						"""),format.raw/*232.7*/("""}"""),format.raw/*232.8*/(""";
						
						return true;					
		   	 	"""),format.raw/*235.9*/("""}"""),format.raw/*235.10*/(""",
		   	 	
		        success : function (response) """),format.raw/*237.41*/("""{"""),format.raw/*237.42*/("""
		        		"""),format.raw/*238.13*/("""if (response.startsWith("image")) """),format.raw/*238.47*/("""{"""),format.raw/*238.48*/("""
		        			"""),format.raw/*239.14*/("""console.log(response)
			        		var b = response.split(":")[1]
			        		console.log(b)
			        		var a="/images/"
			        		var src = a + b  
			        		console.log(src)
	        			
		        			document.getElementById('image' + """),_display_(/*246.49*/index),format.raw/*246.54*/(""").src = src;
		           		document.getElementById('image' + """),_display_(/*247.51*/index),format.raw/*247.56*/(""").style = "display:inline";
		           		document.getElementById('status' + """),_display_(/*248.52*/index),format.raw/*248.57*/(""").className = "status_success";
		           		
		           		document.getElementById('show_image' +  """),_display_(/*250.57*/index),format.raw/*250.62*/(""").style = "display:inline";
						document.getElementById('running_image' +  """),_display_(/*251.51*/index),format.raw/*251.56*/(""").style = "display:none";	
		           	"""),format.raw/*252.15*/("""}"""),format.raw/*252.16*/(""" """),format.raw/*252.17*/("""else if (response.startsWith("audio"))"""),format.raw/*252.55*/("""{"""),format.raw/*252.56*/("""
		           		"""),format.raw/*253.16*/("""console.log(response)
			        		var b = response.split(":")[1]
			        		console.log(b)
			        		var a="/images/"
			        		var src = a + b  
			        		console.log(src)
		           		document.getElementById('audio' + """),_display_(/*259.51*/index),format.raw/*259.56*/(""").src = src;
		           		document.getElementById('audio' + """),_display_(/*260.51*/index),format.raw/*260.56*/(""").style = "display:inline";
		           		document.getElementById('status' + """),_display_(/*261.52*/index),format.raw/*261.57*/(""").className = "status_success";
		           		
		           		document.getElementById('show_audio' +  """),_display_(/*263.57*/index),format.raw/*263.62*/(""").style = "display:inline";
						document.getElementById('running_audio' +  """),_display_(/*264.51*/index),format.raw/*264.56*/(""").style = "display:none";
		           	"""),format.raw/*265.15*/("""}"""),format.raw/*265.16*/(""" """),format.raw/*265.17*/("""else if (response.startsWith("JSON"))"""),format.raw/*265.54*/("""{"""),format.raw/*265.55*/("""
		           		"""),format.raw/*266.16*/("""console.log("RESPONSE::" + response)
		           		var b = response.substring(10)
		           		console.log("B::" + b)
		           		js2JTable(JSON.parse(b))
		           		document.getElementById('status' + """),_display_(/*270.52*/index),format.raw/*270.57*/(""").style = "display:inline";
		           	 	document.getElementById('status' + """),_display_(/*271.53*/index),format.raw/*271.58*/(""").className = "status_success";
		           	"""),format.raw/*272.15*/("""}"""),format.raw/*272.16*/(""" """),format.raw/*272.17*/("""else """),format.raw/*272.22*/("""{"""),format.raw/*272.23*/("""
			           	"""),format.raw/*273.16*/("""console.log("ELSE")
		           		document.getElementById('status' + """),_display_(/*274.52*/index),format.raw/*274.57*/(""").style = "display:inline";
		           	 	document.getElementById('status' + """),_display_(/*275.53*/index),format.raw/*275.58*/(""").className = "status_success";
		           		document.getElementById('status' + """),_display_(/*276.52*/index),format.raw/*276.57*/(""").innerHTML = response;		         
		           	"""),format.raw/*277.15*/("""}"""),format.raw/*277.16*/("""
		        """),format.raw/*278.11*/("""}"""),format.raw/*278.12*/(""",
		        error : function (xhr, status, error) """),format.raw/*279.49*/("""{"""),format.raw/*279.50*/("""
		        		        """),format.raw/*280.21*/("""console.log("error")
		        
		        	   document.getElementById('status' + """),_display_(/*282.51*/index),format.raw/*282.56*/(""").style = "display:inline";
		           document.getElementById('status' + """),_display_(/*283.50*/index),format.raw/*283.55*/(""").className = "status_error";
		           document.getElementById('status' + """),_display_(/*284.50*/index),format.raw/*284.55*/(""").innerHTML = xhr.responseText;
		           document.getElementById('image' + """),_display_(/*285.49*/index),format.raw/*285.54*/(""").style = "display:none";
		           document.getElementById('show_image' +  """),_display_(/*286.55*/index),format.raw/*286.60*/(""").style = "display:inline";
				   document.getElementById('running_image' +  """),_display_(/*287.52*/index),format.raw/*287.57*/(""").style = "display:none";	
		        """),format.raw/*288.11*/("""}"""),format.raw/*288.12*/(""",
		        
		    """),format.raw/*290.7*/("""}"""),format.raw/*290.8*/(""");
		
		function js2Table(jsondata)"""),format.raw/*292.30*/("""{"""),format.raw/*292.31*/("""
		 """),format.raw/*293.4*/("""var table = document.createElement("table");
		 table.setAttribute("id", "myDataTable");
		 table.setAttribute("class", "display")
		 var json_result = "";
		 json_result += "<div>";
         json_result += "<style>";
         json_result += "table, th, td """),format.raw/*299.40*/("""{"""),format.raw/*299.41*/(""" """),format.raw/*299.42*/("""border: 1px solid black;border-collapse: collapse;"""),format.raw/*299.92*/("""}"""),format.raw/*299.93*/("""th, td """),format.raw/*299.100*/("""{"""),format.raw/*299.101*/("""padding: 5px;text-align: left; """),format.raw/*299.132*/("""}"""),format.raw/*299.133*/("""";
         json_result += "</style>";
         json_result += "<table style=\"width:100%\">";
         for(attribute in jsondata)"""),format.raw/*302.36*/("""{"""),format.raw/*302.37*/("""
         	"""),format.raw/*303.11*/("""if(typeof jsondata[attribute] == 'object')"""),format.raw/*303.53*/("""{"""),format.raw/*303.54*/("""
         		"""),format.raw/*304.12*/("""json_result += "<tr><th scope = \"row\">" + attribute + "</th>";
         		json_result += "<td><table>";
         		for(sub in jsondata[attribute])"""),format.raw/*306.43*/("""{"""),format.raw/*306.44*/("""
         			
         			"""),format.raw/*308.13*/("""if(typeof jsondata[attribute][sub] == 'object')"""),format.raw/*308.60*/("""{"""),format.raw/*308.61*/("""
         				"""),format.raw/*309.14*/("""json_result += "<tr>";
         				json_result += "<td>";
	         			for(sub2 in jsondata[attribute][sub])
	         			"""),format.raw/*312.14*/("""{"""),format.raw/*312.15*/("""
	         				"""),format.raw/*313.15*/("""json_result += "<th scope = \"row\">" + sub2 + "</th>";
	         				json_result += "<td>" + jsondata[attribute][sub][sub2] + "</td>";
	         			"""),format.raw/*315.14*/("""}"""),format.raw/*315.15*/("""
	         			"""),format.raw/*316.14*/("""json_result += "</td>"
	         			json_result += "</tr>";
         			"""),format.raw/*318.13*/("""}"""),format.raw/*318.14*/("""
         			"""),format.raw/*319.13*/("""else """),format.raw/*319.18*/("""{"""),format.raw/*319.19*/("""
         				"""),format.raw/*320.14*/("""json_result += " | "+ jsondata[attribute][sub] + " | ";
             		"""),format.raw/*321.16*/("""}"""),format.raw/*321.17*/("""
         			
         		
         		"""),format.raw/*324.12*/("""}"""),format.raw/*324.13*/("""
         		"""),format.raw/*325.12*/("""json_result += "</table></td></tr>";
         	"""),format.raw/*326.11*/("""}"""),format.raw/*326.12*/("""else"""),format.raw/*326.16*/("""{"""),format.raw/*326.17*/("""
         		"""),format.raw/*327.12*/("""json_result += "<tr><th scope = \"row\">" + attribute + "</th><td>" + jsondata[attribute] + "</td></tr>";
         	"""),format.raw/*328.11*/("""}"""),format.raw/*328.12*/("""
         """),format.raw/*329.10*/("""}"""),format.raw/*329.11*/("""
         """),format.raw/*330.10*/("""json_result += "</table></div>";
         document.getElementById('status' + """),_display_(/*331.46*/index),format.raw/*331.51*/(""").innerHTML = json_result;	
		"""),format.raw/*332.3*/("""}"""),format.raw/*332.4*/("""  
		
	    """),format.raw/*334.6*/("""function js2JTable(jsondata)"""),format.raw/*334.34*/("""{"""),format.raw/*334.35*/("""
	    			"""),format.raw/*335.9*/("""console.log(jsondata)
				 var table = document.createElement("table");
				 table.setAttribute("id", "myDataTable");
				 table.setAttribute("class", "display");
				 var header = table.createTHead();
				 var row = header.insertRow(0);
				 var headerString = "["
 				 var json_headers = "";
				 for (var key in jsondata[0])"""),format.raw/*343.34*/("""{"""),format.raw/*343.35*/("""
				 	"""),format.raw/*344.7*/("""if(typeof jsondata[0][key] == 'object')
				 	"""),format.raw/*345.7*/("""{"""),format.raw/*345.8*/("""
				 		"""),format.raw/*346.8*/("""for(var sub in jsondata[0][key])
				 		"""),format.raw/*347.8*/("""{"""),format.raw/*347.9*/("""
				 			"""),format.raw/*348.9*/("""if(typeof jsondata[0][key][sub] == 'object')
				 			"""),format.raw/*349.9*/("""{"""),format.raw/*349.10*/("""
				 				"""),format.raw/*350.10*/("""for(var sub2 in jsondata[0][key][sub])
				 				"""),format.raw/*351.10*/("""{"""),format.raw/*351.11*/("""
				 					"""),format.raw/*352.11*/("""var secondaryCell = row.insertCell(-1);
				 					secondaryCell.innerHTML = key + ": "+sub2;
				 					headerString += '"""),format.raw/*354.28*/("""{"""),format.raw/*354.29*/(""""data":"'+key+"."+sub+"."+sub2+'""""),format.raw/*354.62*/("""}"""),format.raw/*354.63*/(""",'
				 					json_headers += key+"."+sub+"."+sub2+"|"
				 				"""),format.raw/*356.10*/("""}"""),format.raw/*356.11*/("""
				 			"""),format.raw/*357.9*/("""}"""),format.raw/*357.10*/("""
				 			"""),format.raw/*358.9*/("""else
				 			"""),format.raw/*359.9*/("""{"""),format.raw/*359.10*/("""
				 				"""),format.raw/*360.10*/("""var cell = row.insertCell(-1);
				 				cell.innerHTML=key
				 				headerString += '"""),format.raw/*362.27*/("""{"""),format.raw/*362.28*/(""""data":"'+key+'""""),format.raw/*362.44*/("""}"""),format.raw/*362.45*/(""",'
				 				json_headers += key+"|"
				 				break;
				 			"""),format.raw/*365.9*/("""}"""),format.raw/*365.10*/("""
				 		"""),format.raw/*366.8*/("""}"""),format.raw/*366.9*/("""
				 	"""),format.raw/*367.7*/("""}"""),format.raw/*367.8*/("""
				 	"""),format.raw/*368.7*/("""else
				 	"""),format.raw/*369.7*/("""{"""),format.raw/*369.8*/("""
				 		"""),format.raw/*370.8*/("""var cell = row.insertCell(-1);
				 		cell.innerHTML=key
				 		headerString += '"""),format.raw/*372.25*/("""{"""),format.raw/*372.26*/(""""data":"'+key+'""""),format.raw/*372.42*/("""}"""),format.raw/*372.43*/(""",'
				 		json_headers += key+"|"
				 	"""),format.raw/*374.7*/("""}"""),format.raw/*374.8*/("""
				 """),format.raw/*375.6*/("""}"""),format.raw/*375.7*/("""
				 """),format.raw/*376.6*/("""headerString=headerString.replace(/.$/,"]")
				 
				 console.log(headerString)
				 console.log(json_headers)
				 document.getElementById('status' + """),_display_(/*380.42*/index),format.raw/*380.47*/(""").innerHTML=""
				 document.getElementById('status' + """),_display_(/*381.42*/index),format.raw/*381.47*/(""").appendChild(table);
				 $('#myDataTable').DataTable().destroy() 
				 
				 var datatable = $('#myDataTable').DataTable( """),format.raw/*384.51*/("""{"""),format.raw/*384.52*/("""
				 		"""),format.raw/*385.8*/("""data: jsondata,
				        processing: true,
				        columns: JSON.parse(headerString),
				        "scrollX": true
				    """),format.raw/*389.9*/("""}"""),format.raw/*389.10*/(""" """),format.raw/*389.11*/(""");
				 $('#myDataTable').editableTableWidget();
				 
				 var btn = document.createElement("button");
				 btn.innerHTML = "submit form";
				 var header_array = json_headers.split("|");
				 btn.onclick = function(event)"""),format.raw/*395.35*/("""{"""),format.raw/*395.36*/("""
				 	"""),format.raw/*396.7*/("""event.preventDefault();
				 	var tab = document.getElementById('myDataTable');
				 	var c = 0;
				 	for (var key in jsondata[0])"""),format.raw/*399.35*/("""{"""),format.raw/*399.36*/("""
					 	"""),format.raw/*400.8*/("""if(typeof jsondata[0][key] == 'object')
					 	"""),format.raw/*401.8*/("""{"""),format.raw/*401.9*/("""
					 		"""),format.raw/*402.9*/("""for(var sub in jsondata[0][key])
					 		"""),format.raw/*403.9*/("""{"""),format.raw/*403.10*/("""
					 			"""),format.raw/*404.10*/("""if(typeof jsondata[0][key][sub] == 'object')
					 			"""),format.raw/*405.10*/("""{"""),format.raw/*405.11*/("""
					 				"""),format.raw/*406.11*/("""for(var sub2 in jsondata[0][key][sub])
					 				"""),format.raw/*407.11*/("""{"""),format.raw/*407.12*/("""
					 					"""),format.raw/*408.12*/("""jsondata[0][key][sub][sub2] = tab.rows[1].cells[c].innerHTML;
										c++;
					 				"""),format.raw/*410.11*/("""}"""),format.raw/*410.12*/("""
					 			"""),format.raw/*411.10*/("""}"""),format.raw/*411.11*/("""
					 			"""),format.raw/*412.10*/("""else
					 			"""),format.raw/*413.10*/("""{"""),format.raw/*413.11*/("""
					 				"""),format.raw/*414.11*/("""jsondata[0][key] = tab.rows[1].cells[c].innerHTML;
									c++;
					 				break;
					 			"""),format.raw/*417.10*/("""}"""),format.raw/*417.11*/("""
					 		"""),format.raw/*418.9*/("""}"""),format.raw/*418.10*/("""
					 	"""),format.raw/*419.8*/("""}"""),format.raw/*419.9*/("""
					 	"""),format.raw/*420.8*/("""else
					 	"""),format.raw/*421.8*/("""{"""),format.raw/*421.9*/("""
							"""),format.raw/*422.8*/("""jsondata[0][key] = tab.rows[1].cells[c].innerHTML;
							c++;
					 	"""),format.raw/*424.8*/("""}"""),format.raw/*424.9*/("""
				 	"""),format.raw/*425.7*/("""}"""),format.raw/*425.8*/("""
				 	"""),format.raw/*426.7*/("""j_string = JSON.stringify(jsondata);
				    console.log(j_string)
				    j_string = document.getElementById('directory' + """),_display_(/*428.59*/index),format.raw/*428.64*/(""").value + j_string;
					console.log(j_string)
				    var xmlHttp = new XMLHttpRequest();
				    xmlHttp.onreadystatechange = function() """),format.raw/*431.49*/("""{"""),format.raw/*431.50*/("""
						"""),format.raw/*432.7*/("""if (xmlHttp.readyState == 4 && xmlHttp.status == 200) """),format.raw/*432.61*/("""{"""),format.raw/*432.62*/("""
							"""),format.raw/*433.8*/("""console.log(this.responseText)
						"""),format.raw/*434.7*/("""}"""),format.raw/*434.8*/("""
					"""),format.raw/*435.6*/("""}"""),format.raw/*435.7*/("""
					"""),format.raw/*436.6*/("""xmlHttp.open("POST", "/submit_JSON", true);
					xmlHttp.send(j_string);
				    """),format.raw/*438.9*/("""}"""),format.raw/*438.10*/(""";
				 
				 document.getElementById('status' + """),_display_(/*440.42*/index),format.raw/*440.47*/(""").appendChild(btn);
   			"""),format.raw/*441.7*/("""}"""),format.raw/*441.8*/("""
   			
		"""),format.raw/*443.3*/("""</script>		         
  """)))}),format.raw/*444.4*/("""  """))
      }
    }
  }

  def render(task:models.tasks.showResultTask,index:Integer): play.twirl.api.HtmlFormat.Appendable = apply(task,index)

  def f:((models.tasks.showResultTask,Integer) => play.twirl.api.HtmlFormat.Appendable) = (task,index) => apply(task,index)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 28 17:13:04 CDT 2021
                  SOURCE: /Users/petercui/workspace/idols/idols_user/app/views/workflow/showResult.scala.html
                  HASH: 74be034142acd3b48b0c3d3bad54cd8ba40c5a15
                  MATRIX: 772->1|918->52|952->61|966->67|1081->173|1122->176|1164->192|1282->284|1307->289|1402->357|1428->362|1800->707|1826->712|2033->892|2059->897|2108->919|2121->923|2154->935|2246->999|2260->1003|2292->1013|2342->1035|2369->1040|2434->1077|2461->1082|2552->1145|2566->1149|2598->1159|2655->1188|2682->1193|2747->1230|2774->1235|2990->1424|3016->1429|3065->1451|3078->1455|3111->1467|3215->1544|3241->1549|3342->1623|3368->1628|3416->1649|3442->1654|3510->1694|3537->1699|3625->1759|3652->1764|3797->1881|3824->1886|3874->1908|3901->1913|3971->1955|3998->1960|4176->2111|4202->2116|4313->2200|4339->2205|4466->2305|4492->2310|4627->2418|4647->2429|4717->2478|4756->2490|4782->2495|4906->2592|4932->2597|5055->2692|5082->2697|5203->2791|5229->2796|5340->2880|5366->2885|5486->2977|5513->2982|5551->2992|5578->2997|5696->3088|5722->3093|5798->3142|5818->3153|5891->3205|5948->3234|5975->3239|6090->3327|6116->3332|6239->3427|6266->3432|6380->3519|6406->3524|6516->3607|6542->3612|6684->3727|6710->3732|6871->3866|6897->3871|7089->4037|7318->4245|7354->4254|7495->4368|7521->4373|7674->4498|7701->4503|7824->4597|7852->4602|7970->4692|7997->4697|8106->4778|8133->4783|8240->4862|8267->4867|8367->4938|8397->4939|8432->4946|8851->5337|8880->5338|8920->5350|8977->5378|9007->5379|9043->5387|9128->5443|9158->5444|9194->5452|9284->5513|9314->5514|9351->5523|9490->5634|9519->5635|9706->5794|9735->5795|9771->5803|9800->5804|9840->5816|9893->5840|9923->5841|9959->5849|10060->5922|10089->5923|10129->5935|10182->5959|10212->5960|10248->5968|10282->5974|10296->5978|10328->5988|10373->6004|10403->6005|10440->6014|10503->6049|10530->6054|10635->6131|10662->6136|10763->6209|10790->6214|10894->6290|10921->6295|11027->6373|11054->6378|11157->6453|11184->6458|11245->6491|11274->6492|11304->6493|11343->6504|11357->6508|11389->6518|11435->6535|11465->6536|11502->6545|11574->6589|11601->6594|11704->6669|11731->6674|11829->6744|11856->6749|11962->6827|11989->6832|12097->6912|12124->6917|12233->6998|12260->7003|12321->7036|12350->7037|12380->7038|12419->7049|12433->7053|12465->7063|12509->7078|12539->7079|12576->7088|12648->7132|12675->7137|12778->7212|12805->7217|12903->7287|12930->7292|13036->7370|13063->7375|13169->7453|13196->7458|13299->7533|13326->7538|13387->7571|13416->7572|13446->7573|13485->7584|13499->7588|13531->7598|13575->7613|13605->7614|13642->7623|13714->7667|13741->7672|13844->7747|13871->7752|13969->7822|13996->7827|14102->7905|14129->7910|14233->7986|14260->7991|14363->8066|14390->8071|14453->8106|14482->8107|14512->8108|14546->8113|14576->8114|14617->8126|14683->8164|14710->8169|14816->8247|14843->8252|14896->8276|14926->8277|14970->8292|15023->8316|15053->8317|15093->8328|15156->8363|15183->8368|15290->8447|15317->8452|15420->8527|15447->8532|15553->8610|15580->8615|15688->8695|15715->8700|15820->8777|15847->8782|15911->8817|15941->8818|15971->8819|16030->8849|16060->8850|16100->8861|16172->8905|16199->8910|16304->8987|16331->8992|16431->9064|16458->9069|16566->9149|16593->9154|16703->9236|16730->9241|16841->9324|16868->9329|16932->9364|16962->9365|16992->9366|17049->9394|17079->9395|17119->9406|17191->9450|17218->9455|17323->9532|17350->9537|17450->9609|17477->9614|17585->9694|17612->9699|17720->9779|17747->9784|17852->9861|17879->9866|17943->9901|17973->9902|18003->9903|18060->9931|18090->9932|18130->9943|18202->9987|18229->9992|18334->10069|18361->10074|18461->10146|18488->10151|18596->10231|18623->10236|18729->10314|18756->10319|18861->10396|18888->10401|18954->10438|18984->10439|19014->10440|19048->10445|19078->10446|19121->10460|19191->10502|19218->10507|19326->10587|19353->10592|19456->10667|19483->10672|19589->10750|19616->10755|19721->10832|19748->10837|19812->10872|19842->10873|19885->10888|19914->10889|19950->10897|19979->10898|20013->10904|20042->10905|20094->10929|20131->10938|20158->10943|20206->10962|20236->10963|20283->10981|20319->10989|20340->11000|20403->11041|20529->11138|20559->11139|20617->11168|20730->11253|20757->11258|20811->11283|20841->11284|20882->11296|20912->11297|20974->11330|21004->11331|21041->11340|21110->11381|21137->11386|21243->11464|21270->11469|21373->11544|21400->11549|21459->11580|21488->11581|21557->11622|21587->11623|21667->11674|21697->11675|21739->11688|21802->11722|21832->11723|21875->11737|22149->11983|22176->11988|22267->12051|22294->12056|22401->12135|22428->12140|22560->12244|22587->12249|22693->12327|22720->12332|22790->12373|22820->12374|22850->12375|22917->12413|22947->12414|22992->12430|23255->12665|23282->12670|23373->12733|23400->12738|23507->12817|23534->12822|23666->12926|23693->12931|23799->13009|23826->13014|23895->13054|23925->13055|23955->13056|24021->13093|24051->13094|24096->13110|24336->13322|24363->13327|24471->13407|24498->13412|24573->13458|24603->13459|24633->13460|24667->13465|24697->13466|24742->13482|24841->13553|24868->13558|24976->13638|25003->13643|25114->13726|25141->13731|25219->13780|25249->13781|25289->13792|25319->13793|25398->13843|25428->13844|25478->13865|25588->13947|25615->13952|25720->14029|25747->14034|25854->14113|25881->14118|25989->14198|26016->14203|26124->14283|26151->14288|26258->14367|26285->14372|26351->14409|26381->14410|26428->14429|26457->14430|26521->14465|26551->14466|26583->14470|26869->14727|26899->14728|26929->14729|27008->14779|27038->14780|27075->14787|27106->14788|27167->14819|27198->14820|27357->14950|27387->14951|27427->14962|27498->15004|27528->15005|27569->15017|27746->15165|27776->15166|27831->15192|27907->15239|27937->15240|27980->15254|28132->15377|28162->15378|28206->15393|28384->15542|28414->15543|28457->15557|28558->15629|28588->15630|28630->15643|28664->15648|28694->15649|28737->15663|28837->15734|28867->15735|28933->15772|28963->15773|29004->15785|29080->15832|29110->15833|29143->15837|29173->15838|29214->15850|29359->15966|29389->15967|29428->15977|29458->15978|29497->15988|29603->16066|29630->16071|29688->16101|29717->16102|29756->16113|29813->16141|29843->16142|29880->16151|30237->16479|30267->16480|30302->16487|30376->16533|30405->16534|30441->16542|30509->16582|30538->16583|30575->16592|30656->16645|30686->16646|30725->16656|30802->16704|30832->16705|30872->16716|31021->16836|31051->16837|31113->16870|31143->16871|31235->16934|31265->16935|31302->16944|31332->16945|31369->16954|31410->16967|31440->16968|31479->16978|31593->17063|31623->17064|31668->17080|31698->17081|31786->17141|31816->17142|31852->17150|31881->17151|31916->17158|31945->17159|31980->17166|32019->17177|32048->17178|32084->17186|32194->17267|32224->17268|32269->17284|32299->17285|32367->17325|32396->17326|32430->17332|32459->17333|32493->17339|32674->17492|32701->17497|32785->17553|32812->17558|32965->17682|32995->17683|33031->17691|33188->17820|33218->17821|33248->17822|33500->18045|33530->18046|33565->18053|33725->18184|33755->18185|33791->18193|33866->18240|33895->18241|33932->18250|34001->18291|34031->18292|34070->18302|34153->18356|34183->18357|34223->18368|34301->18417|34331->18418|34372->18430|34488->18517|34518->18518|34557->18528|34587->18529|34626->18539|34669->18553|34699->18554|34739->18565|34859->18656|34889->18657|34926->18666|34956->18667|34992->18675|35021->18676|35057->18684|35097->18696|35126->18697|35162->18705|35260->18775|35289->18776|35324->18783|35353->18784|35388->18791|35541->18916|35568->18921|35736->19060|35766->19061|35801->19068|35884->19122|35914->19123|35950->19131|36015->19168|36044->19169|36078->19175|36107->19176|36141->19182|36250->19263|36280->19264|36357->19313|36384->19318|36438->19344|36467->19345|36505->19355|36560->19379
                  LINES: 21->1|26->1|28->3|28->3|28->3|28->3|30->5|33->8|33->8|35->10|35->10|45->20|45->20|52->27|52->27|52->27|52->27|52->27|52->27|52->27|52->27|52->27|52->27|52->27|52->27|52->27|52->27|52->27|52->27|52->27|52->27|52->27|61->36|61->36|61->36|61->36|61->36|62->37|62->37|65->40|65->40|65->40|65->40|65->40|65->40|65->40|65->40|65->40|65->40|65->40|65->40|65->40|65->40|71->46|71->46|73->48|73->48|74->49|74->49|76->51|76->51|76->51|76->51|76->51|78->53|78->53|78->53|78->53|83->58|83->58|85->60|85->60|85->60|85->60|85->60|85->60|88->63|88->63|89->64|89->64|89->64|89->64|89->64|92->67|92->67|92->67|92->67|96->71|96->71|98->73|98->73|102->77|102->77|105->80|105->80|110->85|117->92|118->93|122->97|122->97|125->100|125->100|125->100|125->100|129->104|129->104|131->106|131->106|136->111|136->111|138->113|138->113|139->114|148->123|148->123|150->125|150->125|150->125|151->126|152->127|152->127|153->128|154->129|154->129|155->130|158->133|158->133|161->136|161->136|162->137|162->137|164->139|164->139|164->139|165->140|167->142|167->142|169->144|169->144|169->144|170->145|170->145|170->145|170->145|170->145|170->145|171->146|171->146|171->146|172->147|172->147|173->148|173->148|174->149|174->149|175->150|175->150|176->151|176->151|177->152|177->152|177->152|177->152|177->152|177->152|177->152|177->152|178->153|178->153|178->153|179->154|179->154|180->155|180->155|181->156|181->156|182->157|182->157|183->158|183->158|184->159|184->159|184->159|184->159|184->159|184->159|184->159|184->159|185->160|185->160|185->160|186->161|186->161|187->162|187->162|188->163|188->163|189->164|189->164|190->165|190->165|191->166|191->166|191->166|191->166|191->166|191->166|191->166|191->166|192->167|192->167|192->167|193->168|193->168|194->169|194->169|195->170|195->170|196->171|196->171|197->172|197->172|198->173|198->173|198->173|198->173|198->173|199->174|199->174|199->174|200->175|200->175|200->175|200->175|201->176|201->176|201->176|202->177|202->177|202->177|203->178|203->178|204->179|204->179|205->180|205->180|206->181|206->181|207->182|207->182|208->183|208->183|208->183|208->183|208->183|209->184|209->184|209->184|210->185|210->185|211->186|211->186|212->187|212->187|213->188|213->188|214->189|214->189|215->190|215->190|215->190|215->190|215->190|216->191|216->191|216->191|217->192|217->192|218->193|218->193|219->194|219->194|220->195|220->195|221->196|221->196|222->197|222->197|222->197|222->197|222->197|223->198|223->198|223->198|224->199|224->199|225->200|225->200|226->201|226->201|227->202|227->202|228->203|228->203|229->204|229->204|229->204|229->204|229->204|230->205|230->205|230->205|231->206|231->206|232->207|232->207|233->208|233->208|234->209|234->209|235->210|235->210|236->211|236->211|237->212|237->212|238->213|238->213|242->217|242->217|242->217|243->218|243->218|245->220|245->220|245->220|245->220|248->223|248->223|249->224|251->226|251->226|251->226|251->226|251->226|251->226|253->228|253->228|254->229|254->229|254->229|255->230|255->230|256->231|256->231|257->232|257->232|260->235|260->235|262->237|262->237|263->238|263->238|263->238|264->239|271->246|271->246|272->247|272->247|273->248|273->248|275->250|275->250|276->251|276->251|277->252|277->252|277->252|277->252|277->252|278->253|284->259|284->259|285->260|285->260|286->261|286->261|288->263|288->263|289->264|289->264|290->265|290->265|290->265|290->265|290->265|291->266|295->270|295->270|296->271|296->271|297->272|297->272|297->272|297->272|297->272|298->273|299->274|299->274|300->275|300->275|301->276|301->276|302->277|302->277|303->278|303->278|304->279|304->279|305->280|307->282|307->282|308->283|308->283|309->284|309->284|310->285|310->285|311->286|311->286|312->287|312->287|313->288|313->288|315->290|315->290|317->292|317->292|318->293|324->299|324->299|324->299|324->299|324->299|324->299|324->299|324->299|324->299|327->302|327->302|328->303|328->303|328->303|329->304|331->306|331->306|333->308|333->308|333->308|334->309|337->312|337->312|338->313|340->315|340->315|341->316|343->318|343->318|344->319|344->319|344->319|345->320|346->321|346->321|349->324|349->324|350->325|351->326|351->326|351->326|351->326|352->327|353->328|353->328|354->329|354->329|355->330|356->331|356->331|357->332|357->332|359->334|359->334|359->334|360->335|368->343|368->343|369->344|370->345|370->345|371->346|372->347|372->347|373->348|374->349|374->349|375->350|376->351|376->351|377->352|379->354|379->354|379->354|379->354|381->356|381->356|382->357|382->357|383->358|384->359|384->359|385->360|387->362|387->362|387->362|387->362|390->365|390->365|391->366|391->366|392->367|392->367|393->368|394->369|394->369|395->370|397->372|397->372|397->372|397->372|399->374|399->374|400->375|400->375|401->376|405->380|405->380|406->381|406->381|409->384|409->384|410->385|414->389|414->389|414->389|420->395|420->395|421->396|424->399|424->399|425->400|426->401|426->401|427->402|428->403|428->403|429->404|430->405|430->405|431->406|432->407|432->407|433->408|435->410|435->410|436->411|436->411|437->412|438->413|438->413|439->414|442->417|442->417|443->418|443->418|444->419|444->419|445->420|446->421|446->421|447->422|449->424|449->424|450->425|450->425|451->426|453->428|453->428|456->431|456->431|457->432|457->432|457->432|458->433|459->434|459->434|460->435|460->435|461->436|463->438|463->438|465->440|465->440|466->441|466->441|468->443|469->444
                  -- GENERATED --
              */
          