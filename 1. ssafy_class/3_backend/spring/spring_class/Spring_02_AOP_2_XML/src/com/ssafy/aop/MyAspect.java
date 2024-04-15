package com.ssafy.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
	// 메서드 명이 중요한건 아님.
	
	// 핵심수행 이전에 할 것
	public void before() {
		System.out.println("컴퓨터를 부팅한다.");
	}
	
	// 핵심수행이 정상수행이 된 후	
	public void afterReturning(int line) {
		System.out.println(line+"개의 줄을 Git에 Push 한다.");
	}
	
	// 핵심수행이 정상수행이 안된다면(예외 발생 후)
	public void afterThrowing(Throwable th) {
		System.out.println("조퇴를 한다.");
		if(th instanceof OuchException) {
			((OuchException) th).handleException();
		}
	}
	
	// 핵심 수행 이후에 할 것
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
