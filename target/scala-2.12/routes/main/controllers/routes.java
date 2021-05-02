
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/petercui/workspace/idols/idols_user/conf/routes
// @DATE:Sun May 02 17:13:23 CDT 2021

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseSignInController SignInController = new controllers.ReverseSignInController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseWorkflowController WorkflowController = new controllers.ReverseWorkflowController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplicationController ApplicationController = new controllers.ReverseApplicationController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseRequestController RequestController = new controllers.ReverseRequestController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseGetDynamicFileController GetDynamicFileController = new controllers.ReverseGetDynamicFileController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseSignInController SignInController = new controllers.javascript.ReverseSignInController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseWorkflowController WorkflowController = new controllers.javascript.ReverseWorkflowController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplicationController ApplicationController = new controllers.javascript.ReverseApplicationController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseRequestController RequestController = new controllers.javascript.ReverseRequestController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseGetDynamicFileController GetDynamicFileController = new controllers.javascript.ReverseGetDynamicFileController(RoutesPrefix.byNamePrefix());
  }

}
