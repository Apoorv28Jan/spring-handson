package com.test.springapplications.implementation;

import com.test.springapplications.pojo.SpringHierarchy;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanNameCycle {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        SpringHierarchy obj = (SpringHierarchy) context.getBean("springBeanNameCycle");

        obj.getMessage();
        context.registerShutdownHook();


}
}
