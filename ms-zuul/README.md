## Microservice Consumer:
This microservice is written by following-
1. Adding Spring-boot-starter-web and Eureka-Client dependencies
2. Marking @EnableEurekaClient annotation on main class
3. Created RestTemplate in RestTemplateConfig with @LoadBalanced for client side load balancing
```
@Bean
//@Loadbalanced is used to client side load balancing,
//as Producer endpoints are not required to be hard coded
@LoadBalanced 
public RestTemplate restTemplate() {
	return new RestTemplate();
}
```

4. Adding below code in application.properties 
```
# serivce name
spring.application.name=ms-consumer
# port
server.port=8100
# eureka server url
eureka.client.service-url.default-zone=http://localhost:8761/eureka
```