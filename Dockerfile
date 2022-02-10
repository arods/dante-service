FROM openjdk:11

ADD target/dante-0.0.1-SNAPSHOT.jar dante-service.jar

ENTRYPOINT ["java","-jar","dante-service.jar"]

EXPOSE 8082
