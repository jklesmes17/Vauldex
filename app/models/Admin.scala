package models

case class Admin (
  username: String,
  password: String,
  optId: Option[Int]
) { val id = optId.getOrElse(0) }
