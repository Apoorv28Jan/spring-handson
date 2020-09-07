package com.test.springapplications.implementation;

import com.test.springapplications.pojo.SpringDemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringBeanInitialization {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		SpringDemo obj = (SpringDemo) context.getBean("springDemo");
		obj.getMessage();

	}

}
