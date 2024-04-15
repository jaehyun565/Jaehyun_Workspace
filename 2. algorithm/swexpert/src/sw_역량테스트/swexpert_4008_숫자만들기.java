package sw_역량테스트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swexpert_4008_숫자만들기 {
	static boolean[] visited;
	static int N, max, min;
	static int[] sample = new int[4]; // 사칙연산 받는 변수
	static int[] number, result, operation;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int testCase = Integer.parseInt(br.readLine());
		for (int t = 1; t <= testCase; t++) {
			sb.append("#").append(t).append(" ");
			N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			result = new int[N - 1];
			visited = new boolean[N];
			max = Integer.MIN_VALUE;
			min = Integer.MAX_VALUE;
			for (int i = 0; i < 4; i++) {
				sample[i] = Integer.parseInt(st.nextToken());
			}

			int idx = 0;
			operation = new int[N - 1];
			// 0 은 +, 1은 -, 2는 *, 3은 /
			for (int i = 0; i < 4; i++) {
				while (sample[i] > 0) {
					operation[idx++] = i;
					sample[i]--;
				}
			}

			number = new int[N];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				number[i] = Integer.parseInt(st.nextToken());
			}

			dfs(0);
			sb.append((max-min)).append("\n");
		}
		System.out.println(sb);
	}

	static void dfs(int idx) {
		// base Case
		if (idx == N - 1) {
			calculate(number, result);
			return;
		}
		// recursive Case
		for (int i = 0; i < N - 1; i++) {
			if (visited[i] || (i > 0 && operation[i - 1] == operation[i] && !visited[i - 1])) {
				continue;
			}
			result[idx] = operation[i];
			visited[i] = true;
			dfs(idx + 1);
			visited[i] = false;

		}
	}

	static void calculate(int[] number, int[] result) {
		int answer = number[0];
		for (int i = 0; i < N - 1; i++) {
			if (result[i] == 0) {
				answer += number[i + 1];
			} else if (result[i] == 1) {
				answer -= number[i + 1];
			} else if (result[i] == 2) {
				answer *= number[i + 1];
			} else {
				answer /= number[i + 1];
			}
		}
		max = Math.max(answer, max);
		min = Math.min(answer, min);
	}

}
