package Swexpert_06_Stack2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_1217_거듭제곱 {
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for (int i = 1; i <= 10; i++) {
			br.readLine();
			String s[] = br.readLine().split(" ");
			bw.write("#" + i + " " + power(Integer.parseInt(s[0]), Integer.parseInt(s[1])) + "\n");
		}
		bw.close();
	}

	public static int power(int n, int m) throws IOException {

		while (m == 0) {
			return 1;

		}
		return n * power(n, m - 1);
	}
}
