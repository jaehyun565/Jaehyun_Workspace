package SWexpert_05_Stack1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Solution_5432_쇠막대기자르기 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		System.setIn(new FileInputStream("sample_input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int testCase = 1; testCase <= T; testCase++) {
			Stack<Character> stack = new Stack<>();
			String s = br.readLine();
			int cnt = 0;
			int initalPipe = 0;

			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '(') {
					stack.push(s.charAt(i));
				} else if (s.charAt(i) == ')') {
					if (s.charAt(i - 1) == '(') {
						stack.pop();
						cnt += stack.size();
					} else if (s.charAt(i - 1) == ')') {
						stack.pop();
						initalPipe++;
					}
				}
			}
			bw.write("#" + testCase + " " + (cnt + initalPipe) + "\n");
		}
		bw.close();

	}

}
