name := "hello-play"

version := "1.0.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

mainClass in (Compile, run) := Some("play.server.Server")
