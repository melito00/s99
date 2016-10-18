name := "s99"

organization := "mobi.jnkymd"

version := "0.0.1"

scalaVersion := "2.11.8"

// "-Ydebug"
scalacOptions := Seq(
  "-Xfatal-warnings", "-deprecation", "-feature", "-unchecked", "-explaintypes",
  "-uniqid", "-Ybackend:GenBCode", "-Ydelambdafy:method", "-target:jvm-1.8"
)

val scalazVersion = "7.1.0"

jarName in assembly <<= (version) map { (version) => "S99-" + version + ".jar" }

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-java8-compat" % "0.7.0",
  "org.scalatest" %% "scalatest" % "3.0.0"
//  "org.scalacheck" %% "scalacheck" % "1.12.5"

//  "org.scalaz" %% "scalaz-core" % scalazVersion,
//  "org.scalaz" %% "scalaz-effect" % scalazVersion,
//  "org.scalaz" %% "scalaz-typelevel" % scalazVersion,
//  "org.scalaz" %% "scalaz-scalacheck-binding" % scalazVersion % "test",

//  "org.slf4j" % "slf4j-api" % "1.7.7",
//  "org.slf4j" % "slf4j-simple" % "1.7.7",

//  "net.databinder.dispatch" %% "dispatch-core" % "0.11.2",
//  "io.spray" %%  "spray-json" % "1.2.6",
//  "info.folone" %% "poi-scala" % "0.9",
//  "org.scalafx" %% "scalafx" % "1.0.0-R8",
//  "com.github.scala-incubator.io" %% "scala-io-core" % "0.4.2",
//  "com.github.scala-incubator.io" %% "scala-io-file" % "0.4.2"

)

initialCommands := "import mobi.jnkymd.s99._"

initialCommands in console := "import scalaz._, Scalaz._, org.scalatest._"

unmanagedJars in Compile +=
  Attributed.blank(
    file(scala.util.Properties.javaHome) / "/lib/jfxrt.jar")

testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-oD")
