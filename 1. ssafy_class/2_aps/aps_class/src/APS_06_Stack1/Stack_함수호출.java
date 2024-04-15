package APS_06_Stack1;

import java.util.Arrays;

public class Stack_함수호출 {
	public static void main(String[] args) {
		System.out.println("main 이 호출되었습니다.");
		int a = 10;
		int[] arr = {1,2,3};
		func1(a, arr);
		System.out.println(a);
		System.out.println(Arrays.toString(arr));
		System.out.println("main 이 종료되었습니다.");
	}
	
	// func1의 지역변수 a 임. (main의 a와는 다른 친구임) 그래서 func1에서 a를 바꿔도 main에서 출력하면 a = 10 이나옴
	// 그런데 배열의 경우에는 참조자료형이기 때문에, main과 func1에서 같은 배열을 참조하고 있음. 
	// => 그래서 func1에서 배열의 값을 바꾸면 main에서도 값이 바뀜.
	
	public static void func1(int a, int[] arr) { 
		System.out.println("func1이 호출되었습니다.");
		a = 20;
		arr[0] = 4;
		func2();
		System.out.println("func1이 종료되었습니다.");
	}
	
	public static void func2() {
		System.out.println("func2가 호출되었습니다.");		
		System.out.println("func2가 종료되었습니다.");
	}
}
