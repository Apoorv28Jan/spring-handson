package com.test.springapplications.implementation;

/**Example of constructor injection Constructor class constructor will invoked first*/
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.springapplications.pojo.SuperConstructor;

public class SpringConstructorInjection {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		SuperConstructor obj = (SuperConstructor) context.getBean("superConstructor");
		obj.check();
	}

}
