package com.edgmed.DIdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class DIdemoApplication {

	public static void main(String[] args) {
		// To test each case of DI by constructor or by setter
		// just change the xml file in the ClassPathXmlApplicationContext
		// and run the application


		ApplicationContext context = new ClassPathXmlApplicationContext("BeansSetter.xml");
		CodeEditor codeEditor = (CodeEditor) context.getBean("codeEditor");
		codeEditor.compile();

	}

}
