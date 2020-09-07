package com.test.springapplications.pojo;

public class SuperByName {
	private ConstructorClass testClass;
	private String name;

	/** Constructor First will invoked */
	public SuperByName() {
		System.out.println("Hello default constructor");
	}

	public ConstructorClass getTestClass() {
		return testClass;
	}

	public void setTestClass(ConstructorClass testClassLecture) {
		System.out.println("Hello test setter  method ");
		this.testClass = testClassLecture;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("hello name setter method");
		this.name = name;
	}

	public void callConstructor() {
		testClass.checkSpelling();
	}

}
