package java03_operator;

public class Op04_논리연산자 {
	public static void main(String[] args) {
		 // 주석에 올바른 실행 결과 값을 채워 넣으시오.

		System.out.println(true && true); //
		System.out.println(true && false); //
		System.out.println(false && true); //
		System.out.println(false && false); //

		System.out.println(true || true); //
		System.out.println(true || false); //
		System.out.println(false || true); //
		System.out.println(false || false); //

		int a = 10;
		int b = 20;
		
		// short circuit evaluation == 단축연산
		// && 연산의 경우 : 앞이 false => 전체 결과가 false
		//				  =>뒤는 고려하지 않음 
		
		// || 연산의 경우 : 앞이 true => 전체 결과가 true
		//				  => 뒤는 고려하지 않음.

		
		// 앞이 false라서 뒤를 실행안함
		// 그래서 a = 그대로 10이 출력됨
		System.out.println(a > b && a++ > b);
		System.out.println(a); //
		
		// 앞이 true라서 뒤에것 까지 실행해줘야함
		// 그래서 a = 1이 더해진 11이 출력됨.
		System.out.println(a < b && a++ < b); //
		System.out.println(a); //

		System.out.println(a > b || a++ > b); //
		System.out.println(a); //
		System.out.println(a < b || a++ < b); //
		System.out.println(a); //

		System.out.println("-----");

//		a = 10;
//		b = 20;
//
//		System.out.println(a > b & a++ > b); //
//		System.out.println(a); //
//		System.out.println(a < b & a++ < b); //
//		System.out.println(a); //
//
//		System.out.println(a > b | a++ > b); //
//		System.out.println(a); //
//		System.out.println(a < b | a++ < b); //
//		System.out.println(a); //

	}
}
