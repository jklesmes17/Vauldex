
package views.html.employee

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object empIndex_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class empIndex extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String)(implicit request: RequestHeader, msg: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.67*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Vauldex - Employee")/*4.28*/ {_display_(Seq[Any](format.raw/*4.30*/("""

  """),format.raw/*6.3*/("""<div class="row expanded container">
    <div class="large-3 columns container border">
      <div class="large-12 columns label center-items">
        <h3><strong>VAULDEX</strong></h3>
      </div>
    </div>
    <div class="large-9 columns container">
      <div class="large-1 columns container"></div>
      <div class="large-10 columns container">
        <br>
        <h2 id="dateTime"></h2>
      </div>
      <div class="large-1 columns container"></div>
    </div>
  </div>
""")))}),format.raw/*21.2*/("""
"""))
      }
    }
  }

  def render(message:String,request:RequestHeader,msg:Messages): play.twirl.api.HtmlFormat.Appendable = apply(message)(request,msg)

  def f:((String) => (RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = (message) => (request,msg) => apply(message)(request,msg)

  def ref: this.type = this

}


}

/**/
object empIndex extends empIndex_Scope0.empIndex
              /*
                  -- GENERATED --
                  DATE: Tue Mar 01 13:18:18 PHT 2016
                  SOURCE: /Users/fixerinit2/Projects/Vauldex/app/views/employee/empIndex.scala.html
                  HASH: b6790dcf07123144f023f3c18e020792202f0994
                  MATRIX: 565->1|740->66|767->84|794->86|828->112|867->114|897->118|1411->602
                  LINES: 20->1|25->1|26->3|27->4|27->4|27->4|29->6|44->21
                  -- GENERATED --
              */
          