package Lv0;

import java.util.Arrays;

public class permutation {
	static int[] a = { 1, 2, 3, 4 };
	static boolean[] visited;
	static int[] answer = new int[2];

	public static void main(String[] args) {
		visited = new boolean[4];
		permutation(0);
	}

	public static void permutation(int idx) {
		// base Case
		if (idx == 2) {
			System.out.println(Arrays.toString(answer));
			return;
		}
		// recursive Case
		for (int i = 0; i < 4; i++) {
			if (visited[i]) {
				continue;
			}
			answer[idx] = a[i];
			visited[i] = true;
			permutation(idx + 1);
			visited[i] = false;
		}

	}
}
