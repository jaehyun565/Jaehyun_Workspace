package D2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.io.IOException;

public class swexpert_1926_간단한369게임 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		Stack<Character> stack1 = new Stack<>();
		for (int i = 1; i <= num; i++) {
			char[] c = Integer.toString(i).toCharArray();
			for (int j = 0; j < c.length; j++) {
				if (c[j] == '3' || c[j] == '6' || c[j] == '9') {
					stack1.push('-');
				}
			}
			
			if (stack1.isEmpty()) {
				System.out.print(i + " ");
			} else {
				while (!(stack1.isEmpty())) {
					System.out.print(stack1.pop());
				}
				System.out.print(" ");
			}

		}

	}
}
