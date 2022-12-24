package com.cursor.cursor;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class HwKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HwKafkaApplication.class, args);
	}


}
