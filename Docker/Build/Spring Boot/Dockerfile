FROM maven:alpine AS maven

RUN mkdir /code
WORKDIR /code
COPY . .
RUN mvn clean install

FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY --from=maven /code/target/*.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]