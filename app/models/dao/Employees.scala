package models.dao

import javax.inject.Inject
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

import slick.profile.RelationalProfile
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}

import models.Employee


class Employees @Inject() (
  val dbConfigProvider: DatabaseConfigProvider
) extends HasDatabaseConfigProvider[RelationalProfile] {

  import slick.driver.PostgresDriver.api._

  object query extends TableQuery(new EmployeesTable(_)) {
    def filterCredentials(username: String, password: String) =
      this.filter(r => r.username === username && r.password === password)
  }

  def insert(employee: Employee): Future[Boolean] =
    db.run( (query += (employee)).map(_ > 0) )

  def all: Future[Seq[Employee]] =
    db.run( query.sortBy(_.id.desc).result )

  def login(username: String, password: String) : Future[Option[Employee]] =
    db.run(query.filterCredentials(username, password).result.headOption)

  /** Employee Table Definition */
  class EmployeesTable(tag: Tag) extends Table[Employee](tag, "EMPLOYEE") {
    def username = column[String]("USERNAME")
    def password = column[String]("PASSWORD")
    def fname = column[String]("FNAME")
    def lname = column[String]("LNAME")
    def mname = column[String]("MNAME")
    def tin = column[String]("TIN")
    def sss = column[String]("SSS")
    def pagibig = column[String]("PAGIBIG")
    def macAddr = column[String]("MAC_ADDR")
    def ratePerHour = column[Int]("RATE_PER_HOUR")
    def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)

    def * = (
      username,
      password,
      fname,
      lname,
      mname,
      tin,
      sss,
      pagibig,
      macAddr,
      ratePerHour,
      id.?
    ) <> (Employee.tupled, Employee.unapply)
  }
}
