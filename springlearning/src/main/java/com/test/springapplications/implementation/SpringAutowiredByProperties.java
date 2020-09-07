package com.test.springapplications.implementation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.springapplications.pojo.SpringAutowiredProperties;

public class SpringAutowiredByProperties {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		SpringAutowiredProperties obj = (SpringAutowiredProperties) context.getBean("superConstructor");
		obj.callMethod();

	}

}
