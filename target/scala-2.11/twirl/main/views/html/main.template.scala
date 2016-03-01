
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.59*/routes/*8.65*/.Assets.at("images/favicon.png")),format.raw/*8.97*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/routes/*9.60*/.WebJarAssets.at(WebJarAssets.locate("foundation.min.css"))),format.raw/*9.119*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*10.54*/routes/*10.60*/.WebJarAssets.at(WebJarAssets.locate("foundation-flex.css"))),format.raw/*10.120*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*11.54*/routes/*11.60*/.WebJarAssets.at(WebJarAssets.locate("font-awesome.css"))),format.raw/*11.117*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*12.54*/routes/*12.60*/.Assets.at("stylesheets/main.css")),format.raw/*12.94*/("""">

        <script src=""""),_display_(/*14.23*/routes/*14.29*/.WebJarAssets.at(WebJarAssets.locate("jquery.min.js"))),format.raw/*14.83*/(""""></script>
        <script src=""""),_display_(/*15.23*/routes/*15.29*/.WebJarAssets.at(WebJarAssets.locate("underscore.js"))),format.raw/*15.83*/(""""></script>
        <script src=""""),_display_(/*16.23*/routes/*16.29*/.WebJarAssets.at(WebJarAssets.locate("backbone.js"))),format.raw/*16.81*/(""""></script>
        <script src=""""),_display_(/*17.23*/routes/*17.29*/.WebJarAssets.at(WebJarAssets.locate("moment.min.js"))),format.raw/*17.83*/(""""></script>
    </head>
    <body>
        """),_display_(/*20.10*/content),format.raw/*20.17*/("""
        """),format.raw/*21.9*/("""<script src=""""),_display_(/*21.23*/routes/*21.29*/.WebJarAssets.at(WebJarAssets.locate("foundation.core.js"))),format.raw/*21.88*/(""""></script>
        <script src=""""),_display_(/*22.23*/routes/*22.29*/.WebJarAssets.at(WebJarAssets.locate("foundation.min.js"))),format.raw/*22.87*/(""""></script>
        <script src=""""),_display_(/*23.23*/routes/*23.29*/.WebJarAssets.at(WebJarAssets.locate("foundation.reveal.js"))),format.raw/*23.90*/(""""></script>
        <script src=""""),_display_(/*24.23*/routes/*24.29*/.Assets.at("javascripts/main.js")),format.raw/*24.62*/(""""></script>
        <script>
            $(document).foundation();
        </script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Tue Mar 01 10:01:46 PHT 2016
                  SOURCE: /Users/fixerinit2/Projects/Vauldex/app/views/main.scala.html
                  HASH: 42a6912024b2b7a59779dc696d70243888fd4a24
                  MATRIX: 530->1|655->31|683->33|770->94|795->99|888->166|902->172|954->204|1036->260|1050->266|1130->325|1213->381|1228->387|1310->447|1393->503|1408->509|1487->566|1570->622|1585->628|1640->662|1693->688|1708->694|1783->748|1844->782|1859->788|1934->842|1995->876|2010->882|2083->934|2144->968|2159->974|2234->1028|2305->1072|2333->1079|2369->1088|2410->1102|2425->1108|2505->1167|2566->1201|2581->1207|2660->1265|2721->1299|2736->1305|2818->1366|2879->1400|2894->1406|2948->1439
                  LINES: 20->1|25->1|27->3|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|36->12|36->12|36->12|38->14|38->14|38->14|39->15|39->15|39->15|40->16|40->16|40->16|41->17|41->17|41->17|44->20|44->20|45->21|45->21|45->21|45->21|46->22|46->22|46->22|47->23|47->23|47->23|48->24|48->24|48->24
                  -- GENERATED --
              */
          