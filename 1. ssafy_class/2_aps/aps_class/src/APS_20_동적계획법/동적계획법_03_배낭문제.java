package APS_20_동적계획법;

import java.util.Arrays;
import java.util.Scanner;

public class 동적계획법_03_배낭문제 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(input);

		int N = sc.nextInt(); // 물건의 개수
		int W = sc.nextInt(); // 가방의 용량

		int[] weights = new int[N + 1];
		int[] values = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			values[i] = sc.nextInt();
			weights[i] = sc.nextInt();
		}

		int[][] dp = new int[N + 1][W + 1]; // i 번 까지의 물건을 고려하고, w무게만큼만 고려한다
		// 물건은 한 개 씩만 존재한다.
		for (int i = 1; i <= N; i++) { // 1번부터 i번까지의 물건을 고려하겠다
			for (int w = 0; w <= W; w++) {// 0kg부터 wkg 까지의 무게를 고려하겠다
				// 지금 물건을 가방에 넣을 수 있는 상태면 이 물건을 넣을지 말지 고민해야됨
				if (weights[i] <= w) {
					// 현재 w무게에서의 최적해 = dp[i-1][w]임
					// 이번 물건 i를 고려했을 때 최적해 = dp[i-1][w-weights[i]]+values[i]
					dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - weights[i]] + values[i]);
				} else {
					// 지금 물건을 가방에 넣을 수 없으면, 이전 물건까지 고려한 값을 가져와라
					dp[i][w] = dp[i - 1][w];
				}

			}

		}
		System.out.println(dp[N][W]);

	}

	static String input = "4 10\r\n" + "10 5\r\n" + "40 4\r\n" + "30 6\r\n" + "50 3";
}
