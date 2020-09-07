package com.test.springapplications;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("address")
public class Address {

	@Value("Pune")
	String city;
	
	@Value("411015")
	int zip;
	
	public Address() {
		System.out.println("Inside Address Default constructor");
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}
	
	
	
	
	
}
