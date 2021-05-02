
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/petercui/workspace/idols/idols_user/conf/routes
// @DATE:Sun May 02 17:13:23 CDT 2021


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
