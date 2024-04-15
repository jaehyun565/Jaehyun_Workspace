package SWexpert_03_Array3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_2001_파리퇴치 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		// 델타배열 {상, 하, 좌, 우, 좌상, 우상, 좌하, 우하}
		int[] dr = { -1, 1, 0, 0, -1, -1, 1, 1 };
		int[] dc = { 0, 0, -1, 1, -1, 1, -1, 1 };

		for (int i = 0; i < T; i++) {
			String[] s = br.readLine().split(" ");
			int N = Integer.parseInt(s[0]);
			int M = Integer.parseInt(s[1]);

			// 방 배열 선언.
			int[][] arr = new int[N][N];
			int[][] splash = new int[M][M];

			// 방 배열에 모기 숫자 집어넣기.
			for (int r = 0; r < arr.length; r++) {
				String[] array = br.readLine().split(" ");
				for (int c = 0; c < arr[0].length; c++) {
					arr[r][c] = Integer.parseInt(array[c]);
				}
			}

			int max = 0;
			int nr = 0;
			int nc = 0;
			
			for (int r = 0; r < M; r++) {
				for (int c = 0; c < M; c++) {
					
					splash[r][c] = arr[r][c];
				}
			}
			

			// 0,0부터 돌면서 모기 잡음.
//			for (int r = 0; r < arr.length; r++) {
//				for (int c = 0; c < arr[0].length; c++) {					
//					int kill = arr[r][c];
//					 for (int d = 0; d < 8; d++) {
//						 out : for (int size = 0; size < M-1; size++) {							
//							nr = r + dr[d];
//							nc = c + dc[d];							
//							if(!(nr>=0 && nr<arr.length && nc>=0 && nc<arr[0].length)) {
//								continue out;
//							}							
//							kill += arr[nr][nc];
//							System.out.println(i + "회차(" + r + " , " + c + ")kill :" + kill + " nr :"+nr+"nc :"+nc+" d : "+d);
//							if (max < kill) {
//								max = kill;
//							}
//						}
//					}
//				}
//			}
			System.out.println(i + "회차" + max);
		}

	}

}
