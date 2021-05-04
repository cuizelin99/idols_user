
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/petercui/workspace/idols/idols_user/conf/routes
// @DATE:Tue May 04 15:39:51 CDT 2021

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

  
    // @LINE:90
    def at(file:String): Call = {
    
      (file: @unchecked) match {
      
        // @LINE:90
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

  // @LINE:75
  class ReverseSignInController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:75
    def view(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signIn")
    }
  
    // @LINE:79
    def googleSubmit(idTokenString:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "googleSignIn" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("idTokenString", idTokenString)))))
    }
  
    // @LINE:77
    def submit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "signIn")
    }
  
  }

  // @LINE:19
  class ReverseWorkflowController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:70
    def getTaskDescription(index:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "description" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("index", index)))))
    }
  
    // @LINE:67
    def save_workflow(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "saveworkflow")
    }
  
    // @LINE:58
    def download_workflow(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "downloadworkflow")
    }
  
    // @LINE:52
    def generateTreeFromJSON(rootPath:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "directorytreeJSON" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("rootPath", rootPath)))))
    }
  
    // @LINE:45
    def submit_JSON(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "submit_JSON")
    }
  
    // @LINE:64
    def remove_selected_workflow(file:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "removeworkflow/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
    // @LINE:19
    def showWorkflow(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "workflow")
    }
  
    // @LINE:26
    def downloadFile(path:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "download" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("path", path)))))
    }
  
    // @LINE:24
    def runTask(index:Integer): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "workflow" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("index", index)))))
    }
  
    // @LINE:61
    def download_selected_workflow(file:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "downloadselectedworkflow/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
    // @LINE:20
    def showWorkflowDynamically(path:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dynamicworkflow" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("path", path)))))
    }
  
    // @LINE:49
    def generateTree(rootPath:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "directorytree" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("rootPath", rootPath)))))
    }
  
    // @LINE:55
    def refreshTree(rootPath:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "directorytreeRefresh" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("rootPath", rootPath)))))
    }
  
    // @LINE:92
    def getAudio(file:String): Call = {
    
      (file: @unchecked) match {
      
        // @LINE:92
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

  
    // @LINE:73
    def signOut(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signOut")
    }
  
    // @LINE:13
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "silhouette")
    }
  
  }

  // @LINE:81
  class ReverseRequestController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:81
    def view(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "request")
    }
  
    // @LINE:83
    def submit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "request")
    }
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def generate_user(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "generate_random_users")
    }
  
    // @LINE:40
    def show_submit_script(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "submit_script")
    }
  
    // @LINE:11
    def send_feedback(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "contact")
    }
  
    // @LINE:42
    def submit_script(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "submit_script")
    }
  
    // @LINE:37
    def job_management(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "job_management")
    }
  
    // @LINE:30
    def show_generate_user(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "generate_random_users")
    }
  
    // @LINE:35
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

  // @LINE:97
  class ReverseGetDynamicFileController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:97
    def getFile(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "DynamicFiles/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
  }


}
