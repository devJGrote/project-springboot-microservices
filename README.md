Spring Version 3.1.9
Java 17

<artifactId>spring-boot-starter-parent</artifactId>
<version>3.1.9</version>

<spring-cloud.version>2022.0.5</spring-cloud.version>


https://spring.io/projects/spring-cloud
2022.0.x aka Kilburn	3.0.x, 3.1.x (Starting with 2022.0.3)



For the API-Gateway application, use the 9191 port.

For the Department-Service application, use the 8080 port and for its instance, use port 8082
java -jar -Dserver.port=8082 target/department-service-0.0.1-SNAPSHOT.jar
java -jar -Dserver.port=8083 target/department-service-0.0.1-SNAPSHOT.jar

For the Employee-Service application, use the 8081 port.

For the Config-Server application, use the 8888 port.

For the Service-Registry application, use the 8761 port.
http://localhost:8761/

For the Organization-Service application, use the 8083 port.

For the React-Frontend application, use the 3000 port.

Zipkin Server uses the default port 94
