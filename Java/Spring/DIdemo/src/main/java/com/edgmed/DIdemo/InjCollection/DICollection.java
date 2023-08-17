package com.edgmed.DIdemo.InjCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DICollection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("CollectionBean.xml");
        JavaCollection javaCollection = (JavaCollection) context.getBean("javaCollection");
        javaCollection.getInjectionList();
        javaCollection.getInjectionSet();
        javaCollection.getInjectionMap();
        javaCollection.getInjectionProperties();
    }
}
