FROM ubuntu:latest AS build

RUN apt-get update
RUN apt-get install openjdk-17-jdk -y
COPY . .

RUN apt-get install maven -y
RUN mvn clean install -X

FROM openjdk:17-jdk-slim

EXPOSE 8080

#COPY --from=build /target/deploy_render-1.0.0.jar app.jar

WORKDIR /app

COPY --from=build /target/ssjg-0.0.1-SNAPSHOT.jar /app/ssjg-0.0.1-SNAPSHOT.jar

ENTRYPOINT [ "java", "-jar", "/app/ssjg-0.0.1-SNAPSHOT.jar" ]
