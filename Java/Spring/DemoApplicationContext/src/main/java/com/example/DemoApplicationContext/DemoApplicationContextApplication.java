package com.example.DemoApplicationContext;

import com.example.DemoApplicationContext.config.AppConfig;

import com.example.DemoApplicationContext.domain.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplicationContextApplication {

	public static void main(String[] args) {
		//Modo por el Spring application
		ApplicationContext context = SpringApplication.run(DemoApplicationContextApplication.class, args);

		//Modo pro App config
		//ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Student student =  context.getBean(Student.class);

		System.out.println(student);
	}


}
