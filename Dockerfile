FROM openjdk:19-jdk-alpine
EXPOSE 8080
ADD target/jenkins-test.jar jenkins-test.jar
ENTRYPOINT ["java","-jar","/jenkins-test.jar"]