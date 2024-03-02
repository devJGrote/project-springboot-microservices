## Version

Spring Version 3.1.9
Java 21

<artifactId>spring-boot-starter-parent</artifactId>
<version>3.1.9</version>

<spring-cloud.version>2022.0.5</spring-cloud.version>

https://spring.io/projects/spring-cloud
2022.0.x aka Kilburn	3.0.x, 3.1.x (Starting with 2022.0.3)

## API-Gateway
For the API-Gateway application, use the 9191 port.
Without Locater
GET http://localhost:9191/api/employees/1
GET http://localhost:9191/api/departments/IT001

With Locater enabled
GET http://localhost:9191/employee-service/api/employees/1
GET http://localhost:9191/department-service/api/departments/IT001


## Department-Service 
For the Department-Service application, use the 8080 port and for its instance, use port 8082
java -jar -Dserver.port=8082 target/department-service-0.0.1-SNAPSHOT.jar
java -jar -Dserver.port=8083 target/department-service-0.0.1-SNAPSHOT.jar
GET http://localhost:8080/api/departments/IT001
GET http://localhost:8080/message
POST http://localhost:8080/actuator/busrefresh
POST http://localhost:8080/actuator/refresh
GET http://localhost:8080/actuator/info

POST http://localhost:8080/api/departments
Content-Type: application/json

{
"id": 1,
"departmentName": "IT",
"departmentDescription": "Information Technologie",
"departmentCode": "IT001"
}

## Employee-Service
For the Employee-Service application, use the 8081 port.
GET http://localhost:8081/users/message
GET http://localhost:8081/api/employees/1

POST http://localhost:8081/api/employees
Content-Type: application/json

{
"id": 0,
"firstName": "Jens",
"lastName": "Grote",
"email": "mail@example.com",
"departmentCode": "IT001"
}


## Config-Server
For the Config-Server application, use the 8888 port.

Propeties Configuration
https://github.com/devJGrote/project-springboot-microservices-config-server-repo/tree/main

## Service-Registry
For the Service-Registry application, use the 8761 port.
http://localhost:8761/

## Organization-Service
For the Organization-Service application, use the 8083 port.

## React-Frontend
For the React-Frontend application, use the 3000 port.

## Zipkin Server
Zipkin Server uses the default port 9411
Create via Docker
http://127.0.0.1:9411/ 

## Database Postgres
Postgres Server us the default port 5432
Create via Docker