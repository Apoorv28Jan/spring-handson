package com.test.springapplications;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		CollectionClass cc = (CollectionClass) context.getBean("collection");
		cc.getAddressList();
		cc.getAddressMap();
	}

}
