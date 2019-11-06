#!/bin/sh
assigned_ip=$(hostname -I | awk '{print $2}')
if [ -z "$assigned_ip" ]
then
  assigned_ip="localhost"
fi

echo "assigned ip address: $assigned_ip"
exec bin/kafka-server-start.sh config/server.properties \
  --override advertised.host.name=$assigned_ip \
  --override advertised.port=$KAFKA_ADVERTISED_PORT \
  --override zookeeper.connect=$KAFKA_ZOOKEEPER_CONNECTION