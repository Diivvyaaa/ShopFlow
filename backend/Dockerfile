FROM maven:3.9-eclipse-temurin-25 AS build
WORKDIR /workspace/app

COPY pom.xml .
RUN mvn dependency:go-offline

COPY src src
RUN mvn clean package -DskipTests

FROM eclipse-temurin:25-jre-jammy
VOLUME /tmp
WORKDIR /app
COPY --from=build /workspace/app/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]
