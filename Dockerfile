FROM openjdk:17
LABEL maintainer="Akinyemi samuel"
WORKDIR /app
COPY target/spring-boot-training.jar /app
ENTRYPOINT["java", "-jar", "/app/spring-boot-training.jar"]
EXPOSE 8000