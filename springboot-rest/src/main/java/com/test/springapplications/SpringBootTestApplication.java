package com.test.springapplications;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class SpringBootTestApplication {

	public static void main(String[] args) {
try{
		SpringApplication.run(SpringBootTestApplication.class, args);
	}
catch(Throwable ex) {
	ex.printStackTrace();
}
}}
