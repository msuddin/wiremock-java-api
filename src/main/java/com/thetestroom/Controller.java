package com.thetestroom;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/hi")
    public String sayHello() {
        return "Hi QA Shahin";
    }
}
