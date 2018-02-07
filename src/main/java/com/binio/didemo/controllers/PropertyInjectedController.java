package com.binio.didemo.controllers;

import com.binio.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingServiceImpl service;

    public String sayHello() {
        return service.sayHello();
    }
}
