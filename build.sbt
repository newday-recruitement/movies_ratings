name := "movies_ratings"

version := "1.0"

scalaVersion := "2.11.12"

val sparkVersion = "2.4.4"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.scalatest" %% "scalatest" % "3.0.1",
  "com.holdenkarau" %% "spark-testing-base" % "2.3.1_0.10.0" % "test",
  "org.apache.spark" %% "spark-hive" % "2.0.0"
)