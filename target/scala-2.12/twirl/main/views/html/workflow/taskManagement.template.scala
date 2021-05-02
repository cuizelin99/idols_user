
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

object taskManagement extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[models.auth.User,Integer,Array[models.tasks.Task],play.twirl.api.HtmlFormat.Appendable] {

  /* taskManagement Template File */
  def apply/*2.2*/(user: models.auth.User, tasks_length: Integer, tasks: Array[models.tasks.Task]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.82*/("""

"""),format.raw/*4.1*/("""<div class="step1">

	<p>Workflow Management </p>
	
</div>

<ul style="list-style:none">

	<p>Define Task Predecessor</p>
	"""),_display_(/*13.3*/for(index <- 0 until tasks_length) yield /*13.37*/ {_display_(Seq[Any](format.raw/*13.39*/("""
	    	"""),format.raw/*14.7*/("""<li>
			<div class="indivsteps">
				<p>Task """),_display_(/*16.14*/(index+1)),format.raw/*16.23*/("""    """),format.raw/*16.27*/("""<select id="predecessor"""),_display_(/*16.51*/index),format.raw/*16.56*/("""">
										<option disabled selected>Please select predecessor task</option>
										<option selected>None</option>
										"""),_display_(/*19.12*/for(n <- 0 until tasks_length) yield /*19.42*/ {_display_(Seq[Any](format.raw/*19.44*/("""
											"""),_display_(/*20.13*/if(n == index)/*20.27*/ {_display_(Seq[Any](format.raw/*20.29*/("""
												"""),format.raw/*21.13*/("""<option disabled>Task """),_display_(/*21.36*/(n + 1)),format.raw/*21.43*/("""</option>
											""")))}/*22.14*/else/*22.19*/{_display_(Seq[Any](format.raw/*22.20*/("""
												"""),format.raw/*23.13*/("""<option>Task """),_display_(/*23.27*/(n + 1)),format.raw/*23.34*/("""</option>
											""")))}),format.raw/*24.13*/("""
										""")))}),format.raw/*25.12*/("""
								  """),format.raw/*26.11*/("""</select> <div class="status_none"  style="display:inline; white-space: nowrap;" id="status_"""),_display_(/*26.104*/index),format.raw/*26.109*/(""""></div>
				</p>
				<p> """),_display_(/*28.10*/tasks(index)/*28.22*/.task_name),format.raw/*28.32*/(""" """),format.raw/*28.33*/("""</p>
				<p> """),_display_(/*29.10*/tasks(index)/*29.22*/.get_description()),format.raw/*29.40*/(""" """),format.raw/*29.41*/("""</p>
			</div>
			<button data-toggle="collapse" data-target="#form"""),_display_(/*31.54*/index),format.raw/*31.59*/("""">Hide Task """),_display_(/*31.72*/(index+1)),format.raw/*31.81*/("""</button>
		</li>
	""")))}),format.raw/*33.3*/("""
	
	"""),format.raw/*35.2*/("""<li>
		<div class="indivsteps">
			<button type="button" onclick="runTasks()">Run All Tasks</button>
		</div>
	</li>
</ul>

"""),_display_(/*42.2*/if(user.role == models.auth.Roles.AdminRole)/*42.46*/ {_display_(Seq[Any](format.raw/*42.48*/("""
	"""),_display_(/*43.3*/helper/*43.9*/.form(action = controllers.routes.WorkflowController.runTask(-1), 'enctype -> "multipart/form-data")/*43.109*/ {_display_(Seq[Any](format.raw/*43.111*/("""
		"""),format.raw/*44.3*/("""<input type="file" name="new_workflow" value="new_workflow"><button type="submit">Upload New Workflow</button>
	""")))}),format.raw/*45.3*/("""
	
	"""),format.raw/*47.2*/("""<button type="button" id="save_workflow">Save Current Workflow</button>
	    
	<button type="button" id="current_workflow">Download Current Workflow</button>	
""")))}),format.raw/*50.2*/("""


"""),format.raw/*53.1*/("""<script>
	document.getElementById("save_workflow").onclick = function () """),format.raw/*54.65*/("""{"""),format.raw/*54.66*/("""
		"""),format.raw/*55.3*/("""location.href = "/saveworkflow";
	"""),format.raw/*56.2*/("""}"""),format.raw/*56.3*/(""";
	
	document.getElementById("current_workflow").onclick = function () """),format.raw/*58.68*/("""{"""),format.raw/*58.69*/("""
		"""),format.raw/*59.3*/("""location.href = "/downloadworkflow";
	"""),format.raw/*60.2*/("""}"""),format.raw/*60.3*/(""";
	
	
	var total_ran = 0;
	var total_error = 0;
	var arr = new Array("""),_display_(/*65.23*/tasks_length),format.raw/*65.35*/(""").fill(0);
	
	function runTasks() """),format.raw/*67.22*/("""{"""),format.raw/*67.23*/("""
		"""),format.raw/*68.3*/("""arr.fill(0);
		runAll();
	"""),format.raw/*70.2*/("""}"""),format.raw/*70.3*/("""
	
	"""),format.raw/*72.2*/("""function runAll() """),format.raw/*72.20*/("""{"""),format.raw/*72.21*/("""
		"""),format.raw/*73.3*/("""check();
		runnable();
		console.log(arr);
	"""),format.raw/*76.2*/("""}"""),format.raw/*76.3*/("""
	
	"""),format.raw/*78.2*/("""function runnable() """),format.raw/*78.22*/("""{"""),format.raw/*78.23*/("""
		"""),format.raw/*79.3*/("""for (i = 0; i < arr.length; i++)
			if (arr[i] == 1) """),format.raw/*80.21*/("""{"""),format.raw/*80.22*/("""
				"""),format.raw/*81.5*/("""$("#submit" + i).click();
				arr[i] = 2;
			"""),format.raw/*83.4*/("""}"""),format.raw/*83.5*/("""
	"""),format.raw/*84.2*/("""}"""),format.raw/*84.3*/("""
	
	"""),format.raw/*86.2*/("""function check() """),format.raw/*86.19*/("""{"""),format.raw/*86.20*/("""
		"""),_display_(/*87.4*/for(index <- 0 until tasks_length) yield /*87.38*/ {_display_(Seq[Any](format.raw/*87.40*/("""
				"""),format.raw/*88.5*/("""console.log("""),_display_(/*88.18*/index),format.raw/*88.23*/(""" """),format.raw/*88.24*/("""+ document.getElementById('status' + """),_display_(/*88.62*/index),format.raw/*88.67*/(""").className);
				if (arr["""),_display_(/*89.14*/index),format.raw/*89.19*/("""] == 0) """),format.raw/*89.27*/("""{"""),format.raw/*89.28*/("""
					"""),format.raw/*90.6*/("""var predecessor_index = document.getElementById('predecessor' + """),_display_(/*90.71*/index),format.raw/*90.76*/(""").selectedIndex;
					if (predecessor_index == 1) """),format.raw/*91.34*/("""{"""),format.raw/*91.35*/("""
						"""),format.raw/*92.7*/("""document.getElementById('status' + """),_display_(/*92.43*/index),format.raw/*92.48*/(""").className = "status_running";
						document.getElementById('status' + """),_display_(/*93.43*/index),format.raw/*93.48*/(""").innerHTML = "Running";
						document.getElementById('status_' + """),_display_(/*94.44*/index),format.raw/*94.49*/(""").className = "status_running";
						document.getElementById('status_' + """),_display_(/*95.44*/index),format.raw/*95.49*/(""").innerHTML = "Running";
						arr["""),_display_(/*96.12*/index),format.raw/*96.17*/("""] = 1;
					"""),format.raw/*97.6*/("""}"""),format.raw/*97.7*/(""" """),format.raw/*97.8*/("""else if (document.getElementById('status' + (predecessor_index-2)).className == "status_success") """),format.raw/*97.106*/("""{"""),format.raw/*97.107*/("""
						"""),format.raw/*98.7*/("""document.getElementById('status' + """),_display_(/*98.43*/index),format.raw/*98.48*/(""").className = "status_running";
						document.getElementById('status' + """),_display_(/*99.43*/index),format.raw/*99.48*/(""").innerHTML = "Running";
						document.getElementById('status_' + """),_display_(/*100.44*/index),format.raw/*100.49*/(""").className = "status_running";
						document.getElementById('status_' + """),_display_(/*101.44*/index),format.raw/*101.49*/(""").innerHTML = "Running";
						arr["""),_display_(/*102.12*/index),format.raw/*102.17*/("""] = 1;
					"""),format.raw/*103.6*/("""}"""),format.raw/*103.7*/(""" """),format.raw/*103.8*/("""else if (document.getElementById('status' + (predecessor_index-2)).className == "status_error") """),format.raw/*103.104*/("""{"""),format.raw/*103.105*/("""
						"""),format.raw/*104.7*/("""document.getElementById('status' + """),_display_(/*104.43*/index),format.raw/*104.48*/(""").className = "status_error";
		           		document.getElementById('status' + """),_display_(/*105.52*/index),format.raw/*105.57*/(""").innerHTML = "Failed: error in predecessor task";
		           		document.getElementById('status_' + """),_display_(/*106.53*/index),format.raw/*106.58*/(""").className = "status_error";
						document.getElementById('status_' + """),_display_(/*107.44*/index),format.raw/*107.49*/(""").innerHTML = "Failed: error in predecessor task";
		           		arr["""),_display_(/*108.21*/index),format.raw/*108.26*/("""] = -1;
					"""),format.raw/*109.6*/("""}"""),format.raw/*109.7*/("""
				"""),format.raw/*110.5*/("""}"""),format.raw/*110.6*/("""
			""")))}),format.raw/*111.5*/("""
		
	"""),format.raw/*113.2*/("""}"""),format.raw/*113.3*/("""
	
"""),format.raw/*115.1*/("""</script>
		"""))
      }
    }
  }

  def render(user:models.auth.User,tasks_length:Integer,tasks:Array[models.tasks.Task]): play.twirl.api.HtmlFormat.Appendable = apply(user,tasks_length,tasks)

  def f:((models.auth.User,Integer,Array[models.tasks.Task]) => play.twirl.api.HtmlFormat.Appendable) = (user,tasks_length,tasks) => apply(user,tasks_length,tasks)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun May 02 17:13:24 CDT 2021
                  SOURCE: /Users/petercui/workspace/idols/idols_user/app/views/workflow/taskManagement.scala.html
                  HASH: f0408f9dc0cc6f2c5a6b8f1b2a17aad2ff7c11b7
                  MATRIX: 820->36|995->116|1023->118|1173->242|1223->276|1263->278|1297->285|1370->331|1400->340|1432->344|1483->368|1509->373|1667->504|1713->534|1753->536|1793->549|1816->563|1856->565|1897->578|1947->601|1975->608|2016->631|2029->636|2068->637|2109->650|2150->664|2178->671|2231->693|2274->705|2313->716|2434->809|2461->814|2515->841|2536->853|2567->863|2596->864|2637->878|2658->890|2697->908|2726->909|2821->977|2847->982|2887->995|2917->1004|2967->1024|2998->1028|3149->1153|3202->1197|3242->1199|3271->1202|3285->1208|3395->1308|3436->1310|3466->1313|3609->1426|3640->1430|3830->1590|3860->1593|3961->1666|3990->1667|4020->1670|4081->1704|4109->1705|4208->1776|4237->1777|4267->1780|4332->1818|4360->1819|4457->1889|4490->1901|4552->1935|4581->1936|4611->1939|4664->1965|4692->1966|4723->1970|4769->1988|4798->1989|4828->1992|4899->2036|4927->2037|4958->2041|5006->2061|5035->2062|5065->2065|5146->2118|5175->2119|5207->2124|5279->2169|5307->2170|5336->2172|5364->2173|5395->2177|5440->2194|5469->2195|5499->2199|5549->2233|5589->2235|5621->2240|5661->2253|5687->2258|5716->2259|5781->2297|5807->2302|5861->2329|5887->2334|5923->2342|5952->2343|5985->2349|6077->2414|6103->2419|6181->2469|6210->2470|6244->2477|6307->2513|6333->2518|6434->2592|6460->2597|6555->2665|6581->2670|6683->2745|6709->2750|6772->2786|6798->2791|6837->2803|6865->2804|6893->2805|7020->2903|7050->2904|7084->2911|7147->2947|7173->2952|7274->3026|7300->3031|7396->3099|7423->3104|7526->3179|7553->3184|7617->3220|7644->3225|7684->3237|7713->3238|7742->3239|7868->3335|7899->3336|7934->3343|7998->3379|8025->3384|8134->3465|8161->3470|8292->3573|8319->3578|8420->3651|8447->3656|8546->3727|8573->3732|8614->3745|8643->3746|8676->3751|8705->3752|8741->3757|8774->3762|8803->3763|8834->3766
                  LINES: 21->2|26->2|28->4|37->13|37->13|37->13|38->14|40->16|40->16|40->16|40->16|40->16|43->19|43->19|43->19|44->20|44->20|44->20|45->21|45->21|45->21|46->22|46->22|46->22|47->23|47->23|47->23|48->24|49->25|50->26|50->26|50->26|52->28|52->28|52->28|52->28|53->29|53->29|53->29|53->29|55->31|55->31|55->31|55->31|57->33|59->35|66->42|66->42|66->42|67->43|67->43|67->43|67->43|68->44|69->45|71->47|74->50|77->53|78->54|78->54|79->55|80->56|80->56|82->58|82->58|83->59|84->60|84->60|89->65|89->65|91->67|91->67|92->68|94->70|94->70|96->72|96->72|96->72|97->73|100->76|100->76|102->78|102->78|102->78|103->79|104->80|104->80|105->81|107->83|107->83|108->84|108->84|110->86|110->86|110->86|111->87|111->87|111->87|112->88|112->88|112->88|112->88|112->88|112->88|113->89|113->89|113->89|113->89|114->90|114->90|114->90|115->91|115->91|116->92|116->92|116->92|117->93|117->93|118->94|118->94|119->95|119->95|120->96|120->96|121->97|121->97|121->97|121->97|121->97|122->98|122->98|122->98|123->99|123->99|124->100|124->100|125->101|125->101|126->102|126->102|127->103|127->103|127->103|127->103|127->103|128->104|128->104|128->104|129->105|129->105|130->106|130->106|131->107|131->107|132->108|132->108|133->109|133->109|134->110|134->110|135->111|137->113|137->113|139->115
                  -- GENERATED --
              */
          