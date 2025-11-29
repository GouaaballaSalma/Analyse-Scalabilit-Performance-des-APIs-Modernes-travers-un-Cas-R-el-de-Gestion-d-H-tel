
# Hotel API Comparison — Repository Skeleton

This repository is a **skeleton** to run experiments comparing REST, SOAP, GraphQL and gRPC for a hotel reservation service.
It includes a minimal Spring Boot REST service, a `.proto` for gRPC, load-test scripts, Docker/Kubernetes manifests and monitoring placeholders.

**What is inside**
- `backend/spring-boot/` — minimal Spring Boot project (pom + simple entities + REST controller + Dockerfile)
- `backend/grpc/` — Protobuf definitions and notes to generate Java stubs
- `frontend/react/` — minimal React app skeleton to call the REST API
- `infra/` — docker-compose, prometheus.yml, k8s manifests (Deployments + Services)
- `loadtests/` — k6 scripts, locustfile.py, JMeter placeholders
- `scripts/` — helper scripts (example to run a local docker-compose)

> This skeleton is intentionally minimal so you can extend it for your tests (DB choice, security, GraphQL, SOAP).

## Quick start (local dev with Docker Compose)
1. Install Docker & docker-compose.
2. Build the backend image (example for Spring Boot):
   ```bash
   cd backend/spring-boot
   mvn -DskipTests package
   docker build -t hotel-rest:local .
   ```
3. Start infra
   ```bash
   cd /mnt/data/hotel-api-comparison/infra
   docker-compose up --build
   ```
4. Run load tests in `loadtests/` (k6, Locust, JMeter as you prefer).

## Download
A zip archive of this skeleton is available next to this notebook output.
