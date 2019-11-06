FROM openjdk:11-slim

RUN apt-get update && apt-get -y install --no-install-recommends curl dnsutils \
    && curl "https://www.apache.org/dist/kafka/2.2.1/kafka_2.12-2.2.1.tgz" -o kafka.tgz \
    && tar -xzf kafka.tgz \
    && rm kafka.tgz

WORKDIR "kafka_2.12-2.2.1"
ADD start.sh .
RUN chmod 755 start.sh

ENV KAFKA_ZOOKEEPER_CONNECTION="zookeeper"
ENV KAFKA_ADVERTISED_PORT="9092"

EXPOSE 9092

VOLUME /tmp/kafka-logs

ENTRYPOINT [ "./start.sh" ]