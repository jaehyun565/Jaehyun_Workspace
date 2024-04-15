package D4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class swexpert_1486_장훈이의높은선반 {
	static int[] groups;
	static boolean check[];
	static int N, B, answer;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int testCase = Integer.parseInt(br.readLine());

		for (int t = 1; t <= testCase; t++) {
			sb.append("#").append(t).append(" ");
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());

			groups = new int[N];
			check = new boolean[N];
			answer = Integer.MAX_VALUE;

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				groups[i] = Integer.parseInt(st.nextToken());
			}
			// 부분집합으로 풀어야 합니다
			dfs(0);
			sb.append(answer-B).append("\n");
		}
		System.out.println(sb);
	}

	static void dfs(int idx) {
		// base Case
		if (idx >= N) {
			int tmp = 0;
			for (int i = 0; i < N; i++) {
				if (check[i]) {
					tmp+=groups[i];
				}
			}
			if(tmp>=B) {
				answer = Math.min(answer, tmp);				
			}
			return;
		}

		// recursive Case
		check[idx] = true;
		dfs(idx + 1);
		check[idx] = false;
		dfs(idx + 1);

	}
}
