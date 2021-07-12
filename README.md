# Study-Kafka

### Project description
Project that builds an api that opens a transactional flow of reactive data, so that Apis connects with Kafka to process and receive messages. Promoting Spring Cloud Stream, Spring WebFlux and Kafka.


## Installation ##

It is necessary to install some items:
- Docker
- Java
- Maven

### Spring Cloud Stream
Spring Cloud Stream is a tool within Spring Cloud that delivers high scalability, event-driven ease, and components that abstract communication with various message brokers.


### Necessary Steps

For the optimal execution of microservices, you need to upload kafka, for that access the project's root folder, in it run the command docker compose up -d.

After running docker compose, you will access Kafdrop, a visual manager of your Kafka cluster. The address is defined in the docker-compose.yml file

If you haven't changed docker compose the address is: http://localhost:19000/


Finally we will run our reactive/native application with SpringWebFlux and Spring Native by executing the following command: docker run spring-native-demo

In Kafdrop you can create your own topics for Kafka, to run the application create the following topics: active.web-domains and web-domains, both with a partition for their most basic configuration.

### Technologies

The following technologies were used to carry out the project:
- Java 11
- Maven
- SpringBoot
- Spring Webflux
- Spring Cloud Stream
- Kafka
- Docker Compose
