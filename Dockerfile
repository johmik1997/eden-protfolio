# -------- Stage 1: Build --------
FROM maven:3.8.5-openjdk-24 AS build

# Set working directory inside container
WORKDIR /app

# Copy only the necessary files first for better caching
COPY pom.xml .
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests

# -------- Stage 2: Run --------
FROM openjdk:24-slim

# Set working directory inside container
WORKDIR /app

# Copy the jar from the previous stage
COPY --from=build /app/target/*.jar app.jar

# Expose port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
