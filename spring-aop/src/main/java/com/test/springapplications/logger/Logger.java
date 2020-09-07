package com.test.springapplications.logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
	
	@Before(value="afterAllGetters()")
	public void logMessage1(){
		System.out.println("in Before ");
	}
	
		
	@After(value="afterAllGetters()")
	public void logMessage2(){
		System.out.println("in after ");
	}
	
	
	@Pointcut("execution(* *.addition(..))")
	public void afterAllGetters(){}
	
	
/*	@Pointcut("@annotaion(org.springframework.web.bind.annotation.RequestMappingUrl)")
	public int afterAllGetters1(){
		return 100;
	}*/
	
	/*@Pointcut("@annotaion(org.springframework.web.bind.annotation.RequestMapping)")
	public void afterAllGetters2(){
		
	}*/
	
	/*@Pointcut 
	int counter = 100;*/
	
	
	
	/*@Around(value="execution (* *.addition(..))")
	public int logMessage(ProceedingJoinPoint proceedJP){
		int returnValue=0;
		System.out.println("Inside Log Message 1");
		try {
			returnValue=(int) proceedJP.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Inside Log Message 2");
		return returnValue;
	}*/
		
	
	/*@AfterReturning(value="execution (* *.addition(..))")
	public void logMessage3(){
		System.out.println("in after returning");
	}*/

	/*@AfterThrowing(value="execution (* *.exceptionMethod(..))",throwing="NullPointerException")
	public void logMessage4(){
		System.out.println("Exception Thrown");
	}*/
	
	
}
