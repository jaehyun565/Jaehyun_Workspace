package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_11048_이동하기 {
	static boolean[][] visited;
	static int[][] dp, board;
	static int N, M;
	static int[] dr = { 0, 1, 1 };
	static int[] dc = { 1, 0, 1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		board = new int[N][M];
		visited = new boolean[N][M];
		dp = new int[N][M];

		for (int r = 0; r < N; r++) {
			st = new StringTokenizer(br.readLine());
			for (int c = 0; c < M; c++) {
				board[r][c] = Integer.parseInt(st.nextToken());
			}
		}
		dp[0][0] = board[0][0];
		candyCount(0, 0);
		System.out.println(dp[N-1][M-1]);

	}

	static void candyCount(int i, int j) {
		Queue<int[]> queue = new LinkedList<>();
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < M; c++) {
				queue.add(new int[] { i, j });
				while (!queue.isEmpty()) {
					int[] curr = queue.poll();
					int curr_r = curr[0];
					int curr_c = curr[1];
					for (int d = 0; d < 3; d++) {
						int nr = curr_r + dr[d];
						int nc = curr_c + dc[d];
						if (nr >= 0 && nr < N && nc >= 0 && nc < M && !visited[nr][nc]) {
							if (nc >= 1) {
								if (nr >= 1) {
									dp[nr][nc] = board[nr][nc] + Math.max(dp[nr - 1][nc - 1],Math.max(dp[nr - 1][nc], dp[nr][nc - 1]));
								} else {
									dp[nr][nc] = board[nr][nc] + dp[nr][nc - 1];
								}
							} else {
								dp[nr][nc] = board[nr][nc]+dp[nr - 1][nc];

							}
							visited[nr][nc] = true;
							queue.add(new int[] { nr, nc });
						}
					}
				}
			}
		}
	}

}
