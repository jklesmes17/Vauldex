package utils

import play.api._
import play.api.mvc._
import play.api.data.Form
import play.api.data.Forms._

import models._

object EmployeeForm {
  val default = Form(mapping(
    "username"    -> nonEmptyText,
    "password"    -> nonEmptyText,
    "fname"       -> nonEmptyText,
    "lname"       -> nonEmptyText,
    "mname"       -> nonEmptyText,
    "tin"         -> text,
    "sss"         -> text,
    "pagibig"     -> text,
    "ratePerHour" -> number,
    "optId"       -> optional(number)
  )(Employee.apply)(Employee.unapply))
  val loginForm = Form(tuple(
    "username"    -> nonEmptyText,
    "password"    -> nonEmptyText
  ))
}
