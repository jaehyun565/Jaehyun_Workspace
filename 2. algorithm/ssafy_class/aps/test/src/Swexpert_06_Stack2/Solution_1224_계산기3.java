package Swexpert_06_Stack2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution_1224_계산기3 {
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Map<Character, Integer> priority = new HashMap<>();
		priority.put('+', 1);
		priority.put('-', 1);
		priority.put('*', 2);
		priority.put('/', 2);
		priority.put('(', 0);

		for (int testcase = 1; testcase <= 10; testcase++) {
			Stack<Character> stack = new Stack<>();

			br.readLine();
			String expression = br.readLine();
			String postfix = new String();
			for (int i = 0; i < expression.length(); i++) {
				char c = expression.charAt(i);
				if (c == '(') {
					stack.push(c);
				} else if (c == ')') {
					while (stack.peek() != '(') {
						postfix += stack.pop();
					}
					stack.pop();
				} else if ('0' <= c && c <= '9') {
					postfix += c;
				} else {
					if (stack.isEmpty()) {
						stack.push(c);
					} else {
						while (!stack.isEmpty() && priority.get(c) < priority.get(stack.peek())) {
							postfix += stack.pop();
						}
						stack.push(c);
					}
				}
			}
			// Step2. 계산
			Stack<Integer> numStack = new Stack<>();

			for (char c : postfix.toCharArray()) {
				if ('0' <= c && c <= '9') {
					numStack.push(c - '0');
				} else {
					int a = numStack.pop();
					int b = numStack.pop();					
					switch (c) {
					case '+':
						numStack.push(b + a);
						break;
					case '-':
						numStack.push(b - a);
						break;
					case '*':
						numStack.push(b * a);
						break;
					case '/':
						numStack.push(b / a);
						break;
					}
				}
			}
			int result = numStack.pop();
			bw.write("#"+testcase+" "+result+"\n");
		}
		bw.close();		

	}
}
