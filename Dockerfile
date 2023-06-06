FROM openjdk:17
COPY target/*.jar nadetdev-spring-cloud-app.jar
ENTRYPOINT ["java", "-jar", "nadetdev-spring-cloud-app.jar"]