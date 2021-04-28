
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

object clusterStatus extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.tasks.checkClusterTask,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(task: models.tasks.checkClusterTask, index: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.55*/("""


    
    """),_display_(/*5.6*/helper/*5.12*/.form(action = controllers.routes.WorkflowController.runTask(index), 'id -> "form".concat(index.toString))/*5.118*/  {_display_(Seq[Any](format.raw/*5.121*/("""
    	
    	
	    """),format.raw/*8.6*/("""<ul style="list-style:none">
	    	<li>
		    	<div class="indivsteps">
					Reservation name
				</div>
				<p>
		    		<input type="text" id="reservation"""),_display_(/*14.44*/index),format.raw/*14.49*/("""" name="reservation" value=""""),_display_(/*14.78*/task/*14.82*/.reservationName),format.raw/*14.98*/("""" required> 
		    	</p>
		    </li>
	    
		    <li>
	    	<li>
			    <div class="indivsteps">
					Get reservation details
				</div>
			    <p>
			    	<button type="submit" id="submit"""),_display_(/*24.42*/index),format.raw/*24.47*/("""">Submit</button>
			    </p>
		    </li>

		    
		 </ul>
		 
		<div class="status" id="status"""),_display_(/*31.34*/index),format.raw/*31.39*/(""""></div>
    
	    <script>
		    $('#form"""),_display_(/*34.16*/index),format.raw/*34.21*/("""')
		    .ajaxForm("""),format.raw/*35.17*/("""{"""),format.raw/*35.18*/("""
		        """),format.raw/*36.11*/("""url : '"""),_display_(/*36.19*/controllers/*36.30*/.routes.WorkflowController.runTask(index)),format.raw/*36.71*/("""', 
		        success : function (response) """),format.raw/*37.41*/("""{"""),format.raw/*37.42*/("""
		        	"""),format.raw/*38.12*/("""document.getElementById('status' + """),_display_(/*38.48*/index),format.raw/*38.53*/(""").className = "status_success";
		           	document.getElementById('status' + """),_display_(/*39.51*/index),format.raw/*39.56*/(""").innerHTML = response;
		        """),format.raw/*40.11*/("""}"""),format.raw/*40.12*/(""",
		        error : function (xhr, status, error) """),format.raw/*41.49*/("""{"""),format.raw/*41.50*/("""
		           """),format.raw/*42.14*/("""document.getElementById('status' + """),_display_(/*42.50*/index),format.raw/*42.55*/(""").className = "status_error";
		           document.getElementById('status' + """),_display_(/*43.50*/index),format.raw/*43.55*/(""").innerHTML = xhr.responseText;
		        """),format.raw/*44.11*/("""}"""),format.raw/*44.12*/(""",
		        
		    """),format.raw/*46.7*/("""}"""),format.raw/*46.8*/(""");
		</script>	
		 

	         
     """)))}),format.raw/*51.7*/("""  
     

   
  



 """))
      }
    }
  }

  def render(task:models.tasks.checkClusterTask,index:Integer): play.twirl.api.HtmlFormat.Appendable = apply(task,index)

  def f:((models.tasks.checkClusterTask,Integer) => play.twirl.api.HtmlFormat.Appendable) = (task,index) => apply(task,index)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 28 17:13:05 CDT 2021
                  SOURCE: /Users/petercui/workspace/idols/idols_user/app/views/workflow/clusterStatus.scala.html
                  HASH: f968cc513875ac4adb9f8e003ab54ab36a83056b
                  MATRIX: 777->1|925->54|963->67|977->73|1092->179|1133->182|1177->200|1360->356|1386->361|1442->390|1455->394|1492->410|1708->599|1734->604|1857->700|1883->705|1953->748|1979->753|2026->772|2055->773|2094->784|2129->792|2149->803|2211->844|2283->888|2312->889|2352->901|2415->937|2441->942|2550->1024|2576->1029|2638->1063|2667->1064|2745->1114|2774->1115|2816->1129|2879->1165|2905->1170|3011->1249|3037->1254|3107->1296|3136->1297|3182->1316|3210->1317|3278->1355
                  LINES: 21->1|26->1|30->5|30->5|30->5|30->5|33->8|39->14|39->14|39->14|39->14|39->14|49->24|49->24|56->31|56->31|59->34|59->34|60->35|60->35|61->36|61->36|61->36|61->36|62->37|62->37|63->38|63->38|63->38|64->39|64->39|65->40|65->40|66->41|66->41|67->42|67->42|67->42|68->43|68->43|69->44|69->44|71->46|71->46|76->51
                  -- GENERATED --
              */
          