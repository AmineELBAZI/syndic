FROM openjdk:17
EXPOSE 8080
ADD target/syndic.jar syndic.jar
ENTRYPOINT ["java", "-jar", "/syndic.jar"]