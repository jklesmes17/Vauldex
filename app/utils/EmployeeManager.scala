package utils

import javax.inject.Inject
import scala.concurrent.duration._
import scala.concurrent.Await
import scala.concurrent.ExecutionContext.Implicits.global

import models.Employee
import models.dao.Employees

class EmployeeManager @Inject() (
  val employees: Employees
) {
  def insert(employee: Employee) = Await.result (employees.insert(employee), 5 seconds)

  def all = Await.result ( employees.all, 5 seconds )

  def login(username: String, password: String) = Await.result(
    employees.login(username, password), 5 seconds )
}
