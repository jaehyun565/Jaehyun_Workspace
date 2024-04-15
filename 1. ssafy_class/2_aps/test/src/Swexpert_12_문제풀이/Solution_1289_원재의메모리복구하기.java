package Swexpert_12_문제풀이;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_1289_원재의메모리복구하기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testCase = Integer.parseInt(br.readLine());

		for (int t = 1; t <= testCase; t++) {
			char[] c = br.readLine().toCharArray();
			char idx = '0';
			int cnt = 0;
			for (int i = 0; i < c.length; i++) {
				if (c[i] != idx) {
					cnt++;
					idx = c[i];
				}
			}
			bw.write("#"+t+" "+cnt+"\n");
		}
		bw.close();
	}
}
