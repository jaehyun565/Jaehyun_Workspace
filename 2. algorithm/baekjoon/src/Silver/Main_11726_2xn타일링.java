package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_11726_2xn타일링 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[] dp = new int[n+1];
		dp[1] = 1;
		if(n>1) {
			dp[2] = 2;			
		}
		int cnt = 0;
		for (int i = 1; i <= n; i++) {
			if (i <= 2)
				continue;
			dp[i] = (dp[i - 1] + dp[i - 2])%10007;
		}
		System.out.println(dp[n]);
	}
}
