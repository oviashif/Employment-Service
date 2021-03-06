import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "Employment Service"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      // Add your project dependencies here,
      "org.hibernate" % "hibernate-entitymanager" % "4.1.1.Final",
      "mysql" % "mysql-connector-java" % "5.1.24"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      // Add your own project settings here
      ebeanEnabled := false
    )

}
