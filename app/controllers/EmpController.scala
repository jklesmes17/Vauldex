package controllers

import javax.inject.Inject
import java.io.File
import java.time.{ZoneId, LocalDate, LocalDateTime}
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

import play.api._
import play.api.mvc._
import play.api.i18n._

import models._

class EmpController @Inject() (
  val messagesApi: MessagesApi
) extends Controller with I18nSupport {

  def empHome = Action { implicit request =>
    Ok(views.html.employee.empIndex("Your new application is ready."))
  }
}
