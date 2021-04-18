# Wiremock API

This is a simple Wiremock API setup

## High Level Overview
We currently have two API's:
 - The first is a Spring Boot API that runs locally, very simple, nothing heavy
 - The second is a wiremock API
  - A docker image is generated for the wiremock api (Dockerfile.wiremock)
  - A docker-compose file is then used to run the wiremock container

The Spring Boot API make calls to the wiremock API internall and covers areas of functionality of Wiremock

## Endpoints

### Spring Boot API - GET /valid

Spring Boot API

```
GET /valid
```

Calls Wiremock API
```
GET /valid
```

Which Returns a valid-response.json
```
{
  "message": "valid message"
}
```
