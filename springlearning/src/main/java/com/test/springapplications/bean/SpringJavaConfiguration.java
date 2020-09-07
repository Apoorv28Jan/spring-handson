package com.test.springapplications.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringJavaConfiguration {

	@Bean
	public SuperByConstructor configurationBean() {
		return new SuperByConstructor(childConstructor());
	}

	@Bean
	public ConstructorClass childConstructor() {
		return new ConstructorClass();
	}

}
