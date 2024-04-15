package sw_역량테스트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class swexpert_5658_보물상자비밀번호 {
	static Deque<Character> dequeue;
	static int N;
	static char[] c;
	static char[] char_num;
	static List<Integer> num;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int testCase = Integer.parseInt(br.readLine());

		for (int t = 1; t <= testCase; t++) {
			sb.append("#").append(t).append(" ");
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			num = new ArrayList<>();
			dequeue = new LinkedList<>();
			
			char_num = new char[N];
			String S = br.readLine();
			c = S.toCharArray();

			String a = new String(c, 1, 3);

			for (int i = 0; i < N; i++) {
				dequeue.addLast(c[i]);
			}

			for (int i = 0; i < N/4; i++) {
				dequeue.addFirst(dequeue.pollLast());
				calculate(c);
				for (int j = 0; j < N; j++) {
					c[j] = dequeue.peekFirst();
					dequeue.addLast(dequeue.pollFirst());
				}
			}
			Collections.sort(num, Collections.reverseOrder());
			sb.append(num.get(K-1)).append("\n");
			
		}
		System.out.println(sb);
	}

	public static void calculate(char[] c) {
		out: for (int i = 0; i < N; i += N / 4) {
			String a = new String(c, i, N / 4);			
			int b = Integer.parseInt(a, 16);

			for (int j = 0; j < num.size(); j++) {
				if (b == num.get(j)) {
					continue out;
				}
			}
			num.add(b);
		}
	}
}
