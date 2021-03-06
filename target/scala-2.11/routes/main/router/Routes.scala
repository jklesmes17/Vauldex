
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/fixerinit2/Projects/Vauldex/conf/routes
// @DATE:Tue Mar 01 11:20:41 PHT 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Main_2: controllers.Main,
  // @LINE:10
  EmpController_3: controllers.EmpController,
  // @LINE:19
  Assets_1: controllers.Assets,
  // @LINE:20
  WebJarAssets_0: controllers.WebJarAssets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Main_2: controllers.Main,
    // @LINE:10
    EmpController_3: controllers.EmpController,
    // @LINE:19
    Assets_1: controllers.Assets,
    // @LINE:20
    WebJarAssets_0: controllers.WebJarAssets
  ) = this(errorHandler, Main_2, EmpController_3, Assets_1, WebJarAssets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Main_2, EmpController_3, Assets_1, WebJarAssets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Main.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/login""", """controllers.Main.employeeLoginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/home""", """controllers.EmpController.empHome"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/login""", """controllers.Main.adminLogin"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/login""", """controllers.Main.adminLoginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/home""", """controllers.Main.adminHome"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/employee""", """controllers.Main.employeeSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""", """controllers.WebJarAssets.at(file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Main_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Main_index0_invoker = createInvoker(
    Main_2.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Main",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Main_employeeLoginSubmit1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/login")))
  )
  private[this] lazy val controllers_Main_employeeLoginSubmit1_invoker = createInvoker(
    Main_2.employeeLoginSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Main",
      "employeeLoginSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """employee/login"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_EmpController_empHome2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/home")))
  )
  private[this] lazy val controllers_EmpController_empHome2_invoker = createInvoker(
    EmpController_3.empHome,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmpController",
      "empHome",
      Nil,
      "GET",
      """ Employee Dashboard""",
      this.prefix + """employee/home"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Main_adminLogin3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/login")))
  )
  private[this] lazy val controllers_Main_adminLogin3_invoker = createInvoker(
    Main_2.adminLogin,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Main",
      "adminLogin",
      Nil,
      "GET",
      """ Admin Dashboard""",
      this.prefix + """admin/login"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Main_adminLoginSubmit4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/login")))
  )
  private[this] lazy val controllers_Main_adminLoginSubmit4_invoker = createInvoker(
    Main_2.adminLoginSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Main",
      "adminLoginSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """admin/login"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Main_adminHome5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/home")))
  )
  private[this] lazy val controllers_Main_adminHome5_invoker = createInvoker(
    Main_2.adminHome,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Main",
      "adminHome",
      Nil,
      "GET",
      """""",
      this.prefix + """admin/home"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Main_employeeSubmit6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/employee")))
  )
  private[this] lazy val controllers_Main_employeeSubmit6_invoker = createInvoker(
    Main_2.employeeSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Main",
      "employeeSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """admin/employee"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Assets_at7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at7_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_WebJarAssets_at8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("webjars/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_WebJarAssets_at8_invoker = createInvoker(
    WebJarAssets_0.at(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WebJarAssets",
      "at",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """webjars/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Main_index0_route(params) =>
      call { 
        controllers_Main_index0_invoker.call(Main_2.index)
      }
  
    // @LINE:7
    case controllers_Main_employeeLoginSubmit1_route(params) =>
      call { 
        controllers_Main_employeeLoginSubmit1_invoker.call(Main_2.employeeLoginSubmit)
      }
  
    // @LINE:10
    case controllers_EmpController_empHome2_route(params) =>
      call { 
        controllers_EmpController_empHome2_invoker.call(EmpController_3.empHome)
      }
  
    // @LINE:13
    case controllers_Main_adminLogin3_route(params) =>
      call { 
        controllers_Main_adminLogin3_invoker.call(Main_2.adminLogin)
      }
  
    // @LINE:14
    case controllers_Main_adminLoginSubmit4_route(params) =>
      call { 
        controllers_Main_adminLoginSubmit4_invoker.call(Main_2.adminLoginSubmit)
      }
  
    // @LINE:15
    case controllers_Main_adminHome5_route(params) =>
      call { 
        controllers_Main_adminHome5_invoker.call(Main_2.adminHome)
      }
  
    // @LINE:16
    case controllers_Main_employeeSubmit6_route(params) =>
      call { 
        controllers_Main_employeeSubmit6_invoker.call(Main_2.employeeSubmit)
      }
  
    // @LINE:19
    case controllers_Assets_at7_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at7_invoker.call(Assets_1.at(path, file))
      }
  
    // @LINE:20
    case controllers_WebJarAssets_at8_route(params) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_WebJarAssets_at8_invoker.call(WebJarAssets_0.at(file))
      }
  }
}