package com.binio.didemo.controllers;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MyControllerTest {

    MyController controller;

    @Before
    public void setUp() {
        controller = new MyController();
    }
    @Test
    public void testSayHello() {
        assertEquals("foo", controller.hello());
    }
}