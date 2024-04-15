package SWexpert_03_Array3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1954_달팽이숫자 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.setIn(new FileInputStream("input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		int[] dr = { -1, 0, 1, 0 };
		int[] dc = { 0, 1, 0, -1 };

		for (int i = 0; i < T; i++) {

			int N = Integer.parseInt(br.readLine());

			int[][] arr = new int[N][N];
			// 델타배열, 상, 우, 하, 좌(시계)

			int num = 1;

			int r = 0;
			int c = 0;

			arr[0][0] = num;

			out: while (num < N * N - 1) {

				for (int d = 0; d < 4; d++) {
					int nr = r + dr[d];
					int nc = c + dc[d];

					while (nr >= 0 && nr < arr.length && nc >= 0 && nc < arr[0].length && arr[nr][nc] == 0) {
						arr[nr][nc] = ++num;
						r = nr;
						c = nc;
						nr += dr[d];
						nc += dc[d];

						if (!(nr >= 0 && nr < arr.length && nc >= 0 && nc < arr[0].length && arr[nr][nc] == 0)) {
							continue out;
						}
						if (nr == arr.length) {
							r = nr - 1;
						} else if (nr < 0) {
							r = nr + 1;

						} else {
							r = nr;

						}

						if (nc == arr[0].length) {
							c = nc - 1;
						} else if (nc < 0) {
							c = nc + 1;
						} else {
							c = nc;
						}

					}
				}
			}
			for (r = 0; r < arr.length; r++) {
				for (c = 0; c < arr[0].length; c++) {
					if (arr[r][c] == 0) {
						arr[r][c] = N * N;
					}

				}
			}
			System.out.println("#"+(i+1));
			for (r = 0; r < arr.length; r++) {
				for (c = 0; c < arr[0].length; c++) {
					System.out.print(arr[r][c] + " ");
				}				
				System.out.println();
			}

		}
	}

}
