package com.ssafy.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

	
	@Pointcut("execution(* com.ssafy.aop.*.coding())")
	public void mypt() {}
	
	@Before("mypt()")
	public void before() {
		System.out.println("컴퓨터를 부팅한다.");
	}
	
	@AfterReturning(value = "mypt()", returning = "line")
	public void afterReturning(int line) {
		System.out.println(line+"개의 줄을 Git에 Push 한다.");
	}
	
	@AfterThrowing(value = "mypt()", throwing = "th")
	public void afterThrowing(Throwable th) {
		System.out.println("조퇴를 한다.");
		if(th instanceof OuchException) {
			((OuchException) th).handleException();
		}
	}
	
	@After("mypt()")
	public void after() {
		System.out.println("하루를 마무리한다.");
	}
	
	///////////////////////////////////
	// around
	public int around(ProceedingJoinPoint pjt) {
		int line = 0;
		try {
			line = (int)(pjt.proceed());
			this.afterReturning(line);
		} catch(Throwable e) {
			this.afterThrowing(e);
		} finally {
			this.after();
		}
		return line;
		
	}
}
