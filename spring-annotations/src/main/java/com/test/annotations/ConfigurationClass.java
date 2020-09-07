package com.test.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;

@Configuration
@Import(configurationNew.class)
public class ConfigurationClass {

	@Bean(name="b1")
	@Lazy
	public Address getAddress(){
		System.out.println("First");
		return new Address();
	}


}
