package com.enduser.enduser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class EnduserApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnduserApplication.class, args);
	}

}
