FROM maven:3.9-eclipse-temurin-11 AS build
WORKDIR /src
COPY pom.xml .
RUN mvn -B -DskipTests dependency:go-offline
COPY src ./src
RUN mvn -B -DskipTests package

FROM payara/server-full:5.2022.5-jdk11
COPY --from=build /src/target/rh-3.0.0.war /opt/payara/deployments/rh.war
COPY docker/start-hmis.sh /opt/payara/start-hmis.sh
USER root
RUN chmod +x /opt/payara/start-hmis.sh
USER payara
ENTRYPOINT ["/opt/payara/start-hmis.sh"]
