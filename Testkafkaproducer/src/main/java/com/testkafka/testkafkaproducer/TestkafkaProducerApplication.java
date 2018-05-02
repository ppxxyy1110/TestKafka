package com.testkafka.testkafkaproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestkafkaProducerApplication {
	
//	@Autowired
//    private KafkaSender kafkaSender;

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(TestkafkaProducerApplication.class, args);
		KafkaSender sd = ctx.getBean(KafkaSender.class);
		sd.sendTest();
		
	}
}
