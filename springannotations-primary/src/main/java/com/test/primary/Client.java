package com.test.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Client {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);		

		Vehicle vehicle = context.getBean(Vehicle.class);
		
		vehicle.getMessage();
	}

}
