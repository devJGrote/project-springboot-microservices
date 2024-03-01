docker build -t springboot_microservices_postgres .
docker run -d -p 5432:5432 springboot_microservices_postgres