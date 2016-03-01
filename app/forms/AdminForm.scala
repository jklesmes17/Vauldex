package forms

import play.api._
import play.api.mvc._
import play.api.data.Form
import play.api.data.Forms._

import models._

object AdminForm {
  val default = Form(tuple(
    "username" -> nonEmptyText,
    "password" -> nonEmptyText
  ))
}
