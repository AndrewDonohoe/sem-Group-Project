FROM openjdk:latest
COPY ./target/seMethodsGroupTask-1.0-SNAPSHOT-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "seMethodsGroupTask-1.0-SNAPSHOT-jar-with-dependencies.jar"]