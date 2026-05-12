FROM gradle:8.4.3-jdk17 AS builder
WORKDIR /home/app
COPY . /home/app
RUN gradle :bff:bootJar --no-daemon -x test

FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
COPY --from=builder /home/app/bff/build/libs/bff.jar app.jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
