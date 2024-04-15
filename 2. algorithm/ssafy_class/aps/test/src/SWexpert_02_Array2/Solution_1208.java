package SWexpert_02_Array2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1208 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 10; i++) {
			int dump = Integer.parseInt(br.readLine()); // 덤프횟수
			String[] boxS = br.readLine().split(" "); // 박스
			int height = 0;
			int max = 0;
			int min = 0;
			int max_index = 0;
			int min_index = 0;
			int[] array = new int[100];

			// String array를 int array로 변환.
			for (int k = 0; k < 100; k++) {
				array[k] = Integer.parseInt(boxS[k]);
			}

			out: for (int j = 0; j < dump; j++) { // 덤프 횟수만큼 반복.
				max = -500;
				min = 500;
				// 덤프 1회 할 때 수행하는 명령.
				// 박스 높이에서 가장 높은 높이와, 가장 낮은 높이를 찾기.
				for (int k = 0; k < 100; k++) {

					if (max < array[k]) {
						max = array[k];
						max_index = k;
					}
					if (min > array[k]) {
						min = array[k];
						min_index = k;
					}
				}

				// 최대 최솟값이 나왔으면, 해당 값을 가지고 덤프 실행.
				if (max - min <= 1) {
					break out;
				} else {

					array[max_index]--;
					array[min_index]++;
				}

			}
			max = -500;
			min = 500;
			for (int j = 0; j < 100; j++) {

				if (max < array[j]) {
					max = array[j];			

				}
				if (min > array[j]) {
					min = array[j];

				}
			}

			height = max - min;
			System.out.println("#" + (i + 1) + " " + height);
		}
	}
}
