package com.example.client.controllers;

import com.example.client.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/")
    public String printMessage(@RequestParam(defaultValue = "Shift") String name) {
        return helloService.receiveGreeting(name);
    }
}
