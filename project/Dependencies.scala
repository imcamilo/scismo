import sbt._

object Dependencies {

  val finchVersion = "0.26.0"
  val circeVersion = "0.10.1"
  val scalatestVersion = "3.0.5"
  val scaldiVersion = "0.5.8"
  val configtVersion = "1.3.2"
  val jsoupVersion = "1.8.3"

  lazy val scalaTest = "org.scalatest" %% "scalatest" % scalatestVersion
  lazy val jsoup = "org.jsoup" % "jsoup" % jsoupVersion
  lazy val finchxcore = "com.github.finagle" %% "finchx-core"  % finchVersion
  lazy val finchxcirce = "com.github.finagle" %% "finchx-circe"  % finchVersion
  lazy val circe = "io.circe" %% "circe-generic" % circeVersion
  lazy val scaldi = "org.scaldi" %% "scaldi" % scaldiVersion
  lazy val configtypesafe =  "com.typesafe" % "config" % configtVersion

}
