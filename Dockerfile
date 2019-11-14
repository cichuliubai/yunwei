FROM openjdk:8-jdk-alpine
COPY yunwei-test-0.0.1-SNAPSHOT.jar yunwei-test-0.0.1-SNAPSHOT.jar
CMD java -jar yunwei-test-0.0.1-SNAPSHOT.jar
