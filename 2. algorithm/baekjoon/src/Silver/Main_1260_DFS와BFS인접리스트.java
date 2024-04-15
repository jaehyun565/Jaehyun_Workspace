package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1260_DFS와BFS인접리스트 {
	static boolean[] visited_dfs;
	static boolean[] visited_bfs;
	static List<Integer>[] list;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int V = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());
		visited_dfs = new boolean[V + 1];
		visited_bfs = new boolean[V + 1];

		list = new ArrayList[V + 1];

		for (int i = 0; i <= V; i++) {
			list[i] = new ArrayList<>();
		}

		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			list[a].add(b);
			list[b].add(a);
		}

		for (int i = 0; i <= V; i++) {
			Collections.sort(list[i]);
		}

		dfs(start);
		System.out.println();
		bfs(start);
	}

	private static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);
		visited_bfs[start] = true;

		while (!queue.isEmpty()) {
			int tmp = queue.poll();
			System.out.print(tmp + " ");

			for (int i : list[tmp]) {
				if (!visited_bfs[i]) {
					queue.add(i);
					visited_bfs[i] = true;
				}
			}
		}
	}

	private static void dfs(int start) {
		visited_dfs[start] = true;
		System.out.print(start + " ");
		for (int i = 0; i < list[start].size(); i++) {
			if (!visited_dfs[list[start].get(i)]) {
				dfs(list[start].get(i));
			}
		}

	}

}
