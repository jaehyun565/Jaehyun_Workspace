package APS_16_graph탐색;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class 그래프탐색_02_BFS {
	static int V;
	static List<Integer>[] adj;
	static boolean[] visited;

	public static void main(String[] args) throws IOException{
		FileInputStream file = new FileInputStream("APS_16_그래프탐색_01_DFS_input.txt");
		Scanner sc = new Scanner(file);

		V = sc.nextInt();
		int E = sc.nextInt();

		// 연결리스트로 구현해보자!
		adj = new ArrayList[V+1];
		for(int i = 1; i<=V ; i++) {
			adj[i] = new ArrayList<>();
		}
		visited = new boolean[V + 1];

		for (int i = 0; i < E; i++) {
			int st = sc.nextInt(); // 앞 노드
			int ed = sc.nextInt(); // 뒷 노드

			adj[st].add(ed);
			adj[ed].add(st);
		}
		// 여기까지 노드 및 간선정보 입력 완료
		for(List list : adj) {
			System.out.println(list);
		}
		// 1번 노드부터 
		DFS(1);

	}

	// v : 시작정점
	public static void DFS(int v) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(v); // 시작 정점을 큐에 넣기
		visited[v] = true; // 시작 정점 방문처리
		
		// 큐가 공백상태 될 때까지 반복문 수행
		while(!queue.isEmpty()) {
			int curr = queue.poll(); // 넣어 놓은 정점 꺼내기
			System.out.println(curr); // 이 경로 왔다는거 티내기
			
			// 인접리스트
			for(int i : adj[curr]) {
				if(!visited[i]) {
					queue.add(i);
					visited[i] = true; 
				}
			}
		}		
	}

}
