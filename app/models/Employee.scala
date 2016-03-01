package models

case class Employee (
  username: String,
  password: String,
  fname: String,
  lname: String,
  mname: String,
  tin: String,
  sss: String,
  pagibig: String,
  macAddr: String,
  ratePerHour: Int,
  optId: Option[Int]
) { def id = optId.getOrElse(0) }
