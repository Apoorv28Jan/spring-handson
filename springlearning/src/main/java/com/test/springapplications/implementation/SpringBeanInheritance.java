package com.test.springapplications.implementation;

import com.test.springapplications.pojo.SpringDemo;
import com.test.springapplications.pojo.SpringDemoInheritance;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanInheritance {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        SpringDemo obj = (SpringDemo) context.getBean("springBeanInheritance");

        obj.getMessage();
        obj.getMessage2();

        SpringDemoInheritance obj2 = (SpringDemoInheritance) context.getBean("springBeanInheritanceSecond");

        obj2.getMessage();
        obj2.getMessage2();
        obj2.getMessage3();
        /** Will print "How are you" one time as scope is defined as prototype */
    }

}
