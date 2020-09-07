package com.test.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfClient {

	public static void main(String[] args) {


		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		Address addr = (Address)context.getBean("b2");//Address.class can be used but there ll be only one
		//@Bean Entries should be there in MyConfig class

		addr.setCity("hello");
		addr.setZip(1001);

		System.out.println(addr.getCity());
		System.out.println(addr.getZip());




	}

}
