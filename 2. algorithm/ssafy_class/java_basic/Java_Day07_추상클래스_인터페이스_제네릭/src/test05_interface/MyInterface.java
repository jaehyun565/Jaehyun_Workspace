package test05_interface;

// 클래스를 만들 때는 : class
// 인터페이스를 만들 떄는 : interface
// 인터페이스로 객체 생성 가능하냐? > 불가능함
// 클래스가 이 인터페이스를 구현하도록 하고, 그 클래스로 객체를 생성함.
public interface MyInterface {
	// 인터페이스의 모든 변수는 상수;
	public static final int MEMBER1 = 10;
	int MEMBER2 = 20; // public static final을 생략해도 있는 것.

	// 인터페이스의 모든 메서드는 추상메서드
	public abstract void method1(); // 이 메서드를 구현하겠다는 약속.

	void method2(); // public abstract를 생략해도 있는 것.

}
