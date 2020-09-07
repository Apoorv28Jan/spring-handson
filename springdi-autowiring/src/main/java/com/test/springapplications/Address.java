package com.test.springapplications;

public class Address {

	String city;
	int zip;
	
	public Address() {
		System.out.println("Inside Address Default constructor");
	}

	public Address(String city, int zip) {
		this.city = city;
		this.zip = zip;
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
