package APS_16_graph탐색;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class 그래프탐색_01_DFS {
	static int V;
	static int[][] adj;
	static boolean[] visited;

	public static void main(String[] args) throws IOException{
		FileInputStream file = new FileInputStream("APS_16_그래프탐색_01_DFS_input.txt");
		Scanner sc = new Scanner(file);

		V = sc.nextInt();
		int E = sc.nextInt();

		adj = new int[V + 1][V + 1]; // 시작정점을 1부터 시작하게
		visited = new boolean[V + 1];

		for (int i = 0; i < E; i++) {
			int st = sc.nextInt(); // 앞 노드
			int ed = sc.nextInt(); // 뒷 노드

			adj[st][ed] = adj[ed][st] = 1; // 인접행렬(무향)이라 이렇게
		}
		// 여기까지 노드 및 간선정보 입력 완료
		
		// 1번 노드부터 
		DFS(1);

	}

	public static void DFS(int v) {
		// v 방문처리
		visited[v] = true;
		System.out.println(v);

		// 인접한 친구들 방문 (인접행렬, 인접리스트의 코드가 좀 다름)
		for (int i = 1; i <= V; i++) { // 처음부터 끝정점까지 조회
			if (!visited[i] && adj[v][i] == 1) { // i를 방문을 안 했고, 현재 정점v와 새 정점 i가 연결되어있으면
				DFS(i);
			}
		}

//		// 인접 리스트로 했을 때는 이렇게도 사용 가능하다
//		for(int i : adj[V]) {
//			if(!visited[i]) {
//				DFS(i);
//			}
//		}
	}

}
