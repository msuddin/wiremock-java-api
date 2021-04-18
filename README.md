# Wiremock API

This is a simple Wiremock API setup

## High Level Overview
We currently have two API's:
 - The first is a Spring Boot API that runs locally, very simple, nothing heavy
 - The second is a wiremock API
  - A docker image is generated for the wiremock api (Dockerfile.wiremock)
  - A docker-compose file is then used to run the wiremock container

The Spring Boot API make calls to the wiremock API internall and covers areas of functionality of Wiremock

## Instructions

### Spring Boot API
For the moment, running it locally via IntelliJ

### Wiremock API
Navigate to src/test/resources and run:
```
docker-compose up
```

### Endpoints

| Spring Boot API Endpoint | Wiremock API Endpoint | Expected Response |
| --- | --- | --- |
| GET /valid | GET /valid | Return a 'valid message' with response of 200, happy path |
| GET /delay | GET /delay | Return a 'delay message' with response of 200, endpoint takes 10 seconds to respond, simulates a long response time |
| GET /chunk | GET /chunk | Return a 'chunk message' with response of 200, 5 chunks over 2 seconds, simulates a slow network response |

#### Hitting Endpoints

```
curl http://localhost:8081/<replace-with-spring-boot-api-endpoint-from-table-above>
```
