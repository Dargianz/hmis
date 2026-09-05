FROM maven:3.9-eclipse-temurin-11 AS build
WORKDIR /src
COPY lims-middleware-libraries /deps/lims-middleware-libraries
RUN mvn -B -f /deps/lims-middleware-libraries/pom.xml install
COPY pom.xml .
COPY src ./src
RUN mvn -B -Dmaven.test.skip=true clean package

FROM payara/server-full:5.2022.5-jdk11
USER root
COPY --from=build /src/target/rh-3.0.0.war /opt/payara/deployments/rh.war
COPY --from=build /root/.m2/repository/com/github/hmislk/lims-middleware-libraries/1.1.4/lims-middleware-libraries-1.1.4.jar /opt/payara/appserver/glassfish/lib/
COPY docker/post-boot-commands.asadmin /opt/payara/config/post-boot-commands.asadmin
USER payara
