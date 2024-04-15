package SWexpert_04_String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_1989_초심자의회문검사 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.setIn(new FileInputStream("input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());

		test :for (int i = 1; i <= T; i++) {
			String str = br.readLine();

			char[] c = str.toCharArray();

			for (int j = 0; j < c.length/2; j++) {
				if (c[j] != c[c.length - 1 - j]) { // 다르면 브레이킹 
					bw.write("#"+i+" 0");
					bw.newLine();
					continue test;					
				}				
			}	
			bw.write("#"+i+" 1");
			bw.newLine();
		}
		bw.flush();
		bw.close();
		
	}
}
