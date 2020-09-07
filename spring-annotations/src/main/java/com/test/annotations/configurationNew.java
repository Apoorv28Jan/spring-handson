package com.test.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
public class configurationNew {

	@Bean(name = "b2")
	@Lazy
	public Address getNewAddress() {
		System.out.println("Second");
		return new Address();
	}

}
