
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/petercui/workspace/idols/idols_user/conf/routes
// @DATE:Tue May 04 15:39:51 CDT 2021

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.utils.route.Binders._

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_1: controllers.HomeController,
  // @LINE:13
  ApplicationController_5: controllers.ApplicationController,
  // @LINE:16
  Assets_4: controllers.Assets,
  // @LINE:19
  WorkflowController_6: controllers.WorkflowController,
  // @LINE:75
  SignInController_2: controllers.SignInController,
  // @LINE:81
  RequestController_3: controllers.RequestController,
  // @LINE:88
  webjars_Routes_0: webjars.Routes,
  // @LINE:97
  GetDynamicFileController_0: controllers.GetDynamicFileController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_1: controllers.HomeController,
    // @LINE:13
    ApplicationController_5: controllers.ApplicationController,
    // @LINE:16
    Assets_4: controllers.Assets,
    // @LINE:19
    WorkflowController_6: controllers.WorkflowController,
    // @LINE:75
    SignInController_2: controllers.SignInController,
    // @LINE:81
    RequestController_3: controllers.RequestController,
    // @LINE:88
    webjars_Routes_0: webjars.Routes,
    // @LINE:97
    GetDynamicFileController_0: controllers.GetDynamicFileController
  ) = this(errorHandler, HomeController_1, ApplicationController_5, Assets_4, WorkflowController_6, SignInController_2, RequestController_3, webjars_Routes_0, GetDynamicFileController_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, ApplicationController_5, Assets_4, WorkflowController_6, SignInController_2, RequestController_3, webjars_Routes_0, GetDynamicFileController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.home"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """use_cases""", """controllers.HomeController.use_cases"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contact""", """controllers.HomeController.contact"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contact""", """controllers.HomeController.send_feedback"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """silhouette""", """controllers.ApplicationController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """workflow""", """controllers.WorkflowController.showWorkflow()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dynamicworkflow""", """controllers.WorkflowController.showWorkflowDynamically(path:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """workflow""", """controllers.WorkflowController.runTask(index:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """download""", """controllers.WorkflowController.downloadFile(path:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """generate_random_users""", """controllers.HomeController.show_generate_user()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """generate_random_users""", """controllers.HomeController.generate_user()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job_management""", """controllers.HomeController.show_job_management()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job_management""", """controllers.HomeController.job_management()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """submit_script""", """controllers.HomeController.show_submit_script()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """submit_script""", """controllers.HomeController.submit_script()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """submit_JSON""", """controllers.WorkflowController.submit_JSON()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """directorytree""", """controllers.WorkflowController.generateTree(rootPath:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """directorytreeJSON""", """controllers.WorkflowController.generateTreeFromJSON(rootPath:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """directorytreeRefresh""", """controllers.WorkflowController.refreshTree(rootPath:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """downloadworkflow""", """controllers.WorkflowController.download_workflow()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """downloadselectedworkflow/""" + "$" + """file<.+>""", """controllers.WorkflowController.download_selected_workflow(file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeworkflow/""" + "$" + """file<.+>""", """controllers.WorkflowController.remove_selected_workflow(file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """saveworkflow""", """controllers.WorkflowController.save_workflow()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """description""", """controllers.WorkflowController.getTaskDescription(index:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signOut""", """controllers.ApplicationController.signOut"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signIn""", """controllers.SignInController.view"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signIn""", """controllers.SignInController.submit"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """googleSignIn""", """controllers.SignInController.googleSubmit(idTokenString:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """request""", """controllers.RequestController.view"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """request""", """controllers.RequestController.submit"""),
    prefixed_webjars_Routes_0_31.router.documentation,
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """images/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public/images", file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/stylesheets/DataTables-1.10.18/images/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public/images", file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """audio_data/""" + "$" + """file<.+>""", """controllers.WorkflowController.getAudio(file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """audio_data/human_transcribed_audio/""" + "$" + """file<.+>""", """controllers.WorkflowController.getAudio(file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """audio_data/all_three_transcribed/""" + "$" + """file<.+>""", """controllers.WorkflowController.getAudio(file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DynamicFiles/""" + "$" + """name<[^/]+>""", """controllers.GetDynamicFileController.getFile(name:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_home0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_home0_invoker = createInvoker(
    HomeController_1.home,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "home",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_use_cases1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("use_cases")))
  )
  private[this] lazy val controllers_HomeController_use_cases1_invoker = createInvoker(
    HomeController_1.use_cases,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "use_cases",
      Nil,
      "GET",
      this.prefix + """use_cases""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_contact2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contact")))
  )
  private[this] lazy val controllers_HomeController_contact2_invoker = createInvoker(
    HomeController_1.contact,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "contact",
      Nil,
      "GET",
      this.prefix + """contact""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_send_feedback3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contact")))
  )
  private[this] lazy val controllers_HomeController_send_feedback3_invoker = createInvoker(
    HomeController_1.send_feedback,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "send_feedback",
      Nil,
      "POST",
      this.prefix + """contact""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:13
  private[this] lazy val controllers_ApplicationController_index4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("silhouette")))
  )
  private[this] lazy val controllers_ApplicationController_index4_invoker = createInvoker(
    ApplicationController_5.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "index",
      Nil,
      "GET",
      this.prefix + """silhouette""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Assets_versioned5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned5_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_WorkflowController_showWorkflow6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workflow")))
  )
  private[this] lazy val controllers_WorkflowController_showWorkflow6_invoker = createInvoker(
    WorkflowController_6.showWorkflow(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkflowController",
      "showWorkflow",
      Nil,
      "GET",
      this.prefix + """workflow""",
      """ The page to upload workflow""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_WorkflowController_showWorkflowDynamically7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dynamicworkflow")))
  )
  private[this] lazy val controllers_WorkflowController_showWorkflowDynamically7_invoker = createInvoker(
    WorkflowController_6.showWorkflowDynamically(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkflowController",
      "showWorkflowDynamically",
      Seq(classOf[String]),
      "GET",
      this.prefix + """dynamicworkflow""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_WorkflowController_runTask8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workflow")))
  )
  private[this] lazy val controllers_WorkflowController_runTask8_invoker = createInvoker(
    WorkflowController_6.runTask(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkflowController",
      "runTask",
      Seq(classOf[Integer]),
      "POST",
      this.prefix + """workflow""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:26
  private[this] lazy val controllers_WorkflowController_downloadFile9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("download")))
  )
  private[this] lazy val controllers_WorkflowController_downloadFile9_invoker = createInvoker(
    WorkflowController_6.downloadFile(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkflowController",
      "downloadFile",
      Seq(classOf[String]),
      "GET",
      this.prefix + """download""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_HomeController_show_generate_user10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("generate_random_users")))
  )
  private[this] lazy val controllers_HomeController_show_generate_user10_invoker = createInvoker(
    HomeController_1.show_generate_user(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "show_generate_user",
      Nil,
      "GET",
      this.prefix + """generate_random_users""",
      """ The page to generate random users""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_HomeController_generate_user11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("generate_random_users")))
  )
  private[this] lazy val controllers_HomeController_generate_user11_invoker = createInvoker(
    HomeController_1.generate_user(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "generate_user",
      Nil,
      "POST",
      this.prefix + """generate_random_users""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:35
  private[this] lazy val controllers_HomeController_show_job_management12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job_management")))
  )
  private[this] lazy val controllers_HomeController_show_job_management12_invoker = createInvoker(
    HomeController_1.show_job_management(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "show_job_management",
      Nil,
      "GET",
      this.prefix + """job_management""",
      """ The page to generate jupyter notebook session""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_HomeController_job_management13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job_management")))
  )
  private[this] lazy val controllers_HomeController_job_management13_invoker = createInvoker(
    HomeController_1.job_management(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "job_management",
      Nil,
      "POST",
      this.prefix + """job_management""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:40
  private[this] lazy val controllers_HomeController_show_submit_script14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("submit_script")))
  )
  private[this] lazy val controllers_HomeController_show_submit_script14_invoker = createInvoker(
    HomeController_1.show_submit_script(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "show_submit_script",
      Nil,
      "GET",
      this.prefix + """submit_script""",
      """ The page to generate jupyter notebook session""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_HomeController_submit_script15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("submit_script")))
  )
  private[this] lazy val controllers_HomeController_submit_script15_invoker = createInvoker(
    HomeController_1.submit_script(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "submit_script",
      Nil,
      "POST",
      this.prefix + """submit_script""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:45
  private[this] lazy val controllers_WorkflowController_submit_JSON16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("submit_JSON")))
  )
  private[this] lazy val controllers_WorkflowController_submit_JSON16_invoker = createInvoker(
    WorkflowController_6.submit_JSON(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkflowController",
      "submit_JSON",
      Nil,
      "POST",
      this.prefix + """submit_JSON""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:49
  private[this] lazy val controllers_WorkflowController_generateTree17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("directorytree")))
  )
  private[this] lazy val controllers_WorkflowController_generateTree17_invoker = createInvoker(
    WorkflowController_6.generateTree(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkflowController",
      "generateTree",
      Seq(classOf[String]),
      "GET",
      this.prefix + """directorytree""",
      """ get jsonString of directory tree""",
      Seq()
    )
  )

  // @LINE:52
  private[this] lazy val controllers_WorkflowController_generateTreeFromJSON18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("directorytreeJSON")))
  )
  private[this] lazy val controllers_WorkflowController_generateTreeFromJSON18_invoker = createInvoker(
    WorkflowController_6.generateTreeFromJSON(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkflowController",
      "generateTreeFromJSON",
      Seq(classOf[String]),
      "GET",
      this.prefix + """directorytreeJSON""",
      """ get jsonString of directory tree from a JSON file""",
      Seq()
    )
  )

  // @LINE:55
  private[this] lazy val controllers_WorkflowController_refreshTree19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("directorytreeRefresh")))
  )
  private[this] lazy val controllers_WorkflowController_refreshTree19_invoker = createInvoker(
    WorkflowController_6.refreshTree(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkflowController",
      "refreshTree",
      Seq(classOf[String]),
      "GET",
      this.prefix + """directorytreeRefresh""",
      """ get jsonString of directory tree with refresh""",
      Seq()
    )
  )

  // @LINE:58
  private[this] lazy val controllers_WorkflowController_download_workflow20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("downloadworkflow")))
  )
  private[this] lazy val controllers_WorkflowController_download_workflow20_invoker = createInvoker(
    WorkflowController_6.download_workflow(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkflowController",
      "download_workflow",
      Nil,
      "GET",
      this.prefix + """downloadworkflow""",
      """ get jsonString of directory tree""",
      Seq()
    )
  )

  // @LINE:61
  private[this] lazy val controllers_WorkflowController_download_selected_workflow21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("downloadselectedworkflow/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_WorkflowController_download_selected_workflow21_invoker = createInvoker(
    WorkflowController_6.download_selected_workflow(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkflowController",
      "download_selected_workflow",
      Seq(classOf[String]),
      "GET",
      this.prefix + """downloadselectedworkflow/""" + "$" + """file<.+>""",
      """ get jsonString of selected file""",
      Seq()
    )
  )

  // @LINE:64
  private[this] lazy val controllers_WorkflowController_remove_selected_workflow22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeworkflow/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_WorkflowController_remove_selected_workflow22_invoker = createInvoker(
    WorkflowController_6.remove_selected_workflow(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkflowController",
      "remove_selected_workflow",
      Seq(classOf[String]),
      "GET",
      this.prefix + """removeworkflow/""" + "$" + """file<.+>""",
      """ Remove selected workflow""",
      Seq()
    )
  )

  // @LINE:67
  private[this] lazy val controllers_WorkflowController_save_workflow23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("saveworkflow")))
  )
  private[this] lazy val controllers_WorkflowController_save_workflow23_invoker = createInvoker(
    WorkflowController_6.save_workflow(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkflowController",
      "save_workflow",
      Nil,
      "GET",
      this.prefix + """saveworkflow""",
      """ save workflow""",
      Seq()
    )
  )

  // @LINE:70
  private[this] lazy val controllers_WorkflowController_getTaskDescription24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("description")))
  )
  private[this] lazy val controllers_WorkflowController_getTaskDescription24_invoker = createInvoker(
    WorkflowController_6.getTaskDescription(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkflowController",
      "getTaskDescription",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """description""",
      """ get description of a task""",
      Seq()
    )
  )

  // @LINE:73
  private[this] lazy val controllers_ApplicationController_signOut25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signOut")))
  )
  private[this] lazy val controllers_ApplicationController_signOut25_invoker = createInvoker(
    ApplicationController_5.signOut,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "signOut",
      Nil,
      "GET",
      this.prefix + """signOut""",
      """ authentication """,
      Seq()
    )
  )

  // @LINE:75
  private[this] lazy val controllers_SignInController_view26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signIn")))
  )
  private[this] lazy val controllers_SignInController_view26_invoker = createInvoker(
    SignInController_2.view,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignInController",
      "view",
      Nil,
      "GET",
      this.prefix + """signIn""",
      """""",
      Seq()
    )
  )

  // @LINE:77
  private[this] lazy val controllers_SignInController_submit27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signIn")))
  )
  private[this] lazy val controllers_SignInController_submit27_invoker = createInvoker(
    SignInController_2.submit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignInController",
      "submit",
      Nil,
      "POST",
      this.prefix + """signIn""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:79
  private[this] lazy val controllers_SignInController_googleSubmit28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("googleSignIn")))
  )
  private[this] lazy val controllers_SignInController_googleSubmit28_invoker = createInvoker(
    SignInController_2.googleSubmit(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignInController",
      "googleSubmit",
      Seq(classOf[String]),
      "POST",
      this.prefix + """googleSignIn""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:81
  private[this] lazy val controllers_RequestController_view29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("request")))
  )
  private[this] lazy val controllers_RequestController_view29_invoker = createInvoker(
    RequestController_3.view,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RequestController",
      "view",
      Nil,
      "GET",
      this.prefix + """request""",
      """""",
      Seq()
    )
  )

  // @LINE:83
  private[this] lazy val controllers_RequestController_submit30_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("request")))
  )
  private[this] lazy val controllers_RequestController_submit30_invoker = createInvoker(
    RequestController_3.submit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RequestController",
      "submit",
      Nil,
      "POST",
      this.prefix + """request""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:88
  private[this] val prefixed_webjars_Routes_0_31 = Include(webjars_Routes_0.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "webjars"))

  // @LINE:90
  private[this] lazy val controllers_Assets_at32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at32_invoker = createInvoker(
    Assets_4.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """images/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )

  // @LINE:91
  private[this] lazy val controllers_Assets_at33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/stylesheets/DataTables-1.10.18/images/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at33_invoker = createInvoker(
    Assets_4.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/stylesheets/DataTables-1.10.18/images/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )

  // @LINE:92
  private[this] lazy val controllers_WorkflowController_getAudio34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("audio_data/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_WorkflowController_getAudio34_invoker = createInvoker(
    WorkflowController_6.getAudio(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkflowController",
      "getAudio",
      Seq(classOf[String]),
      "GET",
      this.prefix + """audio_data/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )

  // @LINE:93
  private[this] lazy val controllers_WorkflowController_getAudio35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("audio_data/human_transcribed_audio/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_WorkflowController_getAudio35_invoker = createInvoker(
    WorkflowController_6.getAudio(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkflowController",
      "getAudio",
      Seq(classOf[String]),
      "GET",
      this.prefix + """audio_data/human_transcribed_audio/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )

  // @LINE:94
  private[this] lazy val controllers_WorkflowController_getAudio36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("audio_data/all_three_transcribed/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_WorkflowController_getAudio36_invoker = createInvoker(
    WorkflowController_6.getAudio(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkflowController",
      "getAudio",
      Seq(classOf[String]),
      "GET",
      this.prefix + """audio_data/all_three_transcribed/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )

  // @LINE:97
  private[this] lazy val controllers_GetDynamicFileController_getFile37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DynamicFiles/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GetDynamicFileController_getFile37_invoker = createInvoker(
    GetDynamicFileController_0.getFile(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GetDynamicFileController",
      "getFile",
      Seq(classOf[String]),
      "GET",
      this.prefix + """DynamicFiles/""" + "$" + """name<[^/]+>""",
      """ file needs to be in ./public/DynamicFiles to show on the client """,
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_home0_route(params@_) =>
      call { 
        controllers_HomeController_home0_invoker.call(HomeController_1.home)
      }
  
    // @LINE:8
    case controllers_HomeController_use_cases1_route(params@_) =>
      call { 
        controllers_HomeController_use_cases1_invoker.call(HomeController_1.use_cases)
      }
  
    // @LINE:9
    case controllers_HomeController_contact2_route(params@_) =>
      call { 
        controllers_HomeController_contact2_invoker.call(HomeController_1.contact)
      }
  
    // @LINE:11
    case controllers_HomeController_send_feedback3_route(params@_) =>
      call { 
        controllers_HomeController_send_feedback3_invoker.call(HomeController_1.send_feedback)
      }
  
    // @LINE:13
    case controllers_ApplicationController_index4_route(params@_) =>
      call { 
        controllers_ApplicationController_index4_invoker.call(ApplicationController_5.index)
      }
  
    // @LINE:16
    case controllers_Assets_versioned5_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned5_invoker.call(Assets_4.versioned(path, file))
      }
  
    // @LINE:19
    case controllers_WorkflowController_showWorkflow6_route(params@_) =>
      call { 
        controllers_WorkflowController_showWorkflow6_invoker.call(WorkflowController_6.showWorkflow())
      }
  
    // @LINE:20
    case controllers_WorkflowController_showWorkflowDynamically7_route(params@_) =>
      call(params.fromQuery[String]("path", None)) { (path) =>
        controllers_WorkflowController_showWorkflowDynamically7_invoker.call(WorkflowController_6.showWorkflowDynamically(path))
      }
  
    // @LINE:24
    case controllers_WorkflowController_runTask8_route(params@_) =>
      call(params.fromQuery[Integer]("index", None)) { (index) =>
        controllers_WorkflowController_runTask8_invoker.call(WorkflowController_6.runTask(index))
      }
  
    // @LINE:26
    case controllers_WorkflowController_downloadFile9_route(params@_) =>
      call(params.fromQuery[String]("path", None)) { (path) =>
        controllers_WorkflowController_downloadFile9_invoker.call(WorkflowController_6.downloadFile(path))
      }
  
    // @LINE:30
    case controllers_HomeController_show_generate_user10_route(params@_) =>
      call { 
        controllers_HomeController_show_generate_user10_invoker.call(HomeController_1.show_generate_user())
      }
  
    // @LINE:32
    case controllers_HomeController_generate_user11_route(params@_) =>
      call { 
        controllers_HomeController_generate_user11_invoker.call(HomeController_1.generate_user())
      }
  
    // @LINE:35
    case controllers_HomeController_show_job_management12_route(params@_) =>
      call { 
        controllers_HomeController_show_job_management12_invoker.call(HomeController_1.show_job_management())
      }
  
    // @LINE:37
    case controllers_HomeController_job_management13_route(params@_) =>
      call { 
        controllers_HomeController_job_management13_invoker.call(HomeController_1.job_management())
      }
  
    // @LINE:40
    case controllers_HomeController_show_submit_script14_route(params@_) =>
      call { 
        controllers_HomeController_show_submit_script14_invoker.call(HomeController_1.show_submit_script())
      }
  
    // @LINE:42
    case controllers_HomeController_submit_script15_route(params@_) =>
      call { 
        controllers_HomeController_submit_script15_invoker.call(HomeController_1.submit_script())
      }
  
    // @LINE:45
    case controllers_WorkflowController_submit_JSON16_route(params@_) =>
      call { 
        controllers_WorkflowController_submit_JSON16_invoker.call(WorkflowController_6.submit_JSON())
      }
  
    // @LINE:49
    case controllers_WorkflowController_generateTree17_route(params@_) =>
      call(params.fromQuery[String]("rootPath", None)) { (rootPath) =>
        controllers_WorkflowController_generateTree17_invoker.call(WorkflowController_6.generateTree(rootPath))
      }
  
    // @LINE:52
    case controllers_WorkflowController_generateTreeFromJSON18_route(params@_) =>
      call(params.fromQuery[String]("rootPath", None)) { (rootPath) =>
        controllers_WorkflowController_generateTreeFromJSON18_invoker.call(WorkflowController_6.generateTreeFromJSON(rootPath))
      }
  
    // @LINE:55
    case controllers_WorkflowController_refreshTree19_route(params@_) =>
      call(params.fromQuery[String]("rootPath", None)) { (rootPath) =>
        controllers_WorkflowController_refreshTree19_invoker.call(WorkflowController_6.refreshTree(rootPath))
      }
  
    // @LINE:58
    case controllers_WorkflowController_download_workflow20_route(params@_) =>
      call { 
        controllers_WorkflowController_download_workflow20_invoker.call(WorkflowController_6.download_workflow())
      }
  
    // @LINE:61
    case controllers_WorkflowController_download_selected_workflow21_route(params@_) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_WorkflowController_download_selected_workflow21_invoker.call(WorkflowController_6.download_selected_workflow(file))
      }
  
    // @LINE:64
    case controllers_WorkflowController_remove_selected_workflow22_route(params@_) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_WorkflowController_remove_selected_workflow22_invoker.call(WorkflowController_6.remove_selected_workflow(file))
      }
  
    // @LINE:67
    case controllers_WorkflowController_save_workflow23_route(params@_) =>
      call { 
        controllers_WorkflowController_save_workflow23_invoker.call(WorkflowController_6.save_workflow())
      }
  
    // @LINE:70
    case controllers_WorkflowController_getTaskDescription24_route(params@_) =>
      call(params.fromQuery[Integer]("index", None)) { (index) =>
        controllers_WorkflowController_getTaskDescription24_invoker.call(WorkflowController_6.getTaskDescription(index))
      }
  
    // @LINE:73
    case controllers_ApplicationController_signOut25_route(params@_) =>
      call { 
        controllers_ApplicationController_signOut25_invoker.call(ApplicationController_5.signOut)
      }
  
    // @LINE:75
    case controllers_SignInController_view26_route(params@_) =>
      call { 
        controllers_SignInController_view26_invoker.call(SignInController_2.view)
      }
  
    // @LINE:77
    case controllers_SignInController_submit27_route(params@_) =>
      call { 
        controllers_SignInController_submit27_invoker.call(SignInController_2.submit)
      }
  
    // @LINE:79
    case controllers_SignInController_googleSubmit28_route(params@_) =>
      call(params.fromQuery[String]("idTokenString", None)) { (idTokenString) =>
        controllers_SignInController_googleSubmit28_invoker.call(SignInController_2.googleSubmit(idTokenString))
      }
  
    // @LINE:81
    case controllers_RequestController_view29_route(params@_) =>
      call { 
        controllers_RequestController_view29_invoker.call(RequestController_3.view)
      }
  
    // @LINE:83
    case controllers_RequestController_submit30_route(params@_) =>
      call { 
        controllers_RequestController_submit30_invoker.call(RequestController_3.submit)
      }
  
    // @LINE:88
    case prefixed_webjars_Routes_0_31(handler) => handler
  
    // @LINE:90
    case controllers_Assets_at32_route(params@_) =>
      call(Param[String]("path", Right("/public/images")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at32_invoker.call(Assets_4.at(path, file))
      }
  
    // @LINE:91
    case controllers_Assets_at33_route(params@_) =>
      call(Param[String]("path", Right("/public/images")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at33_invoker.call(Assets_4.at(path, file))
      }
  
    // @LINE:92
    case controllers_WorkflowController_getAudio34_route(params@_) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_WorkflowController_getAudio34_invoker.call(WorkflowController_6.getAudio(file))
      }
  
    // @LINE:93
    case controllers_WorkflowController_getAudio35_route(params@_) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_WorkflowController_getAudio35_invoker.call(WorkflowController_6.getAudio(file))
      }
  
    // @LINE:94
    case controllers_WorkflowController_getAudio36_route(params@_) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_WorkflowController_getAudio36_invoker.call(WorkflowController_6.getAudio(file))
      }
  
    // @LINE:97
    case controllers_GetDynamicFileController_getFile37_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_GetDynamicFileController_getFile37_invoker.call(GetDynamicFileController_0.getFile(name))
      }
  }
}
