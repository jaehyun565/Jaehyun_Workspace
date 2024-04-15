package SWexpert_03_Array3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution_1209_sum {
	public static void main(String[] args) throws NumberFormatException, IOException {

		System.setIn(new FileInputStream("input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = 100;
		int[][] arr = new int[N][N];

		int t = 0;
		while (t < 10) {
			
			int T = Integer.parseInt(br.readLine());			
			// 배열 생성.
			for (int r = 0; r < N; r++) {
				String[] s = br.readLine().split(" ");
				int j = 0;
				for (int c = 0; c < N; c++) {
					arr[r][c] = Integer.parseInt(s[j]);
					j++;
				}
			}

			// 가로 합
			List<Integer> array = new ArrayList<Integer>();

			int sum;
			for (int r = 0; r < N; r++) {
				sum = 0;
				for (int c = 0; c < N; c++) {

					sum += arr[r][c];
				}
				array.add(sum);
			}

			// 세로 합
			for (int c = 0; c < N; c++) {
				sum = 0;
				for (int r = 0; r < N; r++) {

					sum += arr[r][c];
				}
				array.add(sum);
			}

			// 좌하대각선 합
			sum = 0;
			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					if (r == c) {
						sum += arr[r][c];
					}
				}
			}
			array.add(sum);

			// 우하대각선 합
			sum = 0;
			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					if (r + c == arr.length - 1) {
						sum += arr[r][c];
					}
				}
			}
			array.add(sum);

			int max = 0;
			for (int i = 0; i < array.size(); i++) {
				if (max < array.get(i)) {
					max = array.get(i);
				}
			}
			System.out.println("#" + T);
			System.out.println(max);

			t++;
			
		}

	}

}
