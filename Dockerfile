FROM openjdk:17-alpine
ADD target/primeNumberIdentifier-0.0.1-SNAPSHOT.jar primeNumberIdentifier-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","primeNumberIdentifier-0.0.1-SNAPSHOT.jar"]
