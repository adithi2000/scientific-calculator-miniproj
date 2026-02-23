FROM eclipse-temurin:17-jdk


WORKDIR /app


COPY target/scientific-calculator-1.0-SNAPSHOT.jar app.jar


#CMD ["java", "-jar", "app.jar"]
#when you run it as a cmd, and give docker run scientific-calculator sqrt 25, it fails ad takes it as a shell or bash command
#Using Entrypoint everytime fixes that. 
ENTRYPOINT ["java","-jar","app.jar"]



