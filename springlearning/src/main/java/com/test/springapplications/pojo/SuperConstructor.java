package com.test.springapplications.pojo;

public class SuperConstructor {

	private ConstructorClass testClass;

	public SuperConstructor(ConstructorClass constructor) {
		System.out.println("Inside SuperConstructor");
		this.testClass = constructor;
	}

	public void check() {
		testClass.checkSpelling();
	}
}
