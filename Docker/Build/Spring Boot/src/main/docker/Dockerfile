FROM frolvlad/alpine-oraclejdk8

ENV SLEEP 3

ADD *.jar /app.jar

RUN sh -c 'touch /app.jar'

VOLUME /tmp

EXPOSE 8443

CMD echo "The application will start in ${SLEEP}s..." && \
    sleep ${SLEEP} && \
    java -Djava.security.egd=file:/dev/./urandom -jar /app.jar --spring.profiles.active=prod
