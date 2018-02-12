package com.binio.didemo.controllers;

import com.binio.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private GreetingService service;

    public ConstructorInjectedController(GreetingService service) {
        this.service = service;
    }

    public String sayHello() {
        return service.sayHello();
    }
}
