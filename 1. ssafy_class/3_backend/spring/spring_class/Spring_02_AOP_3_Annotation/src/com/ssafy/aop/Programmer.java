package com.ssafy.aop;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Programmer implements Person {
	// 필드 생략

	// 프로그래머의 일상
	public int coding() throws OuchException{
		System.out.println("열심히 코드를 짠다."); // 핵심 관심 사항
		if(new Random().nextBoolean()) {
			throw new OuchException();
		}
		
		return (int)(Math.random() * 100)+1;
	}
}
