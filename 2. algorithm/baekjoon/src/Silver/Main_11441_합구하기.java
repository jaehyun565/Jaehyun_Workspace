package Silver;

import java.util.Scanner;

public class Main_11441_합구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		int[] sumArr = new int[num+1];
		sumArr[0] = 0;
		sumArr[1] = arr[0];
		for (int i = 2; i < num+1; i++) {
			sumArr[i] = sumArr[i - 1] + arr[i-1];
		}
		
		int testCase = sc.nextInt();
		for (int t = 0; t < testCase; t++) {
			int start = sc.nextInt()-1;
			int end = sc.nextInt();			
			System.out.println(sumArr[end] - sumArr[start]);
		}

	}
}
