package com.test.springapplications.entity;

public class Student {
	
	private int age;
	private String name;
	private int id;
	
	public Student(){
		System.out.println("default cons.");
	}
	
	public Student( int id, String name,int age) {
		super();
		this.age = age;
		this.name = name;
		this.id = id;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	

}
