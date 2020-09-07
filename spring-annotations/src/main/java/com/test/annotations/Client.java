package com.test.annotations;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Client {


	public static void main(String[] args) {

		//BeanFactory context = new XmlBeanFactory(new FileSystemResource("spring.xml"));

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("springTest.xml");

		Employee emp = (Employee)context.getBean("employee");

		System.out.println("Employee Id : " + emp.getId());
		System.out.println("Employee Name : " + emp.getName());
		System.out.println("Employee City : " + emp.getAddress().getCity());
		System.out.println("Employee Zip Code : " + emp.getAddress().getZip());

	}

}
