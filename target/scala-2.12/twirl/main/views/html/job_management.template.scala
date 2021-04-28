
package views.html

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

object job_management extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.auth.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.auth.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.26*/("""

"""),_display_(/*3.2*/idols_main("Reset Jupyter Notebook Sessions", Some(user))/*3.59*/ {_display_(Seq[Any](format.raw/*3.61*/("""

"""),format.raw/*5.1*/("""<h2>Manage Jupyter Notebook Sessions</h2>


<table id="myDataTable" class="display" style="width:80%" border="1"> </table>

<button id="refresh" onClick="getTable()">Get Job Status</button>
<button id="launch" onClick="launchJob()">Launch Job</button>
<button id="cancel" onClick="cancelJob()">Cancel Job</button>

	<script>
	// refresh the table every minute
	//setInterval(function() """),format.raw/*16.27*/("""{"""),format.raw/*16.28*/("""document.getElementById("refresh").click();"""),format.raw/*16.71*/("""}"""),format.raw/*16.72*/(""", 30000);

	function launchJob() """),format.raw/*18.23*/("""{"""),format.raw/*18.24*/("""
		"""),format.raw/*19.3*/("""document.getElementById("launch").disabled = true;
		console.log("disabled")
		
		var table = $('#myDataTable').DataTable();
		var selected = arrToString(table.rows( """),format.raw/*23.42*/("""{"""),format.raw/*23.43*/(""" """),format.raw/*23.44*/("""selected: true """),format.raw/*23.59*/("""}"""),format.raw/*23.60*/(""" """),format.raw/*23.61*/(""").data());

	 	var json = '"""),format.raw/*25.16*/("""{"""),format.raw/*25.17*/(""""action" : "launch", "selected":"[';

	 	for (var i = 0; i < selected.length; i++) """),format.raw/*27.46*/("""{"""),format.raw/*27.47*/("""
		 	"""),format.raw/*28.5*/("""json += selected[i].split('"').join('\\"');
		 	if (i < selected.length - 1) """),format.raw/*29.34*/("""{"""),format.raw/*29.35*/("""
		 		"""),format.raw/*30.6*/("""json += ",";
		 	"""),format.raw/*31.5*/("""}"""),format.raw/*31.6*/("""
		"""),format.raw/*32.3*/("""}"""),format.raw/*32.4*/("""
		
		"""),format.raw/*34.3*/("""json += ']""""),format.raw/*34.14*/("""}"""),format.raw/*34.15*/("""';
	 	var xmlHttp = new XMLHttpRequest();

		xmlHttp.onreadystatechange = function() """),format.raw/*37.43*/("""{"""),format.raw/*37.44*/("""
			"""),format.raw/*38.4*/("""if (xmlHttp.readyState == 4 && xmlHttp.status == 200) """),format.raw/*38.58*/("""{"""),format.raw/*38.59*/("""
				"""),format.raw/*39.5*/("""console.log(this.responseText);
				document.getElementById("refresh").click();
				
			"""),format.raw/*42.4*/("""}"""),format.raw/*42.5*/("""
		"""),format.raw/*43.3*/("""}"""),format.raw/*43.4*/("""
		"""),format.raw/*44.3*/("""xmlHttp.open("POST", "/job_management", true);
		xmlHttp.send(json);
	"""),format.raw/*46.2*/("""}"""),format.raw/*46.3*/("""

	"""),format.raw/*48.2*/("""function cancelJob() """),format.raw/*48.23*/("""{"""),format.raw/*48.24*/("""
		"""),format.raw/*49.3*/("""document.getElementById("cancel").disabled = true;
		
		var table = $('#myDataTable').DataTable();
		var selected = arrToString(table.rows( """),format.raw/*52.42*/("""{"""),format.raw/*52.43*/(""" """),format.raw/*52.44*/("""selected: true """),format.raw/*52.59*/("""}"""),format.raw/*52.60*/(""" """),format.raw/*52.61*/(""").data());

	 	var json = '"""),format.raw/*54.16*/("""{"""),format.raw/*54.17*/(""""action" : "cancel", "selected":"[';

	 	for (var i = 0; i < selected.length; i++) """),format.raw/*56.46*/("""{"""),format.raw/*56.47*/("""
		 	"""),format.raw/*57.5*/("""json += selected[i].split('"').join('\\"');
		 	if (i < selected.length - 1) """),format.raw/*58.34*/("""{"""),format.raw/*58.35*/("""
		 		"""),format.raw/*59.6*/("""json += ",";
		 	"""),format.raw/*60.5*/("""}"""),format.raw/*60.6*/("""
		"""),format.raw/*61.3*/("""}"""),format.raw/*61.4*/("""
		
		"""),format.raw/*63.3*/("""json += ']""""),format.raw/*63.14*/("""}"""),format.raw/*63.15*/("""';
	 	var xmlHttp = new XMLHttpRequest();

		xmlHttp.onreadystatechange = function() """),format.raw/*66.43*/("""{"""),format.raw/*66.44*/("""
			"""),format.raw/*67.4*/("""if (xmlHttp.readyState == 4 && xmlHttp.status == 200) """),format.raw/*67.58*/("""{"""),format.raw/*67.59*/("""
				"""),format.raw/*68.5*/("""console.log(this.responseText);
				document.getElementById("refresh").click();
			"""),format.raw/*70.4*/("""}"""),format.raw/*70.5*/("""
		"""),format.raw/*71.3*/("""}"""),format.raw/*71.4*/("""
		"""),format.raw/*72.3*/("""xmlHttp.open("POST", "/job_management", true);
		xmlHttp.send(json);
	"""),format.raw/*74.2*/("""}"""),format.raw/*74.3*/("""
	

	"""),format.raw/*77.2*/("""function arrToString(arr) """),format.raw/*77.28*/("""{"""),format.raw/*77.29*/("""
		"""),format.raw/*78.3*/("""var res = [];
		for (var i = 0; i < arr.length; i++) """),format.raw/*79.40*/("""{"""),format.raw/*79.41*/("""
			"""),format.raw/*80.4*/("""res.push(JSON.stringify(arr[i]));
		"""),format.raw/*81.3*/("""}"""),format.raw/*81.4*/("""
		"""),format.raw/*82.3*/("""return res;
	"""),format.raw/*83.2*/("""}"""),format.raw/*83.3*/("""
	
	"""),format.raw/*85.2*/("""function getTable() """),format.raw/*85.22*/("""{"""),format.raw/*85.23*/("""
		"""),format.raw/*86.3*/("""document.getElementById("launch").disabled = false;
		console.log("enabled")
		document.getElementById("cancel").disabled = false;
		
	 	var xmlHttp = new XMLHttpRequest();
	 	var json = '"""),format.raw/*91.16*/("""{"""),format.raw/*91.17*/(""""action" : "refresh""""),format.raw/*91.37*/("""}"""),format.raw/*91.38*/("""'
		xmlHttp.onreadystatechange = function() """),format.raw/*92.43*/("""{"""),format.raw/*92.44*/("""
			"""),format.raw/*93.4*/("""if (xmlHttp.readyState == 4 && xmlHttp.status == 200) """),format.raw/*93.58*/("""{"""),format.raw/*93.59*/("""
				"""),format.raw/*94.5*/("""//console.log(this.responseText)
				js2Table(JSON.parse(this.responseText));
			"""),format.raw/*96.4*/("""}"""),format.raw/*96.5*/("""
		"""),format.raw/*97.3*/("""}"""),format.raw/*97.4*/("""
		"""),format.raw/*98.3*/("""xmlHttp.open("POST", "/job_management", true);
		xmlHttp.send(json);
	"""),format.raw/*100.2*/("""}"""),format.raw/*100.3*/("""

	"""),format.raw/*102.2*/("""function js2Table(jsondata)"""),format.raw/*102.29*/("""{"""),format.raw/*102.30*/("""
		"""),format.raw/*103.3*/("""if ( $.fn.dataTable.isDataTable( '#myDataTable' ) ) """),format.raw/*103.55*/("""{"""),format.raw/*103.56*/("""
			"""),format.raw/*104.4*/("""$('#myDataTable').DataTable().destroy();
		"""),format.raw/*105.3*/("""}"""),format.raw/*105.4*/(""" 
		"""),format.raw/*106.3*/("""$('#myDataTable').DataTable( """),format.raw/*106.32*/("""{"""),format.raw/*106.33*/("""
		        """),format.raw/*107.11*/("""data: jsondata, 
		        columns: [
			        """),format.raw/*109.12*/("""{"""),format.raw/*109.13*/(""" """),format.raw/*109.14*/("""title: 'JobID' """),format.raw/*109.29*/("""}"""),format.raw/*109.30*/(""",
			        """),format.raw/*110.12*/("""{"""),format.raw/*110.13*/(""" """),format.raw/*110.14*/("""title: 'Partition' """),format.raw/*110.33*/("""}"""),format.raw/*110.34*/(""",
			        """),format.raw/*111.12*/("""{"""),format.raw/*111.13*/(""" """),format.raw/*111.14*/("""title: 'JobName' """),format.raw/*111.31*/("""}"""),format.raw/*111.32*/(""",
			        """),format.raw/*112.12*/("""{"""),format.raw/*112.13*/(""" """),format.raw/*112.14*/("""title: 'User' """),format.raw/*112.28*/("""}"""),format.raw/*112.29*/(""",
			        """),format.raw/*113.12*/("""{"""),format.raw/*113.13*/(""" """),format.raw/*113.14*/("""title: 'ST' """),format.raw/*113.26*/("""}"""),format.raw/*113.27*/(""",
			        """),format.raw/*114.12*/("""{"""),format.raw/*114.13*/(""" """),format.raw/*114.14*/("""title: 'Time' """),format.raw/*114.28*/("""}"""),format.raw/*114.29*/(""",
			        """),format.raw/*115.12*/("""{"""),format.raw/*115.13*/(""" """),format.raw/*115.14*/("""title: 'Nodes' """),format.raw/*115.29*/("""}"""),format.raw/*115.30*/(""",
			        """),format.raw/*116.12*/("""{"""),format.raw/*116.13*/(""" """),format.raw/*116.14*/("""title: 'Nodelist(Reason)' """),format.raw/*116.40*/("""}"""),format.raw/*116.41*/(""",
			        """),format.raw/*117.12*/("""{"""),format.raw/*117.13*/(""" """),format.raw/*117.14*/("""title: 'Port' """),format.raw/*117.28*/("""}"""),format.raw/*117.29*/(""",
			        """),format.raw/*118.12*/("""{"""),format.raw/*118.13*/(""" """),format.raw/*118.14*/("""title: 'Password' """),format.raw/*118.32*/("""}"""),format.raw/*118.33*/("""
			    """),format.raw/*119.8*/("""],
			    dom: 'Bfrtip',
		        buttons: [
		            'selectAll',
		            'selectNone'
		        ],
		        language: """),format.raw/*125.21*/("""{"""),format.raw/*125.22*/("""
		            """),format.raw/*126.15*/("""buttons: """),format.raw/*126.24*/("""{"""),format.raw/*126.25*/("""
		                """),format.raw/*127.19*/("""selectAll: "Select all items",
		                selectNone: "Select none"
		            """),format.raw/*129.15*/("""}"""),format.raw/*129.16*/("""
		        """),format.raw/*130.11*/("""}"""),format.raw/*130.12*/(""",
		        select: true
		    """),format.raw/*132.7*/("""}"""),format.raw/*132.8*/(""" """),format.raw/*132.9*/(""");
	
		 
		"""),format.raw/*135.3*/("""}"""),format.raw/*135.4*/("""
	    
	"""),format.raw/*137.2*/("""</script>	
""")))}),format.raw/*138.2*/("""


"""))
      }
    }
  }

  def render(user:models.auth.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.auth.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 28 17:13:04 CDT 2021
                  SOURCE: /Users/petercui/workspace/idols/idols_user/app/views/job_management.scala.html
                  HASH: 503e8b9974f2f30418c1506444dfa806dbd8cc2d
                  MATRIX: 748->1|867->25|895->28|960->85|999->87|1027->89|1441->475|1470->476|1541->519|1570->520|1631->553|1660->554|1690->557|1884->723|1913->724|1942->725|1985->740|2014->741|2043->742|2098->769|2127->770|2238->853|2267->854|2299->859|2404->936|2433->937|2466->943|2510->960|2538->961|2568->964|2596->965|2629->971|2668->982|2697->983|2810->1068|2839->1069|2870->1073|2952->1127|2981->1128|3013->1133|3128->1221|3156->1222|3186->1225|3214->1226|3244->1229|3341->1299|3369->1300|3399->1303|3448->1324|3477->1325|3507->1328|3675->1468|3704->1469|3733->1470|3776->1485|3805->1486|3834->1487|3889->1514|3918->1515|4029->1598|4058->1599|4090->1604|4195->1681|4224->1682|4257->1688|4301->1705|4329->1706|4359->1709|4387->1710|4420->1716|4459->1727|4488->1728|4601->1813|4630->1814|4661->1818|4743->1872|4772->1873|4804->1878|4914->1961|4942->1962|4972->1965|5000->1966|5030->1969|5127->2039|5155->2040|5187->2045|5241->2071|5270->2072|5300->2075|5381->2128|5410->2129|5441->2133|5504->2169|5532->2170|5562->2173|5602->2186|5630->2187|5661->2191|5709->2211|5738->2212|5768->2215|5984->2403|6013->2404|6061->2424|6090->2425|6162->2469|6191->2470|6222->2474|6304->2528|6333->2529|6365->2534|6473->2615|6501->2616|6531->2619|6559->2620|6589->2623|6687->2693|6716->2694|6747->2697|6803->2724|6833->2725|6864->2728|6945->2780|6975->2781|7007->2785|7078->2828|7107->2829|7139->2833|7197->2862|7227->2863|7267->2874|7345->2923|7375->2924|7405->2925|7449->2940|7479->2941|7521->2954|7551->2955|7581->2956|7629->2975|7659->2976|7701->2989|7731->2990|7761->2991|7807->3008|7837->3009|7879->3022|7909->3023|7939->3024|7982->3038|8012->3039|8054->3052|8084->3053|8114->3054|8155->3066|8185->3067|8227->3080|8257->3081|8287->3082|8330->3096|8360->3097|8402->3110|8432->3111|8462->3112|8506->3127|8536->3128|8578->3141|8608->3142|8638->3143|8693->3169|8723->3170|8765->3183|8795->3184|8825->3185|8868->3199|8898->3200|8940->3213|8970->3214|9000->3215|9047->3233|9077->3234|9113->3242|9275->3375|9305->3376|9349->3391|9387->3400|9417->3401|9465->3420|9583->3509|9613->3510|9653->3521|9683->3522|9742->3553|9771->3554|9800->3555|9839->3566|9868->3567|9904->3575|9947->3587
                  LINES: 21->1|26->1|28->3|28->3|28->3|30->5|41->16|41->16|41->16|41->16|43->18|43->18|44->19|48->23|48->23|48->23|48->23|48->23|48->23|50->25|50->25|52->27|52->27|53->28|54->29|54->29|55->30|56->31|56->31|57->32|57->32|59->34|59->34|59->34|62->37|62->37|63->38|63->38|63->38|64->39|67->42|67->42|68->43|68->43|69->44|71->46|71->46|73->48|73->48|73->48|74->49|77->52|77->52|77->52|77->52|77->52|77->52|79->54|79->54|81->56|81->56|82->57|83->58|83->58|84->59|85->60|85->60|86->61|86->61|88->63|88->63|88->63|91->66|91->66|92->67|92->67|92->67|93->68|95->70|95->70|96->71|96->71|97->72|99->74|99->74|102->77|102->77|102->77|103->78|104->79|104->79|105->80|106->81|106->81|107->82|108->83|108->83|110->85|110->85|110->85|111->86|116->91|116->91|116->91|116->91|117->92|117->92|118->93|118->93|118->93|119->94|121->96|121->96|122->97|122->97|123->98|125->100|125->100|127->102|127->102|127->102|128->103|128->103|128->103|129->104|130->105|130->105|131->106|131->106|131->106|132->107|134->109|134->109|134->109|134->109|134->109|135->110|135->110|135->110|135->110|135->110|136->111|136->111|136->111|136->111|136->111|137->112|137->112|137->112|137->112|137->112|138->113|138->113|138->113|138->113|138->113|139->114|139->114|139->114|139->114|139->114|140->115|140->115|140->115|140->115|140->115|141->116|141->116|141->116|141->116|141->116|142->117|142->117|142->117|142->117|142->117|143->118|143->118|143->118|143->118|143->118|144->119|150->125|150->125|151->126|151->126|151->126|152->127|154->129|154->129|155->130|155->130|157->132|157->132|157->132|160->135|160->135|162->137|163->138
                  -- GENERATED --
              */
          