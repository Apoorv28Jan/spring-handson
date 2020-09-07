package com.test.springapplications.implementation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.springapplications.pojo.SpringConfigurationBean;
import com.test.springapplications.pojo.SpringJavaConfiguration;

public class SpringJavaBeanConfiguration {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringJavaConfiguration.class);
		SpringConfigurationBean obj =context.getBean(SpringConfigurationBean.class);
		obj.setMessage("Hi");
		obj.getMessage();

	}

}
