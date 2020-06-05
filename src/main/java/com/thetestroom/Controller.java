package com.thetestroom;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/hi/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return "Hi " + name;
    }
}
