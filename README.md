# Spring Cloud for building Microservices
This code repository was created by following the steps mentioned by [OMAR ELGABRY](https://medium.com/omarelgabrys-blog/microservices-with-spring-boot-creating-our-microserivces-gateway-part-2-31f8aa6b215b) <br>
Special Thank you to him.

## Eureka Server:
This server is implemented by following below-
1. Adding Spring-boot-starter-web and Eureka-Server dependencies
2. Marking @EnableEurekaServer annotation on main class
3. Adding below code in application.properties 
```
# Give a name to the eureka server
spring.application.name=eureka-server

# default port for eureka server
server.port=8761

# eureka by default will register itself as a client. So, we need to set it to false.
# What's a client server? See other microservices (image, gallery, auth, etc).
eureka.client.register-with-eureka=false
eureka.client.fetch-registry=false
````

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