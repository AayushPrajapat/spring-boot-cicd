FROM eclipse-temurin:17-jre
# Base Image - Uses Java 17 JRE to run your Spring Boot application.

WORKDIR /app
# Creates or sets /app as the working directory inside the Docker container.

COPY target/github-actions-cicd.jar app.jar
# Copies your JAR file from the local target folder into the container as /app/app.jar.

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
# Starts your Spring Boot application.
