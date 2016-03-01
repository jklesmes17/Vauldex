
// @GENERATOR:play-routes-compiler
// @SOURCE:/Volumes/Development/Projects/vauldex-dtr/conf/routes
// @DATE:Tue Mar 01 09:02:58 PHT 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:21
  class ReverseWebJarAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WebJarAssets.at",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:20
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseMain(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def adminHome: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Main.adminHome",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/home"})
        }
      """
    )
  
    // @LINE:15
    def adminLoginSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Main.adminLoginSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/login"})
        }
      """
    )
  
    // @LINE:17
    def employeeSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Main.employeeSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/employee"})
        }
      """
    )
  
    // @LINE:10
    def employeeHome: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Main.employeeHome",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/home"})
        }
      """
    )
  
    // @LINE:14
    def adminLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Main.adminLogin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/login"})
        }
      """
    )
  
    // @LINE:9
    def employeeLoginSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Main.employeeLoginSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/login"})
        }
      """
    )
  
    // @LINE:11
    def timeRecord: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Main.timeRecord",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/time"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Main.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}