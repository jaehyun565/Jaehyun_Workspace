package test03_throws;

import java.io.FileNotFoundException;
import java.io.IOException;

class Parent {
	public void method1() throws IOException{
		
	}
	
	public void method2() throws ClassNotFoundException{
		
	}
	
	public void method3() {
		
	}
}

// ThrowException 4는 parent의 자식
public class ThrowException4 extends Parent{
	@Override
	public void method1() throws FileNotFoundException{ // FileNOtFoundException 은 IOException의 자식이라 괜찮다.
		
	}
	@Override
	public void method2() { // Exception은 ClassNotFoundException보다 큰 예외를 던질 수 없다!!
		
	}
	
	
	// 하위 클래스의 접근제어자 범위가 상위 클래스보다 크거나 같아야 한다.
	@Override
	void method3() { // 상위가 public인데 자식이 default이면 안됨. 
		
	}
	
}
