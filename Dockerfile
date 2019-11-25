FROM openjdk:8-jdk-alpine AS build

WORKDIR /app

COPY gradlew .

COPY gradle gradle

COPY build.gradle .

COPY src src

RUN ./gradlew clean build

FROM openjdk:8-jre-alpine

ARG JAR_DIR=/build/libs

COPY ${JAR_DIR}/*.jar /libs/springdemo.jar

CMD ["java","-jar","/libs/springdemo.jar"]