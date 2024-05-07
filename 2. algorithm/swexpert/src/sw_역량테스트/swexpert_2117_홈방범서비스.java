package sw_역량테스트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class swexpert_2117_홈방범서비스 {
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };
	static boolean[][] visited;
	static int N, M, homeCnt, answer;
	static int[][] map, cntMap;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		for (int t = 1; t <= testCase; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());

			map = new int[N][N];
			answer = 0;

			for (int r = 0; r < N; r++) {
				st = new StringTokenizer(br.readLine());
				for (int c = 0; c < N; c++) {
					visited = new boolean[N][N];
					map[r][c] = Integer.parseInt(st.nextToken());
				}
			}

			
			for (int i = 1; i <= N; i++) {
				cntMap = new int[N][N];
				find(i);
			}
			System.out.println("#"+t+" "+answer);

		}
	}

	static int calculate(int K) {
		return K * K + (K - 1) * (K - 1);
	}

	static void find(int K) {
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < N; c++) {
				visited = new boolean[N][N];
				if (map[r][c] == 1) {
					homeCnt = 1;
					visited[r][c] = true;
					find2(r,c);
					for(int i = 0; i<N;i++) {
						for(int j = 0;j<N;j++) {
							System.out.print(cntMap[r][c]+" ");
						}
						System.out.println();
					}
					find2(r-K, c);
					find2(r+K, c);
					find2(r, c-K);
					find2(r, c+K);
					cntMap[r][c] = homeCnt;
					if (homeCnt * M > calculate(K)) {
						if (answer < homeCnt) {
							answer = homeCnt;
						}
					}
				}
			}
		}
	}

	static void find2(int r, int c) {
		for (int d = 0; d < 4; d++) {
			int nr = r + dr[d];
			int nc = c + dc[d];
			if (nr >= 0 && nr < N && nc >= 0 && nc < N) {
				if (map[nr][nc] == 1 && !visited[nr][nc]) {
					homeCnt++;
					visited[nr][nc] = true;
				}
			}
		}
	}
}
