package Swexpert_12_문제풀이;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution_6190_정곤이의단조증가하는수 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testCase = Integer.parseInt(br.readLine());
		for (int t = 1; t <= testCase; t++) {
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] numArr = new int[N];
			for (int i = 0; i < N; i++) {
				numArr[i] = Integer.parseInt(st.nextToken());
			}
			List<Integer> arr = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N && j != i; j++) {
					arr.add(numArr[i] * numArr[j]);
				}
			}
			System.out.println(arr);
			int max = 0;
			out: for (int i = 0; i < arr.size(); i++) {				
				int a = arr.get(i);
				int b = a / 10;
				if(b == 0) {
					continue out;
				}
				while (a != 0) {					
					if (a % 10 < b % 10) {
						continue out;
					}
					a = b;
					b /= 10;
				}				
				max = Math.max(max, arr.get(i));								
			}
			if(max == 0) {
				bw.write("#"+t+" "+-1+"\n");
			} else {
				bw.write("#"+t+" "+max+"\n");
			}			
		}
		bw.close();

	}
}
