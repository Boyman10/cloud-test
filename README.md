CLOUD TEST - MICRO SERVICES & SPRING
------------------------------------

- jdk11
- jdk 16 coming up

- Keycloak as user resource / authentication
- Own git repo for storing services configuration parameters

- Angular App for front end

Be careful when upgrading version of Spring boot & Spring Cloud. They should be compatible with each other. Make sure to
load the proper repositories as well [see here](https://www.baeldung.com/spring-maven-repository).

# Frontend Client

See [Cloud Test Cli repository](https://github.com/Boyman10/cloud-test-cli) for more details.

# Start the services

1. start keycloak service

> docker run -p 8080:8080 -e KEYCLOAK_USER=admin -e KEYCLOAK_PASSWORD=admin quay.io/keycloak/keycloak:12.0.2

Or alternatively :

Use docker compose to use it along with postgres for production.

**Keycloak adapter for development :**

We use TEST realm and micro-app client

Check the technical module for more details (application.yml).

2. Start config repo (mandatory for spring-config)

   Using docker-compose

2. Start Spring config service

   ./mvnw spring-boot:run -pl spring-config

   run on port 8888

3. Start Eureka service

   ./mvnw spring-boot:run -pl eureka

   http://localhost:8761


4. Start gateway spring service

   ./mvnw spring-boot:run -pl gateway run on port 8000


5. Start micro user DB (docker-compose)

6. Start micro user service

   ./mvnw spring-boot:run -pl micro-user run on port 9001

   http://localhost:9001/actuator

7. Start spring admin interface
