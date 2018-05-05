package com.testkafka.testkafkaconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

public class KafkaConsumerListener {

	public static Logger logger = LoggerFactory.getLogger(KafkaConsumerListener.class);
    /**
     * 监听test主题,有消息就读取
     * @param message
     */
    @KafkaListener(topics = {"test"})
    public void consumer(String message){
		logger.info("test topic message : {}", message);
    }
}
