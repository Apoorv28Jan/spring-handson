package com.test.springapplications.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringInitDestroyImpl {
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public SpringBeanInitDestroy hello() {
		return new SpringBeanInitDestroy();

	}

}
