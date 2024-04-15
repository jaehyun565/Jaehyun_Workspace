package D3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swexpert_5215_햄버거다이어트 {
	static int N, L, max, calSum, scoreSum;
	static int[] score, cal;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());

		for (int t = 1; t <= testCase; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			L = Integer.parseInt(st.nextToken());

			score = new int[N];
			cal = new int[N];
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				score[i] = Integer.parseInt(st.nextToken());
				cal[i] = Integer.parseInt(st.nextToken());
			}
			calSum = 0;
			scoreSum = 0;
			max = 0;
			best(0);

			System.out.println("#" + t + " " + max);
		}
	}

	public static void best(int idx) {
		// base case
		if (idx >= N) {
			if (calSum <= L) {
				max = Math.max(scoreSum, max);
			}
			return;
		}

		// recursive case
		calSum += cal[idx];
		scoreSum += score[idx];
		best(idx + 1);
		calSum -= cal[idx];
		scoreSum -= score[idx];
		best(idx + 1);

	}
}
