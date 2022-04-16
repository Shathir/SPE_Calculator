FROM openjdk:8
MAINTAINER shathir984  Shathir.Hussain@iiitb.ac.in
COPY ./target/Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]
