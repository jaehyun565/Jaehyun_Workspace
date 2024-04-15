package SWexpert_05_Stack1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solution_1218_괄호짝짓기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		next :for (int testCase = 1; testCase <= 10; testCase++) {
			int num = Integer.parseInt(br.readLine());			

			Stack<Character> stack = new Stack<>();
			String str = br.readLine();

			for (int i = 0; i < num; i++) {
				boolean isOK = false;

				if (str.charAt(i) == '(' || str.charAt(i) == '<' || str.charAt(i) == '{' || str.charAt(i) == '[') {
					stack.push(str.charAt(i));
					continue;
				} else if (str.charAt(i) == ')') {
					if (stack.isEmpty()) {
						System.out.println("#"+testCase+" "+0);
						continue next;
					} else if (stack.pop() == '(') {
						isOK = true;
					} else {
						System.out.println("#"+testCase+" "+0);
						continue next;
					}
				} else if (str.charAt(i) == '}') {
					if (stack.isEmpty()) {
						System.out.println("#"+testCase+" "+0);
						continue next;
					} else if (stack.pop() == '{') {
						isOK = true;
					} else {
						System.out.println("#"+testCase+" "+0);
						continue next;
					}
				} else if (str.charAt(i) == '>') {
					if (stack.isEmpty()) {
						System.out.println("#"+testCase+" "+0);
						continue next;
					} else if (stack.pop() == '<') {
						isOK = true;
					} else {
						System.out.println("#"+testCase+" "+0);
						continue next;
					}
				} else if (str.charAt(i) == ']') {
					if (stack.isEmpty()) {
						System.out.println("#"+testCase+" "+0);
						continue next;
					} else if (stack.pop() == '[') {
						isOK = true;
					} else {
						System.out.println("#"+testCase+" "+0);
						continue next;
					}
				}
			}
			
			if (!stack.isEmpty()) {
				System.out.println("#"+testCase+" "+0);

			} else {
				System.out.println("#"+testCase+" "+1);
			}

		}
	}
}
