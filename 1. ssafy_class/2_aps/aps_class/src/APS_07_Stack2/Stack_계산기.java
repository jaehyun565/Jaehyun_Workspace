package APS_07_Stack2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Stack_계산기 {
	public static void main(String[] args) {
		// 연산자의 우선순위를 관리하기 위해 Map을 사용해보자
		// Map을 통해 연산자와 정수를 Mapping하는 식
		// Map은 인터페이스라서, 구현체인 HashMap사용
		Map<Character, Integer> priority = new HashMap<>();

		// 연산우선순위
		// 1. 스택밖의 여는괄호 / 2. 곱하기, 나누기 / 3. 더하기, 빼기 / 4. 스택안의 여는괄호
		// 우선순위는 스택내의 우선순위를 계산하기 위한 용도이므로 2, 3, 4번만 정해주면 됨.

		priority.put('+', 1);
		priority.put('-', 1);
		priority.put('*', 2);
		priority.put('/', 2);
		priority.put('(', 0);

		Scanner sc = new Scanner(System.in);

		String expression = sc.next(); // 수식을 받을 문자열
		// Step1. 중위표기식 -> 후위표기식으로 변환
		String postfix = ""; // => 후위표기식을 받을 빈문자열
		Stack<Character> op = new Stack<>();

		for (int i = 0; i < expression.length(); i++) {
			char c = expression.charAt(i);

			if (c == '(') { // 여는괄호는 바로 push
				op.push(c);
			} else if (c == ')') { // 닫는 괄호 나오면 top에 여는괄호 있을 때까지 pop하면서 출력
				while (op.peek() != '(') {
					postfix += op.pop();
				}
				op.pop(); // 밎;믹
			} else if ('0' <= c && c <= '9') { // 이번 문제에서는 한자리 숫자만 들어온다고 가정.
				postfix += c;
			} else { // 이제 연산자만 남았다!
				if (op.isEmpty()) { // 스택이 비어있으면 걍 push
					op.push(c);
				} else { // 비어있지 않으면 우선순위가 낮은 연산자가 top에 있을 때까지 pop
					while (!op.isEmpty() &&priority.get(c) <= priority.get(op.peek())) {	
						postfix += op.pop();
					}
					op.push(c);
				}
			}
		}
		System.out.println(postfix);

	}
}
