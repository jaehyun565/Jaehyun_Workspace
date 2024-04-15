package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1260_DFS와BFS인접행렬 {
	static boolean[] visited_dfs;
	static boolean[] visited_bfs;
	static int[][] list;
	static int V;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		V = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());
		visited_dfs = new boolean[V + 1];
		visited_bfs = new boolean[V + 1];

		list = new int[V + 1][V + 1];

		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			list[a][b] = list[b][a] = 1;
		}

		dfs(start);
		System.out.println();
		bfs(start);

	}

	private static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		visited_bfs[start] = true;
		queue.offer(start);

		while (!queue.isEmpty()) {
			int curr = queue.poll();
			System.out.print(curr + " ");
			for (int i = 1; i <= V; i++) {
				if(list[curr][i]==1 && !visited_bfs[i]) {
					queue.offer(i);
					visited_bfs[i] = true;
				}
			}
		}
	}

	private static void dfs(int start) {
		visited_dfs[start] = true;
		System.out.print(start + " ");

		for (int i = 1; i <= V; i++) {
			if (!visited_dfs[i] && list[start][i] == 1) {
				dfs(i);
			}
		}
	}

}
