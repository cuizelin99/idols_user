
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

object showJSON extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.tasks.showJSONTask,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(task: models.tasks.showJSONTask, index: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.51*/("""
  
    """),_display_(/*3.6*/helper/*3.12*/.form(action = controllers.routes.WorkflowController.runTask(index), 'id -> "form".concat(index.toString))/*3.118*/  {_display_(Seq[Any](format.raw/*3.121*/("""
   	    	
	    """),format.raw/*5.6*/("""<ul style="list-style:none">
	    		
	    		<div id="directory_widget"""),_display_(/*7.34*/index),format.raw/*7.39*/("""" style="display:inline">
					    	
			<li>
	    			<div class="indivsteps">
					Define root directory to start exploring
				</div>
				<p>
	    				<input type="text" id="root"""),_display_(/*14.38*/index),format.raw/*14.43*/("""" name="root" value=""""),_display_(/*14.65*/task/*14.69*/.output_path),format.raw/*14.81*/("""" style="width: 400px" > <button type="button" value="directory"""),_display_(/*14.145*/task/*14.149*/.task_name),format.raw/*14.159*/("""" onclick="openTree('"""),_display_(/*14.181*/index),format.raw/*14.186*/("""', document.getElementById('root' + """),_display_(/*14.223*/index),format.raw/*14.228*/(""").value)">View</button> <button type="button" value="directory"""),_display_(/*14.291*/task/*14.295*/.task_name),format.raw/*14.305*/("""" onclick="openTreeRefresh('"""),_display_(/*14.334*/index),format.raw/*14.339*/("""', document.getElementById('root' + """),_display_(/*14.376*/index),format.raw/*14.381*/(""").value)">Refresh</button>
	    			</p>
	   		</li>
    
	   	 	<li>
		    		<div class="indivsteps">
					File Path
				</div>
		    		<p>
			    		<input name="output_path" id="directory"""),_display_(/*23.50*/index),format.raw/*23.55*/("""" type="text" value=""""),_display_(/*23.77*/task/*23.81*/.output_path),format.raw/*23.93*/("""" style="width: 400px" readonly>
			    		<div class="dirTree" id="container"""),_display_(/*24.45*/index),format.raw/*24.50*/(""""></div>
		    		</p>
		    		<p>
		    			<button type="button" id="back"""),_display_(/*27.41*/index),format.raw/*27.46*/("""" onclick="openTree("""),_display_(/*27.67*/index),format.raw/*27.72*/(""", document.getElementById('directory'+ """),_display_(/*27.112*/index),format.raw/*27.117*/(""").value.substring(0, document.getElementById('directory' + """),_display_(/*27.177*/index),format.raw/*27.182*/(""").value.lastIndexOf('/')))" style="display: none;">Go to parent directory</button> <button type="button" id="forward"""),_display_(/*27.299*/index),format.raw/*27.304*/("""" onclick="openTree('"""),_display_(/*27.326*/index),format.raw/*27.331*/("""', document.getElementById('directory' + """),_display_(/*27.373*/index),format.raw/*27.378*/(""").value)" style="display: none;">Expand chosen directory</button> 
		    		</p>
	    		</li>
	    		</div>
	    		
	    		
	    		<div id="JSON_widget"""),_display_(/*33.29*/index),format.raw/*33.34*/("""" style="display:none">
	    				<p>
					    	<button type="submit" id="show_JSON"""),_display_(/*35.47*/index),format.raw/*35.52*/("""" name="action" value="show_JSON">Show</button>
			        </p> 
	    		</div>
	    		
	    		
	    		<div id = "init"""),_display_(/*40.24*/index),format.raw/*40.29*/("""" style = "display:none"></div>   
	    		
	    		<div class="status" id="status"""),_display_(/*42.39*/index),format.raw/*42.44*/(""""></div>
		</ul>	
		
    
	    <script>
	    document.getElementById('init' + """),_display_(/*47.40*/index),format.raw/*47.45*/(""").innerHTML = show_display();
	   
	    
	    function showJSON(path, idx)"""),format.raw/*50.34*/("""{"""),format.raw/*50.35*/("""
	    		"""),format.raw/*51.8*/("""console.log(path);
	    		$.getJSON(path, function(data)"""),format.raw/*52.38*/("""{"""),format.raw/*52.39*/("""
	    		"""),format.raw/*53.8*/("""var 	json_data = '';
	    		$.each(data, function(key, value)"""),format.raw/*54.41*/("""{"""),format.raw/*54.42*/("""
	    			"""),format.raw/*55.9*/("""json_data += '<tr>';
	    			json_data += '<td>' + value.label + '</td>';
	    			json_data += '</tr>';
	    		"""),format.raw/*58.8*/("""}"""),format.raw/*58.9*/(""");
	    		document.getElementById('json_table'+ idx).appendChild(json_data);
	    		document.getElementById('json_table'+ idx).style = "display:inline";
	    	"""),format.raw/*61.7*/("""}"""),format.raw/*61.8*/(""");
	    """),format.raw/*62.6*/("""}"""),format.raw/*62.7*/("""
	    
	    """),format.raw/*64.6*/("""function download(path) """),format.raw/*64.30*/("""{"""),format.raw/*64.31*/("""
	    		"""),format.raw/*65.8*/("""console.log(path);
	    	    window.open("/download?path=" + path);
	    """),format.raw/*67.6*/("""}"""),format.raw/*67.7*/("""
	    
	    """),format.raw/*69.6*/("""function  show_display()"""),format.raw/*69.30*/("""{"""),format.raw/*69.31*/("""
	    			"""),format.raw/*70.9*/("""document.getElementById('JSON_widget' + """),_display_(/*70.50*/index),format.raw/*70.55*/(""").style = "display:inline";
	    """),format.raw/*71.6*/("""}"""),format.raw/*71.7*/("""
	    
	   
	    
		    """),format.raw/*75.7*/("""$('#form"""),_display_(/*75.16*/index),format.raw/*75.21*/("""')
		    .ajaxForm("""),format.raw/*76.17*/("""{"""),format.raw/*76.18*/("""
		    
		        """),format.raw/*78.11*/("""url : '"""),_display_(/*78.19*/controllers/*78.30*/.routes.WorkflowController.runTask(index)),format.raw/*78.71*/("""',		        
		        type : 'post',
		    	
		    		beforeSubmit: function(arr, $form, options)"""),format.raw/*81.52*/("""{"""),format.raw/*81.53*/("""
		    				        		        """),format.raw/*82.29*/("""console.log("before sub")
		    		
						
						return true;					
		   	 	"""),format.raw/*86.9*/("""}"""),format.raw/*86.10*/(""",
		   	 	
		        success : function (response) """),format.raw/*88.41*/("""{"""),format.raw/*88.42*/("""
		        		
	           		"""),format.raw/*90.15*/("""console.log("RESPONSE::" + response)
	           		var b = response.substring(10)
	           		console.log("B::" + b)
	           		js2JTable(JSON.parse(b))
	           		document.getElementById('status' + """),_display_(/*94.51*/index),format.raw/*94.56*/(""").style = "display:inline";
	           	 	document.getElementById('status' + """),_display_(/*95.52*/index),format.raw/*95.57*/(""").className = "status_success";
		           
		        """),format.raw/*97.11*/("""}"""),format.raw/*97.12*/(""",
		        error : function (xhr, status, error) """),format.raw/*98.49*/("""{"""),format.raw/*98.50*/("""
		        		        """),format.raw/*99.21*/("""console.log("error")
		        
		        	   document.getElementById('status' + """),_display_(/*101.51*/index),format.raw/*101.56*/(""").style = "display:inline";
		           document.getElementById('status' + """),_display_(/*102.50*/index),format.raw/*102.55*/(""").className = "status_error";
		           document.getElementById('status' + """),_display_(/*103.50*/index),format.raw/*103.55*/(""").innerHTML = xhr.responseText;
		        """),format.raw/*104.11*/("""}"""),format.raw/*104.12*/(""",
		        
		    """),format.raw/*106.7*/("""}"""),format.raw/*106.8*/(""");
		
		function js2Table(jsondata)"""),format.raw/*108.30*/("""{"""),format.raw/*108.31*/("""
		 """),format.raw/*109.4*/("""var table = document.createElement("table");
		 table.setAttribute("id", "myDataTable");
		 table.setAttribute("class", "display")
		 var json_result = "";
		 json_result += "<div>";
         json_result += "<style>";
         json_result += "table, th, td """),format.raw/*115.40*/("""{"""),format.raw/*115.41*/(""" """),format.raw/*115.42*/("""border: 1px solid black;border-collapse: collapse;"""),format.raw/*115.92*/("""}"""),format.raw/*115.93*/("""th, td """),format.raw/*115.100*/("""{"""),format.raw/*115.101*/("""padding: 5px;text-align: left; """),format.raw/*115.132*/("""}"""),format.raw/*115.133*/("""";
         json_result += "</style>";
         json_result += "<table style=\"width:100%\">";
         for(attribute in jsondata)"""),format.raw/*118.36*/("""{"""),format.raw/*118.37*/("""
         	"""),format.raw/*119.11*/("""if(typeof jsondata[attribute] == 'object')"""),format.raw/*119.53*/("""{"""),format.raw/*119.54*/("""
         		"""),format.raw/*120.12*/("""json_result += "<tr><th scope = \"row\">" + attribute + "</th>";
         		json_result += "<td><table>";
         		for(sub in jsondata[attribute])"""),format.raw/*122.43*/("""{"""),format.raw/*122.44*/("""
         			
         			"""),format.raw/*124.13*/("""if(typeof jsondata[attribute][sub] == 'object')"""),format.raw/*124.60*/("""{"""),format.raw/*124.61*/("""
         				"""),format.raw/*125.14*/("""json_result += "<tr>";
         				json_result += "<td>";
	         			for(sub2 in jsondata[attribute][sub])
	         			"""),format.raw/*128.14*/("""{"""),format.raw/*128.15*/("""
	         				"""),format.raw/*129.15*/("""json_result += "<th scope = \"row\">" + sub2 + "</th>";
	         				json_result += "<td>" + jsondata[attribute][sub][sub2] + "</td>";
	         			"""),format.raw/*131.14*/("""}"""),format.raw/*131.15*/("""
	         			"""),format.raw/*132.14*/("""json_result += "</td>"
	         			json_result += "</tr>";
         			"""),format.raw/*134.13*/("""}"""),format.raw/*134.14*/("""
         			"""),format.raw/*135.13*/("""else """),format.raw/*135.18*/("""{"""),format.raw/*135.19*/("""
         				"""),format.raw/*136.14*/("""json_result += " | "+ jsondata[attribute][sub] + " | ";
             		"""),format.raw/*137.16*/("""}"""),format.raw/*137.17*/("""
         			
         		
         		"""),format.raw/*140.12*/("""}"""),format.raw/*140.13*/("""
         		"""),format.raw/*141.12*/("""json_result += "</table></td></tr>";
         	"""),format.raw/*142.11*/("""}"""),format.raw/*142.12*/("""else"""),format.raw/*142.16*/("""{"""),format.raw/*142.17*/("""
         		"""),format.raw/*143.12*/("""json_result += "<tr><th scope = \"row\">" + attribute + "</th><td>" + jsondata[attribute] + "</td></tr>";
         	"""),format.raw/*144.11*/("""}"""),format.raw/*144.12*/("""
         """),format.raw/*145.10*/("""}"""),format.raw/*145.11*/("""
         """),format.raw/*146.10*/("""json_result += "</table></div>";
         document.getElementById('status' + """),_display_(/*147.46*/index),format.raw/*147.51*/(""").innerHTML = json_result;	
		"""),format.raw/*148.3*/("""}"""),format.raw/*148.4*/("""  
		
	    """),format.raw/*150.6*/("""function js2JTable(jsondata)"""),format.raw/*150.34*/("""{"""),format.raw/*150.35*/("""
	    			"""),format.raw/*151.9*/("""console.log(jsondata)
				 var table = document.createElement("table");
				 table.setAttribute("id", "myDataTable");
				 table.setAttribute("class", "display");
				 var header = table.createTHead();
				 var row = header.insertRow(0);
				 var headerString = "["
 				 var json_headers = "";
				 for (var key in jsondata[0])"""),format.raw/*159.34*/("""{"""),format.raw/*159.35*/("""
				 	"""),format.raw/*160.7*/("""if(typeof jsondata[0][key] == 'object')
				 	"""),format.raw/*161.7*/("""{"""),format.raw/*161.8*/("""
				 		"""),format.raw/*162.8*/("""for(var sub in jsondata[0][key])
				 		"""),format.raw/*163.8*/("""{"""),format.raw/*163.9*/("""
				 			"""),format.raw/*164.9*/("""if(typeof jsondata[0][key][sub] == 'object')
				 			"""),format.raw/*165.9*/("""{"""),format.raw/*165.10*/("""
				 				"""),format.raw/*166.10*/("""for(var sub2 in jsondata[0][key][sub])
				 				"""),format.raw/*167.10*/("""{"""),format.raw/*167.11*/("""
				 					"""),format.raw/*168.11*/("""var secondaryCell = row.insertCell(-1);
				 					secondaryCell.innerHTML = key + ": "+sub2;
				 					headerString += '"""),format.raw/*170.28*/("""{"""),format.raw/*170.29*/(""""data":"'+key+"."+sub+"."+sub2+'""""),format.raw/*170.62*/("""}"""),format.raw/*170.63*/(""",'
				 					json_headers += key+"."+sub+"."+sub2+"|"
				 				"""),format.raw/*172.10*/("""}"""),format.raw/*172.11*/("""
				 			"""),format.raw/*173.9*/("""}"""),format.raw/*173.10*/("""
				 			"""),format.raw/*174.9*/("""else
				 			"""),format.raw/*175.9*/("""{"""),format.raw/*175.10*/("""
				 				"""),format.raw/*176.10*/("""var cell = row.insertCell(-1);
				 				cell.innerHTML=key
				 				headerString += '"""),format.raw/*178.27*/("""{"""),format.raw/*178.28*/(""""data":"'+key+'""""),format.raw/*178.44*/("""}"""),format.raw/*178.45*/(""",'
				 				json_headers += key+"|"
				 				break;
				 			"""),format.raw/*181.9*/("""}"""),format.raw/*181.10*/("""
				 		"""),format.raw/*182.8*/("""}"""),format.raw/*182.9*/("""
				 	"""),format.raw/*183.7*/("""}"""),format.raw/*183.8*/("""
				 	"""),format.raw/*184.7*/("""else
				 	"""),format.raw/*185.7*/("""{"""),format.raw/*185.8*/("""
				 		"""),format.raw/*186.8*/("""var cell = row.insertCell(-1);
				 		cell.innerHTML=key
				 		headerString += '"""),format.raw/*188.25*/("""{"""),format.raw/*188.26*/(""""data":"'+key+'""""),format.raw/*188.42*/("""}"""),format.raw/*188.43*/(""",'
				 		json_headers += key+"|"
				 	"""),format.raw/*190.7*/("""}"""),format.raw/*190.8*/("""
				 """),format.raw/*191.6*/("""}"""),format.raw/*191.7*/("""
				 """),format.raw/*192.6*/("""headerString=headerString.replace(/.$/,"]")
				 
				 console.log(headerString)
				 console.log(json_headers)
				 document.getElementById('status' + """),_display_(/*196.42*/index),format.raw/*196.47*/(""").innerHTML=""
				 document.getElementById('status' + """),_display_(/*197.42*/index),format.raw/*197.47*/(""").appendChild(table);
				 $('#myDataTable').DataTable().destroy() 
				 
				 var datatable = $('#myDataTable').DataTable( """),format.raw/*200.51*/("""{"""),format.raw/*200.52*/("""
				 		"""),format.raw/*201.8*/("""data: jsondata,
				        processing: true,
				        columns: JSON.parse(headerString),
				        "scrollX": true
				    """),format.raw/*205.9*/("""}"""),format.raw/*205.10*/(""" """),format.raw/*205.11*/(""");
				 $('#myDataTable').editableTableWidget();
				 
				 var btn = document.createElement("button");
				 btn.innerHTML = "submit form";
				 var header_array = json_headers.split("|");
				 btn.onclick = function(event)"""),format.raw/*211.35*/("""{"""),format.raw/*211.36*/("""
				 	"""),format.raw/*212.7*/("""event.preventDefault();
				 	var tab = document.getElementById('myDataTable');
				 	var c = 0;
				 	for (var key in jsondata[0])"""),format.raw/*215.35*/("""{"""),format.raw/*215.36*/("""
					 	"""),format.raw/*216.8*/("""if(typeof jsondata[0][key] == 'object')
					 	"""),format.raw/*217.8*/("""{"""),format.raw/*217.9*/("""
					 		"""),format.raw/*218.9*/("""for(var sub in jsondata[0][key])
					 		"""),format.raw/*219.9*/("""{"""),format.raw/*219.10*/("""
					 			"""),format.raw/*220.10*/("""if(typeof jsondata[0][key][sub] == 'object')
					 			"""),format.raw/*221.10*/("""{"""),format.raw/*221.11*/("""
					 				"""),format.raw/*222.11*/("""for(var sub2 in jsondata[0][key][sub])
					 				"""),format.raw/*223.11*/("""{"""),format.raw/*223.12*/("""
					 					"""),format.raw/*224.12*/("""jsondata[0][key][sub][sub2] = tab.rows[1].cells[c].innerHTML;
										c++;
					 				"""),format.raw/*226.11*/("""}"""),format.raw/*226.12*/("""
					 			"""),format.raw/*227.10*/("""}"""),format.raw/*227.11*/("""
					 			"""),format.raw/*228.10*/("""else
					 			"""),format.raw/*229.10*/("""{"""),format.raw/*229.11*/("""
					 				"""),format.raw/*230.11*/("""jsondata[0][key] = tab.rows[1].cells[c].innerHTML;
									c++;
					 				break;
					 			"""),format.raw/*233.10*/("""}"""),format.raw/*233.11*/("""
					 		"""),format.raw/*234.9*/("""}"""),format.raw/*234.10*/("""
					 	"""),format.raw/*235.8*/("""}"""),format.raw/*235.9*/("""
					 	"""),format.raw/*236.8*/("""else
					 	"""),format.raw/*237.8*/("""{"""),format.raw/*237.9*/("""
							"""),format.raw/*238.8*/("""jsondata[0][key] = tab.rows[1].cells[c].innerHTML;
							c++;
					 	"""),format.raw/*240.8*/("""}"""),format.raw/*240.9*/("""
				 	"""),format.raw/*241.7*/("""}"""),format.raw/*241.8*/("""
				 	"""),format.raw/*242.7*/("""j_string = JSON.stringify(jsondata);
				    console.log(j_string)
				    j_string = document.getElementById('directory' + """),_display_(/*244.59*/index),format.raw/*244.64*/(""").value + j_string;
					console.log(j_string)
				    var xmlHttp = new XMLHttpRequest();
				    xmlHttp.onreadystatechange = function() """),format.raw/*247.49*/("""{"""),format.raw/*247.50*/("""
						"""),format.raw/*248.7*/("""if (xmlHttp.readyState == 4 && xmlHttp.status == 200) """),format.raw/*248.61*/("""{"""),format.raw/*248.62*/("""
							"""),format.raw/*249.8*/("""console.log(this.responseText)
						"""),format.raw/*250.7*/("""}"""),format.raw/*250.8*/("""
					"""),format.raw/*251.6*/("""}"""),format.raw/*251.7*/("""
					"""),format.raw/*252.6*/("""xmlHttp.open("POST", "/submit_JSON", true);
					xmlHttp.send(j_string);
				    """),format.raw/*254.9*/("""}"""),format.raw/*254.10*/(""";
				 
				 document.getElementById('status' + """),_display_(/*256.42*/index),format.raw/*256.47*/(""").appendChild(btn);
   			"""),format.raw/*257.7*/("""}"""),format.raw/*257.8*/("""
   			
		"""),format.raw/*259.3*/("""</script>		         
  """)))}),format.raw/*260.4*/("""  """))
      }
    }
  }

  def render(task:models.tasks.showJSONTask,index:Integer): play.twirl.api.HtmlFormat.Appendable = apply(task,index)

  def f:((models.tasks.showJSONTask,Integer) => play.twirl.api.HtmlFormat.Appendable) = (task,index) => apply(task,index)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun May 16 19:53:50 CDT 2021
                  SOURCE: /Users/petercui/workspace/idols/idols_user/app/views/workflow/showJSON.scala.html
                  HASH: 7abfc8a6d69a4985adb9ebc0412bfddeaaa7b8a3
                  MATRIX: 768->1|912->50|946->59|960->65|1075->171|1116->174|1158->190|1254->260|1279->265|1486->445|1512->450|1561->472|1574->476|1607->488|1699->552|1713->556|1745->566|1795->588|1822->593|1887->630|1914->635|2005->698|2019->702|2051->712|2108->741|2135->746|2200->783|2227->788|2443->977|2469->982|2518->1004|2531->1008|2564->1020|2668->1097|2694->1102|2795->1176|2821->1181|2869->1202|2895->1207|2963->1247|2990->1252|3078->1312|3105->1317|3250->1434|3277->1439|3327->1461|3354->1466|3424->1508|3451->1513|3629->1664|3655->1669|3765->1752|3791->1757|3936->1875|3962->1880|4070->1961|4096->1966|4202->2045|4228->2050|4330->2124|4359->2125|4394->2133|4478->2189|4507->2190|4542->2198|4631->2259|4660->2260|4696->2269|4834->2380|4862->2381|5048->2540|5076->2541|5111->2549|5139->2550|5178->2562|5230->2586|5259->2587|5294->2595|5394->2668|5422->2669|5461->2681|5513->2705|5542->2706|5578->2715|5646->2756|5672->2761|5732->2794|5760->2795|5811->2819|5847->2828|5873->2833|5920->2852|5949->2853|5995->2871|6030->2879|6050->2890|6112->2931|6237->3028|6266->3029|6323->3058|6424->3132|6453->3133|6532->3184|6561->3185|6617->3213|6852->3421|6878->3426|6984->3505|7010->3510|7094->3566|7123->3567|7201->3617|7230->3618|7279->3639|7389->3721|7416->3726|7521->3803|7548->3808|7655->3887|7682->3892|7753->3934|7783->3935|7830->3954|7859->3955|7923->3990|7953->3991|7985->3995|8271->4252|8301->4253|8331->4254|8410->4304|8440->4305|8477->4312|8508->4313|8569->4344|8600->4345|8759->4475|8789->4476|8829->4487|8900->4529|8930->4530|8971->4542|9148->4690|9178->4691|9233->4717|9309->4764|9339->4765|9382->4779|9534->4902|9564->4903|9608->4918|9786->5067|9816->5068|9859->5082|9960->5154|9990->5155|10032->5168|10066->5173|10096->5174|10139->5188|10239->5259|10269->5260|10335->5297|10365->5298|10406->5310|10482->5357|10512->5358|10545->5362|10575->5363|10616->5375|10761->5491|10791->5492|10830->5502|10860->5503|10899->5513|11005->5591|11032->5596|11090->5626|11119->5627|11158->5638|11215->5666|11245->5667|11282->5676|11639->6004|11669->6005|11704->6012|11778->6058|11807->6059|11843->6067|11911->6107|11940->6108|11977->6117|12058->6170|12088->6171|12127->6181|12204->6229|12234->6230|12274->6241|12423->6361|12453->6362|12515->6395|12545->6396|12637->6459|12667->6460|12704->6469|12734->6470|12771->6479|12812->6492|12842->6493|12881->6503|12995->6588|13025->6589|13070->6605|13100->6606|13188->6666|13218->6667|13254->6675|13283->6676|13318->6683|13347->6684|13382->6691|13421->6702|13450->6703|13486->6711|13596->6792|13626->6793|13671->6809|13701->6810|13769->6850|13798->6851|13832->6857|13861->6858|13895->6864|14076->7017|14103->7022|14187->7078|14214->7083|14367->7207|14397->7208|14433->7216|14590->7345|14620->7346|14650->7347|14902->7570|14932->7571|14967->7578|15127->7709|15157->7710|15193->7718|15268->7765|15297->7766|15334->7775|15403->7816|15433->7817|15472->7827|15555->7881|15585->7882|15625->7893|15703->7942|15733->7943|15774->7955|15890->8042|15920->8043|15959->8053|15989->8054|16028->8064|16071->8078|16101->8079|16141->8090|16261->8181|16291->8182|16328->8191|16358->8192|16394->8200|16423->8201|16459->8209|16499->8221|16528->8222|16564->8230|16662->8300|16691->8301|16726->8308|16755->8309|16790->8316|16943->8441|16970->8446|17138->8585|17168->8586|17203->8593|17286->8647|17316->8648|17352->8656|17417->8693|17446->8694|17480->8700|17509->8701|17543->8707|17652->8788|17682->8789|17759->8838|17786->8843|17840->8869|17869->8870|17907->8880|17962->8904
                  LINES: 21->1|26->1|28->3|28->3|28->3|28->3|30->5|32->7|32->7|39->14|39->14|39->14|39->14|39->14|39->14|39->14|39->14|39->14|39->14|39->14|39->14|39->14|39->14|39->14|39->14|39->14|39->14|39->14|48->23|48->23|48->23|48->23|48->23|49->24|49->24|52->27|52->27|52->27|52->27|52->27|52->27|52->27|52->27|52->27|52->27|52->27|52->27|52->27|52->27|58->33|58->33|60->35|60->35|65->40|65->40|67->42|67->42|72->47|72->47|75->50|75->50|76->51|77->52|77->52|78->53|79->54|79->54|80->55|83->58|83->58|86->61|86->61|87->62|87->62|89->64|89->64|89->64|90->65|92->67|92->67|94->69|94->69|94->69|95->70|95->70|95->70|96->71|96->71|100->75|100->75|100->75|101->76|101->76|103->78|103->78|103->78|103->78|106->81|106->81|107->82|111->86|111->86|113->88|113->88|115->90|119->94|119->94|120->95|120->95|122->97|122->97|123->98|123->98|124->99|126->101|126->101|127->102|127->102|128->103|128->103|129->104|129->104|131->106|131->106|133->108|133->108|134->109|140->115|140->115|140->115|140->115|140->115|140->115|140->115|140->115|140->115|143->118|143->118|144->119|144->119|144->119|145->120|147->122|147->122|149->124|149->124|149->124|150->125|153->128|153->128|154->129|156->131|156->131|157->132|159->134|159->134|160->135|160->135|160->135|161->136|162->137|162->137|165->140|165->140|166->141|167->142|167->142|167->142|167->142|168->143|169->144|169->144|170->145|170->145|171->146|172->147|172->147|173->148|173->148|175->150|175->150|175->150|176->151|184->159|184->159|185->160|186->161|186->161|187->162|188->163|188->163|189->164|190->165|190->165|191->166|192->167|192->167|193->168|195->170|195->170|195->170|195->170|197->172|197->172|198->173|198->173|199->174|200->175|200->175|201->176|203->178|203->178|203->178|203->178|206->181|206->181|207->182|207->182|208->183|208->183|209->184|210->185|210->185|211->186|213->188|213->188|213->188|213->188|215->190|215->190|216->191|216->191|217->192|221->196|221->196|222->197|222->197|225->200|225->200|226->201|230->205|230->205|230->205|236->211|236->211|237->212|240->215|240->215|241->216|242->217|242->217|243->218|244->219|244->219|245->220|246->221|246->221|247->222|248->223|248->223|249->224|251->226|251->226|252->227|252->227|253->228|254->229|254->229|255->230|258->233|258->233|259->234|259->234|260->235|260->235|261->236|262->237|262->237|263->238|265->240|265->240|266->241|266->241|267->242|269->244|269->244|272->247|272->247|273->248|273->248|273->248|274->249|275->250|275->250|276->251|276->251|277->252|279->254|279->254|281->256|281->256|282->257|282->257|284->259|285->260
                  -- GENERATED --
              */
          