## Zuul (Proxy Gateway):
Netfix Zuul is used as a Proxy Gateway to redirect the request made for a particular microservice. 
It looks up the URL, finds the microservice name (group of services performing same task) and redirects it to one of the nodes.

The code is written by following-
1. Adding Spring-boot-starter-web, Eureka-Client, Zuul dependencies
2. Adding @EnableEurekaClient and @EnableZuulProxy annotations on main class
3. Adding below code in application.properties 
```
# serivce name
spring.application.name=ms-zuul
# port
server.port=8762
# eureka server url
eureka.client.service-url.default-zone=http://localhost:8761/eureka

# A prefix that can added to beginning of all requests. 
#zuul.prefix=/api

# Disable accessing services using service name (i.e. ms-consumer).
# They should be only accessed through the path defined below.
zuul.ignored-services=*

# Map paths to services 
#For Producer service
zuul.routes.producer.path=/producer/**
zuul.routes.producer.service-id=ms-producer

#For Consumer service
zuul.routes.consumer.path=/consumer/**
zuul.routes.consumer.service-id=ms-consumer

```