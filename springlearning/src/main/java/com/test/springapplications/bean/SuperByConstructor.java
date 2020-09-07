package com.test.springapplications.bean;

public class SuperByConstructor {
	private ConstructorClass testClass;

	/** Constructor First will invoked */
	public SuperByConstructor(ConstructorClass testClass) {
		this.testClass = testClass;
		System.out.println("Hello chjk");
	}

	public void callConstructor() {
		testClass.checkSpelling();
	}

}
