ThisBuild / organization := "mobi.jnkymd"
ThisBuild / scalaVersion := "2.13.4"
ThisBuild / version := "0.0.1"

lazy val root = (project in file(".")).
  settings(
    name := "s99",
    scalacOptions := Seq(
      "-Xfatal-warnings", "-deprecation", "-feature", "-unchecked", "-explaintypes",
      "-uniqid", "-Ydelambdafy:method"
    ),
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.3" % Test withSources() withJavadoc(),
      "org.scalatestplus" %% "scalacheck-1-14" % "3.2.2.0" % Test withSources() withJavadoc()
    )
  )

testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-oD")
