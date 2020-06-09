package com.thetestroom;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

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
