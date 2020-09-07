package com.test.springapplications.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class LoggingAspect {
	
	
	
/*	@Before("allGetters()")
	public void loggingAdvice2(){					
		System.out.println("2nd Advice executed...");
	}*/
	
	/*@Pointcut("execution(public * getName())")
	public void allGetters(){}
	*/
	@Pointcut("execution(public * getName())")
	public void afterAllGetters(){}

	@AfterReturning("afterAllGetters()")
	public void loggingAdvice1(JoinPoint jp){
		System.out.println("1st Advice executed...");
		System.out.println(jp.getTarget());
		//System.out.println(joinPoint.toString());
		//Circle c = (Circle) joinPoint.getTarget();
		// for getting circle object 		
	}
	
	/*@AfterReturning(value="afterAllGetters()",returning="r")
	public void logAfter(JoinPoint jp, Object r){
		System.out.println("Exiting from " + jp.getSignature().getName() + "method");
	}*/
	
	

}
