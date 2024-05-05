FROM openjdk:17
WORKDIR /appContainer
COPY ./target/jenkins-docker.jar /appContainer
EXPOSE 8282
CMD ["java","-jar","jenkins-docker.jar"]