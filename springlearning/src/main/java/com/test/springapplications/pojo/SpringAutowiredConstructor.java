package com.test.springapplications.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class SpringAutowiredConstructor {

	public ConstructorClass classTest;

	@Autowired
	public SpringAutowiredConstructor(ConstructorClass classTest) {
		System.out.println("Inside the constructor");
		this.classTest = classTest;
	}

	public void callMethod() {
		classTest.checkSpelling();
	}
}
