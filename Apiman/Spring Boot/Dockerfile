FROM maven:3.2.5-jdk-8u40 AS maven

RUN mkdir --parents /code
WORKDIR /code
# selectively add the POM file
ADD pom.xml .
# get all the downloads out of the way
RUN mvn verify clean --fail-never

ADD . .
RUN mvn verify

FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY --from=maven /code/target/*.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]