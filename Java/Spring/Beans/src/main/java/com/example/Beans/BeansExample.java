package com.example.Beans;

import com.example.Beans.Pojo.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansExample {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) factory.getBean("student");
        System.out.println(student);
    }
}
