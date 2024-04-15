package D2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swexpert_16268_풍선팡2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());

		for (int t = 1; t <= testCase; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int[][] table = new int[N][M];

			for (int r = 0; r < N; r++) {
				st = new StringTokenizer(br.readLine());
				for (int c = 0; c < M; c++) {
					table[r][c] = Integer.parseInt(st.nextToken());
				}
			}

			int max = 0;
			int[] dr = { -1, 1, 0, 0 };
			int[] dc = { 0, 0, -1, 1 };

			for (int r = 0; r < table.length; r++) {
				for (int c = 0; c < table[0].length; c++) {
					int sum = table[r][c];
					for (int d = 0; d < 4; d++) {
						int nr = r + dr[d];
						int nc = c + dc[d];
						if (nr >= 0 && nr < table.length && nc >= 0 && nc < table[0].length) {
							sum += table[nr][nc];
						}
					}
					if(max < sum) {
						max = sum;
					}
				}
			}
			System.out.println("#"+t+" "+max);
		}
	}
}
