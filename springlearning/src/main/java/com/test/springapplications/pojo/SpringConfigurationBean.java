package com.test.springapplications.pojo;

public class SpringConfigurationBean {

	public String message;

	public void getMessage() {
		System.out.println(""+message);
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
