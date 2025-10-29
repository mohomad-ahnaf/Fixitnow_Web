FROM openjdk:17-alpine
WORKDIR /app

# Copy the built JAR file
COPY target/*.jar app.jar

# Expose port
EXPOSE 8090

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]