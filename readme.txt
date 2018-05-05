#zookeeper-server-start.bat config/zookeeper.properties
kafka-server-start.bat config/server.properties
kafka-topics.bat --create --zookeeper 192.168.100.21:2181 --replication-factor 1 --partitions 1 --topic test
kafka-topics.bat --list --zookeeper 192.168.100.21:2181

kafka-console-producer.bat --broker-list localhost:9092 --topic test

This is a message
This is another message

kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic test --from-beginning


https://blog.csdn.net/zhang_zha_zha/article/details/75041047