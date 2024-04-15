package Swexpert_06_Stack2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Solution_1222_계산기1 {
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Stack<Character> stack = new Stack<>();
		String postfix = new String();

		
		for (int testcase = 1; testcase <= 10; testcase++) {
			String opcnt = br.readLine(); // 숫자,+ 개수
			String s = br.readLine(); // 실제 식

			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if ('0' <= c && c <= '9') { // 식이 피연산자이면
					postfix += c; // postfix에 바로 출력
				} else { // 식이 연산자이면
					if (stack.isEmpty()) { // 스택이 비어있으면
						stack.push(c); // 스택에 푸시
					} else { // 스택이 안 비어있으면
						postfix += stack.pop(); // top 하나 pop해서 출력
						stack.push(c); // 다시 푸시
					}
				}
			}
			postfix += stack.pop(); // 마지막 스택에 남아있는 +도 팝해서 출력

			Stack<Integer> number = new Stack<>(); // 계산을 위한 number 스택
			int result = 0; // 실제 계산될 변수 result

			for (int i = 0; i < postfix.length(); i++) {
				char c = postfix.charAt(i);
				if (c == '+') { // 식이 +이면 스택안에 2개 팝해서 더해준다음 스택에 푸시, result에 저장.
					int a = number.pop();
					int b = number.pop();
					result = number.push(a + b);
				} else { // 식이 피연산자이면 스택에 푸시(c가 문자라서 인트형으로 넣어주기 위해 '0'빼서 넣기)
					number.push(c - '0');
				}
			}
			bw.write("#"+testcase+" "+result+"\n");
		}
		bw.close();
	}
}
