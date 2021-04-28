
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

object streamTweets extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.tasks.streamTweetsTask,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(task: models.tasks.streamTweetsTask, index: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.55*/("""


    
    """),_display_(/*5.6*/helper/*5.12*/.form(action = routes.WorkflowController.runTask(index), 'id -> "form".concat(index.toString))/*5.106*/  {_display_(Seq[Any](format.raw/*5.109*/("""
    	
    	
	    """),format.raw/*8.6*/("""<ul style="list-style:none">
	    	<li>
		    	<div class="indivsteps">
					Script directory
				</div>
				<p>
		    		<input type="text" id="script_dir"""),_display_(/*14.43*/index),format.raw/*14.48*/("""" name="script_dir" size="120" value="/Users/rhuang/Documents/Dropbox_1/TACC/Twitter_final/" required> 
		    	</p>
		</li>
	    	<li>
		    	<div class="indivsteps">
					Keywords
				</div>
				<p>
		    		<input type="text" id="keywords"""),_display_(/*22.41*/index),format.raw/*22.46*/("""" name="keywords" size="40" value="&quot;@WhiteHouse&quot;,&quot;@realdonaldtrump&quot;" required> 
		    	</p>
		</li>
		
	    	<li>
		    	<div class="indivsteps">
					Stream Time
				</div>
				<p>
		    		<input type="number" id="stream_time"""),_display_(/*31.46*/index),format.raw/*31.51*/("""" name="stream_time" value=60 required> seconds
		    	</p>
		</li>
	    
		    <li>
	    	<li>
			    <div class="indivsteps">
					Start collecting tweets
				</div>
			    <p>
			    	<button type="submit" id="submit"""),_display_(/*41.42*/index),format.raw/*41.47*/("""">Submit</button>
			    </p>
		</li>

		    
		 </ul>
		 
		<div class="status" id="status"""),_display_(/*48.34*/index),format.raw/*48.39*/(""""></div>
    
	    <script>
		    $('#form"""),_display_(/*51.16*/index),format.raw/*51.21*/("""')
		    .ajaxForm("""),format.raw/*52.17*/("""{"""),format.raw/*52.18*/("""
		        """),format.raw/*53.11*/("""url : '"""),_display_(/*53.19*/routes/*53.25*/.WorkflowController.runTask(index)),format.raw/*53.59*/("""', 
		        success : function (response) """),format.raw/*54.41*/("""{"""),format.raw/*54.42*/("""
		        	"""),format.raw/*55.12*/("""document.getElementById('status' + """),_display_(/*55.48*/index),format.raw/*55.53*/(""").className = "status_success";
		           	document.getElementById('status' + """),_display_(/*56.51*/index),format.raw/*56.56*/(""").innerHTML = response;
		           	document.getElementById('image' + """),_display_(/*57.50*/index),format.raw/*57.55*/(""").style.display = "inline"
		        """),format.raw/*58.11*/("""}"""),format.raw/*58.12*/(""",
		        error : function (xhr, status, error) """),format.raw/*59.49*/("""{"""),format.raw/*59.50*/("""
		           """),format.raw/*60.14*/("""document.getElementById('status' + """),_display_(/*60.50*/index),format.raw/*60.55*/(""").className = "status_error";
		           document.getElementById('status' + """),_display_(/*61.50*/index),format.raw/*61.55*/(""").innerHTML = xhr.responseText;
		        """),format.raw/*62.11*/("""}"""),format.raw/*62.12*/(""",
		        
		    """),format.raw/*64.7*/("""}"""),format.raw/*64.8*/(""");
		</script>
		
		
		<img src=""""),_display_(/*68.14*/controllers/*68.25*/.routes.Assets.versioned("images/tweets_map.png")),format.raw/*68.74*/("""" id="image"""),_display_(/*68.86*/index),format.raw/*68.91*/("""" style="display:none"/>	


	         
     """)))}),format.raw/*72.7*/("""  
     

   
  



 """))
      }
    }
  }

  def render(task:models.tasks.streamTweetsTask,index:Integer): play.twirl.api.HtmlFormat.Appendable = apply(task,index)

  def f:((models.tasks.streamTweetsTask,Integer) => play.twirl.api.HtmlFormat.Appendable) = (task,index) => apply(task,index)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 28 17:13:04 CDT 2021
                  SOURCE: /Users/petercui/workspace/idols/idols_user/app/views/workflow/streamTweets.scala.html
                  HASH: 77b81cb55eb8657459b0d6202ca3c4b2863c0940
                  MATRIX: 776->1|924->54|962->67|976->73|1079->167|1120->170|1164->188|1346->343|1372->348|1639->588|1665->593|1939->842|1965->847|2212->1067|2238->1072|2357->1164|2383->1169|2453->1212|2479->1217|2526->1236|2555->1237|2594->1248|2629->1256|2644->1262|2699->1296|2771->1340|2800->1341|2840->1353|2903->1389|2929->1394|3038->1476|3064->1481|3164->1554|3190->1559|3255->1596|3284->1597|3362->1647|3391->1648|3433->1662|3496->1698|3522->1703|3628->1782|3654->1787|3724->1829|3753->1830|3799->1849|3827->1850|3888->1884|3908->1895|3978->1944|4017->1956|4043->1961|4118->2006
                  LINES: 21->1|26->1|30->5|30->5|30->5|30->5|33->8|39->14|39->14|47->22|47->22|56->31|56->31|66->41|66->41|73->48|73->48|76->51|76->51|77->52|77->52|78->53|78->53|78->53|78->53|79->54|79->54|80->55|80->55|80->55|81->56|81->56|82->57|82->57|83->58|83->58|84->59|84->59|85->60|85->60|85->60|86->61|86->61|87->62|87->62|89->64|89->64|93->68|93->68|93->68|93->68|93->68|97->72
                  -- GENERATED --
              */
          