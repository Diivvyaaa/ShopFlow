FROM eclipse-temurin:17-jdk-jammy AS build
WORKDIR /workspace/app

# Copy maven executable and pom
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .

# Build all dependencies
RUN ./mvnw dependency:go-offline

# Copy source and build
COPY src src
RUN ./mvnw clean package -DskipTests

# Production image
FROM eclipse-temurin:17-jre-jammy
VOLUME /tmp
WORKDIR /app
COPY --from=build /workspace/app/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]
