package test05_interface;

public class test {
	public static void main(String[] args) {
		// 인터페이스의 모든 멤버변수는 static final임 => 인터페이스 이름으로 바로 접근
		System.out.println(MyInterface.MEMBER1); // 10이 출력됨
		System.out.println(MyInterface.MEMBER1 + MyInterface.MEMBER2); // 30이 출력됨
		
		MyClass mc = new MyClass();
		mc.method1(); // 인터페이스의 메서드는 static이 아니었으므로 객체 생성 후 
		mc.method2();
		
		// 해당 객체가 그 인터페이스를 구현했다면,
		// 인터페이스를 참조형 타입으로 활용 가능하다.		
		MyInterface mi = mc;
		MyInterface mi2 = new MyClass();
		
		mi2.method1();		
	}
}
