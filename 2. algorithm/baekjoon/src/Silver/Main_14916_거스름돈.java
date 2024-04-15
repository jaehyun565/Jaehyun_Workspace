package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_14916_거스름돈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		// dp로 풀어봅시다
		int minCnt = 0;
		int[] dp = new int[n + 1];
		
		for (int i = 1; i <= n; i++) {
			minCnt = 987654321;
			// i = 1일 때는 그냥 넘어가기
			if (i == 1) {
				continue;
			}
			// i가 3 이상이면서 2원 전의 값이 0이면 채우지 않고 그냥 두기
			if (i > 2 && dp[i - 2] == 0) {
			} else {
				// 그렇지 않다면 현재 987654321과 2원전의 값에서 2원동전 하나 추가했을 때 갯수 최소값을 비교
				// 사실 비교 안하고 그냥 minCnt = dp[i-2] +1 로 비교 해도 상관없을 듯
				minCnt = Math.min(minCnt, dp[i - 2] + 1);
			}
			// i가 5 이상이면서 5원 전의 값이 0이면 채우지 않고 그냥 두기
			if (i >= 5) {
				if (i > 5 && dp[i - 5] == 0) {
				} else {
					// 그렇지 않다면 현재 최소갯수와 5원전의 값에서 5원동전 하나 추가했을 때 갯수 최소값을 비교
					minCnt = Math.min(minCnt, dp[i - 5] + 1);					
				}
			}

			// 갯수를 셀 수 없어서 넘어간 친구들은 minCnt가 갱신이 안됐을 것이므로
			// 해당 값은 거슬러 줄 수 없으므로 0으로 둡니다.
			if (minCnt == 987654321) {
				dp[i] = 0;
			} else {
				dp[i] = minCnt;
			}
		}
		if(dp[n]==0) {
			System.out.println(-1);
		} else {
			System.out.println(minCnt);			
		}

	}

}
