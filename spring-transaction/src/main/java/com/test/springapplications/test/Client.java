package com.test.springapplications.test;

import com.test.springapplications.AccountService;
import com.test.springapplications.exp.AccountNotFoundException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("account.xml");
		
		AccountService accService = (AccountService) context.getBean("accService");
		try {
			accService.transfer(2, 1, 100);
		} catch (AccountNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
