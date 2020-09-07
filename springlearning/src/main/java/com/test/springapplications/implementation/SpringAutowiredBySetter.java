package com.test.springapplications.implementation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.springapplications.pojo.SpringAutowiredSetter;

public class SpringAutowiredBySetter {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		com.test.springapplications.pojo.SpringAutowiredSetter obj = (com.test.springapplications.pojo.SpringAutowiredSetter) context.getBean("superConstructor");
		obj.callMethod();

	}

}
