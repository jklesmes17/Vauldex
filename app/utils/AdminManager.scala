package utils

import javax.inject.Inject
import scala.concurrent.duration._
import scala.concurrent.Await
import scala.concurrent.ExecutionContext.Implicits.global

import models.Admin
import models.dao.Admins

class AdminManager @Inject() (
  val admins: Admins
) {

  def login(username: String, password: String) = Await.result (
    admins.login(username, password) map {
      case Some(log) => log
      case None      => Admin("","","","",None)
  }, 5 seconds)
}
