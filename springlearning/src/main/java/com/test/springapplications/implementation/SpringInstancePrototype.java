package com.test.springapplications.implementation;

import com.test.springapplications.pojo.SpringDemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringInstancePrototype {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        SpringDemo obj = (SpringDemo) context.getBean("springInstancePrototype");
        obj.setMessage("Prototype Example");
        obj.getMessage();
        SpringDemo obj2 = (SpringDemo) context.getBean("springInstancePrototype");
        obj2.getMessage();

        /** Will print "How are you" one time as scope is defined as prototype */
    }
}
