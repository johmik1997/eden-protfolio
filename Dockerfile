# ------------ Stage 1: Build ------------
FROM maven:3.8.5-openjdk-17 AS build

WORKDIR /app
COPY . .

RUN mvn clean package -DskipTests

# ------------ Stage 2: Run ------------
FROM openjdk:17-jdk-slim

WORKDIR /app

# Copy the JAR file from the previous stage
COPY --from=build /firstProject/target/*.jar firstProject.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
