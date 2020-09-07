package com.test.springapplications.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringJavaConfiguration {

	@Bean
	public SpringConfigurationBean configurationBean() {
		return new SpringConfigurationBean();
	}

}
