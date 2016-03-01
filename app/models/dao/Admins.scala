package models.dao

import javax.inject.Inject
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

import slick.profile.RelationalProfile
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}

import models.Admin


class Admins @Inject() (
  val dbConfigProvider: DatabaseConfigProvider
) extends HasDatabaseConfigProvider[RelationalProfile] {

  import slick.driver.PostgresDriver.api._
  val query = TableQuery[AdminsTable]

  def login(username: String, password: String): Future[Option[Admin]] = db.run (
    query.filter(r => r.username === username && r.password === password).result.headOption
  )
    /** Employee Table Definition */
  class AdminsTable(tag: Tag) extends Table[Admin](tag, "ADMIN") {
    def username = column[String]("USERNAME")
    def password = column[String]("PASSWORD")
    def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)

    def * = (
      username,
      password,
      id.?
    ) <> (Admin.tupled, Admin.unapply)
  }
}
