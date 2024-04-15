package SWexpert_04_String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution_1216_회문2_강사님 {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);

		int T = 10;
		for (int test_case = 1; test_case <= 10; test_case++) {
			sc.nextInt();
			char[][] board = new char[100][100];

			for (int r = 0; r < 100; r++) {
				String line = sc.next();
				for (int c = 0; c < 100; c++) {
					board[r][c] = line.charAt(c);
				}
			}

			int maxLength = -1;
			for (int r = 0; r < 100; r++) {
				for (int c = 0; c < 100; c++) {
					// 시작위치를 결정해두고 상하좌우로 뻗어나가면서 회문 체크
					// 1. 가로방향으로 체크하는데 홀수
					int d = 0;
					while (0 <= c - d && c + d < 100 && board[r][c - d] == board[r][c + d]) {
						d++;
					}
					maxLength = Math.max(maxLength, 2 * d - 1);

					// 2. 가로방향으로 체크하는데 짝수
					d = 0;
					while (0 <= c - d && c + d + 1 < 100 && board[r][c - d] == board[r][c + d + 1]) {
						d++;
					}
					maxLength = Math.max(maxLength, 2 * d);
					// 3. 세로로 체크하는데 홀수
					d = 0;
					while (0 <= r - d && r + d < 100 && board[r - d][c] == board[r + d][c]) {
						d++;
					}
					maxLength = Math.max(maxLength, 2 * d - 1);

					// 4. 세로로 체크하는데 짝수
					d = 0;
					while (0 <= r - d && r + d + 1 < 100 && board[r - d][c] == board[r + d][c]) {
						d++;
					}
					maxLength = Math.max(maxLength, 2 * d);
				}
			}

			System.out.println("#"+test_case+" "+maxLength);
		}
	}
}
