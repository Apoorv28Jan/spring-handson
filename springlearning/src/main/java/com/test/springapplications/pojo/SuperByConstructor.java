package com.test.springapplications.pojo;

public class SuperByConstructor {
	private ConstructorClass testClass;
	private String name;

	/** Constructor First will invoked */
	public SuperByConstructor(String name, ConstructorClass testClass) {
		this.name = name;
		this.testClass = testClass;
		System.out.println("Hello chjk");
	}

	public ConstructorClass getTestClass() {
		return testClass;
	}

	/*
	 * public void setTestClass(ConstructorClass testClassLecture) {
	 * System.out.println("Hello"); this.testClass = testClassLecture; }
	 */

	public String getName() {
		return name;
	}

	/*
	 * public void setName(String name) { System.out.println("hello"); this.name =
	 * name; }
	 */
	public void callConstructor() {
		testClass.checkSpelling();
	}

}
