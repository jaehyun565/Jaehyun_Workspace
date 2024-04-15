package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_15649_N과M_1 {
<<<<<<< HEAD
	static int N, M;
	static int[] arr;
	static boolean[] check;
	static StringBuilder sb = new StringBuilder();
=======
	static int N;
	static int M;
	static int tmp[];
	static boolean check[];
	static StringBuilder sb;
>>>>>>> 53f3ce759d3da7afeaaa3ecda817d58151b3cb65

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));				
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
<<<<<<< HEAD

		arr = new int[M];
		check = new boolean[N];

		perm(0);	
		System.out.println(sb);

	}

	public static void perm(int idx) {
		// base Case
		if (idx == M) {
			for (int i = 0; i < arr.length; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		// recursive Case
		for (int i = 0; i < N; i++) {
			if (check[i]) {
				continue;
			}
			arr[idx] = i+1;
			check[i] = true;
			perm(idx + 1);
			check[i] = false;
		}
=======
		tmp = new int[M];
		check = new boolean[M];
		recur(0, 0);
		System.out.println(sb);
	}

	private static void recur(int idx, int sidx) {
		// base Case
		if (sidx == M) {
			for (int i = 0; i < M; i++) {
				System.out.println(1+": "+idx +" , "+ sidx);
				System.out.println(Arrays.toString(tmp));
				sb.append(tmp[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		if (idx == N) {
			for (int i = 0; i < M; i++) {
				System.out.println(2+": "+idx +" , "+ sidx);
				System.out.println(Arrays.toString(tmp));
				sb.append(tmp[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		// recursive Case
		tmp[sidx] = idx;
		recur(idx + 1, sidx + 1);
		recur(idx + 1, sidx);
>>>>>>> 53f3ce759d3da7afeaaa3ecda817d58151b3cb65

	}

}
