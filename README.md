# onion (Work-In-Progress)

A sample project showcasing the Onion Architecture

## Definition


## Some learning points
- Setting up a multi-module java spring project
    - Alot of pain configuring pom.xml files
    - @EnableAutoConfiguration only searches for components/entities/repos in the same package/module, if you are using 
      a multi-module app, you need to specify where to look e.g. with @EntityScan and @EnableJpaRepositories
- Spring Data only initializes interface beans which extend some Repository class or one of its sub interfaces [link here](https://docs.spring.io/spring-data/jpa/docs/1.6.0.RELEASE/reference/html/repositories.html) under section 1.2.3 Creating repository instances
    


Feel free to leave any suggestions to improve my onion :(
