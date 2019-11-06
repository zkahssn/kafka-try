name := "my-kafka-test"

version := "0.1"
val kafka = "2.3.0"

libraryDependencies ++= Seq(
  "org.apache.kafka"       % "kafka-clients"        % kafka,
  "org.apache.kafka"       %% "kafka-streams-scala" % "2.3.1"
)

scalaVersion := "2.12.0"
