
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/petercui/workspace/idols/idols_user/conf/routes
// @DATE:Sun May 02 17:13:23 CDT 2021

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.utils.route.Binders._

// @LINE:7
package controllers {

  // @LINE:16
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:93
    def at(file:String): Call = {
    
      (file: @unchecked) match {
      
        // @LINE:93
        case (file)  =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public/images"))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "images/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
      
      }
    
    }
  
    // @LINE:16
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:78
  class ReverseSignInController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:78
    def view(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signIn")
    }
  
    // @LINE:82
    def googleSubmit(idTokenString:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "googleSignIn" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("idTokenString", idTokenString)))))
    }
  
    // @LINE:80
    def submit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "signIn")
    }
  
  }

  // @LINE:19
  class ReverseWorkflowController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:73
    def getTaskDescription(index:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "description" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("index", index)))))
    }
  
    // @LINE:70
    def save_workflow(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "saveworkflow")
    }
  
    // @LINE:22
    def showScriptWorkflow(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "script_workflow")
    }
  
    // @LINE:28
    def showCompareTransWorkflow(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "comparetrans_workflow")
    }
  
    // @LINE:67
    def download_workflow(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "downloadworkflow")
    }
  
    // @LINE:26
    def showExplicitWorkflow(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "explicit_workflow")
    }
  
    // @LINE:61
    def generateTreeFromJSON(rootPath:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "directorytreeJSON" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("rootPath", rootPath)))))
    }
  
    // @LINE:27
    def showAudioTransWorkflow(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "audiotrans_workflow")
    }
  
    // @LINE:54
    def submit_JSON(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "submit_JSON")
    }
  
    // @LINE:29
    def showTrainModelWorkflow(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "trainmodel_workflow")
    }
  
    // @LINE:25
    def showParallelWorkflow(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "parallel_workflow")
    }
  
    // @LINE:19
    def showWorkflow(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workflow")
    }
  
    // @LINE:35
    def downloadFile(path:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "download" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("path", path)))))
    }
  
    // @LINE:33
    def runTask(index:Integer): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "workflow" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("index", index)))))
    }
  
    // @LINE:23
    def showTweetsWorkflow(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tweets_workflow")
    }
  
    // @LINE:21
    def showFileWorkflow(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "file_workflow")
    }
  
    // @LINE:20
    def showWorkflowDynamically(path:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dynamicworkflow" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("path", path)))))
    }
  
    // @LINE:58
    def generateTree(rootPath:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "directorytree" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("rootPath", rootPath)))))
    }
  
    // @LINE:24
    def showSpeechWorkflow(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "speech_workflow")
    }
  
    // @LINE:64
    def refreshTree(rootPath:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "directorytreeRefresh" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("rootPath", rootPath)))))
    }
  
    // @LINE:95
    def getAudio(file:String): Call = {
    
      (file: @unchecked) match {
      
        // @LINE:95
        case (file)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "audio_data/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
      
      }
    
    }
  
  }

  // @LINE:13
  class ReverseApplicationController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:76
    def signOut(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signOut")
    }
  
    // @LINE:13
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "silhouette")
    }
  
  }

  // @LINE:84
  class ReverseRequestController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:84
    def view(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "request")
    }
  
    // @LINE:86
    def submit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "request")
    }
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def generate_user(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "generate_random_users")
    }
  
    // @LINE:49
    def show_submit_script(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "submit_script")
    }
  
    // @LINE:11
    def send_feedback(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "contact")
    }
  
    // @LINE:51
    def submit_script(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "submit_script")
    }
  
    // @LINE:46
    def job_management(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "job_management")
    }
  
    // @LINE:39
    def show_generate_user(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "generate_random_users")
    }
  
    // @LINE:44
    def show_job_management(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "job_management")
    }
  
    // @LINE:8
    def use_cases(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "use_cases")
    }
  
    // @LINE:7
    def home(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:9
    def contact(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "contact")
    }
  
  }

  // @LINE:100
  class ReverseGetDynamicFileController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:100
    def getFile(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "DynamicFiles/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
  }


}
