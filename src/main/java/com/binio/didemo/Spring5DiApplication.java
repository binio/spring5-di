package com.binio.didemo;

import com.binio.didemo.controllers.ConstructorInjectedController;
import com.binio.didemo.controllers.MyController;
import com.binio.didemo.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.binio.services", "com.binio.didemo.controllers"})
public class Spring5DiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring5DiApplication.class);
		MyController ctl = (MyController) ctx.getBean("myController");
		ctl.hello();
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
		//SpringApplication.run(Spring5DiApplication.class, args);
	}
}
