From openjdk:11
copy ./target/azureapp-0.0.1-SNAPSHOT.jar azureapp-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","azureapp-0.0.1-SNAPSHOT.jar"]