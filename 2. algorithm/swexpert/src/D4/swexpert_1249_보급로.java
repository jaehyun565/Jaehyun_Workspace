package D4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class swexpert_1249_보급로 {
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };
	static Queue<int[]> queue;
	static int[][] board;
	static boolean[][] visited;
	static int N, ans;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		for (int t = 1; t <= testCase; t++) {
			ans = 0;
			N = Integer.parseInt(br.readLine());

			queue = new LinkedList<>();
			board = new int[N][N];
			visited = new boolean[N][N];

			for (int r = 0; r < N; r++) {
				char[] c1 = new char[N];
				StringTokenizer st = new StringTokenizer(br.readLine());
				c1 = st.nextToken().toCharArray();
				int idx = 0;
				for (int c = 0; c < N; c++) {
					board[r][c] = c1[idx++] - 48;
				}
			}
			queue.offer(new int[] {0,0});
			visited[0][0] = true;
			bfs(0,0);

		}
	}

	private static void bfs(int r, int c) {
		
		while(!queue.isEmpty()) {
			int curr_r = queue.poll()[0];
			int curr_c = queue.poll()[1];
			
			for (int d = 0; d < 4; d++) {
				int nr = curr_r + dr[d];
				int nc = curr_c + dc[d];
				
				if (!movable(nr, nc)) {
					
					queue.offer(new int[] {nr, nc});
					visited[nr][nc] = true;
					
				}
				
			}
			
		}
		

	}

	private static boolean movable(int r, int c) {
		if (r >= 0 && c >= 0 && r < N && c < N && visited[r][c] == false) {
			return true;
		} else {
			return false;
		}
	}

}
