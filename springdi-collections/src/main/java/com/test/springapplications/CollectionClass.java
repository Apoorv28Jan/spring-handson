package com.test.springapplications;

import java.util.List;
import java.util.Map;


public class CollectionClass {
	
	List addressList;
	Map addressMap;
	
	public List getAddressList() {
		System.out.println("Getting List elements :" +  addressList);
		return addressList;
	}
	public void setAddressList(List addressList) {
		this.addressList = addressList;
	}
	public Map getAddressMap() {
		System.out.println("Getting Map elements :" +  addressMap);
		return addressMap;
	}
	public void setAddressMap(Map addressMap) {
		this.addressMap = addressMap;
	}
	
	
	
	

}
