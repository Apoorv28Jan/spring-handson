package com.test.springapplications.implementation;

import com.test.springapplications.pojo.SpringHierarchy;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanInitiationAndDestroy {

        @SuppressWarnings("resource")
        public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        SpringHierarchy obj = (SpringHierarchy) context.getBean("springBeanInitiationAndDestroy");
        obj.getMessage();
        context.registerShutdownHook();

    }

}
