import scala.sys.process.Process

val theScalaVersion = "2.13.6"

lazy val root = project
  .in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .enablePlugins(ScalablyTypedConverterExternalNpmPlugin)
  .settings(
    name := "ScalaJS-Capacitor",
    version := "0.1.0",
    scalaVersion := theScalaVersion,
    scalaJSUseMainModuleInitializer := true,
    scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.ESModule) },
    libraryDependencies += "com.raquo" %%% "laminar" % "0.13.0",
    externalNpm := {
      Process("npm", baseDirectory.value).!
      baseDirectory.value
    },
    stIgnore ++= List(
      "@capacitor/android",
      "@capacitor/cli",
      "@capacitor/core"
    )
  )
