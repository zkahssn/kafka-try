import java.util.Properties

import org.apache.kafka.clients.consumer.KafkaConsumer
import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord}

import scala.io.Source

object Main extends App {

  val props = new Properties();
  props.put("bootstrap.servers", "localhost:9092");
  props.put("acks", "all");
  props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
  props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
  val producer = new KafkaProducer[String, String](props);
  val consumer = new KafkaConsumer[String, String](props)

  val file  = Source.fromFile("/Users/zakiahossain/SideProjects/kafka-try/test.txt").getLines()
  file.zipWithIndex.foreach{l =>
    producer.send(new ProducerRecord[String, String]("my-test-topic", l._2.toString, l._1));
  }
  producer.close()

}

