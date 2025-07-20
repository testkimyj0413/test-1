FROM openjdk:17
COPY ./build/libs/test-1-0.0.1-SNAPSHOT.jar /usr/src/myapp/test-1.jar
ENTRYPOINT ["java",  "-jar","/usr/src/myapp/test-1.jar"]
EXPOSE 8080
WORKDIR /usr/src/myapp