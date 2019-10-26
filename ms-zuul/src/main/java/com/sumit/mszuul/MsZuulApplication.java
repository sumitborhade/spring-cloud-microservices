package com.sumit.mszuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
//Enable Zuul
@EnableZuulProxy 
public class MsZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsZuulApplication.class, args);
	}

}