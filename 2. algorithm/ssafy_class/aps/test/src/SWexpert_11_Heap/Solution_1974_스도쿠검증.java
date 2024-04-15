package SWexpert_11_Heap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_1974_스도쿠검증 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testCase = Integer.parseInt(br.readLine());

		for (int t = 1; t <= testCase; t++) {
			int[][] sudoku = new int[9][9];

			for (int r = 0; r < sudoku.length; r++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int c = 0; c < sudoku[0].length; c++) {
					sudoku[r][c] = Integer.parseInt(st.nextToken());
				}
			}

			int cnt = 0;

			// 가로행 탐색
			for (int r = 0; r < sudoku.length; r++) {
				int sum = 0;
				int multi = 1;
				for (int c = 0; c < sudoku[0].length; c++) {
					sum += sudoku[r][c];
					multi *= sudoku[r][c];
				}
				if (sum == 45 && multi == 362880) {
					cnt++;
				}
			}

			// 세로행 탐색
			for (int c = 0; c < sudoku.length; c++) {
				int sum = 0;
				int multi = 1;
				for (int r = 0; r < sudoku[0].length; r++) {
					sum += sudoku[r][c];
					multi *= sudoku[r][c];
				}
				if (sum == 45 && multi == 362880) {
					cnt++;
				}
			}
			
			// 9칸 탐색
			int a = 0;
			while (a <= 6) {
				int b = 0;
				while (b <= 6) {
					int sum = 0;
					int multi = 1;
					for (int r = a; r < a + 3; r++) {
						for (int c = b; c < b + 3; c++) {
							sum += sudoku[r][c];
							multi *= sudoku[r][c];
						}
						if (sum == 45 && multi == 362880) {
							cnt++;
						}
					}
					b += 3;
				}
				a += 3;
			}
			if(cnt==27) {
				bw.write("#"+t+" "+1+"\n");
			} else {
				bw.write("#"+t+" "+0+"\n");
			}			
		}
		bw.close();
	}
}
