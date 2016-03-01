
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,Form[scala.Tuple2[String, String]],RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, loginForm: Form[(String, String)])(implicit request: RequestHeader, msg: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.102*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main(message)/*4.15*/ {_display_(Seq[Any](format.raw/*4.17*/("""
    """),format.raw/*5.5*/("""<div class="row expanded container">
      <div class="large-5 columns large-centered center-items">
        """),_display_(/*7.10*/form(action = routes.Main.adminLoginSubmit)/*7.53*/ {_display_(Seq[Any](format.raw/*7.55*/("""
              """),_display_(/*8.16*/inputText(loginForm("username"),
              '_showConstraints -> false)),format.raw/*9.42*/("""
              """),_display_(/*10.16*/inputPassword(loginForm("password"),
              '_showConstraints -> false)),format.raw/*11.42*/("""
            """),format.raw/*12.13*/("""<input type="submit" name="adminSubmit" value="Authenticate Admin" class="button alert expanded">
        """)))}),format.raw/*13.10*/("""
      """),format.raw/*14.7*/("""</div>
    </div>
""")))}),format.raw/*16.2*/("""
"""))
      }
    }
  }

  def render(message:String,loginForm:Form[scala.Tuple2[String, String]],request:RequestHeader,msg:Messages): play.twirl.api.HtmlFormat.Appendable = apply(message,loginForm)(request,msg)

  def f:((String,Form[scala.Tuple2[String, String]]) => (RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = (message,loginForm) => (request,msg) => apply(message,loginForm)(request,msg)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Tue Mar 01 10:01:46 PHT 2016
                  SOURCE: /Users/fixerinit2/Projects/Vauldex/app/views/admin/login.scala.html
                  HASH: 1435d00aa49641eb172c9493333088ddb475bf09
                  MATRIX: 591->1|802->101|829->119|856->121|877->134|916->136|947->141|1083->251|1134->294|1173->296|1215->312|1309->386|1352->402|1451->480|1492->493|1630->600|1664->607|1713->626
                  LINES: 20->1|25->1|26->3|27->4|27->4|27->4|28->5|30->7|30->7|30->7|31->8|32->9|33->10|34->11|35->12|36->13|37->14|39->16
                  -- GENERATED --
              */
          