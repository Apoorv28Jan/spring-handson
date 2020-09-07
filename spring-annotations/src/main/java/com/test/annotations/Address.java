package com.test.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("address")
public class Address {
	private int zip;
	private String city;

	public Address(){
		System.out.println("Address Class Instantiated");
	}
	public Address(int zip, String city) {
		super();
		this.zip = zip;
		this.city = city;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}



}
