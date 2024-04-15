package new_test;

public class MyClass {
	
	// 멤버변수(속성)
	int a;
	String b;
	boolean c;
	
	// 메서드(동작)	
	static int myFunction() {
		return 1;
	}
	
	void printFiled() {
		System.out.println("멤버변수 값");
		System.out.println("a");
		System.out.println("b");
		System.out.println("c");
	}
	// 일반적인 메서드 정의 : (접근제한자)(반환형)(이름)(파라미터){}
	// 생성자의 정의 : (접근제한자)(클래스이름)(파라미터){}
	
	MyClass(){
		System.out.println("기본 생성자입니다.");
	}
	MyClass(int a, String b, boolean c){
		// this() 자기 자신의 기본 생성자를 호출함.
		this(); 
		// 멤버변수와 입력받은 파라미터가 동일해서 구분이 안됨
		// 이 때 this 를 사용
		this.a = a;
		this.b = b;
		this.c = c;
		
		System.out.println("두번째 생성자입니다.");
			
	}
	
	public static void main(String[] args) {
		// static 메서드 안에서는 non static 메서드 접근 불가
		System.out.println(myFunction());
		
		
	
		
}
}
