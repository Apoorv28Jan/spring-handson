package com.test.springapplications.implementation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.springapplications.pojo.SuperByName;


public class SpringAutowiringByType {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		SuperByName obj = (SuperByName) context.getBean("superConstructor");
		obj.callConstructor();
		System.out.println(obj.getName()); 

	}

}
