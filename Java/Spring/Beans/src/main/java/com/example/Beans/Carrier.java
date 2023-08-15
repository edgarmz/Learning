package com.example.Beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.Beans.interfaces.mobile;

public class Carrier {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        mobile sim = context.getBean("sim",mobile.class);
        sim.balance();
        sim.message();

    }
}
