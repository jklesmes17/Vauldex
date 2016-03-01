
// @GENERATOR:play-routes-compiler
// @SOURCE:/Volumes/Development/Projects/vauldex-dtr/conf/routes
// @DATE:Tue Mar 01 09:02:58 PHT 2016


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
