package com.test.springapplications.implementation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.springapplications.pojo.SuperByConstructor;

public class SpringAutowiringByConstructor {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		SuperByConstructor obj = (SuperByConstructor) context.getBean("superConstructor");
		obj.callConstructor();
		System.out.println(obj.getName());

	}

}
