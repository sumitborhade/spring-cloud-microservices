package com.sumit.msproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProducerApplication.class, args);
	}

}