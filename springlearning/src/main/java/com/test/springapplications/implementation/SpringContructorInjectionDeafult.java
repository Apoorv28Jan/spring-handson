package com.test.springapplications.implementation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.springapplications.pojo.SuperConstructorDefault;

public class SpringContructorInjectionDeafult {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		SuperConstructorDefault obj = (SuperConstructorDefault) context.getBean("superConstructorDefault");
		obj.callConstructor();

	}

}
