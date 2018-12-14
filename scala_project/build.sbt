ThisBuild / scalaVersion := "2.10.4"

ThisBuild / organization := "com.travis"

lazy val travis = (project in file("."))
.settings(
  name := "Travis",
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test,
)
