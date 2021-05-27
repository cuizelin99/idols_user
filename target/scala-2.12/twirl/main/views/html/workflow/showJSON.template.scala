
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
				 var allLabels = []
				 var header = table.createTHead();
				 var row = header.insertRow(0);
				 var headerString = "["
 				 var json_headers = "";
				 for (var key in jsondata[0])"""),format.raw/*160.34*/("""{"""),format.raw/*160.35*/("""
				 	"""),format.raw/*161.7*/("""if(typeof jsondata[0][key] == 'object')
				 	"""),format.raw/*162.7*/("""{"""),format.raw/*162.8*/("""
				 		"""),format.raw/*163.8*/("""for(var sub in jsondata[0][key])
				 		"""),format.raw/*164.8*/("""{"""),format.raw/*164.9*/("""
				 			"""),format.raw/*165.9*/("""if(typeof jsondata[0][key][sub] == 'object')
				 			"""),format.raw/*166.9*/("""{"""),format.raw/*166.10*/("""
				 				"""),format.raw/*167.10*/("""for(var sub2 in jsondata[0][key][sub])
				 				"""),format.raw/*168.10*/("""{"""),format.raw/*168.11*/("""
				 					"""),format.raw/*169.11*/("""var secondaryCell = row.insertCell(-1);
				 					secondaryCell.innerHTML = key + ": "+sub2;
				 					headerString += '"""),format.raw/*171.28*/("""{"""),format.raw/*171.29*/(""""data":"'+key+"."+sub+"."+sub2+'""""),format.raw/*171.62*/("""}"""),format.raw/*171.63*/(""",'
				 					json_headers += key+"."+sub+"."+sub2+"|"
				 				"""),format.raw/*173.10*/("""}"""),format.raw/*173.11*/("""
				 			"""),format.raw/*174.9*/("""}"""),format.raw/*174.10*/("""
				 			"""),format.raw/*175.9*/("""else
				 			"""),format.raw/*176.9*/("""{"""),format.raw/*176.10*/("""
				 				"""),format.raw/*177.10*/("""console.log(key)
				 				var cell = row.insertCell(-1);
				 				cell.innerHTML=key
				 				
				 				console.log(jsondata[0][key])
				 				
				 				for (var label in jsondata[0][key])
				 				"""),format.raw/*184.10*/("""{"""),format.raw/*184.11*/("""
				 					"""),format.raw/*185.11*/("""console.log(jsondata[0][key][label])
				 					allLabels.push(jsondata[0][key][label])
				 				"""),format.raw/*187.10*/("""}"""),format.raw/*187.11*/("""
				 				 
				 				"""),format.raw/*189.10*/("""headerString += '"""),format.raw/*189.27*/("""{"""),format.raw/*189.28*/(""""data":"'+key+ '""""),format.raw/*189.45*/("""}"""),format.raw/*189.46*/(""",'
					 			json_headers += key+"|"
				 				break;
				 			"""),format.raw/*192.9*/("""}"""),format.raw/*192.10*/("""
				 		"""),format.raw/*193.8*/("""}"""),format.raw/*193.9*/("""
				 	"""),format.raw/*194.7*/("""}"""),format.raw/*194.8*/("""
				 	"""),format.raw/*195.7*/("""else
				 	"""),format.raw/*196.7*/("""{"""),format.raw/*196.8*/("""
				 		"""),format.raw/*197.8*/("""var cell = row.insertCell(-1);
				 		cell.innerHTML=key
				 		
				 		if(key == "chosen_label")
	 					"""),format.raw/*201.8*/("""{"""),format.raw/*201.9*/("""
	 						"""),format.raw/*202.9*/("""headerString += '"""),format.raw/*202.26*/("""{"""),format.raw/*202.27*/(""""data":"'+key+ '", "visible": true, "type": "html""""),format.raw/*202.77*/("""}"""),format.raw/*202.78*/(""",'
	 					"""),format.raw/*203.8*/("""}"""),format.raw/*203.9*/("""
				 		"""),format.raw/*204.8*/("""else
			 			"""),format.raw/*205.8*/("""{"""),format.raw/*205.9*/("""
			 				"""),format.raw/*206.9*/("""headerString += '"""),format.raw/*206.26*/("""{"""),format.raw/*206.27*/(""""data":"'+key+'""""),format.raw/*206.43*/("""}"""),format.raw/*206.44*/(""",'
			 			"""),format.raw/*207.8*/("""}"""),format.raw/*207.9*/("""
				 		
				 		"""),format.raw/*209.8*/("""json_headers += key+"|"
				 	"""),format.raw/*210.7*/("""}"""),format.raw/*210.8*/("""
				 """),format.raw/*211.6*/("""}"""),format.raw/*211.7*/("""
				 """),format.raw/*212.6*/("""headerString=headerString.replace(/.$/,"]")
				 
				 console.log(headerString)
				 console.log(json_headers)
				 console.log(allLabels)
				 document.getElementById('status' + """),_display_(/*217.42*/index),format.raw/*217.47*/(""").innerHTML=""
				 document.getElementById('status' + """),_display_(/*218.42*/index),format.raw/*218.47*/(""").appendChild(table);
				 $('#myDataTable').DataTable().destroy() 
				 
				 var datatable = $('#myDataTable').DataTable( """),format.raw/*221.51*/("""{"""),format.raw/*221.52*/("""
					 	"""),format.raw/*222.8*/(""""dom": '<"toolbar">frtip',
				 		data: jsondata,
				        processing: true,
				        columns: JSON.parse(headerString),
				        "scrollX": true
				    """),format.raw/*227.9*/("""}"""),format.raw/*227.10*/(""" """),format.raw/*227.11*/(""");
				 var dropdownHTML = '<select id="labels">'
				 var AL = 'All Labels'
				 dropdownHTML +=  '<option value="'+AL+'">'+AL+'</option>'
					for (var d in allLabels)
	                	"""),format.raw/*232.19*/("""{"""),format.raw/*232.20*/("""
						"""),format.raw/*233.7*/("""l = allLabels[d]
	                		dropdownHTML +=  '<option value="'+l+'">'+l+'</option>'
	                	"""),format.raw/*235.19*/("""}"""),format.raw/*235.20*/("""
				 """),format.raw/*236.6*/("""dropdownHTML += '</select>'
				 $("div.toolbar").html(dropdownHTML);
				 $('#myDataTable').editableTableWidget();
				 document.getElementById('labels').onchange = function () """),format.raw/*239.63*/("""{"""),format.raw/*239.64*/("""
					 	"""),format.raw/*240.8*/("""var dval = document.getElementById('labels').value;
					 	var colCount = datatable.columns().header().length;
					 	if (dval == AL)
					 		"""),format.raw/*243.9*/("""{"""),format.raw/*243.10*/("""
							 	"""),format.raw/*244.10*/("""var i = 3;
							 	datatable.column(1).visible(false);
							 	while (i < colCount)	
							 		"""),format.raw/*247.11*/("""{"""),format.raw/*247.12*/("""
							 			"""),format.raw/*248.12*/("""datatable.column(i).visible(true);
							 			i += 1;
							 		"""),format.raw/*250.11*/("""}"""),format.raw/*250.12*/("""
					 		"""),format.raw/*251.9*/("""}"""),format.raw/*251.10*/("""
					 	"""),format.raw/*252.8*/("""else
					 		"""),format.raw/*253.9*/("""{"""),format.raw/*253.10*/("""
						 		"""),format.raw/*254.10*/("""var i = 3;
						 		datatable.column(1).visible(false);
							 	while (i < colCount)
							 	"""),format.raw/*257.10*/("""{"""),format.raw/*257.11*/("""
							 		"""),format.raw/*258.11*/("""if (datatable.column(i).data()[0] != dval)
							 			"""),format.raw/*259.12*/("""{"""),format.raw/*259.13*/("""
							 				"""),format.raw/*260.13*/("""if(datatable.column(i).visible())
							 					datatable.column(i).visible(!datatable.column(i).visible());
							 			"""),format.raw/*262.12*/("""}"""),format.raw/*262.13*/("""
							 		"""),format.raw/*263.11*/("""else
							 			"""),format.raw/*264.12*/("""{"""),format.raw/*264.13*/("""
							 				"""),format.raw/*265.13*/("""if(!datatable.column(i).visible())
							 					datatable.column(i).visible(!datatable.column(i).visible());
							 				if(!datatable.column(i+1).visible())
							 					datatable.column(i+1).visible(!datatable.column(i+1).visible());
							 				i += 1;
							 			"""),format.raw/*270.12*/("""}"""),format.raw/*270.13*/("""
							 		"""),format.raw/*271.11*/("""i += 1;
							 	"""),format.raw/*272.10*/("""}"""),format.raw/*272.11*/("""
					 		"""),format.raw/*273.9*/("""}"""),format.raw/*273.10*/("""
					"""),format.raw/*274.6*/("""}"""),format.raw/*274.7*/(""";
				 
				 var btn = document.createElement("button");
				 btn.innerHTML = "submit form";
				 var header_array = json_headers.split("|");
				 btn.onclick = function(event)"""),format.raw/*279.35*/("""{"""),format.raw/*279.36*/("""
				 	"""),format.raw/*280.7*/("""event.preventDefault();
				 	$('#labels').val(AL);
				 	var i = 0;
				 	var colCount = datatable.columns().header().length;
				 	while (i < colCount)	
				 		"""),format.raw/*285.8*/("""{"""),format.raw/*285.9*/("""
				 			"""),format.raw/*286.9*/("""datatable.column(i).visible(true);
				 			i += 1;
				 		"""),format.raw/*288.8*/("""}"""),format.raw/*288.9*/("""
				 	"""),format.raw/*289.7*/("""var tab = document.getElementById('myDataTable');
				 	var c = 0;
				 	
				 	for (var key in jsondata[0])"""),format.raw/*292.35*/("""{"""),format.raw/*292.36*/("""
					 	"""),format.raw/*293.8*/("""if(typeof jsondata[0][key] == 'object')
					 	"""),format.raw/*294.8*/("""{"""),format.raw/*294.9*/("""
					 		"""),format.raw/*295.9*/("""for(var sub in jsondata[0][key])
					 		"""),format.raw/*296.9*/("""{"""),format.raw/*296.10*/("""
					 			"""),format.raw/*297.10*/("""if(typeof jsondata[0][key][sub] == 'object')
					 			"""),format.raw/*298.10*/("""{"""),format.raw/*298.11*/("""
					 				"""),format.raw/*299.11*/("""for(var sub2 in jsondata[0][key][sub])
					 				"""),format.raw/*300.11*/("""{"""),format.raw/*300.12*/("""
					 					"""),format.raw/*301.12*/("""jsondata[0][key][sub][sub2] = tab.rows[1].cells[c].innerHTML;
										c++;
					 				"""),format.raw/*303.11*/("""}"""),format.raw/*303.12*/("""
					 			"""),format.raw/*304.10*/("""}"""),format.raw/*304.11*/("""
					 			"""),format.raw/*305.10*/("""else
					 			"""),format.raw/*306.10*/("""{"""),format.raw/*306.11*/("""
					 				"""),format.raw/*307.11*/("""console.log(tab.rows[1].cells[c].innerHTML)
					 				var labs = tab.rows[1].cells[c].innerHTML
					 				var lis = labs.split(",")
					 				console.log(lis)
					 				jsondata[0][key] = lis;
									c++;
					 				break;
					 			"""),format.raw/*314.10*/("""}"""),format.raw/*314.11*/("""
					 		"""),format.raw/*315.9*/("""}"""),format.raw/*315.10*/("""
					 	"""),format.raw/*316.8*/("""}"""),format.raw/*316.9*/("""
					 	"""),format.raw/*317.8*/("""else
					 	"""),format.raw/*318.8*/("""{"""),format.raw/*318.9*/("""
					 		"""),format.raw/*319.9*/("""console.log(key)
					 		if(key == "chosen_label")
				 			"""),format.raw/*321.9*/("""{"""),format.raw/*321.10*/("""
					 			"""),format.raw/*322.10*/("""var cval = document.getElementById('c_label').value;
					 			if(cval != "")
				 				"""),format.raw/*324.10*/("""{"""),format.raw/*324.11*/("""
					 				 """),format.raw/*325.12*/("""var c_html = '<select id=\"c_label\">'
				 					 c_html +=  '<option value=\"'+cval+'\">'+cval+'</option>'
				 					 c_html +=  '<option value=\"\"></option>'
				 						for (var d in allLabels)
				 		                	"""),format.raw/*329.25*/("""{"""),format.raw/*329.26*/("""
				 							"""),format.raw/*330.13*/("""l = allLabels[d]
				 							if(l != cval)
			 								"""),format.raw/*332.13*/("""{"""),format.raw/*332.14*/("""
			 									"""),format.raw/*333.14*/("""c_html +=  '<option value=\"'+l+'\">'+l+'</option>'
			 								"""),format.raw/*334.13*/("""}"""),format.raw/*334.14*/("""
				 		                	"""),format.raw/*335.25*/("""}"""),format.raw/*335.26*/("""
				 					"""),format.raw/*336.11*/("""c_html += '</select>'
				 					console.log(c_html)
				 					jsondata[0][key] = c_html
				 				"""),format.raw/*339.10*/("""}"""),format.raw/*339.11*/("""
					 			"""),format.raw/*340.10*/("""else
					 				"""),format.raw/*341.11*/("""{"""),format.raw/*341.12*/("""
					 					"""),format.raw/*342.12*/("""jsondata[0][key] = tab.rows[1].cells[c].innerHTML;
					 				"""),format.raw/*343.11*/("""}"""),format.raw/*343.12*/("""
				 			"""),format.raw/*344.9*/("""}"""),format.raw/*344.10*/("""
					 		"""),format.raw/*345.9*/("""else
					 			"""),format.raw/*346.10*/("""{"""),format.raw/*346.11*/("""
					 				"""),format.raw/*347.11*/("""jsondata[0][key] = tab.rows[1].cells[c].innerHTML;
					 			"""),format.raw/*348.10*/("""}"""),format.raw/*348.11*/("""
							
							"""),format.raw/*350.8*/("""c++;
					 	"""),format.raw/*351.8*/("""}"""),format.raw/*351.9*/("""
				 	"""),format.raw/*352.7*/("""}"""),format.raw/*352.8*/("""
				 	"""),format.raw/*353.7*/("""j_string = JSON.stringify(jsondata);
				    console.log(j_string)
				    j_string = document.getElementById('directory' + """),_display_(/*355.59*/index),format.raw/*355.64*/(""").value + j_string;
					console.log(j_string)
				    var xmlHttp = new XMLHttpRequest();
				    xmlHttp.onreadystatechange = function() """),format.raw/*358.49*/("""{"""),format.raw/*358.50*/("""
						"""),format.raw/*359.7*/("""if (xmlHttp.readyState == 4 && xmlHttp.status == 200) """),format.raw/*359.61*/("""{"""),format.raw/*359.62*/("""
							"""),format.raw/*360.8*/("""console.log(this.responseText)
						"""),format.raw/*361.7*/("""}"""),format.raw/*361.8*/("""
					"""),format.raw/*362.6*/("""}"""),format.raw/*362.7*/("""
					"""),format.raw/*363.6*/("""xmlHttp.open("POST", "/submit_JSON", true);
					xmlHttp.send(j_string);
				    """),format.raw/*365.9*/("""}"""),format.raw/*365.10*/(""";
				 
				 document.getElementById('status' + """),_display_(/*367.42*/index),format.raw/*367.47*/(""").appendChild(btn);
   			"""),format.raw/*368.7*/("""}"""),format.raw/*368.8*/("""
   			
		"""),format.raw/*370.3*/("""</script>		         
  """)))}),format.raw/*371.4*/("""  """))
      }
    }
  }

  def render(task:models.tasks.showJSONTask,index:Integer): play.twirl.api.HtmlFormat.Appendable = apply(task,index)

  def f:((models.tasks.showJSONTask,Integer) => play.twirl.api.HtmlFormat.Appendable) = (task,index) => apply(task,index)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu May 27 11:30:38 CDT 2021
                  SOURCE: /Users/petercui/workspace/idols/idols_user/app/views/workflow/showJSON.scala.html
                  HASH: 933b26940861adc93bf895bcfd984c76bf4f21df
                  MATRIX: 768->1|912->50|946->59|960->65|1075->171|1116->174|1158->190|1254->260|1279->265|1486->445|1512->450|1561->472|1574->476|1607->488|1699->552|1713->556|1745->566|1795->588|1822->593|1887->630|1914->635|2005->698|2019->702|2051->712|2108->741|2135->746|2200->783|2227->788|2443->977|2469->982|2518->1004|2531->1008|2564->1020|2668->1097|2694->1102|2795->1176|2821->1181|2869->1202|2895->1207|2963->1247|2990->1252|3078->1312|3105->1317|3250->1434|3277->1439|3327->1461|3354->1466|3424->1508|3451->1513|3629->1664|3655->1669|3765->1752|3791->1757|3936->1875|3962->1880|4070->1961|4096->1966|4202->2045|4228->2050|4330->2124|4359->2125|4394->2133|4478->2189|4507->2190|4542->2198|4631->2259|4660->2260|4696->2269|4834->2380|4862->2381|5048->2540|5076->2541|5111->2549|5139->2550|5178->2562|5230->2586|5259->2587|5294->2595|5394->2668|5422->2669|5461->2681|5513->2705|5542->2706|5578->2715|5646->2756|5672->2761|5732->2794|5760->2795|5811->2819|5847->2828|5873->2833|5920->2852|5949->2853|5995->2871|6030->2879|6050->2890|6112->2931|6237->3028|6266->3029|6323->3058|6424->3132|6453->3133|6532->3184|6561->3185|6617->3213|6852->3421|6878->3426|6984->3505|7010->3510|7094->3566|7123->3567|7201->3617|7230->3618|7279->3639|7389->3721|7416->3726|7521->3803|7548->3808|7655->3887|7682->3892|7753->3934|7783->3935|7830->3954|7859->3955|7923->3990|7953->3991|7985->3995|8271->4252|8301->4253|8331->4254|8410->4304|8440->4305|8477->4312|8508->4313|8569->4344|8600->4345|8759->4475|8789->4476|8829->4487|8900->4529|8930->4530|8971->4542|9148->4690|9178->4691|9233->4717|9309->4764|9339->4765|9382->4779|9534->4902|9564->4903|9608->4918|9786->5067|9816->5068|9859->5082|9960->5154|9990->5155|10032->5168|10066->5173|10096->5174|10139->5188|10239->5259|10269->5260|10335->5297|10365->5298|10406->5310|10482->5357|10512->5358|10545->5362|10575->5363|10616->5375|10761->5491|10791->5492|10830->5502|10860->5503|10899->5513|11005->5591|11032->5596|11090->5626|11119->5627|11158->5638|11215->5666|11245->5667|11282->5676|11663->6028|11693->6029|11728->6036|11802->6082|11831->6083|11867->6091|11935->6131|11964->6132|12001->6141|12082->6194|12112->6195|12151->6205|12228->6253|12258->6254|12298->6265|12447->6385|12477->6386|12539->6419|12569->6420|12661->6483|12691->6484|12728->6493|12758->6494|12795->6503|12836->6516|12866->6517|12905->6527|13132->6725|13162->6726|13202->6737|13327->6833|13357->6834|13407->6855|13453->6872|13483->6873|13529->6890|13559->6891|13647->6951|13677->6952|13713->6960|13742->6961|13777->6968|13806->6969|13841->6976|13880->6987|13909->6988|13945->6996|14078->7101|14107->7102|14144->7111|14190->7128|14220->7129|14299->7179|14329->7180|14367->7190|14396->7191|14432->7199|14472->7211|14501->7212|14538->7221|14584->7238|14614->7239|14659->7255|14689->7256|14727->7266|14756->7267|14800->7283|14858->7313|14887->7314|14921->7320|14950->7321|14984->7327|15193->7508|15220->7513|15304->7569|15331->7574|15484->7698|15514->7699|15550->7707|15741->7870|15771->7871|15801->7872|16018->8060|16048->8061|16083->8068|16222->8178|16252->8179|16286->8185|16493->8363|16523->8364|16559->8372|16729->8514|16759->8515|16798->8525|16924->8622|16954->8623|16995->8635|17088->8699|17118->8700|17155->8709|17185->8710|17221->8718|17262->8731|17292->8732|17331->8742|17455->8837|17485->8838|17525->8849|17608->8903|17638->8904|17680->8917|17828->9036|17858->9037|17898->9048|17943->9064|17973->9065|18015->9078|18311->9345|18341->9346|18381->9357|18427->9374|18457->9375|18494->9384|18524->9385|18558->9391|18587->9392|18792->9568|18822->9569|18857->9576|19047->9738|19076->9739|19113->9748|19199->9806|19228->9807|19263->9814|19400->9922|19430->9923|19466->9931|19541->9978|19570->9979|19607->9988|19676->10029|19706->10030|19745->10040|19828->10094|19858->10095|19898->10106|19976->10155|20006->10156|20047->10168|20163->10255|20193->10256|20232->10266|20262->10267|20301->10277|20344->10291|20374->10292|20414->10303|20676->10536|20706->10537|20743->10546|20773->10547|20809->10555|20838->10556|20874->10564|20914->10576|20943->10577|20980->10586|21067->10645|21097->10646|21136->10656|21251->10742|21281->10743|21322->10755|21572->10976|21602->10977|21644->10990|21728->11045|21758->11046|21801->11060|21894->11124|21924->11125|21978->11150|22008->11151|22048->11162|22174->11259|22204->11260|22243->11270|22287->11285|22317->11286|22358->11298|22448->11359|22478->11360|22515->11369|22545->11370|22582->11379|22625->11393|22655->11394|22695->11405|22784->11465|22814->11466|22858->11482|22898->11494|22927->11495|22962->11502|22991->11503|23026->11510|23179->11635|23206->11640|23374->11779|23404->11780|23439->11787|23522->11841|23552->11842|23588->11850|23653->11887|23682->11888|23716->11894|23745->11895|23779->11901|23888->11982|23918->11983|23995->12032|24022->12037|24076->12063|24105->12064|24143->12074|24198->12098
                  LINES: 21->1|26->1|28->3|28->3|28->3|28->3|30->5|32->7|32->7|39->14|39->14|39->14|39->14|39->14|39->14|39->14|39->14|39->14|39->14|39->14|39->14|39->14|39->14|39->14|39->14|39->14|39->14|39->14|48->23|48->23|48->23|48->23|48->23|49->24|49->24|52->27|52->27|52->27|52->27|52->27|52->27|52->27|52->27|52->27|52->27|52->27|52->27|52->27|52->27|58->33|58->33|60->35|60->35|65->40|65->40|67->42|67->42|72->47|72->47|75->50|75->50|76->51|77->52|77->52|78->53|79->54|79->54|80->55|83->58|83->58|86->61|86->61|87->62|87->62|89->64|89->64|89->64|90->65|92->67|92->67|94->69|94->69|94->69|95->70|95->70|95->70|96->71|96->71|100->75|100->75|100->75|101->76|101->76|103->78|103->78|103->78|103->78|106->81|106->81|107->82|111->86|111->86|113->88|113->88|115->90|119->94|119->94|120->95|120->95|122->97|122->97|123->98|123->98|124->99|126->101|126->101|127->102|127->102|128->103|128->103|129->104|129->104|131->106|131->106|133->108|133->108|134->109|140->115|140->115|140->115|140->115|140->115|140->115|140->115|140->115|140->115|143->118|143->118|144->119|144->119|144->119|145->120|147->122|147->122|149->124|149->124|149->124|150->125|153->128|153->128|154->129|156->131|156->131|157->132|159->134|159->134|160->135|160->135|160->135|161->136|162->137|162->137|165->140|165->140|166->141|167->142|167->142|167->142|167->142|168->143|169->144|169->144|170->145|170->145|171->146|172->147|172->147|173->148|173->148|175->150|175->150|175->150|176->151|185->160|185->160|186->161|187->162|187->162|188->163|189->164|189->164|190->165|191->166|191->166|192->167|193->168|193->168|194->169|196->171|196->171|196->171|196->171|198->173|198->173|199->174|199->174|200->175|201->176|201->176|202->177|209->184|209->184|210->185|212->187|212->187|214->189|214->189|214->189|214->189|214->189|217->192|217->192|218->193|218->193|219->194|219->194|220->195|221->196|221->196|222->197|226->201|226->201|227->202|227->202|227->202|227->202|227->202|228->203|228->203|229->204|230->205|230->205|231->206|231->206|231->206|231->206|231->206|232->207|232->207|234->209|235->210|235->210|236->211|236->211|237->212|242->217|242->217|243->218|243->218|246->221|246->221|247->222|252->227|252->227|252->227|257->232|257->232|258->233|260->235|260->235|261->236|264->239|264->239|265->240|268->243|268->243|269->244|272->247|272->247|273->248|275->250|275->250|276->251|276->251|277->252|278->253|278->253|279->254|282->257|282->257|283->258|284->259|284->259|285->260|287->262|287->262|288->263|289->264|289->264|290->265|295->270|295->270|296->271|297->272|297->272|298->273|298->273|299->274|299->274|304->279|304->279|305->280|310->285|310->285|311->286|313->288|313->288|314->289|317->292|317->292|318->293|319->294|319->294|320->295|321->296|321->296|322->297|323->298|323->298|324->299|325->300|325->300|326->301|328->303|328->303|329->304|329->304|330->305|331->306|331->306|332->307|339->314|339->314|340->315|340->315|341->316|341->316|342->317|343->318|343->318|344->319|346->321|346->321|347->322|349->324|349->324|350->325|354->329|354->329|355->330|357->332|357->332|358->333|359->334|359->334|360->335|360->335|361->336|364->339|364->339|365->340|366->341|366->341|367->342|368->343|368->343|369->344|369->344|370->345|371->346|371->346|372->347|373->348|373->348|375->350|376->351|376->351|377->352|377->352|378->353|380->355|380->355|383->358|383->358|384->359|384->359|384->359|385->360|386->361|386->361|387->362|387->362|388->363|390->365|390->365|392->367|392->367|393->368|393->368|395->370|396->371
                  -- GENERATED --
              */
          