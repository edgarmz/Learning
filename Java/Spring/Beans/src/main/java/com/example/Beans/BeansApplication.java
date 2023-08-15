package com.example.Beans;

import com.example.Beans.Pojo.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BeansApplication {

	public static void main(String[] args) {
		//Creating Bean
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		Student student = (Student)  factory.getBean("student");
		System.out.println(student);
		//SpringApplication.run(BeansApplication.class, args);
	}

}
