name := """trying-akka-remote"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  specs2 % Test,
  "com.typesafe.akka" %% "akka-remote" % "2.3.7"

)


resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
resolvers += "Typesafe Snapshots" at "http://repo.typesafe.com/typesafe/snapshots/"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

unmanagedBase := baseDirectory.value / "lib"
