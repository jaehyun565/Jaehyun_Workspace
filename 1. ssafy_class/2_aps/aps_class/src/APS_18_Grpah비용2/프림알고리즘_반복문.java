package APS_18_Grpah비용2;

import java.util.Arrays;
import java.util.Scanner;

public class 프림알고리즘_반복문 {
	static final int INF = Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner sc = new Scanner(input);

		int V = sc.nextInt(); // 정점의 수, 7
		int E = sc.nextInt(); // 간선의 수, 11

		// 그래프 입력받기
		int[][] adjArr = new int[V][V];

		for (int i = 0; i < E; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int W = sc.nextInt();
			// 무향그래프
			adjArr[A][B] = adjArr[B][A] = W;
		}
		// 입력 끝

		// 방문처리를 위해 배열선언
		boolean[] visited = new boolean[V];
		int[] p = new int[V]; // 이 간선이 어디서 온 간선인지?
		int[] dist = new int[V]; // key값, 가장 작은 비용을 저장하기 위한 배열

		// p, dist 초기화
		for (int i = 0; i < V; i++) {
			p[i] = -1; // p는 그냥 0으로 둬도 상관없음
			dist[i] = INF;
		}

		// 임의의 한점을 선택해서 사이클 돌리기
		dist[0] = 0; // 0 번 정점부터 시작
		int ans = 0;

		// 정점을 선택하는 사이클
		for (int i = 0; i < V; i++) {
			int min = INF;
			int idx = -1;
			// 아직 안 뽑힌 정점들 중 가장 작은 값을 뽑겠다
			for (int j = 0; j < V; j++) {
				if (!visited[j] && dist[j] < min) { // 아직 방문하지 않은 정점 중, 현재 dist가 가장 작은 값을 선택
					min = dist[j];
					idx = j;
				}
			} // 해당 for문 종료시, idx에는 방문하지 않은 정점 중 가장 작은 정점이 선택됨
			visited[idx] = true;

			// 뽑은 정점과 인접한 정점들 중 갱신할 수 있는 정점을 갱신
			for (int j = 0; j < V; j++) {
				if (!visited[j] && adjArr[idx][j] != 0 && dist[j] > adjArr[idx][j]) { // 그 정점을 방문안했고, 뽑은(idx)와 인접해있으며, 해당 정점의 현재 dist보다 실제 간선 거리가 더 짧으면 선택
					dist[j] = adjArr[idx][j]; // dist를 실제 간선거리로 갱신해주고
					p[j] = idx; // 부모를 idx로 바꿔준다

				}
			}
		}

		for (int i = 0; i < V; i++) {
			ans += dist[i];
		}
		
		System.out.println(Arrays.toString(dist));
		System.out.println(Arrays.toString(p));
		System.out.println(ans);

	}

	static String input = "7 11\r\n" + "0 1 32\r\n" + "0 2 31\r\n" + "0 5 60\r\n" + "0 6 51\r\n" + "1 2 21\r\n"
			+ "2 4 46\r\n" + "2 6 25\r\n" + "3 4 34\r\n" + "3 5 18\r\n" + "4 5 40\r\n" + "4 6 51\r\n" + "";
}
