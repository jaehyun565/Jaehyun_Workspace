package Lv0;

import java.util.Arrays;

public class combination {
	static int[] a = { 1, 2, 3, 4 };
	static boolean[] visited;
	static int[] answer = new int[2];

	public static void main(String[] args) {
		visited = new boolean[4];
		combination(0,0);
	}

	public static void combination(int idx, int sidx) {
		// base Case
		if(sidx==2) {
			System.out.println(Arrays.toString(answer));
			return;
		}
		// recursive Case
		for(int i = 0;i<4;i++) {
			answer[sidx] = a[i];
			combination(i+1,sidx+1);
		}
		
	}
}

