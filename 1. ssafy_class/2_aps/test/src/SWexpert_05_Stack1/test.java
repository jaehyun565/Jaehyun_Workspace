package SWexpert_05_Stack1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class test {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int i = 1; i <= T; i++) {
			String s = br.readLine();
			int j = answer(s);
			System.out.println("#" + i + " " + j);
		}

	}

	public static int answer(String s) {
//		Stack<Character> stack = new Stack<>();
		int pype = 0;
		int razer = 0;
		int answer = 0;
		for (int i = 0; i < s.length(); i++) {
//			stack.push(s.charAt(i));
			if (s.charAt(i) == '(') {
				pype++;
			} else if (s.charAt(i - 1) == '(' && s.charAt(i) == ')') {
				razer++;
				pype--;
				if ((i + 1) < s.length() && pype == 0) {
					razer--;
				}
				answer += pype;
				// System.out.println(i+"번째 위치, pype개수: "+pype+", razer 갯수: "+razer+", 현재
				// answer: "+answer);
			} else {
				answer++;
				razer = 0;
				pype--;
			}
		}

		return answer;
	}

}
