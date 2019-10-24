## Microservice Producer:
This microservice is written by following-
1. Adding Spring-boot-starter-web and Eureka-Client dependencies
2. Marking @EnableEurekaClient annotation on main class
3. Adding below code in application.properties 
```
# serivce name
spring.application.name=ms-producer
# port
server.port=8200
# eureka server url
eureka.client.service-url.default-zone=http://localhost:8761/eureka
```