FROM openjdk:latest
EXPOSE 8080
COPY build/libs/demo-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java","-jar","-Ds","/app.jar"]

