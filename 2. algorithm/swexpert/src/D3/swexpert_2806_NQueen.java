package D3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class swexpert_2806_NQueen {
	static int cnt, N, queenCnt;
	static int[][] board;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for (int t = 1; t <= testCase; t++) {
			N = Integer.parseInt(br.readLine());
			board = new int[N][N];
			queenCnt = 0;

			Queen(0, 0);
			System.out.println(cnt);
		}
	}

	public static void Queen(int r, int c) {
		if (r >= N) {
			if (queenCnt == N)
				cnt++;
			return;
		}
//		for (int a = 0; a < board.length; a++) {
//			for (int b = 0; b < board.length; b++) {
//				System.out.print(board[a][b]);
//			}
//			System.out.println();
//		}		

		for (c = 0; c < board[0].length; c++) {
			if (r < board.length && board[r][c] != 1) {
				board[r][c] = 1;
				remove(r, c);
				queenCnt++;
				board[r][c] = 0;
				Queen(++r, ++c);				
			}
		}
		Queen(++r, c);
	}

	public static void remove(int r, int c) {
		int[] dr = { -1, 1, 0, 0, -1, -1, 1, 1 };
		int[] dc = { 0, 0, -1, 1, -1, 1, -1, 1 };

		for (int d = 0; d < dr.length; d++) {
			int nr = r + dr[d];
			int nc = c + dc[d];
			while (nr >= 0 && nr < board.length && nc >= 0 && nc < board[0].length) {
				board[nr][nc] = 1;
				nr += dr[d];
				nc += dc[d];
			}
		}
	}
}
