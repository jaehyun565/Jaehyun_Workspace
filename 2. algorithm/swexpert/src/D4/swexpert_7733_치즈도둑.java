package D4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class swexpert_7733_치즈도둑 {
	static int[][] cheese;
	static boolean[][] check;
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };
	static Queue<Point> queue = new LinkedList<>();
	static int max = 1;
	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int testCase = Integer.parseInt(br.readLine());

		for (int t = 1; t <= testCase; t++) {
			N = Integer.parseInt(br.readLine());
			cheese = new int[N][N];
			// 치즈 넣기
			for (int r = 0; r < N; r++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int c = 0; c < N; c++) {
					cheese[r][c] = Integer.parseInt(st.nextToken());
				}
			}

			// 치즈가 하루에 하나씩 줄어들 때 덩어리의 최댓값 찾기
			int checkEmpty=0;
			next: for (int i = 1; i <= 100; i++) {
				if(checkEmpty == 99) max = 0 ;
				int idx = 0;
				for (int r = 0; r < cheese.length; r++) {
					for (int c = 0; c < cheese.length; c++) {
						if (cheese[r][c] == i) {
							cheese[r][c] = 0;
							idx++;
						}
					}
				}
				if (idx == 0) {
					checkEmpty++;
					continue next;
				}
				int a = cntMash();				
				max = Math.max(max, a);
			}
			sb.append("#"+t+" "+max+"\n");
		}
		System.out.println(sb);
	}

	private static int cntMash() {
		int cnt = 0;
		check = new boolean[N][N];
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < N; c++) {
				if (cheese[r][c] != 0 && !check[r][c]) {
					bfs(r, c);
					cnt++;
				}
			}
		}
		return cnt;
	}

	// 덩어리 단위 만들자
	private static void bfs(int r, int c) {
		// queue에 값 하나 넣고
		queue.add(new Point(r, c));
		check[r][c] = true;
		// 그 근처에 0 이아닌 숫자가 있는지 탐색
		while (!queue.isEmpty()) {
			Point p = queue.poll();
			for (int d = 0; d < 4; d++) {
				int nr = p.x + dr[d];
				int nc = p.y + dc[d];
				if (nr >= 0 && nr < N && nc >= 0 && nc < N && !check[nr][nc]
						&& cheese[nr][nc] != 0) {
					check[nr][nc] = true;
					queue.offer(new Point(nr, nc));

				}
			}
		}
	}

	public static class Point {
		int x, y;

		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

}
