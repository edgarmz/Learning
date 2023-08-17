package com.edgmed.DIdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InnerBean {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("InnerBean.xml");
        CodeEditor codeEditor = (CodeEditor)  context.getBean("codeEditor");
        codeEditor.compile();
    }
}
