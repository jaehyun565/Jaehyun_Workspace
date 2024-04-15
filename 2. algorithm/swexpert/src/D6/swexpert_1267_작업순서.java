package D6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class swexpert_1267_작업순서 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		for (int t = 1; t <= 10; t++) {
			sb.append("#").append(t).append(" ");
			StringTokenizer st = new StringTokenizer(br.readLine());
			int V = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());

			int[][] arr = new int[V + 1][V + 1];
			// 진입차수 늘려주는 배열
			int[] degree = new int[V + 1];

			st = new StringTokenizer(br.readLine());
			for (int i = 1; i <= E; i++) {
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());

				arr[a][b] = 1;

				degree[b]++;
			}

			Queue<Integer> queue = new LinkedList<>();

			for (int i = 1; i <= V; i++) {
				if (degree[i] == 0) {
					queue.offer(i);
				}
			}

			while (!queue.isEmpty()) {				
				int tmp = queue.poll();
				sb.append(tmp).append(" ");

				for (int i = 1; i <= V; i++) {
					if (arr[tmp][i] == 1) {
						degree[i]--;
						
						if (degree[i] == 0) {
							queue.offer(i);
						}
					}
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
