
FROM eclipse-temurin:17-jdk-jammy
ARG JAR_FILE=target/hotel-rest-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/app.jar"]
