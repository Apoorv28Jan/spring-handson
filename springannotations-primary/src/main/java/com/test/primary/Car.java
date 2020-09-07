package com.test.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Car implements Vehicle{

	@Override
	public void getMessage() {
		
		System.out.println("insidde car's implementation");
		
	}

	
}
