package com.edgmed.BeanCycle;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class BeanCycleApplication {

	public static void main(String[] args) {
		//SpringApplication.run(BeanCycleApplication.class, args);
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		HelloWorld world = (HelloWorld) context.getBean("helloWorld");
		System.out.println("Hi " + world.getMessage());

		context.registerShutdownHook();
	}


}
