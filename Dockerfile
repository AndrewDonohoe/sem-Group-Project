FROM amazoncorretto:17
COPY ./target/seMethodsGroupTask-4.0-SNAPSHOT-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "seMethodsGroupTask-4.0-SNAPSHOT-jar-with-dependencies.jar"]

