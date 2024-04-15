package D4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swexpert_3289_서로소집합_민규코드 {
	static int[] represent;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());

		for (int t = 1; t <= testCase; t++) {
			StringBuilder sb = new StringBuilder();
			sb.append("#").append(t).append(" ");
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			represent = new int[n + 1];
			for (int i = 1; i <= n; i++) {
				represent[i] = i;
			}

			for (int i = 0; i < m; i++) {
				st = new StringTokenizer(br.readLine());
				boolean isZero = (Integer.parseInt(st.nextToken()) == 0);
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());

				if (isZero) {
					union(a, b);
				} else {
					if (findset(a) == findset(b)) {
						sb.append(1);
					} else {
						sb.append(0);
					}

				}
			}			
			System.out.println(sb);
		}
	}

	static void union(int x, int y) {
		represent[represent[y]] = represent[x];
		represent[y] = represent[x];
		
	}

	static int findset(int x) {
		if (x != represent[x]) {
			represent[x] = findset(represent[x]);
		}
		return represent[x];
	}

}
