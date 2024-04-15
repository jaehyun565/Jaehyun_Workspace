package SWexpert_11_Heap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_2930_백만장자프로젝트 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testCase = Integer.parseInt(br.readLine());

		for (int t = 1; t <= testCase; t++) {
			int N = Integer.parseInt(br.readLine());
			long[] cost = new long[N];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				cost[i] = Integer.parseInt(st.nextToken());
			}

			long max;
			int maxDay = -1;
			long answer = 0;

			int maxcnt = 0;
			int i = 0;
			int j = -1;
			long premax = -1;
			while (true) {
				max = 0;
				for (i = maxDay + 1; i < N; i++) {
					if (cost[i] > max) {
						max = cost[i];
						maxDay = i;
					}
					if (cost[i] == premax) {
						maxcnt++;
					}
				}
				System.out.println(maxcnt);
				if (premax == max) {
					maxcnt--;
					if (maxcnt < 0) {
						bw.write("#" + t + " " + answer + "\n");
						break;
					}
				}
				premax = max;
				while (j < maxDay) {
//					System.out.println("j : " + j);
					answer += max - cost[++j];
				}
			}
		}
		bw.close();

	}

}
