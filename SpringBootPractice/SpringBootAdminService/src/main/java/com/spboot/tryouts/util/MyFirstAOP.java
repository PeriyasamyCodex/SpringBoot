package com.spboot.tryouts.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyFirstAOP {
	
	

	@Before(value = "execution(* com.spboot.tryouts.service.*.*(..)) and args(empId)")
	public void beforeAdvice(JoinPoint joinPoint, int empId) {

		System.out.println("***AOP****Before Method ->" + joinPoint.getSignature());

		System.out.println("Creating with Input ->" + empId);

	}
	
	@Before(value = "execution(* com.spboot.tryouts.service.*.*(..))")
	public void beforeAdvice(JoinPoint joinPoint) {

		System.out.println("***AOP****Before Method ->" + joinPoint.getSignature());

		

	}

	@After(value = "execution(* com.spboot.tryouts.*.*(..))")
	public void afterAdvice(JoinPoint joinPoint) {

		System.out.println("***AOP****After Method ->" + joinPoint.getSignature());

	}
	
	

}
