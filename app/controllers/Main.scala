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
import models.dao._
import utils._
import forms._

class Main @Inject() (
  val messagesApi: MessagesApi,
  val amanager: AdminManager,
  val emanager: EmployeeManager
) extends Controller with I18nSupport {

  def index = Action { implicit request =>
    Ok(views.html.index("Your new application is ready.", EmployeeForm.loginForm))
  }
  def adminLogin = Action { implicit request =>
    Ok(views.html.admin.login("Admin Login", AdminForm.default))
  }
  def adminLoginSubmit = Action { implicit request =>
    AdminForm.default.bindFromRequest.fold (
      formWithErrors => BadRequest(views.html.admin.login("Login Error", formWithErrors)),
      { case (user, pass) =>
          val isLogin = amanager.login(user, pass)
          isLogin.username.isEmpty match {
            case true  => InternalServerError
            case false => Redirect(routes.Main.adminHome).
              withSession("idAdmin" -> isLogin.id.toString)
          }
      }
    )
  }
  def adminHome = Action { implicit request =>
    Ok(views.html.admin.home("Welcome to Admin Dashboard", EmployeeForm.default, emanager.all))
  }
  def employeeSubmit = Action { implicit request =>
    EmployeeForm.default.bindFromRequest.fold (
      formWithErrors => BadRequest(
        views.html.admin.home("Employee Form Error", formWithErrors, emanager.all)),
      employee => emanager.insert(employee) match {
        case true => Ok("Success")
        case false => Ok("Not")
      }
    )
  }
  def employeeLoginSubmit = Action { implicit request =>
    EmployeeForm.loginForm.bindFromRequest.fold (
      formWithErrors => BadRequest(views.html.index("Employee Login Error", formWithErrors)),
      { case (username, password) =>
        val isLogin = emanager.login(username, password)
        isLogin.username.isEmpty match {
          case true  => InternalServerError
          case false => Redirect(routes.Main.employeeHome)
            .withSession("idEmployee" -> isLogin.id.toString)
        }
      }
    )
  }
  def employeeHome = Action { implicit request =>
    Ok(views.html.home("Welcome to Employee Dashboard"))
  }
}
