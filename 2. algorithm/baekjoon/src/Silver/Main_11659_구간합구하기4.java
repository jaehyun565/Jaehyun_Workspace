package Silver;

import java.util.Arrays;
import java.util.Scanner;

public class Main_11659_구간합구하기4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		int[] sumArr = new int[N + 1];
		sumArr[0] = 0;
		sumArr[1] = arr[0];
		for (int i = 2; i < N + 1; i++) {
			sumArr[i] = sumArr[i - 1] + arr[i - 1];
		}
		for(int i = 0; i<M;i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			System.out.println(sumArr[end] - sumArr[start-1]);
		}

	}
}
