package com.test.springapplications.bean;

public class SpringBeanInitDestroy {

	public void init() {
		System.out.println("Starting");
	}
	public void destroy() {
		System.out.println("End");
	}
}
