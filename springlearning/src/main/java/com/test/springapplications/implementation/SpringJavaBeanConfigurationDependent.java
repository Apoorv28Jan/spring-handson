package com.test.springapplications.implementation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.springapplications.bean.SpringJavaConfiguration;
import com.test.springapplications.bean.SuperByConstructor;

public class SpringJavaBeanConfigurationDependent {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringJavaConfiguration.class);
		SuperByConstructor obj = context.getBean(SuperByConstructor.class);
		obj.callConstructor();

	}

}
