# Spring Cloud Gateway

## Test route using actuator :

https://cloud.spring.io/spring-cloud-gateway/multi/multi__actuator_api.html

> curl http://localhost:8000/actuator/

> curl http://localhost:8000/actuator/gateway/routes

> curl http://localhost:8000/actuator/gateway/routes/{id}


Access Micro user app :

> curl -s -D - http://localhost:8000/micro-user/users