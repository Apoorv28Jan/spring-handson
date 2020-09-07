package com.test.springapplications.pojo;

public class SuperConstructorDefault {
	private ConstructorClass constructorClass;

	private String name;

	/** Constructor First will invoked */
	public SuperConstructorDefault() {
		System.out.println("Hello default constructor");
	}

	public ConstructorClass getConstructorClass() {
		return constructorClass;
	}

	public void setConstructorClass(ConstructorClass constructorClass) {
		System.out.println("Hello method constructor");
		this.constructorClass = constructorClass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("hello");
		this.name = name;
	}

	public void callConstructor() {
		constructorClass.checkSpelling();
	}

}
