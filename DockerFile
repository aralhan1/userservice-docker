FROM openjdk:8u212-jdk-slim

MAINTAINER Abhishek

EXPOSE 8080

#install Spring Boot artifact
RUN mkdir /srv/demo

COPY target/userservice-0.0.1-SNAPSHOT.jar /srv/demo/user-service.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/srv/demo/user-service.jar"]