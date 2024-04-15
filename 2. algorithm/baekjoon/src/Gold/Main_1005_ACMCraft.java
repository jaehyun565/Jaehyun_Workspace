package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_1005_ACMCraft {
	static int N, max;
	static int[] visited, delay, degree;
	static int[][] adj;
	static Stack<Integer> stack = new Stack<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int testCase = Integer.parseInt(br.readLine());
		for (int t = 1; t <= testCase; t++) {			
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			max = 0;

			st = new StringTokenizer(br.readLine());
			delay = new int[N + 1];
			for (int i = 1; i <= N; i++) {
				delay[i] = Integer.parseInt(st.nextToken());
			}

			adj = new int[N + 1][N + 1];
			degree = new int[N + 1];
			int ans = 0;

			for (int i = 0; i < K; i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());

				adj[a][b] = 1;

				degree[b]++;
			}
			int W = Integer.parseInt(br.readLine());
			int time = delay[W];
			dfs(W,time);			
			sb.append(max).append("\n");
		}
		System.out.println(sb);

	}

	private static void dfs(int idx, int time) {
		// base Case
		if(degree[idx]==0) {
			max = Math.max(time, max);		
			return;
		}
		// recursive Case
		for (int i = N; i >= 1; i--) {
			if (adj[i][idx] == 1) {
				time+=delay[i];
				degree[idx]--;
				dfs(i, time);		
				degree[idx]++;
				time-=delay[i];
			}
		}
	}

}
