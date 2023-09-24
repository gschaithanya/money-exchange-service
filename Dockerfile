# Dockerfile

# Use Azul Zulu OpenJDK 11 JRE as the base image
FROM azul/zulu-openjdk-alpine:11-jre

MAINTAINER Chaitanya <chaithanyags93@gmai.com>
# Set the working directory in the container
WORKDIR /opt/app

# Copy the JAR file from your local build context into the container
COPY target/money-exchange-service-0.0.1-SNAPSHOT.jar /opt/app/

# Expose the port that your Spring Boot application listens on
EXPOSE 8080

# Define the command to run your Spring Boot application
CMD ["java", "-jar", "money-exchange-service-0.0.1-SNAPSHOT.jar"]
