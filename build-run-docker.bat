docker build -t springboot_microservices_postgres -f Dockerfile.postgresdb .
docker run -d -p 5432:5432 springboot_microservices_postgres

docker build -t springboot_microservices_rabbitmq -f Dockerfile.rabbitmq .
docker run -d -p 5672:5672 springboot_microservices_rabbitmq

docker build -t springboot_microservices_zipkin -f Dockerfile.zipkin .
docker run -d -p 9411:9411 springboot_microservices_zipkin
