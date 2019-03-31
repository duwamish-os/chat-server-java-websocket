name := "introv-ws"

version := "0.1"

scalaVersion := "2.12.8"

enablePlugins(JettyPlugin)

libraryDependencies += "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided"
libraryDependencies += "javax.websocket" % "javax.websocket-api" % "1.1" % "provided"
