package Swexpert_12_문제풀이;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_4613_러시아국기같은깃발 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testCase = Integer.parseInt(br.readLine());

		for (int t = 1; t <= testCase; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			int[] w = new int[N];
			int[] b = new int[N];
			int[] r = new int[N];

			for (int i = 0; i < N; i++) {
				w[i] = M;
				b[i] = M;
				r[i] = M;				
				String s = br.readLine();
				for (int j = 0; j < M; j++) {
					if (s.charAt(j) == 'W') {											
						w[i]-- ;
					} else if (s.charAt(j) == 'B') {
						b[i]--;
					} else {
						r[i]--;
					}
				}
			}
			int[] sumW = new int[N];
			int[] sumB = new int[N];
			int[] sumR = new int[N];
			sumW[0] = w[0];
			sumB[0] = b[0];
			sumR[0] = r[0];
			for (int i = 1; i < N; i++) {
				sumW[i] = sumW[i - 1] + w[i]; // i번째 줄까지의 w로 만들기 위해 고쳐야 값 = 그 전줄까지 + i번째 줄
				sumB[i] = sumB[i - 1] + b[i];
				sumR[i] = sumR[i - 1] + r[i];
			}

			int min = Integer.MAX_VALUE;
			for (int i = 0; i < N - 2; i++) { // 0 ~ 2
				for (int j = i + 1; j < N - 1; j++) { // 1 ~ 3
					int sum = 0;
					sum += sumW[i];
					sum += sumB[j] - sumB[i];
					sum += sumR[N-1] - sumR[j];					
					if (min > sum) {
						min = sum;
					}
				}

			}
			bw.write("#"+t+" "+min+"\n");
		}
		bw.close();
	}
}
