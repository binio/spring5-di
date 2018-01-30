package com.binio.didemo;

import com.binio.didemo.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5DiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring5DiApplication.class);
		MyController ctl = (MyController) ctx.getBean("myController");
		ctl.hello();
		//SpringApplication.run(Spring5DiApplication.class, args);
	}
}
