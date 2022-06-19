FROM openjdk:8
COPY . /src/java
WORKDIR /src/java
RUN  ["javac", "Main"]
ENTRYPOINT ["java", "Main"]