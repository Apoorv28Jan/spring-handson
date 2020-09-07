package com.test.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Bus implements Vehicle{

	@Override
	public void getMessage() {
		
		System.out.println("inside Bus Implementation");
		
	}
	
}
