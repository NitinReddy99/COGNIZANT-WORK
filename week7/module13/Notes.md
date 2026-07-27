# Module 13 - Containerization using Docker

## 1. What is Docker?

Docker is an open-source platform that allows developers to package applications and their dependencies into lightweight containers. Containers ensure applications run consistently across different environments.

---

## 2. Features of Docker

- Lightweight containers
- Fast deployment
- Easy application portability
- Efficient resource utilization
- Isolation between applications
- Version control for images

---

## 3. Basic Docker Commands

| Command | Description |
|---------|-------------|
| docker run | Create and start a container |
| docker ps | List running containers |
| docker stop | Stop a container |
| docker rm | Remove a container |
| docker images | List available images |
| docker rmi | Remove an image |
| docker pull | Download an image |
| docker exec | Execute commands inside a running container |

---

## 4. Docker Run

Common uses of docker run:

- Start a container
- Assign a custom name
- Run in detached mode (-d)
- Run interactively (-it)
- Publish ports (-p)
- Automatically remove container (--rm)

Example:

docker run -d -p 8080:80 nginx

---

## 5. Docker Images

A Docker image is a read-only template used to create containers.

### Types

- Base Image
- Parent Image
- Custom Image

### Components

- Image Layers
- Container Layer
- Docker Manifest
- Docker Registry
- Docker Repository

### Creating Docker Images

1. Interactive Method
2. Dockerfile Method

Build Command:

docker build -t myimage .

---

## 6. Docker Compose

Docker Compose is a tool for defining and running multi-container Docker applications.

### Benefits

- Manage multiple containers
- Simple YAML configuration
- Easy deployment

Common Commands

docker-compose up

docker-compose down

docker-compose build

---

## 7. Docker Engine

Docker Engine consists of:

- Docker CLI
- Docker Daemon
- REST API

Docker CLI is used to execute Docker commands.

Docker Daemon manages Docker containers and images.

---

## 8. Docker Storage

Docker supports persistent storage using volumes.

### Storage Features

- Storage Drivers
- Data Volumes
- Named Volumes
- Bind Mounts

Commands

docker volume create myvolume

docker volume ls

---

## 9. Docker Networking

Docker provides networking to allow communication between containers.

Default Networks

- Bridge
- Host
- None

Useful Commands

docker network ls

docker network inspect bridge

docker network create mynetwork

---

## 10. Container Orchestration

Container orchestration automates deployment, scaling, networking, and management of containers.

### Benefits

- Automatic deployment
- Load balancing
- High availability
- Auto scaling
- Self-healing containers

---

## 11. Kubernetes

Kubernetes is the most popular container orchestration platform.

Features

- Automatic scheduling
- Scaling
- Load balancing
- Rolling updates
- Self-healing

---

## 12. Docker vs Kubernetes

| Docker | Kubernetes |
|---------|------------|
| Container platform | Container orchestration platform |
| Creates containers | Manages multiple containers |
| Single-host management | Multi-node cluster management |

---

## Summary

Docker simplifies application deployment by packaging software into containers. Docker Compose manages multi-container applications, while Kubernetes automates deployment, scaling, and management of containerized applications.