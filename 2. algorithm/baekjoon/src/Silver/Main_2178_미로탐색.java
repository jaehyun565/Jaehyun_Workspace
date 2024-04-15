package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main_2178_미로탐색 {
	static class Point {
		int x;
		int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

	}

	static boolean[][] visited;
	static int[][] board, dist;
	static int N, M;
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		N = Integer.parseInt(s.split(" ")[0]);
		M = Integer.parseInt(s.split(" ")[1]);
		board = new int[N][M];
		visited = new boolean[N][M];
		dist = new int[N][M];

		for (int r = 0; r < N; r++) {
			int idx = 0;
			s = br.readLine();
			for (int c = 0; c < M; c++) {
				board[r][c] = Integer.parseInt(s.split("")[idx++]);
			}
		}

		bfs(0, 0);
		System.out.println(dist[N-1][M-1]);
	}

	private static void bfs(int i, int j) {
		Queue<Point> queue = new LinkedList<>();
		queue.offer(new Point(i,j));
		visited[i][j] = true;
		dist[i][j] = 1;
		while (!queue.isEmpty()) {
			Point curr = queue.poll();
			int curr_r = curr.x;
			int curr_c = curr.y;			
			for (int d = 0; d < 4; d++) {
				int nr = curr_r + dr[d];
				int nc = curr_c + dc[d];

				if (movable(nr, nc)) {
					Point p = new Point(nr,nc);
					queue.add(p);
					visited[nr][nc]=true;
					dist[nr][nc] = dist[curr_r][curr_c]+1;
				}
			}
		}
	}

	private static boolean movable(int i, int j) {
		if (i >= 0 && j >= 0 && i < N && j < M && !visited[i][j] && board[i][j]==1) {
			return true;
		}
		return false;
	}

}
