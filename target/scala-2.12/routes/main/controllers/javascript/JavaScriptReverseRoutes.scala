
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/petercui/workspace/idols/idols_user/conf/routes
// @DATE:Wed Apr 28 17:13:03 CDT 2021

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.utils.route.Binders._

// @LINE:7
package controllers.javascript {

  // @LINE:16
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:83
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "images/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
          }
        
        }
      """
    )
  
    // @LINE:16
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:68
  class ReverseSignInController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:68
    def view: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignInController.view",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signIn"})
        }
      """
    )
  
    // @LINE:72
    def googleSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignInController.googleSubmit",
      """
        function(idTokenString0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "googleSignIn" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("idTokenString", idTokenString0)])})
        }
      """
    )
  
    // @LINE:70
    def submit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignInController.submit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signIn"})
        }
      """
    )
  
  }

  // @LINE:19
  class ReverseWorkflowController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:63
    def getTaskDescription: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkflowController.getTaskDescription",
      """
        function(index0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "description" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("index", index0)])})
        }
      """
    )
  
    // @LINE:21
    def showScriptWorkflow: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkflowController.showScriptWorkflow",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "script_workflow"})
        }
      """
    )
  
    // @LINE:60
    def download_workflow: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkflowController.download_workflow",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "downloadworkflow"})
        }
      """
    )
  
    // @LINE:54
    def generateTreeFromJSON: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkflowController.generateTreeFromJSON",
      """
        function(rootPath0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "directorytreeJSON" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("rootPath", rootPath0)])})
        }
      """
    )
  
    // @LINE:47
    def submit_JSON: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkflowController.submit_JSON",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "submit_JSON"})
        }
      """
    )
  
    // @LINE:19
    def showWorkflow: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkflowController.showWorkflow",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow"})
        }
      """
    )
  
    // @LINE:28
    def downloadFile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkflowController.downloadFile",
      """
        function(path0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "download" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("path", path0)])})
        }
      """
    )
  
    // @LINE:26
    def runTask: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkflowController.runTask",
      """
        function(index0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("index", index0)])})
        }
      """
    )
  
    // @LINE:20
    def showFileWorkflow: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkflowController.showFileWorkflow",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "file_workflow"})
        }
      """
    )
  
    // @LINE:51
    def generateTree: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkflowController.generateTree",
      """
        function(rootPath0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "directorytree" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("rootPath", rootPath0)])})
        }
      """
    )
  
    // @LINE:57
    def refreshTree: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkflowController.refreshTree",
      """
        function(rootPath0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "directorytreeRefresh" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("rootPath", rootPath0)])})
        }
      """
    )
  
    // @LINE:85
    def getAudio: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkflowController.getAudio",
      """
        function(file0) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "audio_data/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file0)})
          }
        
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseApplicationController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:66
    def signOut: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.signOut",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signOut"})
        }
      """
    )
  
    // @LINE:13
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "silhouette"})
        }
      """
    )
  
  }

  // @LINE:74
  class ReverseRequestController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:74
    def view: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RequestController.view",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "request"})
        }
      """
    )
  
    // @LINE:76
    def submit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RequestController.submit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "request"})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def generate_user: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.generate_user",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "generate_random_users"})
        }
      """
    )
  
    // @LINE:42
    def show_submit_script: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.show_submit_script",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "submit_script"})
        }
      """
    )
  
    // @LINE:11
    def send_feedback: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.send_feedback",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "contact"})
        }
      """
    )
  
    // @LINE:44
    def submit_script: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.submit_script",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "submit_script"})
        }
      """
    )
  
    // @LINE:39
    def job_management: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.job_management",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "job_management"})
        }
      """
    )
  
    // @LINE:32
    def show_generate_user: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.show_generate_user",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "generate_random_users"})
        }
      """
    )
  
    // @LINE:37
    def show_job_management: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.show_job_management",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "job_management"})
        }
      """
    )
  
    // @LINE:8
    def use_cases: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.use_cases",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "use_cases"})
        }
      """
    )
  
    // @LINE:7
    def home: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.home",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:9
    def contact: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.contact",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contact"})
        }
      """
    )
  
  }

  // @LINE:90
  class ReverseGetDynamicFileController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:90
    def getFile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GetDynamicFileController.getFile",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "DynamicFiles/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0))})
        }
      """
    )
  
  }


}
