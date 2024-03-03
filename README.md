## Version

3.2.3 (release 2024-02-22) and 2023.0.0 (release 2023-12-06 )

- Spring Version: 3.2.3
- Java Version: 21
- Spring Boot Starter Parent: 3.2.3
- Spring Cloud Version: 2023.0.0 from ([Spring Cloud Website](https://spring.io/projects/spring-cloud))


## API-Gateway

For the API-Gateway application, use port 9191.

- Cors https://cloud.spring.io/spring-cloud-gateway/multi/multi__cors_configuration.html

### Without Locator

- GET [http://localhost:9191/api/employees/1](http://localhost:9191/api/employees/1)
- GET [http://localhost:9191/api/departments/IT001](http://localhost:9191/api/departments/IT001)

### With Locator Enabled

- GET [http://localhost:9191/employee-service/api/employees/1](http://localhost:9191/employee-service/api/employees/1)
- GET [http://localhost:9191/department-service/api/departments/IT001](http://localhost:9191/department-service/api/departments/IT001)

## Department-Service

For the Department-Service application, use port 8080, and for its instances, use ports 8082 and 8083.

- java -jar -Dserver.port=8082 target/department-service-0.0.1-SNAPSHOT.jar
- java -jar -Dserver.port=8083 target/department-service-0.0.1-SNAPSHOT.jar

### Endpoints

- GET [http://localhost:8080/api/departments/IT001](http://localhost:8080/api/departments/IT001)
- GET [http://localhost:8080/message](http://localhost:8080/message)
- POST [http://localhost:8080/actuator/busrefresh](http://localhost:8080/actuator/busrefresh)
- POST [http://localhost:8080/actuator/refresh](http://localhost:8080/actuator/refresh)
- GET [http://localhost:8080/actuator/info](http://localhost:8080/actuator/info)
- POST [http://localhost:8080/api/departments](http://localhost:8080/api/departments)
    - Content-Type: application/json
    - Body:
      ```json
      {
        "id": 1,
        "departmentName": "IT",
        "departmentDescription": "Information Technology",
        "departmentCode": "IT001"
      }
      ```
- Swagger http://localhost:8080/swagger-ui/index.html#/

## Employee-Service

For the Employee-Service application, use port 8081.

### Endpoints

- GET [http://localhost:8081/users/message](http://localhost:8081/users/message)
- GET [http://localhost:8081/api/employees/1](http://localhost:8081/api/employees/1)
- POST [http://localhost:8081/api/employees](http://localhost:8081/api/employees)
    - Content-Type: application/json
    - Body:
      ```json
      {
        "id": 0,
        "firstName": "Jens",
        "lastName": "Grote",
        "email": "mail@example.com",
        "departmentCode": "IT001",
        "organizationCode" : "Inosofttech_ORG" 
      }
      ```

## Config-Server

For the Config-Server application, use port 8888.

### Properties Configuration

- [Config Repository Link](https://github.com/devJGrote/project-springboot-microservices-config-server-repo/tree/main)

## Service-Registry

For the Service-Registry application, use port 8761.

- [http://localhost:8761/](http://localhost:8761/)

## Organization-Service

For the Organization-Service application, use port 8083.

### Endpoints

- GET [http://localhost:8083/api/organizations/Inosofttech_RG](http://localhost:8083/api/organizations/Inosofttech_RG)
- POST [http://localhost:8083/api/organizations](http://localhost:8083/api/organizations)
    - Content-Type: application/json
    - Body:
      ```json
      {
        "organizationName": "Inosofttech",
        "organizationDescription": "Innovation Software Technology",
        "organizationCode": "Inosofttech_ORG"
      }
      ```

## React-Frontend

For the React-Frontend application, use port 3000.

- http://localhost:3000/

- Latest LTS Version: 20.11.1 (includes npm 10.2.4) https://nodejs.org/en/download
- https://create-react-app.dev/docs/getting-started
-  npx create-react-app react-frontend

   cd my-app

   npm start

- npm start
Starts the development server.

- npm run build
Bundles the app into static files for production.

- npm test
Starts the test runner.

- npm run eject
Removes this tool and copies build dependencies, configuration files
and scripts into the app directory. If you do this, you can’t go back!


- install material ui
npm install @mui/material @emotion/react @emotion/styled

-install roboto font

npm install @fontsource/roboto

import '@fontsource/roboto/300.css';
import '@fontsource/roboto/400.css';
import '@fontsource/roboto/500.css';
import '@fontsource/roboto/700.css';

<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
<link
  rel="stylesheet"
  href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700&display=swap"
/>

- install icons 
npm install @mui/icons-material
<link
  rel="stylesheet"
  href="https://fonts.googleapis.com/icon?family=Material+Icons"
/>

- install axios
npm install axios --save

- install in visual studio code
"Reactjs code snippets"

- rcc→	class component skeleton
- rrc→	class component skeleton with react-redux connect
- rrdc→	class component skeleton with react-redux connect and dispatch
- rccp→	class component skeleton with prop types after the class
- rcjc→	class component skeleton without import and default export lines
- rcfc→	class component skeleton that contains all the lifecycle methods
- rwwd→	class component without import statements
- rpc→	class pure component skeleton with prop types after the class

## Zipkin Server

Zipkin Server uses the default port 9411.

- [Zipkin URL](http://127.0.0.1:9411/)

## Database Postgres

Postgres Server uses the default port 5432.

- Create via Docker

## Project Dependencies

- Spring Web
- Spring Data JPA
- PostgreSQL Driver
- Lombok
