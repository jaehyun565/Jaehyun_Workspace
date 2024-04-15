package APS_07_Stack2;

public class Stack_재귀호출_facotrial {
	
	public static void main(String[] args) {
		int result = factorial(10);
		System.out.println(result);
	}

	public static int factorial(int n) {
		if (n <= 1) {
			return 1;
		}
		
		return n * factorial(n - 1);
	}
}
