package org.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${POD_NAME:unknown}")
    private String podName;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Service A. Pod: " + podName;
    }
}
