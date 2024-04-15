package APS_20_동적계획법;

import java.util.Arrays;
import java.util.Scanner;

public class 동적계획법_02_동전거스름돈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int money = sc.nextInt(); // 해당 거스름돈의 최소 동전개수를 구하고 싶다
		// 사용 가능한 동전은 1원 / 4원 / 6원의 총 3가지 동전

		int[] dp = new int[money + 1]; // 해당 money구하고 싶음
		// dp[] = 0;

		for (int i = 1; i <= money; i++) {
			int minCnt = Integer.MAX_VALUE; // i 원에 대한 최소 거스름돈 개수
			// 1원을 작은 부분 문제에 추가하겠다
			minCnt = Math.min(minCnt, dp[i - 1] + 1); // 1원단위이므로 직전 원의 거스름돈 + 1개 추가한 해가 최적해
			if (i >= 4) {
				minCnt = Math.min(minCnt, dp[i - 4] + 1); // 4원이 됐을 때는 0원일 때 + 1개 추가한 1개가 최적해
			}
			if (i >= 6) {
				minCnt = Math.min(minCnt, dp[i - 6] + 1); // 6원이 됐을 때는 0원일 때 + 1개 추가한 개가 최적해
			}
			// 고려할 동전 다 고려함
			dp[i] = minCnt;
		}
		System.out.println(Arrays.toString(dp));

	}
}
