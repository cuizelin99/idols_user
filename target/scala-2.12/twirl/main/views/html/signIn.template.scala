
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
/*1.2*/import play.api.data.Form
/*2.2*/import play.api.i18n.Messages
/*3.2*/import play.api.mvc.RequestHeader
/*4.2*/import org.webjars.play.WebJarsUtil
/*5.2*/import controllers.AssetsFinder
/*6.2*/import com.mohiva.play.silhouette.impl.providers.SocialProviderRegistry
/*7.2*/import forms.SignInForm.Data
/*8.2*/import b3.inline.fieldConstructor

object signIn extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[Form[Data],SocialProviderRegistry,RequestHeader,Messages,WebJarsUtil,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*10.2*/(signInForm: Form[Data], socialProviders: SocialProviderRegistry)(implicit request: RequestHeader, messages: Messages, webJarsUtil: WebJarsUtil, assets: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*10.168*/("""

"""),_display_(/*12.2*/main(messages("sign.in.title"))/*12.33*/ {_display_(Seq[Any](format.raw/*12.35*/("""
 	"""),format.raw/*13.3*/("""<p>
    </p>
    <fieldset class="col-md-6 col-md-offset-3">
        """),_display_(/*16.10*/helper/*16.16*/.form(action = controllers.routes.SignInController.submit())/*16.76*/ {_display_(Seq[Any](format.raw/*16.78*/("""
            """),_display_(/*17.14*/helper/*17.20*/.CSRF.formField),format.raw/*17.35*/("""
            """),_display_(/*18.14*/b3/*18.16*/.text(signInForm("username"), '_hiddenLabel -> messages("username"), 'placeholder -> messages("Username/Email"), 'class -> "form-control input-lg")),format.raw/*18.163*/("""

            """),_display_(/*20.14*/b3/*20.16*/.password(signInForm("password"), '_hiddenLabel -> messages("password"), 'placeholder -> messages("password"), 'class -> "form-control input-lg")),format.raw/*20.161*/("""
            """),format.raw/*21.13*/("""<!--"""),_display_(/*21.18*/b3/*21.20*/.checkbox(signInForm("rememberMe"), '_text -> messages("remember.me"), 'checked -> false)),format.raw/*21.109*/("""-->

			<div class="form-group">
                <div>
                    <button id="submit1" type="submit" name="action" value="regular" class="btn btn-lg btn-primary btn-block">Sign In with IDOLS</button>
                </div>
                <p>
                </p>
                <div>
                    <button id="submit2" type="submit" name="action" value="tacc" class="btn btn-lg btn-primary btn-block">Sign In with TACC</button>
                </div>
                <p>
                </p>
               <!--  <div class="fb-login-button" data-max-rows="1" data-size="large" data-button-type="continue_with" data-show-faces="false" data-auto-logout-link="false" data-use-continue-as="false" onlogin="checkLoginState()"></div>
				<div id="status"></div> -->
				
				<div class="g-signin2" data-onsuccess="onSignIn"></div>

            </div>
        """)))}),format.raw/*40.10*/("""


"""),format.raw/*43.1*/("""</fieldset>

    <script>
      function onSignIn(googleUser) """),format.raw/*46.37*/("""{"""),format.raw/*46.38*/("""
        """),format.raw/*47.9*/("""// Useful data for your client-side scripts:
        var profile = googleUser.getBasicProfile();
        console.log("ID: " + profile.getId()); // Don't send this directly to your server!
        console.log('Full Name: ' + profile.getName());
        console.log('Given Name: ' + profile.getGivenName());
        console.log('Family Name: ' + profile.getFamilyName());
        console.log("Image URL: " + profile.getImageUrl());
        console.log("Email: " + profile.getEmail());

        // The ID token you need to pass to your backend:
        var id_token = googleUser.getAuthResponse().id_token;
        console.log("ID Token: " + id_token);
        httpGet(id_token);
      """),format.raw/*60.7*/("""}"""),format.raw/*60.8*/(""";
      
      function httpGet(id_token) """),format.raw/*62.34*/("""{"""),format.raw/*62.35*/("""
			"""),format.raw/*63.4*/("""var xmlHttp = new XMLHttpRequest();
			xmlHttp.open("POST", "/googleSignIn?idTokenString=" + id_token, false);
			xmlHttp.onreadystatechange = function() """),format.raw/*65.44*/("""{"""),format.raw/*65.45*/("""
				"""),format.raw/*66.5*/("""if (xmlHttp.readyState == 4 && xmlHttp.status == 200) """),format.raw/*66.59*/("""{"""),format.raw/*66.60*/("""
					"""),format.raw/*67.6*/("""var auth2 = gapi.auth2.getAuthInstance();
				    auth2.signOut().then(function () """),format.raw/*68.42*/("""{"""),format.raw/*68.43*/("""
				      """),format.raw/*69.11*/("""console.log('User signed out.');
				    """),format.raw/*70.9*/("""}"""),format.raw/*70.10*/(""");
					 window.location.pathname = '/use_cases';      
		        """),format.raw/*72.11*/("""}"""),format.raw/*72.12*/("""
		 	"""),format.raw/*73.5*/("""}"""),format.raw/*73.6*/("""; 
			xmlHttp.send();
		"""),format.raw/*75.3*/("""}"""),format.raw/*75.4*/("""
    """),format.raw/*76.5*/("""</script>
    
    

	<!-- Facebook Login -->

	<!--
 	 Below we include the Login Button social plugin. This button uses
  	 the JavaScript SDK to present a graphical Login button that triggers
 	 the FB.login() function when clicked.
	-->

<!-- <fb:login-button scope="email, public_profile" onlogin="checkLoginState()"></fb:login-button>  -->

	<!-- <script>
	
		 // This is called with the results from from FB.getLoginStatus().
		function statusChangeCallback(response) """),format.raw/*93.43*/("""{"""),format.raw/*93.44*/("""
			"""),format.raw/*94.4*/("""console.log('statusChangeCallback');
			console.log(response);
			// The response object is returned with a status field that lets the
			// app know the current login status of the person.
			// Full docs on the response object can be found in the documentation
			// for FB.getLoginStatus().
			if (response.status === 'connected') """),format.raw/*100.41*/("""{"""),format.raw/*100.42*/("""
				"""),format.raw/*101.5*/("""// Logged into your app and Facebook.
				testAPI(response.authResponse.accessToken);
			"""),format.raw/*103.4*/("""}"""),format.raw/*103.5*/(""" """),format.raw/*103.6*/("""else """),format.raw/*103.11*/("""{"""),format.raw/*103.12*/("""
				"""),format.raw/*104.5*/("""// The person is not logged into your app or we are unable to tell.
				document.getElementById('status').innerHTML = 'Please log '
						+ 'into this app.';
			"""),format.raw/*107.4*/("""}"""),format.raw/*107.5*/("""
		"""),format.raw/*108.3*/("""}"""),format.raw/*108.4*/("""

		"""),format.raw/*110.3*/("""// This function is called when someone finishes with the Login
		// Button.  See the onlogin handler attached to it in the sample
		// code below.
		function checkLoginState() """),format.raw/*113.30*/("""{"""),format.raw/*113.31*/("""
			"""),format.raw/*114.4*/("""FB.getLoginStatus(function(response) """),format.raw/*114.41*/("""{"""),format.raw/*114.42*/("""
				"""),format.raw/*115.5*/("""statusChangeCallback(response);
			"""),format.raw/*116.4*/("""}"""),format.raw/*116.5*/(""");
		"""),format.raw/*117.3*/("""}"""),format.raw/*117.4*/(""" 

		"""),format.raw/*119.3*/("""window.fbAsyncInit = function() """),format.raw/*119.35*/("""{"""),format.raw/*119.36*/("""
			"""),format.raw/*120.4*/("""FB.init("""),format.raw/*120.12*/("""{"""),format.raw/*120.13*/("""
				"""),format.raw/*121.5*/("""appId : '1791463614233616',
				cookie : true, // enable cookies to allow the server to access 
				// the session
				xfbml : true, // parse social plugins on this page
				version : 'v2.8' // use graph api version 2.8
			"""),format.raw/*126.4*/("""}"""),format.raw/*126.5*/(""");
		"""),format.raw/*127.3*/("""}"""),format.raw/*127.4*/(""";

		// Load the SDK asynchronously
		(function(d, s, id) """),format.raw/*130.23*/("""{"""),format.raw/*130.24*/("""
			"""),format.raw/*131.4*/("""var js, fjs = d.getElementsByTagName(s)[0];
			if (d.getElementById(id))
				return;
			js = d.createElement(s);
			js.id = id;
			js.src = "https://connect.facebook.net/en_US/sdk.js";
			fjs.parentNode.insertBefore(js, fjs);
		"""),format.raw/*138.3*/("""}"""),format.raw/*138.4*/("""(document, 'script', 'facebook-jssdk')); 

		function httpGet(response, accessToken) """),format.raw/*140.43*/("""{"""),format.raw/*140.44*/("""
			"""),format.raw/*141.4*/("""var xmlHttp = new XMLHttpRequest();
			xmlHttp.open("POST", "/facebookSignIn?response=" + JSON.stringify(response)
					+ "&accessToken=" + accessToken, false);
			xmlHttp.onreadystatechange = function() """),format.raw/*144.44*/("""{"""),format.raw/*144.45*/("""
				"""),format.raw/*145.5*/("""if (xmlHttp.readyState == 4 && xmlHttp.status == 200) """),format.raw/*145.59*/("""{"""),format.raw/*145.60*/("""
					 """),format.raw/*146.7*/("""window.location.pathname = '/home';      
		        """),format.raw/*147.11*/("""}"""),format.raw/*147.12*/("""
		 	"""),format.raw/*148.5*/("""}"""),format.raw/*148.6*/("""; 
			xmlHttp.send();

		"""),format.raw/*151.3*/("""}"""),format.raw/*151.4*/("""

		"""),format.raw/*153.3*/("""// Here we run a very simple test of the Graph API after login is
		// successful.  See statusChangeCallback() for when this call is made.
		function testAPI(accessToken) """),format.raw/*155.33*/("""{"""),format.raw/*155.34*/("""
			"""),format.raw/*156.4*/("""console.log('Welcome!  Fetching your information.... ');
			FB.api('/me?fields=name,id,email', function(response) """),format.raw/*157.58*/("""{"""),format.raw/*157.59*/("""
				"""),format.raw/*158.5*/("""httpGet(response, accessToken); 

			"""),format.raw/*160.4*/("""}"""),format.raw/*160.5*/(""");
		"""),format.raw/*161.3*/("""}"""),format.raw/*161.4*/("""

		"""),format.raw/*163.3*/("""function rand() """),format.raw/*163.19*/("""{"""),format.raw/*163.20*/("""
			"""),format.raw/*164.4*/("""var text = "";
			var possible = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

			for (var i = 0; i < 10; i++)
				text += possible.charAt(Math.floor(Math.random()
						* possible.length));

			return text;
		"""),format.raw/*172.3*/("""}"""),format.raw/*172.4*/("""
	"""),format.raw/*173.2*/("""</script> -->


	<!-- Google Login -->
	<!-- <div class="g-signin2" data-onsuccess="onSignIn"></div>
	<script>
		function onSignIn(googleUser) """),format.raw/*179.33*/("""{"""),format.raw/*179.34*/("""
			"""),format.raw/*180.4*/("""var profile = googleUser.getBasicProfile();
			console.log('ID: ' + profile.getId()); // Do not send to your backend! Use an ID token instead.
			console.log('Name: ' + profile.getName());
			console.log('Image URL: ' + profile.getImageUrl());
			console.log('Email: ' + profile.getEmail()); // This is null if the 'email' scope is not present.
		"""),format.raw/*185.3*/("""}"""),format.raw/*185.4*/("""
	"""),format.raw/*186.2*/("""</script> -->

""")))}),format.raw/*188.2*/("""
"""))
      }
    }
  }

  def render(signInForm:Form[Data],socialProviders:SocialProviderRegistry,request:RequestHeader,messages:Messages,webJarsUtil:WebJarsUtil,assets:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(signInForm,socialProviders)(request,messages,webJarsUtil,assets)

  def f:((Form[Data],SocialProviderRegistry) => (RequestHeader,Messages,WebJarsUtil,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (signInForm,socialProviders) => (request,messages,webJarsUtil,assets) => apply(signInForm,socialProviders)(request,messages,webJarsUtil,assets)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 28 17:13:04 CDT 2021
                  SOURCE: /Users/petercui/workspace/idols/idols_user/app/views/signIn.scala.html
                  HASH: f6aa7579588a59c5bda84861fb4bd6a871e50ceb
                  MATRIX: 432->1|465->28|502->59|543->94|586->131|625->164|704->237|740->267|1155->303|1418->469|1447->472|1487->503|1527->505|1557->508|1654->578|1669->584|1738->644|1778->646|1819->660|1834->666|1870->681|1911->695|1922->697|2091->844|2133->859|2144->861|2311->1006|2352->1019|2384->1024|2395->1026|2506->1115|3409->1987|3439->1990|3529->2052|3558->2053|3594->2062|4304->2745|4332->2746|4402->2788|4431->2789|4462->2793|4644->2947|4673->2948|4705->2953|4787->3007|4816->3008|4849->3014|4960->3097|4989->3098|5028->3109|5096->3150|5125->3151|5219->3217|5248->3218|5280->3223|5308->3224|5359->3248|5387->3249|5419->3254|5922->3729|5951->3730|5982->3734|6345->4068|6375->4069|6408->4074|6525->4163|6554->4164|6583->4165|6617->4170|6647->4171|6680->4176|6869->4337|6898->4338|6929->4341|6958->4342|6990->4346|7196->4523|7226->4524|7258->4528|7324->4565|7354->4566|7387->4571|7450->4606|7479->4607|7512->4612|7541->4613|7574->4618|7635->4650|7665->4651|7697->4655|7734->4663|7764->4664|7797->4669|8048->4892|8077->4893|8110->4898|8139->4899|8226->4957|8256->4958|8288->4962|8544->5190|8573->5191|8687->5276|8717->5277|8749->5281|8982->5485|9012->5486|9045->5491|9128->5545|9158->5546|9193->5553|9274->5605|9304->5606|9337->5611|9366->5612|9419->5637|9448->5638|9480->5642|9680->5813|9710->5814|9742->5818|9885->5932|9915->5933|9948->5938|10013->5975|10042->5976|10075->5981|10104->5982|10136->5986|10181->6002|10211->6003|10243->6007|10502->6238|10531->6239|10561->6241|10733->6384|10763->6385|10795->6389|11170->6736|11199->6737|11229->6739|11276->6755
                  LINES: 17->1|18->2|19->3|20->4|21->5|22->6|23->7|24->8|29->10|34->10|36->12|36->12|36->12|37->13|40->16|40->16|40->16|40->16|41->17|41->17|41->17|42->18|42->18|42->18|44->20|44->20|44->20|45->21|45->21|45->21|45->21|64->40|67->43|70->46|70->46|71->47|84->60|84->60|86->62|86->62|87->63|89->65|89->65|90->66|90->66|90->66|91->67|92->68|92->68|93->69|94->70|94->70|96->72|96->72|97->73|97->73|99->75|99->75|100->76|117->93|117->93|118->94|124->100|124->100|125->101|127->103|127->103|127->103|127->103|127->103|128->104|131->107|131->107|132->108|132->108|134->110|137->113|137->113|138->114|138->114|138->114|139->115|140->116|140->116|141->117|141->117|143->119|143->119|143->119|144->120|144->120|144->120|145->121|150->126|150->126|151->127|151->127|154->130|154->130|155->131|162->138|162->138|164->140|164->140|165->141|168->144|168->144|169->145|169->145|169->145|170->146|171->147|171->147|172->148|172->148|175->151|175->151|177->153|179->155|179->155|180->156|181->157|181->157|182->158|184->160|184->160|185->161|185->161|187->163|187->163|187->163|188->164|196->172|196->172|197->173|203->179|203->179|204->180|209->185|209->185|210->186|212->188
                  -- GENERATED --
              */
          