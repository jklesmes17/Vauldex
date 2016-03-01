
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
    <title>"""),_display_(/*7.13*/title),format.raw/*7.18*/("""</title>
      <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.57*/routes/*8.63*/.Assets.at("images/favicon.png")),format.raw/*8.95*/("""">
      <link rel="stylesheet" media="screen" href=""""),_display_(/*9.52*/routes/*9.58*/.WebJarAssets.at(WebJarAssets.locate("foundation.min.css"))),format.raw/*9.117*/("""">
      <link rel="stylesheet" media="screen" href=""""),_display_(/*10.52*/routes/*10.58*/.WebJarAssets.at(WebJarAssets.locate("foundation-flex.css"))),format.raw/*10.118*/("""">
      <link rel="stylesheet" media="screen" href=""""),_display_(/*11.52*/routes/*11.58*/.WebJarAssets.at(WebJarAssets.locate("font-awesome.css"))),format.raw/*11.115*/("""">
      <link rel="stylesheet" media="screen" href=""""),_display_(/*12.52*/routes/*12.58*/.Assets.at("stylesheets/main.css")),format.raw/*12.92*/("""">

      <script src=""""),_display_(/*14.21*/routes/*14.27*/.WebJarAssets.at(WebJarAssets.locate("jquery.min.js"))),format.raw/*14.81*/(""""></script>
      <script src=""""),_display_(/*15.21*/routes/*15.27*/.WebJarAssets.at(WebJarAssets.locate("underscore.js"))),format.raw/*15.81*/(""""></script>
      <script src=""""),_display_(/*16.21*/routes/*16.27*/.WebJarAssets.at(WebJarAssets.locate("backbone.js"))),format.raw/*16.79*/(""""></script>
      <script src=""""),_display_(/*17.21*/routes/*17.27*/.WebJarAssets.at(WebJarAssets.locate("moment.min.js"))),format.raw/*17.81*/(""""></script>
  </head>
  <body>
    """),_display_(/*20.6*/content),format.raw/*20.13*/("""
    """),format.raw/*21.5*/("""<script src=""""),_display_(/*21.19*/routes/*21.25*/.WebJarAssets.at(WebJarAssets.locate("foundation.core.js"))),format.raw/*21.84*/(""""></script>
    <script src=""""),_display_(/*22.19*/routes/*22.25*/.WebJarAssets.at(WebJarAssets.locate("foundation.min.js"))),format.raw/*22.83*/(""""></script>
    <script src=""""),_display_(/*23.19*/routes/*23.25*/.WebJarAssets.at(WebJarAssets.locate("foundation.reveal.js"))),format.raw/*23.86*/(""""></script>
    <script src=""""),_display_(/*24.19*/routes/*24.25*/.Assets.at("javascripts/main.js")),format.raw/*24.58*/(""""></script>
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
                  DATE: Tue Mar 01 13:18:18 PHT 2016
                  SOURCE: /Users/fixerinit2/Projects/Vauldex/app/views/main.scala.html
                  HASH: c2db6f1729125cafa4735979f76ecf6bc095e6c2
                  MATRIX: 530->1|655->31|683->33|764->88|789->93|880->158|894->164|946->196|1026->250|1040->256|1120->315|1201->369|1216->375|1298->435|1379->489|1394->495|1473->552|1554->606|1569->612|1624->646|1675->670|1690->676|1765->730|1824->762|1839->768|1914->822|1973->854|1988->860|2061->912|2120->944|2135->950|2210->1004|2272->1040|2300->1047|2332->1052|2373->1066|2388->1072|2468->1131|2525->1161|2540->1167|2619->1225|2676->1255|2691->1261|2773->1322|2830->1352|2845->1358|2899->1391
                  LINES: 20->1|25->1|27->3|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|36->12|36->12|36->12|38->14|38->14|38->14|39->15|39->15|39->15|40->16|40->16|40->16|41->17|41->17|41->17|44->20|44->20|45->21|45->21|45->21|45->21|46->22|46->22|46->22|47->23|47->23|47->23|48->24|48->24|48->24
                  -- GENERATED --
              */
          