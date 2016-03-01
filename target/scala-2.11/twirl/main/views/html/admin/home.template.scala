
package views.html.admin

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

class home extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,Form[Employee],Seq[Employee],RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, employeeForm: Form[Employee], employees: Seq[Employee])(implicit request: RequestHeader, msg: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.123*/("""
"""),format.raw/*3.1*/("""

"""),_display_(/*5.2*/main(message)/*5.15*/ {_display_(Seq[Any](format.raw/*5.17*/("""


  """),format.raw/*8.3*/("""<div class="row expanded container">
    <div class="large-12 columns">
      <ul class="tabs" data-tabs id="admin-main-nav">
        <li class="tabs-title is-active"><a href="#home" aria-selected="true">Home</a></li>
        <li class="tabs-title"><a href="#employee">Employee</a></li>
      </ul>
      <div class="tabs-content" data-tabs-content="admin-main-nav">
        <div class="tabs-panel is-active" id="home">
          <h3>List of Employee</h3>
         <ol>
           """),_display_(/*18.13*/for(employee <- employees) yield /*18.39*/ {_display_(Seq[Any](format.raw/*18.41*/("""
              """),format.raw/*19.15*/("""<li>"""),_display_(/*19.20*/employee/*19.28*/.fname),format.raw/*19.34*/(""" """),_display_(/*19.36*/employee/*19.44*/.lname),format.raw/*19.50*/("""</li>
           """)))}),format.raw/*20.13*/("""
         """),format.raw/*21.10*/("""</ul>
        </div>
        <div class="tabs-panel clearfix" id="employee">
          """),_display_(/*24.12*/form(action = routes.Main.employeeSubmit)/*24.53*/ {_display_(Seq[Any](format.raw/*24.55*/("""
            """),_display_(/*25.14*/inputText(employeeForm("username"), '_showConstraints -> false)),format.raw/*25.77*/("""
            """),_display_(/*26.14*/inputText(employeeForm("password"), '_showConstraints -> false)),format.raw/*26.77*/("""
            """),_display_(/*27.14*/inputText(employeeForm("fname"), '_showConstraints -> false)),format.raw/*27.74*/("""
            """),_display_(/*28.14*/inputText(employeeForm("lname"), '_showConstraints -> false)),format.raw/*28.74*/("""
            """),_display_(/*29.14*/inputText(employeeForm("mname"), '_showConstraints -> false)),format.raw/*29.74*/("""
            """),_display_(/*30.14*/inputText(employeeForm("tin"), '_showConstraints -> false)),format.raw/*30.72*/("""
            """),_display_(/*31.14*/inputText(employeeForm("sss"), '_showConstraints -> false)),format.raw/*31.72*/("""
            """),_display_(/*32.14*/inputText(employeeForm("pagibig"), '_showConstraints -> false)),format.raw/*32.76*/("""
            """),_display_(/*33.14*/inputText(employeeForm("ratePerHour"), '_showConstraints -> false)),format.raw/*33.80*/("""
            """),format.raw/*34.13*/("""<input type="submit" name="submit" value="Submit" class="button float-right">
          """)))}),format.raw/*35.12*/("""
        """),format.raw/*36.9*/("""</div>
      </div>
    </div>
  </div>
""")))}),format.raw/*40.2*/("""
"""))
      }
    }
  }

  def render(message:String,employeeForm:Form[Employee],employees:Seq[Employee],request:RequestHeader,msg:Messages): play.twirl.api.HtmlFormat.Appendable = apply(message,employeeForm,employees)(request,msg)

  def f:((String,Form[Employee],Seq[Employee]) => (RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = (message,employeeForm,employees) => (request,msg) => apply(message,employeeForm,employees)(request,msg)

  def ref: this.type = this

}


}

/**/
object home extends home_Scope0.home
              /*
                  -- GENERATED --
                  DATE: Mon Feb 29 23:56:58 PHT 2016
                  SOURCE: /Volumes/Development/Projects/vauldex-dtr/app/views/admin/home.scala.html
                  HASH: 68f9c083f6317984b2e67ef2eb9d1095d256593f
                  MATRIX: 583->1|815->122|842->140|870->143|891->156|930->158|961->163|1470->645|1512->671|1552->673|1595->688|1627->693|1644->701|1671->707|1700->709|1717->717|1744->723|1793->741|1831->751|1946->839|1996->880|2036->882|2077->896|2161->959|2202->973|2286->1036|2327->1050|2408->1110|2449->1124|2530->1184|2571->1198|2652->1258|2693->1272|2772->1330|2813->1344|2892->1402|2933->1416|3016->1478|3057->1492|3144->1558|3185->1571|3305->1660|3341->1669|3412->1710
                  LINES: 20->1|25->1|26->3|28->5|28->5|28->5|31->8|41->18|41->18|41->18|42->19|42->19|42->19|42->19|42->19|42->19|42->19|43->20|44->21|47->24|47->24|47->24|48->25|48->25|49->26|49->26|50->27|50->27|51->28|51->28|52->29|52->29|53->30|53->30|54->31|54->31|55->32|55->32|56->33|56->33|57->34|58->35|59->36|63->40
                  -- GENERATED --
              */
          