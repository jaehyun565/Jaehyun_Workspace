package test03_throws;

public class ThrowException1 {
	public static void main(String[] args) throws ClassNotFoundException {
		// method1()에서 다시 위임함.
		// 결국 여기서도 처리하거나, 위임해야됨.
		method1();		
	}
	
	public static void method1() throws ClassNotFoundException {
		// method2()에서 예외를 위임함. 
		// 이 메서드를 호출한 곳에서 처리하거나, 다시 위임.		
			method2();
	}
	
	public static void method2() throws ClassNotFoundException { // 예외처리 위임.
		Class.forName("SSAFY"); // SSAFY 라는 이름의 클래스를 메모리에 로드해라. 라는 뜻.
		
		// 위 예외는 checked exception이다보니 예외처리가 강제.
		// 1. 직접처리(try ~ catch)
		// 2. 간접처리(throw)
	}
}
