FROM amazoncorretto:17
COPY ./target/seMethodsGroupTask-3.1-SNAPSHOT-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "seMethodsGroupTask-3.1-SNAPSHOT-jar-with-dependencies.jar"]

