package com.test.springapplications.implementation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.springapplications.pojo.SpringRequiredAnnotation;

public class SpringByAnnotation {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		com.test.springapplications.pojo.SpringRequiredAnnotation obj = (com.test.springapplications.pojo.SpringRequiredAnnotation) context.getBean("superConstructor");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());

	}

}
