FROM openjdk:11

ADD ./target/WebSocketApplication-0.0.1-SNAPSHOT.jar /event/src/WebSocketApplication-0.0.1-SNAPSHOT.jar
EXPOSE 9093
WORKDIR event/src
ENTRYPOINT ["java","-jar","WebSocketApplication-0.0.1-SNAPSHOT.jar"]
