package SWexpert_07_Queue1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution_7102_준홍이의카드놀이 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());

		for (int testCase = 1; testCase <= t; testCase++) {
			bw.write("#"+testCase+" ");
			Queue<Integer> queue1 = new LinkedList<>();
			Queue<Integer> queue2 = new LinkedList<>();
			String[] s = br.readLine().split(" ");
			int[] cnt = new int[41];
			int N = Integer.parseInt(s[0]);
			int M = Integer.parseInt(s[1]);

			for (int i = 1; i <= N; i++) {
				queue1.offer(i);
			}
			for (int i = 1; i <= M; i++) {
				queue2.offer(i);
			}

			for (int i = 0; i < N; i++) {
				int a = queue1.poll();
				for (int j = 0; j < M; j++) {
					int b = queue2.poll();
					cnt[a + b]++;
					queue1.offer(a);
					queue2.offer(b);
				}
			}

			// 가장 많이 나온 횟수 찾기
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < cnt.length; i++) {
				if (max < cnt[i]) {
					max = cnt[i];
				}
			}
			// 가장 많이 나온 횟수와 같은 인덱스 번호 찾기
			for(int i = 0;i<cnt.length;i++) {
				if(max == cnt[i]) {
					bw.write(i + " ");
				}
			}
			bw.write("\n");
		}
		bw.close();
	}
}
