package com.thetestroom;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

    String wireMockApi = "http://localhost:8080";

    @RequestMapping(value = "/valid", produces = "application/json")
    public String getValidResponse() {
        RestTemplate request = new RestTemplate();
        return request.getForEntity(wireMockApi + "/valid", String.class).getBody();
    }

    @RequestMapping(value = "/delay", produces = "application/json")
    public String getDelayedResponse() {
        RestTemplate request = new RestTemplate();
        return request.getForEntity(wireMockApi + "/delay", String.class).getBody();
    }

    @RequestMapping(value = "/chunk", produces = "application/json")
    public String getChunkedResponse() {
        RestTemplate request = new RestTemplate();
        return request.getForEntity(wireMockApi + "/chunk", String.class).getBody();
    }

    @RequestMapping("/empty")
    public String getEmptyResponse() {
        RestTemplate request = new RestTemplate();
        return request.getForEntity(wireMockApi + "/empty", String.class).getBody();
    }

    @RequestMapping("/malformed")
    public String getMalformedResponse() {
        RestTemplate request = new RestTemplate();
        return request.getForEntity(wireMockApi + "/malformed", String.class).getBody();
    }

    @RequestMapping("/random")
    public String getRandomResponse() {
        RestTemplate request = new RestTemplate();
        return request.getForEntity(wireMockApi + "/random", String.class).getBody();
    }

    @RequestMapping("/close")
    public String getCloseResponse() {
        RestTemplate request = new RestTemplate();
        return request.getForEntity(wireMockApi + "/close", String.class).getBody();
    }

}
