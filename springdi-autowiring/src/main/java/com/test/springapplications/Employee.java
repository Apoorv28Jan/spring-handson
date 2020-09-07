package com.test.springapplications;

public class Employee {

	
	Address pAddress;
	Address rAddress;
	
	public Employee() {
		System.out.println("Inside Employee Default constructor");
	}

	public Address getpAddress() {
		return pAddress;
	}

	public void setpAddress(Address pAddress) {
		this.pAddress = pAddress;
	}

	public Address getrAddress() {
		return rAddress;
	}

	public void setrAddress(Address rAddress) {
		this.rAddress = rAddress;
	}

	
	
	
	
}
