package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1920_수찾기 {
	static int[] arr;
	static int key;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int M = Integer.parseInt(br.readLine());
		int[] problem = new int[M];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			problem[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);
		for (int i = 0; i < M; i++) {
			key = problem[i];
			binarySearch(0, N - 1);

		}
	}

	private static void binarySearch(int st, int ed) {
		if (st > ed) {
			System.out.println(0);
			return;
		}
		int mid = (st + ed) / 2;
		if(key==arr[mid]) {
			System.out.println(1);
			return;
		}
		if (key < arr[mid]) {
			binarySearch(st, mid-1);
		} else {
			binarySearch(mid+1, ed);
		}

	}
}
