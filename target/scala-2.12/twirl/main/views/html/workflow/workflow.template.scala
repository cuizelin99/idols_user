
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

			"""),_display_(/*23.5*/tasks(index)/*23.17*/.task_type/*23.27*/  match/*23.34*/ {/*24.8*/case "UploadTask"       =>/*24.34*/ {_display_(Seq[Any](format.raw/*24.36*/(""" """),_display_(/*24.38*/upload(tasks(index).asInstanceOf[models.tasks.UploadTask], index)),format.raw/*24.103*/(""" """)))}/*25.9*/case "checkClusterTask"      =>/*25.40*/ {_display_(Seq[Any](format.raw/*25.42*/(""" """),_display_(/*25.44*/clusterStatus(tasks(index).asInstanceOf[models.tasks.checkClusterTask], index)),format.raw/*25.122*/(""" """)))}/*26.9*/case "runWordCountTask"     =>/*26.39*/ {_display_(Seq[Any](format.raw/*26.41*/(""" """),_display_(/*26.43*/wordcount(tasks(index).asInstanceOf[models.tasks.runWordCountTask], index)),format.raw/*26.117*/(""" """)))}/*27.9*/case "checkHadoopJobStatusTask"   =>/*27.45*/ {_display_(Seq[Any](format.raw/*27.47*/(""" """),_display_(/*27.49*/jobStatus(tasks(index).asInstanceOf[models.tasks.checkHadoopJobStatusTask], index)),format.raw/*27.131*/(""" """)))}/*28.9*/case "showResultTask"       =>/*28.39*/ {_display_(Seq[Any](format.raw/*28.41*/(""" """),_display_(/*28.43*/showResult(tasks(index).asInstanceOf[models.tasks.showResultTask], index)),format.raw/*28.116*/(""" """)))}/*29.9*/case "startZeppelinTask"    =>/*29.39*/ {_display_(Seq[Any](format.raw/*29.41*/(""" """),_display_(/*29.43*/zeppelin(tasks(index).asInstanceOf[models.tasks.startZeppelinTask], index, user)),format.raw/*29.123*/(""" """)))}/*30.9*/case "runMPITask"    		=>/*30.34*/ {_display_(Seq[Any](format.raw/*30.36*/(""" """),_display_(/*30.38*/mpi(tasks(index).asInstanceOf[models.tasks.runMPITask], index)),format.raw/*30.100*/(""" """)))}/*31.9*/case "streamTweetsTask"    	=>/*31.39*/ {_display_(Seq[Any](format.raw/*31.41*/(""" """),_display_(/*31.43*/streamTweets(tasks(index).asInstanceOf[models.tasks.streamTweetsTask], index)),format.raw/*31.120*/(""" """)))}/*32.9*/case "runScriptTask"     	=>/*32.37*/ {_display_(Seq[Any](format.raw/*32.39*/(""" """),_display_(/*32.41*/runScript(tasks(index).asInstanceOf[models.tasks.runScriptTask], index)),format.raw/*32.112*/(""" """)))}/*33.8*/case "RunInputScriptTask"     	=>/*33.41*/ {_display_(Seq[Any](format.raw/*33.43*/(""" """),_display_(/*33.45*/runInputScript(tasks(index).asInstanceOf[models.tasks.RunInputScriptTask], index)),format.raw/*33.126*/(""" """)))}/*34.8*/case "showJSONTask"     	=>/*34.35*/ {_display_(Seq[Any](format.raw/*34.37*/(""" """),_display_(/*34.39*/showJSON(tasks(index).asInstanceOf[models.tasks.showJSONTask], index)),format.raw/*34.108*/(""" """)))}}),format.raw/*35.9*/("""	
		   """),format.raw/*36.6*/("""</div>
	    """)))}),format.raw/*37.7*/("""
	    
	"""),format.raw/*39.2*/("""<script src=""""),_display_(/*39.16*/controllers/*39.27*/.routes.Assets.versioned("javascripts/upload.js")),format.raw/*39.76*/(""""></script>    
	<script>

	
	function getDescription(index) """),format.raw/*43.33*/("""{"""),format.raw/*43.34*/("""
		"""),format.raw/*44.3*/("""var xmlHttp = new XMLHttpRequest();
		xmlHttp.onreadystatechange = function() """),format.raw/*45.43*/("""{"""),format.raw/*45.44*/("""
			"""),format.raw/*46.4*/("""if (xmlHttp.readyState == 4 && xmlHttp.status == 200) """),format.raw/*46.58*/("""{"""),format.raw/*46.59*/("""
				"""),format.raw/*47.5*/("""document.getElementById('description' + index).innerHTML = "Description: " + this.responseText;
			"""),format.raw/*48.4*/("""}"""),format.raw/*48.5*/("""
		"""),format.raw/*49.3*/("""}"""),format.raw/*49.4*/("""
		"""),format.raw/*50.3*/("""xmlHttp.open("GET", "/description?index=" + index, true);
		xmlHttp.send();
	"""),format.raw/*52.2*/("""}"""),format.raw/*52.3*/("""
	
	"""),_display_(/*54.3*/for(index <- 0 until tasks.length) yield /*54.37*/ {_display_(Seq[Any](format.raw/*54.39*/("""
		"""),format.raw/*55.3*/("""console.log("""),_display_(/*55.16*/index),format.raw/*55.21*/(""");
		if("""),_display_(/*56.7*/tasks(index)/*56.19*/.task_type.equals("showResultTask")),format.raw/*56.54*/(""")"""),format.raw/*56.55*/("""{"""),format.raw/*56.56*/("""
			"""),format.raw/*57.4*/("""document.getElementById('directory' + """),_display_(/*57.43*/index),format.raw/*57.48*/(""").onchange = function() """),format.raw/*57.72*/("""{"""),format.raw/*57.73*/("""
				"""),format.raw/*58.5*/("""console.log("changed" + """),_display_(/*58.30*/index),format.raw/*58.35*/(""");
				var passed_value = document.getElementById('directory' + """),_display_(/*59.63*/index),format.raw/*59.68*/(""").value;
				var file_name = "";
				file_name = passed_value.substring(passed_value.lastIndexOf("/") + 1, passed_value.lastIndexOf(".WAV"));
				/* if("""),_display_(/*62.12*/tasks(index)/*62.24*/.task_name.contains("Audio")),format.raw/*62.52*/(""")"""),format.raw/*62.53*/("""{"""),format.raw/*62.54*/("""
					"""),format.raw/*63.6*/("""file_name = passed_value.substring(passed_value.lastIndexOf("/"), passed_value.lastIndexOf(".WAV"));
				"""),format.raw/*64.5*/("""}"""),format.raw/*64.6*/("""
				"""),format.raw/*65.5*/("""else"""),format.raw/*65.9*/("""{"""),format.raw/*65.10*/("""
					"""),format.raw/*66.6*/("""file_name = passed_value.substring(passed_value.lastIndexOf("/"), passed_value.lastIndexOf(".WAV"));
				"""),format.raw/*67.5*/("""}"""),format.raw/*67.6*/(""" """),format.raw/*67.7*/("""*/
				console.log(file_name);
				var i;
				"""),_display_(/*70.6*/for(i <- 0 until tasks.length) yield /*70.36*/{_display_(Seq[Any](format.raw/*70.37*/("""
					"""),format.raw/*71.6*/("""if("""),_display_(/*71.10*/i),format.raw/*71.11*/(""" """),format.raw/*71.12*/("""!= """),_display_(/*71.16*/index),format.raw/*71.21*/(""")"""),format.raw/*71.22*/("""{"""),format.raw/*71.23*/("""
						"""),format.raw/*72.7*/("""if("""),_display_(/*72.11*/tasks(i)/*72.19*/.task_type.equals("showResultTask")),format.raw/*72.54*/(""" """),format.raw/*72.55*/("""&& !"""),_display_(/*72.60*/tasks(i)/*72.68*/.task_name.equals("Show Human Transcription")),format.raw/*72.113*/(""" """),format.raw/*72.114*/("""&& !"""),_display_(/*72.119*/tasks(i)/*72.127*/.task_name.equals("Show IDOLS Transcription")),format.raw/*72.172*/(""" """),format.raw/*72.173*/("""&& !"""),_display_(/*72.178*/tasks(i)/*72.186*/.task_name.equals("Show Google Transcription")),format.raw/*72.232*/(""" """),format.raw/*72.233*/(""")"""),format.raw/*72.234*/("""{"""),format.raw/*72.235*/("""
							"""),format.raw/*73.8*/("""var x = document.getElementById('root' + """),_display_(/*73.50*/i),format.raw/*73.51*/(""");
							console.log(file_name);
							console.log(x.value);
							//if(x.value.indexOf(".WAV") != -1)
							x.value = x.value.substring(0, x.value.lastIndexOf("/") + 1);
							x.value += file_name;
							if("""),_display_(/*79.12*/tasks(i)/*79.20*/.task_name.contains("Audio")),format.raw/*79.48*/(""")"""),format.raw/*79.49*/("""{"""),format.raw/*79.50*/("""
								"""),format.raw/*80.9*/("""x.value += ".WAV";
							"""),format.raw/*81.8*/("""}"""),format.raw/*81.9*/("""
							"""),format.raw/*82.8*/("""if("""),_display_(/*82.12*/tasks(i)/*82.20*/.task_name.contains("Transcription")),format.raw/*82.56*/(""")"""),format.raw/*82.57*/("""{"""),format.raw/*82.58*/("""
								"""),format.raw/*83.9*/("""x.value += ".WAV.txt";
							"""),format.raw/*84.8*/("""}"""),format.raw/*84.9*/("""
							"""),format.raw/*85.8*/("""if("""),_display_(/*85.12*/tasks(i)/*85.20*/.task_name.contains("Label")),format.raw/*85.48*/(""")"""),format.raw/*85.49*/("""{"""),format.raw/*85.50*/("""
								"""),format.raw/*86.9*/("""x.value += ".WAV.txt.json";
							"""),format.raw/*87.8*/("""}"""),format.raw/*87.9*/("""
						"""),format.raw/*88.7*/("""}"""),format.raw/*88.8*/("""
						"""),format.raw/*89.7*/("""if("""),_display_(/*89.11*/tasks(i)/*89.19*/.task_type.equals("RunInputScriptTask")),format.raw/*89.58*/(""")"""),format.raw/*89.59*/("""{"""),format.raw/*89.60*/("""
							"""),format.raw/*90.8*/("""var y = document.getElementById(0 + 'val' + """),_display_(/*90.53*/i),format.raw/*90.54*/(""");
							console.log(file_name);
							console.log(y.value);
							y.value = file_name.substring(0);
							y.value += ".WAV";
							if("""),_display_(/*95.12*/tasks(i)/*95.20*/.task_name.contains("Text Labeling")),format.raw/*95.56*/(""")"""),format.raw/*95.57*/("""{"""),format.raw/*95.58*/("""
								"""),format.raw/*96.9*/("""y.value += ".txt";
							"""),format.raw/*97.8*/("""}"""),format.raw/*97.9*/("""
						"""),format.raw/*98.7*/("""}"""),format.raw/*98.8*/("""
					"""),format.raw/*99.6*/("""}"""),format.raw/*99.7*/("""
				""")))}),format.raw/*100.6*/("""
				"""),format.raw/*101.5*/("""}"""),format.raw/*101.6*/(""";
		"""),format.raw/*102.3*/("""}"""),format.raw/*102.4*/(""" 
		"""),format.raw/*103.3*/("""getDescription("""),_display_(/*103.19*/index),format.raw/*103.24*/(""");
	""")))}),format.raw/*104.3*/("""
	
	"""),format.raw/*106.2*/("""//document.getElementById('directory' + 0).onchange = function() """),format.raw/*106.67*/("""{"""),format.raw/*106.68*/("""updateFields(0, """),_display_(/*106.85*/tasks),format.raw/*106.90*/(""")"""),format.raw/*106.91*/("""}"""),format.raw/*106.92*/(""";
	
	
	</script>
	
	 
""")))}),format.raw/*112.2*/("""
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
                  DATE: Sun May 16 19:53:49 CDT 2021
                  SOURCE: /Users/petercui/workspace/idols/idols_user/app/views/workflow/workflow.scala.html
                  HASH: 13cb2bbeee4933a942e43747efd22365c1add722
                  MATRIX: 441->1|812->26|978->97|1006->100|1042->128|1081->130|1117->140|1148->145|1172->149|1234->185|1295->226|1339->244|1389->278|1429->280|1471->295|1559->356|1591->367|1621->370|1642->382|1673->392|1705->397|1808->473|1834->478|1912->530|1933->542|1952->552|1968->559|1978->569|2013->595|2053->597|2082->599|2169->664|2189->675|2229->706|2269->708|2298->710|2398->788|2418->799|2457->829|2497->831|2526->833|2622->907|2642->918|2687->954|2727->956|2756->958|2860->1040|2880->1057|2919->1087|2959->1089|2988->1091|3083->1164|3103->1175|3142->1205|3182->1207|3211->1209|3313->1289|3333->1300|3367->1325|3407->1327|3436->1329|3520->1391|3540->1402|3579->1432|3619->1434|3648->1436|3747->1513|3767->1524|3804->1552|3844->1554|3873->1556|3966->1627|3986->1637|4028->1670|4068->1672|4097->1674|4200->1755|4220->1765|4256->1792|4296->1794|4325->1796|4416->1865|4449->1876|4483->1883|4526->1896|4561->1904|4602->1918|4622->1929|4692->1978|4781->2039|4810->2040|4840->2043|4946->2121|4975->2122|5006->2126|5088->2180|5117->2181|5149->2186|5275->2285|5303->2286|5333->2289|5361->2290|5391->2293|5495->2370|5523->2371|5554->2376|5604->2410|5644->2412|5674->2415|5714->2428|5740->2433|5775->2442|5796->2454|5852->2489|5881->2490|5910->2491|5941->2495|6007->2534|6033->2539|6085->2563|6114->2564|6146->2569|6198->2594|6224->2599|6316->2664|6342->2669|6522->2822|6543->2834|6592->2862|6621->2863|6650->2864|6683->2870|6815->2975|6843->2976|6875->2981|6906->2985|6935->2986|6968->2992|7100->3097|7128->3098|7156->3099|7229->3146|7275->3176|7314->3177|7347->3183|7378->3187|7400->3188|7429->3189|7460->3193|7486->3198|7515->3199|7544->3200|7578->3207|7609->3211|7626->3219|7682->3254|7711->3255|7743->3260|7760->3268|7827->3313|7857->3314|7890->3319|7908->3327|7975->3372|8005->3373|8038->3378|8056->3386|8124->3432|8154->3433|8184->3434|8214->3435|8249->3443|8318->3485|8340->3486|8582->3701|8599->3709|8648->3737|8677->3738|8706->3739|8742->3748|8795->3774|8823->3775|8858->3783|8889->3787|8906->3795|8963->3831|8992->3832|9021->3833|9057->3842|9114->3872|9142->3873|9177->3881|9208->3885|9225->3893|9274->3921|9303->3922|9332->3923|9368->3932|9430->3967|9458->3968|9492->3975|9520->3976|9554->3983|9585->3987|9602->3995|9662->4034|9691->4035|9720->4036|9755->4044|9827->4089|9849->4090|10017->4231|10034->4239|10091->4275|10120->4276|10149->4277|10185->4286|10238->4312|10266->4313|10300->4320|10328->4321|10361->4327|10389->4328|10426->4334|10459->4339|10488->4340|10520->4344|10549->4345|10581->4349|10625->4365|10652->4370|10688->4375|10720->4379|10814->4444|10844->4445|10889->4462|10916->4467|10946->4468|10976->4469|11030->4492
                  LINES: 17->1|22->3|27->3|29->5|29->5|29->5|31->7|31->7|31->7|32->8|32->8|34->10|34->10|34->10|36->12|38->14|38->14|38->14|38->14|38->14|39->15|43->19|43->19|47->23|47->23|47->23|47->23|47->24|47->24|47->24|47->24|47->24|47->25|47->25|47->25|47->25|47->25|47->26|47->26|47->26|47->26|47->26|47->27|47->27|47->27|47->27|47->27|47->28|47->28|47->28|47->28|47->28|47->29|47->29|47->29|47->29|47->29|47->30|47->30|47->30|47->30|47->30|47->31|47->31|47->31|47->31|47->31|47->32|47->32|47->32|47->32|47->32|47->33|47->33|47->33|47->33|47->33|47->34|47->34|47->34|47->34|47->34|47->35|48->36|49->37|51->39|51->39|51->39|51->39|55->43|55->43|56->44|57->45|57->45|58->46|58->46|58->46|59->47|60->48|60->48|61->49|61->49|62->50|64->52|64->52|66->54|66->54|66->54|67->55|67->55|67->55|68->56|68->56|68->56|68->56|68->56|69->57|69->57|69->57|69->57|69->57|70->58|70->58|70->58|71->59|71->59|74->62|74->62|74->62|74->62|74->62|75->63|76->64|76->64|77->65|77->65|77->65|78->66|79->67|79->67|79->67|82->70|82->70|82->70|83->71|83->71|83->71|83->71|83->71|83->71|83->71|83->71|84->72|84->72|84->72|84->72|84->72|84->72|84->72|84->72|84->72|84->72|84->72|84->72|84->72|84->72|84->72|84->72|84->72|84->72|84->72|85->73|85->73|85->73|91->79|91->79|91->79|91->79|91->79|92->80|93->81|93->81|94->82|94->82|94->82|94->82|94->82|94->82|95->83|96->84|96->84|97->85|97->85|97->85|97->85|97->85|97->85|98->86|99->87|99->87|100->88|100->88|101->89|101->89|101->89|101->89|101->89|101->89|102->90|102->90|102->90|107->95|107->95|107->95|107->95|107->95|108->96|109->97|109->97|110->98|110->98|111->99|111->99|112->100|113->101|113->101|114->102|114->102|115->103|115->103|115->103|116->104|118->106|118->106|118->106|118->106|118->106|118->106|118->106|124->112
                  -- GENERATED --
              */
          