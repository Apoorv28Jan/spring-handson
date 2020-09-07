package com.test.springapplications;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getAddress().getCity());
		System.out.println(employee.getAddress().getZip());

	}

}
