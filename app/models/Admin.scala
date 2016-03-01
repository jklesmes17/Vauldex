package models

case class Admin (
  username: String,
  password: String,
  fname: String,
  lname: String,
  optId: Option[Int]
) { val id = optId.getOrElse(0) }
