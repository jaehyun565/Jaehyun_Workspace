package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_1874_스택수열 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int idx = 1;
		for(int i = 0;i<N;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int target_idx = 0;
		// idx를 끝까지 다 집어넣었고, 스택이 비어있으면 => 정상 수행 다 했으면 멈춤
		while (!(stack.isEmpty()) || idx <= N) {
			// 스택에 수 집어넣기
			stack.push(idx++);
			sb.append("+").append("\n");
			// 현재 최 상단의 값이 타겟값과 같으면
			if (stack.peek() == arr[target_idx]) {
				while (!(stack.isEmpty()) && stack.peek() == arr[target_idx]) {
					stack.pop();
					sb.append("-").append("\n");
					if (stack.isEmpty() && idx > N)
						break;
					target_idx++;
				}
			} else if (stack.peek() > arr[target_idx]) {
				break;
			}

		}
		if (stack.isEmpty()) {
			System.out.println(sb);
		} else {
			System.out.println("NO");
		}
	}
}
