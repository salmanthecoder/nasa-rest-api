FROM maven:3.6.3-jdk-8
WORKDIR /usr/src/java-code
COPY . /usr/src/java-code/
RUN mvn package

WORKDIR /usr/src/java-app
RUN cp /usr/src/java-code/target/*.jar ./app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
