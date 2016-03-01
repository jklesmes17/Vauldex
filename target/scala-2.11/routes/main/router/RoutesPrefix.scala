
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/fixerinit2/Projects/Vauldex/conf/routes
// @DATE:Tue Mar 01 11:20:41 PHT 2016


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
