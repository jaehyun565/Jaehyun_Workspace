package Bronze;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2435_기상청인턴신현수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

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

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < sumArr.length-K; i++) {
			int tmp = sumArr[i + K] - sumArr[i];
			if (max < tmp) {
				max = tmp;
			}
		}
		System.out.println(max);

	}
}
