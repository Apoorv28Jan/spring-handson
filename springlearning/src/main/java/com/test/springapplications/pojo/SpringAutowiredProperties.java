package com.test.springapplications.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class SpringAutowiredProperties {

	@Autowired
	public ConstructorClass classTest;

	/*
	 * @Autowired public SpringAutowiredProperties(ConstructorClass classTest) {
	 * System.out.println("Inside the constructor"); this.classTest = classTest; }
	 */

	public ConstructorClass getClassTest() {
		return classTest;
	}

	/*
	 * public void setClassTest(ConstructorClass classTest) {
	 * System.out.println("Inside"); this.classTest = classTest; }
	 */

	public void callMethod() {
		classTest.checkSpelling();
	}
}
