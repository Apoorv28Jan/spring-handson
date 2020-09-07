package com.test.springapplications;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee e = (Employee) context.getBean("e");
		System.out.println(e.getpAddress().getCity());
		System.out.println(e.getpAddress().getZip());
		System.out.println(e.getrAddress().getCity());
		System.out.println(e.getrAddress().getZip());
		
	}

}
