
FROM maven:3.6.3-jdk-8

COPY . .

RUN mvn clean install

WORKDIR .

COPY target/consume-rest-0.0.1-SNAPSHOT.jar consume-rest-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD java -jar consume-rest-0.0.1-SNAPSHOT.jar
