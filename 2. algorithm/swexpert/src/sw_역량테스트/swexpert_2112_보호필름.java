package sw_역량테스트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swexpert_2112_보호필름 {
	static int D, W, K;
	static int[][] film;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());

		for (int t = 1; t <= testCase; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			D = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());

			film = new int[D][W];

			for (int r = 0; r < D; r++) {
				st = new StringTokenizer(br.readLine());
				for (int c = 0; c < W; c++) {
					film[r][c] = Integer.parseInt(st.nextToken());
				}
			}

		}
	}

	public boolean examination(int idx) {
		for (int c = 0; c < W; c++) {
			int cnt = 0;
			for (int r = 0; r < D - 1; r++) {
				if (film[r][c] == film[r + 1][c]) {
					cnt++;
				}
				if (cnt >= K) {
					idx++;
				}
			}
		}
		if(idx==W) {
			return true;
		} else {
			return false;
		}
	}

}
