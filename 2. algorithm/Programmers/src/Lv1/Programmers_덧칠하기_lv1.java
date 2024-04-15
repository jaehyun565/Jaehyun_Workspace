package Lv1;

import java.util.LinkedList;
import java.util.Queue;

public class Programmers_덧칠하기_lv1 {
	public static int solution(int n, int m, int[] section) {
		int answer = 0;

		Queue<Integer> queue = new LinkedList<>();
		for (int i : section) {
			queue.offer(i);
		}
		int a = queue.poll();
		int cnt = 1;
		while (!queue.isEmpty()) {
			if ((queue.peek() - a) < m) {
				queue.poll();
			} else {
				cnt++;	
				a = queue.poll();
			}
			
		}
		answer = cnt;

		return answer;
	}

	public static void main(String[] args) {

		int[] a = { 1,2,3,4 };

		int b = solution(4, 1, a);
		System.out.println(b);
	}
}
