package com.thetestroom;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

    String wireMockApi = "http://localhost:8080";

    @RequestMapping("/valid")
    public String getValid() {
        RestTemplate request = new RestTemplate();
        return request.getForEntity(wireMockApi + "/valid", String.class).getBody();
    }

    @RequestMapping("/delay")
    public String getDelay() {
        RestTemplate request = new RestTemplate();
        return request.getForEntity(wireMockApi + "/delay", String.class).getBody();
    }

    @RequestMapping("/chunk")
    public String getChunk() {
        RestTemplate request = new RestTemplate();
        return request.getForEntity(wireMockApi + "/chunk", String.class).getBody();
    }

    @RequestMapping("/hi/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return "Hi " + name;
    }

    @RequestMapping("/hello")
    public Person getPerson(@RequestParam("name") String name) {
        return new Person(name);
    }

    @RequestMapping(value = "/person", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public Person person(@RequestBody Person person) {
        return new Person(person.getName(), person.getAge());
    }
}
