# Use the official PostgreSQL image from Docker Hub
FROM postgres:latest

# Environment variables to set up the database
#ENV POSTGRES_DB department_db

ENV POSTGRES_USER postgres
ENV POSTGRES_PASSWORD password

# Expose PostgreSQL port
EXPOSE 5432

# Copy the initialization script into the Docker container
COPY init.sql /docker-entrypoint-initdb.d/

# You can also add any other configurations or scripts needed for your setup
# Start PostgreSQL service
CMD ["postgres"]