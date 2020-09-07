package com.test.springapplications.implementation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.springapplications.pojo.SpringAutowiredConstructor;

public class SpringAutowiredByConstructor {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		SpringAutowiredConstructor obj = (SpringAutowiredConstructor) context.getBean("superConstructor");
		obj.callMethod();

	}

}
