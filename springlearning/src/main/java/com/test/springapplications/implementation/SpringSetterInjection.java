package com.test.springapplications.implementation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.test.springapplications.pojo.SuperSetter;

public class SpringSetterInjection {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		SuperSetter obj = (SuperSetter) context.getBean("superConstructorSetter");
		obj.callConstructorClass();
	}
}
