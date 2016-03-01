name := """vauldex-dtr"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  ws,
  "joda-time" % "joda-time" % "2.9.1",
  "org.joda" % "joda-convert" % "1.8.1",
  "org.postgresql" % "postgresql" % "9.4.1208",
  "com.typesafe.slick" %% "slick" % "3.1.1",
  "com.typesafe.play" %% "play-slick" % "1.1.1",
  "com.typesafe.play" %% "play-slick-evolutions" % "1.1.1",
  "com.github.tototoshi" %% "slick-joda-mapper" % "2.1.0",
  specs2 % Test
)

// WebJars Library Dependency
libraryDependencies ++= Seq(
   "org.webjars" %% "webjars-play" % "2.4.0-2",
   "org.webjars" % "jquery" % "2.2.1",
   "org.webjars" % "foundation" % "6.2.0",
   "org.webjars" % "underscorejs" % "1.8.3",
   "org.webjars" % "backbonejs" % "1.2.3",
   "org.webjars" % "momentjs" % "2.11.1",
   "org.webjars" % "jquery-pjax" % "1.9.5",
   "org.webjars" % "font-awesome" % "4.5.0"
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
resolvers += "Ejisan Github" at "https://ejisan.github.io/repo/"

// Sass compiler options
sassOptions in Assets ++= Seq("--compass", "-r", "compass")
sassOptions in Assets ++= Seq("--cache-location", "target/web/sass/.sass-cache")

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
