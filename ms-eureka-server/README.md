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
# What's a client server? See other microservices (ms-producer, ms-consumer etc).
eureka.client.register-with-eureka=false
eureka.client.fetch-registry=false
````
