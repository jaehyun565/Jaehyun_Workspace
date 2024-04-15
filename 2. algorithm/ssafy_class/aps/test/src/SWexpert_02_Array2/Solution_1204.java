package SWexpert_02_Array2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1204 {
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			int testNum = Integer.parseInt(br.readLine()); // test번호 저장.

			String[] numS = br.readLine().split(" "); // numS에 숫자들 String 배열로 저장.

			int[] count = new int[101];

			for (int j = 0; j < 1000; j++) {
				count[Integer.parseInt(numS[j])]++;
			}
			int max = count[0];
			int max_count = 0;
			for (int j = 0; j < 101; j++) {				
				if (max <= count[j]) {
					max = count[j];
					max_count = j;
				}
			}
			System.out.println("#"+testNum +" "+ max_count);
		}

	}

}
