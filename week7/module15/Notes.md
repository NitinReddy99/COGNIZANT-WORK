# Module 15 - Cloud Computing and AWS

## 1. What is Cloud Computing?

Cloud Computing is the delivery of computing services such as servers, storage, databases, networking, and software over the Internet.

### Benefits
- Cost-effective
- Scalability
- High Availability
- Reliability
- Security
- Pay-as-you-go pricing

---

## 2. Traditional IT vs Cloud

### Traditional IT
- Own physical servers
- High maintenance
- Large upfront cost

### Cloud Computing
- Resources available on demand
- Lower maintenance
- Easy scalability
- Pay only for what you use

---

## 3. Virtualization

Virtualization allows multiple virtual machines (VMs) to run on a single physical server using a hypervisor.

Benefits:
- Better resource utilization
- Lower hardware costs
- Isolation
- Easy management

---

## 4. Service-Oriented Architecture (SOA)

SOA is a software architecture where applications communicate through reusable services.

Benefits:
- Reusability
- Flexibility
- Scalability

---

## 5. Cloud Service Models

### IaaS (Infrastructure as a Service)
- Virtual machines
- Networking
- Storage

Example:
- Amazon EC2
- Azure Virtual Machines

---

### PaaS (Platform as a Service)

Provides a development platform without managing infrastructure.

Examples:
- AWS Elastic Beanstalk
- Google App Engine

---

### SaaS (Software as a Service)

Complete software delivered through the Internet.

Examples:
- Gmail
- Microsoft 365
- Salesforce

---

## 6. Deployment Models

- Public Cloud
- Private Cloud
- Hybrid Cloud
- Community Cloud

---

## 7. Cloud Providers

- Amazon Web Services (AWS)
- Microsoft Azure
- Google Cloud Platform (GCP)

---

# Amazon EC2

Elastic Compute Cloud (EC2) provides virtual servers in AWS.

### Components

- Instances
- AMIs
- Security Groups
- Key Pairs

Common Instance:
- t2.micro

---

# Amazon ECS

Elastic Container Service is used to run Docker containers on AWS.

Difference:

EC2 → Virtual Machines

ECS → Containers

---

# Amazon S3

Simple Storage Service stores files as objects.

Components:

- Buckets
- Objects

Storage Classes

- Standard
- Intelligent Tiering
- Standard IA
- Glacier

Features

- Versioning
- Lifecycle Policies

---

# Amazon EBS

Elastic Block Store provides block storage for EC2 instances.

Volume Types

- gp2
- gp3
- io1

Supports snapshots for backups.

---

# Amazon VPC

Virtual Private Cloud creates an isolated network in AWS.

Components

- Public Subnet
- Private Subnet
- Route Table
- Internet Gateway
- NAT Gateway
- Security Groups
- VPC Peering

---

# Elastic Load Balancer

Distributes incoming traffic across multiple servers.

Types

### Application Load Balancer (ALB)

- Layer 7
- HTTP/HTTPS
- Path-based routing

### Network Load Balancer (NLB)

- Layer 4
- TCP/UDP
- High performance

---

# Amazon RDS

Managed relational database service.

Supported Databases

- MySQL
- PostgreSQL
- SQL Server
- Aurora

Features

- Automated Backup
- Multi-AZ Deployment
- Automatic Failover

---

# Amazon DynamoDB

Fully managed NoSQL database.

Primary Keys

- Partition Key
- Sort Key

Advantages

- High scalability
- Low latency
- Serverless

---

# AWS Lambda

Serverless computing service.

Supports

- Java
- Python
- Node.js

Triggers

- S3
- API Gateway
- DynamoDB Streams

Pricing

Pay only when the function executes.

---

# AWS API Gateway

Used to create and manage REST APIs.

Features

- HTTP Methods
- Routing
- Lambda Integration
- Deployment Stages
- API Security
- Throttling

---

# Summary

Cloud Computing provides scalable and reliable computing resources over the Internet. AWS offers a wide range of services including EC2, ECS, S3, EBS, VPC, ELB, RDS, DynamoDB, Lambda, and API Gateway to build secure and highly available cloud applications.