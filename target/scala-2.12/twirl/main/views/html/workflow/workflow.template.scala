
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
/*1.2*/import models.tasks._

object workflow extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[models.auth.User,String,Array[models.tasks.Task],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(user: models.auth.User, head: String, tasks: Array[models.tasks.Task]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.73*/("""

"""),_display_(/*5.2*/idols_main(head, Some(user))/*5.30*/ {_display_(Seq[Any](format.raw/*5.32*/("""
    
    """),format.raw/*7.5*/("""<h2>"""),_display_(/*7.10*/head),format.raw/*7.14*/("""</h2>
    	    	<div class="steps">"""),_display_(/*8.31*/taskManagement(user, tasks.length, tasks)),format.raw/*8.72*/("""</div>
    
	    """),_display_(/*10.7*/for(index <- 0 until tasks.length) yield /*10.41*/ {_display_(Seq[Any](format.raw/*10.43*/("""
	    
	       """),format.raw/*12.9*/("""<div class="steps">
	       		<div class="step1">
					Task """),_display_(/*14.12*/(index + 1)),format.raw/*14.23*/(""": """),_display_(/*14.26*/tasks(index)/*14.38*/.task_name),format.raw/*14.48*/("""
				"""),format.raw/*15.5*/("""</div>

			<ul style="list-style: none">
				<li>
					<div id="description"""),_display_(/*19.27*/index),format.raw/*19.32*/("""" class="indivsteps"></div>
				</li>
			</ul>

			"""),_display_(/*23.5*/tasks(index)/*23.17*/.task_type/*23.27*/  match/*23.34*/ {/*24.8*/case "UploadTask"       =>/*24.34*/ {_display_(Seq[Any](format.raw/*24.36*/(""" """),_display_(/*24.38*/upload(tasks(index).asInstanceOf[models.tasks.UploadTask], index)),format.raw/*24.103*/(""" """)))}/*25.9*/case "checkClusterTask"      =>/*25.40*/ {_display_(Seq[Any](format.raw/*25.42*/(""" """),_display_(/*25.44*/clusterStatus(tasks(index).asInstanceOf[models.tasks.checkClusterTask], index)),format.raw/*25.122*/(""" """)))}/*26.9*/case "runWordCountTask"     =>/*26.39*/ {_display_(Seq[Any](format.raw/*26.41*/(""" """),_display_(/*26.43*/wordcount(tasks(index).asInstanceOf[models.tasks.runWordCountTask], index)),format.raw/*26.117*/(""" """)))}/*27.9*/case "checkHadoopJobStatusTask"   =>/*27.45*/ {_display_(Seq[Any](format.raw/*27.47*/(""" """),_display_(/*27.49*/jobStatus(tasks(index).asInstanceOf[models.tasks.checkHadoopJobStatusTask], index)),format.raw/*27.131*/(""" """)))}/*28.9*/case "showResultTask"       =>/*28.39*/ {_display_(Seq[Any](format.raw/*28.41*/(""" """),_display_(/*28.43*/showResult(tasks(index).asInstanceOf[models.tasks.showResultTask], index)),format.raw/*28.116*/(""" """)))}/*29.9*/case "startZeppelinTask"    =>/*29.39*/ {_display_(Seq[Any](format.raw/*29.41*/(""" """),_display_(/*29.43*/zeppelin(tasks(index).asInstanceOf[models.tasks.startZeppelinTask], index, user)),format.raw/*29.123*/(""" """)))}/*30.9*/case "runMPITask"    		=>/*30.34*/ {_display_(Seq[Any](format.raw/*30.36*/(""" """),_display_(/*30.38*/mpi(tasks(index).asInstanceOf[models.tasks.runMPITask], index)),format.raw/*30.100*/(""" """)))}/*31.9*/case "streamTweetsTask"    	=>/*31.39*/ {_display_(Seq[Any](format.raw/*31.41*/(""" """),_display_(/*31.43*/streamTweets(tasks(index).asInstanceOf[models.tasks.streamTweetsTask], index)),format.raw/*31.120*/(""" """)))}/*32.9*/case "runScriptTask"     	=>/*32.37*/ {_display_(Seq[Any](format.raw/*32.39*/(""" """),_display_(/*32.41*/runScript(tasks(index).asInstanceOf[models.tasks.runScriptTask], index)),format.raw/*32.112*/(""" """)))}/*33.8*/case "RunInputScriptTask"     	=>/*33.41*/ {_display_(Seq[Any](format.raw/*33.43*/(""" """),_display_(/*33.45*/runInputScript(tasks(index).asInstanceOf[models.tasks.RunInputScriptTask], index)),format.raw/*33.126*/(""" """)))}}),format.raw/*34.9*/("""	
		   """),format.raw/*35.6*/("""</div>
	    """)))}),format.raw/*36.7*/("""
	    
	"""),format.raw/*38.2*/("""<script src=""""),_display_(/*38.16*/controllers/*38.27*/.routes.Assets.versioned("javascripts/upload.js")),format.raw/*38.76*/(""""></script>    
	<script>

	
	function getDescription(index) """),format.raw/*42.33*/("""{"""),format.raw/*42.34*/("""
		"""),format.raw/*43.3*/("""var xmlHttp = new XMLHttpRequest();
		xmlHttp.onreadystatechange = function() """),format.raw/*44.43*/("""{"""),format.raw/*44.44*/("""
			"""),format.raw/*45.4*/("""if (xmlHttp.readyState == 4 && xmlHttp.status == 200) """),format.raw/*45.58*/("""{"""),format.raw/*45.59*/("""
				"""),format.raw/*46.5*/("""document.getElementById('description' + index).innerHTML = "Description: " + this.responseText;
			"""),format.raw/*47.4*/("""}"""),format.raw/*47.5*/("""
		"""),format.raw/*48.3*/("""}"""),format.raw/*48.4*/("""
		"""),format.raw/*49.3*/("""xmlHttp.open("GET", "/description?index=" + index, true);
		xmlHttp.send();
	"""),format.raw/*51.2*/("""}"""),format.raw/*51.3*/("""
	
	"""),_display_(/*53.3*/for(index <- 0 until tasks.length) yield /*53.37*/ {_display_(Seq[Any](format.raw/*53.39*/("""
		"""),format.raw/*54.3*/("""console.log("""),_display_(/*54.16*/index),format.raw/*54.21*/(""");
		if("""),_display_(/*55.7*/tasks(index)/*55.19*/.task_type.equals("showResultTask")),format.raw/*55.54*/(""")"""),format.raw/*55.55*/("""{"""),format.raw/*55.56*/("""
			"""),format.raw/*56.4*/("""document.getElementById('directory' + """),_display_(/*56.43*/index),format.raw/*56.48*/(""").onchange = function() """),format.raw/*56.72*/("""{"""),format.raw/*56.73*/("""
				"""),format.raw/*57.5*/("""console.log("changed" + """),_display_(/*57.30*/index),format.raw/*57.35*/(""");
				var passed_value = document.getElementById('directory' + """),_display_(/*58.63*/index),format.raw/*58.68*/(""").value;
				var file_name = "";
				file_name = passed_value.substring(passed_value.lastIndexOf("/") + 1, passed_value.lastIndexOf(".WAV"));
				/* if("""),_display_(/*61.12*/tasks(index)/*61.24*/.task_name.contains("Audio")),format.raw/*61.52*/(""")"""),format.raw/*61.53*/("""{"""),format.raw/*61.54*/("""
					"""),format.raw/*62.6*/("""file_name = passed_value.substring(passed_value.lastIndexOf("/"), passed_value.lastIndexOf(".WAV"));
				"""),format.raw/*63.5*/("""}"""),format.raw/*63.6*/("""
				"""),format.raw/*64.5*/("""else"""),format.raw/*64.9*/("""{"""),format.raw/*64.10*/("""
					"""),format.raw/*65.6*/("""file_name = passed_value.substring(passed_value.lastIndexOf("/"), passed_value.lastIndexOf(".WAV"));
				"""),format.raw/*66.5*/("""}"""),format.raw/*66.6*/(""" """),format.raw/*66.7*/("""*/
				console.log(file_name);
				var i;
				"""),_display_(/*69.6*/for(i <- 0 until tasks.length) yield /*69.36*/{_display_(Seq[Any](format.raw/*69.37*/("""
					"""),format.raw/*70.6*/("""if("""),_display_(/*70.10*/i),format.raw/*70.11*/(""" """),format.raw/*70.12*/("""!= """),_display_(/*70.16*/index),format.raw/*70.21*/(""")"""),format.raw/*70.22*/("""{"""),format.raw/*70.23*/("""
						"""),format.raw/*71.7*/("""if("""),_display_(/*71.11*/tasks(i)/*71.19*/.task_type.equals("showResultTask")),format.raw/*71.54*/(""" """),format.raw/*71.55*/("""&& !"""),_display_(/*71.60*/tasks(i)/*71.68*/.task_name.equals("Show Human Transcription")),format.raw/*71.113*/(""" """),format.raw/*71.114*/("""&& !"""),_display_(/*71.119*/tasks(i)/*71.127*/.task_name.equals("Show IDOLS Transcription")),format.raw/*71.172*/(""" """),format.raw/*71.173*/("""&& !"""),_display_(/*71.178*/tasks(i)/*71.186*/.task_name.equals("Show Google Transcription")),format.raw/*71.232*/(""" """),format.raw/*71.233*/(""")"""),format.raw/*71.234*/("""{"""),format.raw/*71.235*/("""
							"""),format.raw/*72.8*/("""var x = document.getElementById('root' + """),_display_(/*72.50*/i),format.raw/*72.51*/(""");
							console.log(file_name);
							console.log(x.value);
							//if(x.value.indexOf(".WAV") != -1)
							x.value = x.value.substring(0, x.value.lastIndexOf("/") + 1);
							x.value += file_name;
							if("""),_display_(/*78.12*/tasks(i)/*78.20*/.task_name.contains("Audio")),format.raw/*78.48*/(""")"""),format.raw/*78.49*/("""{"""),format.raw/*78.50*/("""
								"""),format.raw/*79.9*/("""x.value += ".WAV";
							"""),format.raw/*80.8*/("""}"""),format.raw/*80.9*/("""
							"""),format.raw/*81.8*/("""if("""),_display_(/*81.12*/tasks(i)/*81.20*/.task_name.contains("Transcription")),format.raw/*81.56*/(""")"""),format.raw/*81.57*/("""{"""),format.raw/*81.58*/("""
								"""),format.raw/*82.9*/("""x.value += ".WAV.txt";
							"""),format.raw/*83.8*/("""}"""),format.raw/*83.9*/("""
							"""),format.raw/*84.8*/("""if("""),_display_(/*84.12*/tasks(i)/*84.20*/.task_name.contains("Label")),format.raw/*84.48*/(""")"""),format.raw/*84.49*/("""{"""),format.raw/*84.50*/("""
								"""),format.raw/*85.9*/("""x.value += ".WAV.txt.json";
							"""),format.raw/*86.8*/("""}"""),format.raw/*86.9*/("""
						"""),format.raw/*87.7*/("""}"""),format.raw/*87.8*/("""
						"""),format.raw/*88.7*/("""if("""),_display_(/*88.11*/tasks(i)/*88.19*/.task_type.equals("RunInputScriptTask")),format.raw/*88.58*/(""")"""),format.raw/*88.59*/("""{"""),format.raw/*88.60*/("""
							"""),format.raw/*89.8*/("""var y = document.getElementById(0 + 'val' + """),_display_(/*89.53*/i),format.raw/*89.54*/(""");
							console.log(file_name);
							console.log(y.value);
							y.value = file_name.substring(0);
							y.value += ".WAV";
							if("""),_display_(/*94.12*/tasks(i)/*94.20*/.task_name.contains("Text Labeling")),format.raw/*94.56*/(""")"""),format.raw/*94.57*/("""{"""),format.raw/*94.58*/("""
								"""),format.raw/*95.9*/("""y.value += ".txt";
							"""),format.raw/*96.8*/("""}"""),format.raw/*96.9*/("""
						"""),format.raw/*97.7*/("""}"""),format.raw/*97.8*/("""
					"""),format.raw/*98.6*/("""}"""),format.raw/*98.7*/("""
				""")))}),format.raw/*99.6*/("""
				"""),format.raw/*100.5*/("""}"""),format.raw/*100.6*/(""";
		"""),format.raw/*101.3*/("""}"""),format.raw/*101.4*/(""" 
		"""),format.raw/*102.3*/("""getDescription("""),_display_(/*102.19*/index),format.raw/*102.24*/(""");
	""")))}),format.raw/*103.3*/("""
	
	"""),format.raw/*105.2*/("""//document.getElementById('directory' + 0).onchange = function() """),format.raw/*105.67*/("""{"""),format.raw/*105.68*/("""updateFields(0, """),_display_(/*105.85*/tasks),format.raw/*105.90*/(""")"""),format.raw/*105.91*/("""}"""),format.raw/*105.92*/(""";
	
	
	</script>
	
	 
""")))}),format.raw/*111.2*/("""
"""))
      }
    }
  }

  def render(user:models.auth.User,head:String,tasks:Array[models.tasks.Task]): play.twirl.api.HtmlFormat.Appendable = apply(user,head,tasks)

  def f:((models.auth.User,String,Array[models.tasks.Task]) => play.twirl.api.HtmlFormat.Appendable) = (user,head,tasks) => apply(user,head,tasks)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 28 17:13:04 CDT 2021
                  SOURCE: /Users/petercui/workspace/idols/idols_user/app/views/workflow/workflow.scala.html
                  HASH: 784396b5af8df80cb5186de1accf250844c4e638
                  MATRIX: 441->1|812->26|978->97|1006->100|1042->128|1081->130|1117->140|1148->145|1172->149|1234->185|1295->226|1339->244|1389->278|1429->280|1471->295|1559->356|1591->367|1621->370|1642->382|1673->392|1705->397|1808->473|1834->478|1912->530|1933->542|1952->552|1968->559|1978->569|2013->595|2053->597|2082->599|2169->664|2189->675|2229->706|2269->708|2298->710|2398->788|2418->799|2457->829|2497->831|2526->833|2622->907|2642->918|2687->954|2727->956|2756->958|2860->1040|2880->1057|2919->1087|2959->1089|2988->1091|3083->1164|3103->1175|3142->1205|3182->1207|3211->1209|3313->1289|3333->1300|3367->1325|3407->1327|3436->1329|3520->1391|3540->1402|3579->1432|3619->1434|3648->1436|3747->1513|3767->1524|3804->1552|3844->1554|3873->1556|3966->1627|3986->1637|4028->1670|4068->1672|4097->1674|4200->1755|4233->1766|4267->1773|4310->1786|4345->1794|4386->1808|4406->1819|4476->1868|4565->1929|4594->1930|4624->1933|4730->2011|4759->2012|4790->2016|4872->2070|4901->2071|4933->2076|5059->2175|5087->2176|5117->2179|5145->2180|5175->2183|5279->2260|5307->2261|5338->2266|5388->2300|5428->2302|5458->2305|5498->2318|5524->2323|5559->2332|5580->2344|5636->2379|5665->2380|5694->2381|5725->2385|5791->2424|5817->2429|5869->2453|5898->2454|5930->2459|5982->2484|6008->2489|6100->2554|6126->2559|6306->2712|6327->2724|6376->2752|6405->2753|6434->2754|6467->2760|6599->2865|6627->2866|6659->2871|6690->2875|6719->2876|6752->2882|6884->2987|6912->2988|6940->2989|7013->3036|7059->3066|7098->3067|7131->3073|7162->3077|7184->3078|7213->3079|7244->3083|7270->3088|7299->3089|7328->3090|7362->3097|7393->3101|7410->3109|7466->3144|7495->3145|7527->3150|7544->3158|7611->3203|7641->3204|7674->3209|7692->3217|7759->3262|7789->3263|7822->3268|7840->3276|7908->3322|7938->3323|7968->3324|7998->3325|8033->3333|8102->3375|8124->3376|8366->3591|8383->3599|8432->3627|8461->3628|8490->3629|8526->3638|8579->3664|8607->3665|8642->3673|8673->3677|8690->3685|8747->3721|8776->3722|8805->3723|8841->3732|8898->3762|8926->3763|8961->3771|8992->3775|9009->3783|9058->3811|9087->3812|9116->3813|9152->3822|9214->3857|9242->3858|9276->3865|9304->3866|9338->3873|9369->3877|9386->3885|9446->3924|9475->3925|9504->3926|9539->3934|9611->3979|9633->3980|9801->4121|9818->4129|9875->4165|9904->4166|9933->4167|9969->4176|10022->4202|10050->4203|10084->4210|10112->4211|10145->4217|10173->4218|10209->4224|10242->4229|10271->4230|10303->4234|10332->4235|10364->4239|10408->4255|10435->4260|10471->4265|10503->4269|10597->4334|10627->4335|10672->4352|10699->4357|10729->4358|10759->4359|10813->4382
                  LINES: 17->1|22->3|27->3|29->5|29->5|29->5|31->7|31->7|31->7|32->8|32->8|34->10|34->10|34->10|36->12|38->14|38->14|38->14|38->14|38->14|39->15|43->19|43->19|47->23|47->23|47->23|47->23|47->24|47->24|47->24|47->24|47->24|47->25|47->25|47->25|47->25|47->25|47->26|47->26|47->26|47->26|47->26|47->27|47->27|47->27|47->27|47->27|47->28|47->28|47->28|47->28|47->28|47->29|47->29|47->29|47->29|47->29|47->30|47->30|47->30|47->30|47->30|47->31|47->31|47->31|47->31|47->31|47->32|47->32|47->32|47->32|47->32|47->33|47->33|47->33|47->33|47->33|47->34|48->35|49->36|51->38|51->38|51->38|51->38|55->42|55->42|56->43|57->44|57->44|58->45|58->45|58->45|59->46|60->47|60->47|61->48|61->48|62->49|64->51|64->51|66->53|66->53|66->53|67->54|67->54|67->54|68->55|68->55|68->55|68->55|68->55|69->56|69->56|69->56|69->56|69->56|70->57|70->57|70->57|71->58|71->58|74->61|74->61|74->61|74->61|74->61|75->62|76->63|76->63|77->64|77->64|77->64|78->65|79->66|79->66|79->66|82->69|82->69|82->69|83->70|83->70|83->70|83->70|83->70|83->70|83->70|83->70|84->71|84->71|84->71|84->71|84->71|84->71|84->71|84->71|84->71|84->71|84->71|84->71|84->71|84->71|84->71|84->71|84->71|84->71|84->71|85->72|85->72|85->72|91->78|91->78|91->78|91->78|91->78|92->79|93->80|93->80|94->81|94->81|94->81|94->81|94->81|94->81|95->82|96->83|96->83|97->84|97->84|97->84|97->84|97->84|97->84|98->85|99->86|99->86|100->87|100->87|101->88|101->88|101->88|101->88|101->88|101->88|102->89|102->89|102->89|107->94|107->94|107->94|107->94|107->94|108->95|109->96|109->96|110->97|110->97|111->98|111->98|112->99|113->100|113->100|114->101|114->101|115->102|115->102|115->102|116->103|118->105|118->105|118->105|118->105|118->105|118->105|118->105|124->111
                  -- GENERATED --
              */
          