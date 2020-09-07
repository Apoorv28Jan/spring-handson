package com.test.springapplications.pojo;

import org.springframework.beans.factory.annotation.Required;

@SuppressWarnings("deprecation")
public class SpringRequiredAnnotation {

	private Integer age;
	private String name;

	public Integer getAge() {
		return age;
	}

	@Required
	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}

}
