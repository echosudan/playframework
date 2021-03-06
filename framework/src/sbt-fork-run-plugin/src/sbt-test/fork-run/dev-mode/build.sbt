//
// Copyright (C) 2009-2016 Typesafe Inc. <http://www.typesafe.com>
//

lazy val root = (project in file(".")).enablePlugins(PlayScala)

DevModeBuild.settings

fork in run := true

// This actually doesn't do anything, since the build runs in a forked sbt server which doesn't have the same
// system properties as the sbt client that forked it.
scalaVersion := Option(System.getProperty("scala.version")).getOrElse("2.11.7")
