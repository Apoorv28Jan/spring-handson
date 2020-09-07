package com.test.springapplications.client;

		import org.springframework.context.ApplicationContext;
		import org.springframework.context.support.ClassPathXmlApplicationContext;

		import com.test.springapplications.calculator.Calculator;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-aop.xml");

		Calculator calculator = (Calculator) context.getBean("calculatorBean");
		int result = calculator.addition(1,5);

	}

}
