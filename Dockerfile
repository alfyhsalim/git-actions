FROM maven:3.9.10-amazoncorretto-17 AS build
WORKDIR /src
COPY pom.xml .
RUN mvn -DskipTests=true dependency:go-offline
COPY src ./src
RUN mvn clean verify

FROM azul/zulu-openjdk:17-jre-headless as runtime
WORKDIR /app
COPY --from=build /src/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]