FROM adoptopenjdk/openjdk11:alpine-jre
EXPOSE 8082
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} c-service-1.1.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/c-service-1.1.1-SNAPSHOT.jar"]
