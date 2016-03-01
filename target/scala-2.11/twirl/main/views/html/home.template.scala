
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object home_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class home extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String)(implicit request: RequestHeader, msg: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.67*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main(message)/*4.15*/ {_display_(Seq[Any](format.raw/*4.17*/("""

  """),_display_(/*6.4*/form(action = routes.Main.timeRecord)/*6.41*/ {_display_(Seq[Any](format.raw/*6.43*/("""


  """)))}),format.raw/*9.4*/("""
""")))}),format.raw/*10.2*/("""
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
object home extends home_Scope0.home
              /*
                  -- GENERATED --
                  DATE: Tue Mar 01 09:02:58 PHT 2016
                  SOURCE: /Volumes/Development/Projects/vauldex-dtr/app/views/home.scala.html
                  HASH: 76ccc88e1f393bbf2d39390750d94a566a019439
                  MATRIX: 548->1|723->66|750->84|777->86|798->99|837->101|867->106|912->143|951->145|986->151|1018->153
                  LINES: 20->1|25->1|26->3|27->4|27->4|27->4|29->6|29->6|29->6|32->9|33->10
                  -- GENERATED --
              */
          