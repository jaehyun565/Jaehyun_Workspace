package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1654_랜선자르기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int[] arr = new int[K];

		for (int i = 0; i < K; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		
		// 최댓값 찾기
		int max_length = 0;
		for (int i = 0; i < K; i++) {
			if (max_length < arr[i]) {
				max_length = arr[i];
			}
		}

		int ans = 0;
		for (int j = 1; j <= max_length; j++) {
			int cnt = 0;
			for (int i = 0; i < K; i++) {
				cnt += arr[i] / j;
			}
			if (cnt >= N) {
				ans = Math.max(ans, j);
			}
		}
		System.out.println(ans);

	}

}