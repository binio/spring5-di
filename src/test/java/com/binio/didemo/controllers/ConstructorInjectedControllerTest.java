package com.binio.didemo.controllers;

import com.binio.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @Before
    public void setup(){
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testSayHello() {
        assertEquals("Hello GreetingServiceImpl", controller.sayHello());
    }

}