
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,Form[scala.Tuple2[String, String]],RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, loginForm: Form[(String, String)])(implicit request: RequestHeader, msg: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.102*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Vauldex - Home")/*4.24*/ {_display_(Seq[Any](format.raw/*4.26*/("""

  """),format.raw/*6.3*/("""<div class="row expanded container">
      <div class="large-3 columns container border">
            <div class="large-12 columns label center-items">
                <h3><strong>VAULDEX</strong></h3>
            </div>
            <div class="large-12 columns">
                """),_display_(/*12.18*/form(action = routes.Main.employeeLoginSubmit)/*12.64*/ {_display_(Seq[Any](format.raw/*12.66*/("""
                  """),_display_(/*13.20*/inputText(loginForm("username"), '_showConstraints -> false)),format.raw/*13.80*/("""
                  """),_display_(/*14.20*/inputPassword(loginForm("password"), '_showConstraints -> false)),format.raw/*14.84*/("""
                  """),format.raw/*15.19*/("""<input type="submit" name="submit" value="Login" class="button expanded">
                """)))}),format.raw/*16.18*/("""
            """),format.raw/*17.13*/("""</div>
      </div>
      <div class="large-9 columns container"></div>
  </div>

""")))}),format.raw/*22.2*/("""
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
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon Feb 29 23:56:58 PHT 2016
                  SOURCE: /Volumes/Development/Projects/vauldex-dtr/app/views/index.scala.html
                  HASH: ff6d4a75fdc6ed4934582075f3d073d39a1d2cc0
                  MATRIX: 585->1|796->101|823->119|850->121|880->143|919->145|949->149|1257->430|1312->476|1352->478|1399->498|1480->558|1527->578|1612->642|1659->661|1781->752|1822->765|1935->848
                  LINES: 20->1|25->1|26->3|27->4|27->4|27->4|29->6|35->12|35->12|35->12|36->13|36->13|37->14|37->14|38->15|39->16|40->17|45->22
                  -- GENERATED --
              */
          