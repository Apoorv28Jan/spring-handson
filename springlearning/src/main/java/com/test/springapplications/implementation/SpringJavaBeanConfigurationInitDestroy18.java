package com.test.springapplications.implementation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.test.springapplications.bean.SpringBeanInitDestroy;
import com.test.springapplications.bean.SpringInitDestroyImpl;
import com.test.springapplications.bean.SpringJavaConfiguration;
import com.test.springapplications.bean.SuperByConstructor;

public class SpringJavaBeanConfigurationInitDestroy18 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringInitDestroyImpl.class);
		/* context.re */
		/*
		 * SpringBeanInitDestroy obj = context.getBean(SpringBeanInitDestroy.class);
		 * ((AbstractApplicationContext) context).registerShutdownHook();
		 */
	}

}
