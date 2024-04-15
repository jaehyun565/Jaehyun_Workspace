package java02_variable;

public class Var02_TypeCasting {
	public static void main(String[] args) {

		// 1. 묵시적 형변환 : 범위가 작은 곳 -> 범위가 큰 곳
		int n1 = 100;
		long n2 = n1;

		// 2. 명시적 형변환 : 범위가 큰 곳 -> 범위가 작은 곳
		// byte b = n2; => 이렇게 묵시적으로 변환 할 수 없다.
		byte b = (byte) n2;
	}
}
