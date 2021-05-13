TECHNICAL MODULE
----------------

Features shared libraries among micro services.

# Examples of modules

- Spring security / with configuration
- Keycloak adapter

# Dealing with technical modules

https://reflectoring.io/spring-boot-modules/
https://www.baeldung.com/spring-componentscan-vs-enableautoconfiguration

Since Spring Boot 1.2.0, we can use the @SpringBootApplication annotation, which is a combination of the three
annotations @Configuration, @EnableAutoConfiguration, and@ComponentScan with their default attributes:

@Import(KeycloakSecurityConfig.class)
worked but should find a better way => 
