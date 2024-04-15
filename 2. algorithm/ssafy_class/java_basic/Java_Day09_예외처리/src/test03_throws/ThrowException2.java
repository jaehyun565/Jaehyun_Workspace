package test03_throws;

// Unchecked Exception 발생
// - 예외처리를 강제 하지 않음.
// = throws도 강제하지 않음.(사실 써도 무의미임.)
// => 처리하고 싶으면 try catch문으로 직접처리 해라.

// ★method1에서 try catch를 하면 예외처리가 된다!!
// throws를 따로 하지는 않았지만 내부적으로는 예외를 넘기고 있다!
// 결국 처리 하지 않으면 최종적으로는 비정상적 종료가 된다!

public class ThrowException2 {
	public static void main(String[] args) {
		method1();
	}

	public static void method1() { // 여기서에서 method2()의 예외를 처리해보자.
		try {
			method2();	
		}
		catch(ArithmeticException e){
			System.out.println("에러가 났다!");
		}
		
	}

	public static void method2() {		
		int i = 1 / 0;
		
	}

}
