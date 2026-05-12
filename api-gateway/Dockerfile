FROM gradle:8.4.3-jdk17 AS builder
WORKDIR /home/app
COPY . /home/app
RUN gradle :api-gateway:bootJar --no-daemon -x test

FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
COPY --from=builder /home/app/api-gateway/build/libs/api-gateway.jar app.jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
