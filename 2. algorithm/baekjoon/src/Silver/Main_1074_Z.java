package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1074_Z {
	static int[][] arr;
	static int N, r, c, cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		cnt = 0;
		N = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		int ans=0;

		while (N != 0) {
			N -= 1;
			int idx = (int) Math.pow(2, N);
			int l = (int) Math.pow(4, N);
			System.out.println("idx : "+idx + ", l :"+l);

			if (r >= idx && c >= idx) {
				ans += l * 3;
			} else if (r >= idx && c < idx) {
				ans += l * 2;
			} else if (r < idx && c >= idx) {
				ans += l * 1;
			} else {
				ans += l * 0;
			}
			System.out.println(ans);

		}
		System.out.println(ans);
	}

}
