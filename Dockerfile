FROM openjdk:11
ADD target/demo-0.0.1-SNAPSHOT.jar demo-sesion07.jar
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "demo-sesion07.jar"]