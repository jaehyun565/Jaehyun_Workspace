package SWexpert_05_Stack1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solution_8931_제로 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.setIn(new FileInputStream("sample_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int testCase = 1; testCase <= T; testCase++) {
			int K = Integer.parseInt(br.readLine());
			Stack<Integer> stack = new Stack<Integer>();
			int sum =0;
			for (int i = 0; i < K; i++) {
				
				stack.push(Integer.parseInt(br.readLine()));				
				if (stack.peek() == 0) {
					stack.pop();
					stack.pop();
				}
			}
			while(!stack.isEmpty()) {		
				sum += stack.pop();
			}
			System.out.println("#"+testCase + " "+sum);
			
		}
	}
}
