package APS_18_Grpah비용2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 프림알고리즘_우선순위큐 {
	static final int INF = Integer.MAX_VALUE;

	static class Edge implements Comparable<Edge> {
		int st, ed, w;

		public Edge(int st, int ed, int w) {
			this.st = st;
			this.ed = ed;
			this.w = w;
		}

		@Override
		public int compareTo(Edge o) {
			return Integer.compare(this.w, o.w);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(input);

		int V = sc.nextInt(); // 정점의 수, 7
		int E = sc.nextInt(); // 간선의 수, 11

		// 그래프 입력받기
		List<Edge>[] adjList = new ArrayList[V];

		for (int i = 0; i < V; i++) {
			adjList[i] = new ArrayList<>();
		}

		for (int i = 0; i < E; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int W = sc.nextInt();

			adjList[A].add(new Edge(A, B, W));
			adjList[B].add(new Edge(B, A, W));
		}
		// 입력 끝

		// 방문처리를 위해 배열선언
		boolean[] visited = new boolean[V];

		PriorityQueue<Edge> pq = new PriorityQueue<>();

		// 시작점을 선택
		visited[0] = true;

		// 0번 정점과 인접한 친구들을 몽땅 넣자
		for (int i = 0; i < adjList[0].size(); i++) {
			pq.add(adjList[0].get(i));
		}
//		// 이 방법도 가능하고
//		for(Edge e : adjList[0]) {
//			pq.add(e);
//		}
//		// 이 방법도 가능하다
//		pq.addAll(adjList[0]);

		int pick = 1; // 현재 확보한 정점의 개수
		int ans = 0;

		while (pick != V) {
			Edge e = pq.poll(); // 현재 연결된 간선 중 가장 간선의 길이가 짧은 정점을 뽑음
			// 0번을 시작으로 했을 때는 2번 정점이 가장 먼저 뽑혔을 것
			// 이 뽑은 정점이 이미 방문한 점이라면 넘어가
			if (visited[e.ed])
				continue;
			ans += e.w;
			visited[e.ed] = true;
			pick++;

			// 반복문을 돌면서 갱신할 수 있는 거 전부 갱신
			pq.addAll(adjList[e.ed]);
		}

		System.out.println(ans);

	}

	static String input = "7 11\r\n" + "0 1 32\r\n" + "0 2 31\r\n" + "0 5 60\r\n" + "0 6 51\r\n" + "1 2 21\r\n"
			+ "2 4 46\r\n" + "2 6 25\r\n" + "3 4 34\r\n" + "3 5 18\r\n" + "4 5 40\r\n" + "4 6 51\r\n" + "";
}
