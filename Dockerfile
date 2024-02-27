FROM openjdk:8-jre-alpine

MAINTAINER robsonoduarte

RUN apk add --update bash && rm -rf /var/cache/apk/*
RUN apk add curl jq

WORKDIR /usr/share/dealsAutomation


ADD target/selenium-docker.jar             selenium-docker.jar
ADD target/selenium-docker-tests.jar       selenium-docker-tests.jar
ADD target/libs                            libs
ADD src/main/resources                     src/main/resources
ADD pom.xml                                pom.xml
ADD healthcheck.sh                         healthcheck.sh



ENTRYPOINT sh healthcheck.sh