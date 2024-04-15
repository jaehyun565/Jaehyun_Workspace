package SWexpert_04_String;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_1216_회문2 {
	public static void main(String[] args) throws IOException {
		// 가운데서 시작 > 홀, 짝 나누어서
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 10; i++) {
			String t = br.readLine();
			char[][] arr = new char[1][15];

			for (int r = 0; r < arr.length; r++) {
				int num = 0;
				char[] chr = br.readLine().toCharArray();
				for (int c = 0; c < arr[0].length; c++) {
					arr[r][c] = chr[num++];
				}
			}

			int lenR = arr.length;
			int lenC = arr[0].length;

			int max = 0;
			row: for (int r = 0; r < lenR; r++) { // 행을 컨트롤
				for (int c = 0; c < lenC; c++) {// 열을 컨트롤
					// 시작부터 끝값까지 비교하면서 알파벳이 같을 때 그 길이가 max 보다 작으면 계산 안하려고 만든 조건식
					j: for (int j = 0; j < (lenC+c-1) / 2; j++) {
						System.out.println(j+" "+c);
						if (arr[r][c+j] == arr[r][lenC - 1 - j] && lenC - j > max) {
							// 회문인지 아닌지 실제로 검정하는 식.
							for (int k = 0; k < (lenC+c-1) / 2; k++) {
								if (arr[r][c+k] != arr[r][lenC - 1 - k]) {
									continue j;
								}

							}
							// 여기까지 내려왔다면 회문이라는 것, max의 값을 수정.
							System.out.println("c :" + c + ", j :" + j);
							max = lenC - j;
							// max를 찾았으면 그 행에서는 더 이상 계산할 필요가 없음 > 다음행으로로.
							continue row;
						}
					}
				}
			}
			System.out.println(max);

//			System.out.println("#"+(i+1)+" 번");
//			for (int r = 0; r < arr.length; r++) {				
//				for (int c = 0; c < arr[0].length; c++) {
//					System.out.print(arr[r][c]);
//				}
//				System.out.println();
//			}

		}

	}
}
