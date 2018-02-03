package com.binio.didemo.controllers;

import com.binio.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {
    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.service = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals("Hello GreetingServiceImpl", propertyInjectedController.sayHello());
    }
}