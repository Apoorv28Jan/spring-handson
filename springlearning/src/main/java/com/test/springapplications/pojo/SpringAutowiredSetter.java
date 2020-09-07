package com.test.springapplications.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class SpringAutowiredSetter {

	public ConstructorClass classTest;

	public ConstructorClass getClassTest() {
		return classTest;
	}

	@Autowired
	public void setClassTest(ConstructorClass classTest) {
		this.classTest = classTest;
	}

	public void callMethod() {
		classTest.checkSpelling();
	}
}
