package com.sumit.msconsumer.configurations;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

	@Bean
	//@Loadbalanced is used to client side load balancing,
	//as Producer endpoints are not required to be hard coded
	@LoadBalanced 
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
