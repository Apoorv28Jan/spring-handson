package com.test.springapplications.pojo;

public class SuperSetter {
	private ConstructorClass testClass;

	public ConstructorClass getTestClass() {
		return testClass;
	}

	public void setTestClass(ConstructorClass testClass) {
		System.out.println("Inside setter method of SuperSetter");
		this.testClass = testClass;
	}
	
	public void callConstructorClass() {
		testClass.checkSpelling();
	}

}
