FROM openjdk:17
EXPOSE 8080
ADD target/spring-docker-example.jar spring-docker-example.jar
ENTRYPOINT ["java","-jar", "spring-docker-example.jar"]