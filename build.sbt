name := "my-kafka-test"

version := "0.1"
val kafka = "2.3.0"

libraryDependencies ++= Seq(
  "org.apache.kafka"       % "kafka-clients"        % kafka,
  "org.scala-lang.modules" %% "scala-java8-compat"  % "0.9.0",
  "org.apache.kafka"       %% "kafka-streams-scala" % "2.3.1"
)

scalaVersion := "2.12.0"
