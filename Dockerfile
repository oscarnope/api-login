# Build Stage
FROM maven:3.6.1-jdk-8 AS builder
WORKDIR /LoginService
COPY pom.xml .
COPY ./src ./src
RUN mvn clean package

# Run Stage
FROM openjdk:8u201-jdk-alpine3.9
LABEL maintainer="Oscar Alexander Nope Saavedra - german.suarez@javeriana.edu.co"
WORKDIR WORKSPACE /LoginService
COPY --from=builder /LoginService/target/login-service-thorntail.jar .
ENTRYPOINT java -Djava.net.preferIPv4Stack=true -jar login-service-thorntail.jar