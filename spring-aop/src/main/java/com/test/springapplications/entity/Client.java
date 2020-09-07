package com.test.springapplications.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
		Circle circle = (Circle) context.getBean("circle");
		String s = circle.getName();
		System.out.println(s);

	}

}
