
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
	    
	"""),format.raw/*47.2*/("""<button type="button" id="current_workflow">Download Current Workflow</button>
""")))}),format.raw/*48.2*/("""


"""),format.raw/*51.1*/("""<script>
	document.getElementById("current_workflow").onclick = function () """),format.raw/*52.68*/("""{"""),format.raw/*52.69*/("""
		"""),format.raw/*53.3*/("""location.href = "/downloadworkflow";
	"""),format.raw/*54.2*/("""}"""),format.raw/*54.3*/(""";
	
	
	var total_ran = 0;
	var total_error = 0;
	var arr = new Array("""),_display_(/*59.23*/tasks_length),format.raw/*59.35*/(""").fill(0);
	
	function runTasks() """),format.raw/*61.22*/("""{"""),format.raw/*61.23*/("""
		"""),format.raw/*62.3*/("""arr.fill(0);
		runAll();
	"""),format.raw/*64.2*/("""}"""),format.raw/*64.3*/("""
	
	"""),format.raw/*66.2*/("""function runAll() """),format.raw/*66.20*/("""{"""),format.raw/*66.21*/("""
		"""),format.raw/*67.3*/("""check();
		runnable();
		console.log(arr);
	"""),format.raw/*70.2*/("""}"""),format.raw/*70.3*/("""
	
	"""),format.raw/*72.2*/("""function runnable() """),format.raw/*72.22*/("""{"""),format.raw/*72.23*/("""
		"""),format.raw/*73.3*/("""for (i = 0; i < arr.length; i++)
			if (arr[i] == 1) """),format.raw/*74.21*/("""{"""),format.raw/*74.22*/("""
				"""),format.raw/*75.5*/("""$("#submit" + i).click();
				arr[i] = 2;
			"""),format.raw/*77.4*/("""}"""),format.raw/*77.5*/("""
	"""),format.raw/*78.2*/("""}"""),format.raw/*78.3*/("""
	
	"""),format.raw/*80.2*/("""function check() """),format.raw/*80.19*/("""{"""),format.raw/*80.20*/("""
		"""),_display_(/*81.4*/for(index <- 0 until tasks_length) yield /*81.38*/ {_display_(Seq[Any](format.raw/*81.40*/("""
				"""),format.raw/*82.5*/("""console.log("""),_display_(/*82.18*/index),format.raw/*82.23*/(""" """),format.raw/*82.24*/("""+ document.getElementById('status' + """),_display_(/*82.62*/index),format.raw/*82.67*/(""").className);
				if (arr["""),_display_(/*83.14*/index),format.raw/*83.19*/("""] == 0) """),format.raw/*83.27*/("""{"""),format.raw/*83.28*/("""
					"""),format.raw/*84.6*/("""var predecessor_index = document.getElementById('predecessor' + """),_display_(/*84.71*/index),format.raw/*84.76*/(""").selectedIndex;
					if (predecessor_index == 1) """),format.raw/*85.34*/("""{"""),format.raw/*85.35*/("""
						"""),format.raw/*86.7*/("""document.getElementById('status' + """),_display_(/*86.43*/index),format.raw/*86.48*/(""").className = "status_running";
						document.getElementById('status' + """),_display_(/*87.43*/index),format.raw/*87.48*/(""").innerHTML = "Running";
						document.getElementById('status_' + """),_display_(/*88.44*/index),format.raw/*88.49*/(""").className = "status_running";
						document.getElementById('status_' + """),_display_(/*89.44*/index),format.raw/*89.49*/(""").innerHTML = "Running";
						arr["""),_display_(/*90.12*/index),format.raw/*90.17*/("""] = 1;
					"""),format.raw/*91.6*/("""}"""),format.raw/*91.7*/(""" """),format.raw/*91.8*/("""else if (document.getElementById('status' + (predecessor_index-2)).className == "status_success") """),format.raw/*91.106*/("""{"""),format.raw/*91.107*/("""
						"""),format.raw/*92.7*/("""document.getElementById('status' + """),_display_(/*92.43*/index),format.raw/*92.48*/(""").className = "status_running";
						document.getElementById('status' + """),_display_(/*93.43*/index),format.raw/*93.48*/(""").innerHTML = "Running";
						document.getElementById('status_' + """),_display_(/*94.44*/index),format.raw/*94.49*/(""").className = "status_running";
						document.getElementById('status_' + """),_display_(/*95.44*/index),format.raw/*95.49*/(""").innerHTML = "Running";
						arr["""),_display_(/*96.12*/index),format.raw/*96.17*/("""] = 1;
					"""),format.raw/*97.6*/("""}"""),format.raw/*97.7*/(""" """),format.raw/*97.8*/("""else if (document.getElementById('status' + (predecessor_index-2)).className == "status_error") """),format.raw/*97.104*/("""{"""),format.raw/*97.105*/("""
						"""),format.raw/*98.7*/("""document.getElementById('status' + """),_display_(/*98.43*/index),format.raw/*98.48*/(""").className = "status_error";
		           		document.getElementById('status' + """),_display_(/*99.52*/index),format.raw/*99.57*/(""").innerHTML = "Failed: error in predecessor task";
		           		document.getElementById('status_' + """),_display_(/*100.53*/index),format.raw/*100.58*/(""").className = "status_error";
						document.getElementById('status_' + """),_display_(/*101.44*/index),format.raw/*101.49*/(""").innerHTML = "Failed: error in predecessor task";
		           		arr["""),_display_(/*102.21*/index),format.raw/*102.26*/("""] = -1;
					"""),format.raw/*103.6*/("""}"""),format.raw/*103.7*/("""
				"""),format.raw/*104.5*/("""}"""),format.raw/*104.6*/("""
			""")))}),format.raw/*105.5*/("""
		
	"""),format.raw/*107.2*/("""}"""),format.raw/*107.3*/("""
	
"""),format.raw/*109.1*/("""</script>
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
                  DATE: Wed Apr 28 17:13:04 CDT 2021
                  SOURCE: /Users/petercui/workspace/idols/idols_user/app/views/workflow/taskManagement.scala.html
                  HASH: 6664fdecc6ab30add641ac992ac3035bc25c3ea8
                  MATRIX: 820->36|995->116|1023->118|1173->242|1223->276|1263->278|1297->285|1370->331|1400->340|1432->344|1483->368|1509->373|1667->504|1713->534|1753->536|1793->549|1816->563|1856->565|1897->578|1947->601|1975->608|2016->631|2029->636|2068->637|2109->650|2150->664|2178->671|2231->693|2274->705|2313->716|2434->809|2461->814|2515->841|2536->853|2567->863|2596->864|2637->878|2658->890|2697->908|2726->909|2821->977|2847->982|2887->995|2917->1004|2967->1024|2998->1028|3149->1153|3202->1197|3242->1199|3271->1202|3285->1208|3395->1308|3436->1310|3466->1313|3609->1426|3644->1434|3754->1514|3784->1517|3888->1593|3917->1594|3947->1597|4012->1635|4040->1636|4137->1706|4170->1718|4232->1752|4261->1753|4291->1756|4344->1782|4372->1783|4403->1787|4449->1805|4478->1806|4508->1809|4579->1853|4607->1854|4638->1858|4686->1878|4715->1879|4745->1882|4826->1935|4855->1936|4887->1941|4959->1986|4987->1987|5016->1989|5044->1990|5075->1994|5120->2011|5149->2012|5179->2016|5229->2050|5269->2052|5301->2057|5341->2070|5367->2075|5396->2076|5461->2114|5487->2119|5541->2146|5567->2151|5603->2159|5632->2160|5665->2166|5757->2231|5783->2236|5861->2286|5890->2287|5924->2294|5987->2330|6013->2335|6114->2409|6140->2414|6235->2482|6261->2487|6363->2562|6389->2567|6452->2603|6478->2608|6517->2620|6545->2621|6573->2622|6700->2720|6730->2721|6764->2728|6827->2764|6853->2769|6954->2843|6980->2848|7075->2916|7101->2921|7203->2996|7229->3001|7292->3037|7318->3042|7357->3054|7385->3055|7413->3056|7538->3152|7568->3153|7602->3160|7665->3196|7691->3201|7799->3282|7825->3287|7956->3390|7983->3395|8084->3468|8111->3473|8210->3544|8237->3549|8278->3562|8307->3563|8340->3568|8369->3569|8405->3574|8438->3579|8467->3580|8498->3583
                  LINES: 21->2|26->2|28->4|37->13|37->13|37->13|38->14|40->16|40->16|40->16|40->16|40->16|43->19|43->19|43->19|44->20|44->20|44->20|45->21|45->21|45->21|46->22|46->22|46->22|47->23|47->23|47->23|48->24|49->25|50->26|50->26|50->26|52->28|52->28|52->28|52->28|53->29|53->29|53->29|53->29|55->31|55->31|55->31|55->31|57->33|59->35|66->42|66->42|66->42|67->43|67->43|67->43|67->43|68->44|69->45|71->47|72->48|75->51|76->52|76->52|77->53|78->54|78->54|83->59|83->59|85->61|85->61|86->62|88->64|88->64|90->66|90->66|90->66|91->67|94->70|94->70|96->72|96->72|96->72|97->73|98->74|98->74|99->75|101->77|101->77|102->78|102->78|104->80|104->80|104->80|105->81|105->81|105->81|106->82|106->82|106->82|106->82|106->82|106->82|107->83|107->83|107->83|107->83|108->84|108->84|108->84|109->85|109->85|110->86|110->86|110->86|111->87|111->87|112->88|112->88|113->89|113->89|114->90|114->90|115->91|115->91|115->91|115->91|115->91|116->92|116->92|116->92|117->93|117->93|118->94|118->94|119->95|119->95|120->96|120->96|121->97|121->97|121->97|121->97|121->97|122->98|122->98|122->98|123->99|123->99|124->100|124->100|125->101|125->101|126->102|126->102|127->103|127->103|128->104|128->104|129->105|131->107|131->107|133->109
                  -- GENERATED --
              */
          