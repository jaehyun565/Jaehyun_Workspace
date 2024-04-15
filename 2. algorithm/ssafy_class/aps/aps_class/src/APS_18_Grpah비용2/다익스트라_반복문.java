package APS_18_Grpah비용2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 다익스트라_반복문 {
	static class Node {
		int v, w;

		public Node(int v, int w) {
			this.v = v;
			this.w = w;
		}
	}

	static final int INF = Integer.MAX_VALUE;
	static int V, E;
	static List<Node>[] adjList;
	static int[] dist;

	public static void main(String[] args) {
		Scanner sc = new Scanner(input);
		
		V = sc.nextInt();
		E = sc.nextInt();
		
		adjList = new ArrayList[V];
		for(int i =0;i<V;i++) {
			adjList[i] = new ArrayList<>();
		}
		
		dist =  new int[V];
		Arrays.fill(dist,  INF);
		
		for(int i = 0;i<E;i++) {			
			// 시작 정점에 add(끝정점, 가중치)
			adjList[sc.nextInt()].add(new Node(sc.nextInt(), sc.nextInt()));			
		}
		
		dijkstra(0);
		System.out.println(Arrays.toString(dist));
	}

	private static void dijkstra(int start) {
		boolean[] visited = new boolean[V]; // 방문처리를 할 친구
		dist[start] = 0; // 시작 노드까지의 거리는 0으로 초기화
		for (int i = 0; i < V; i++) {
			int min = INF;
			int idx = -1; // 방문하지 안항ㅆ으면서, 시작정점으로부부터 해당 idx 정점까지의 거리가 최소인 정점

			for (int j = 0; j < V; j++) {
				if (!visited[j] && min > dist[j]) {
					min = dist[j];
					idx = j;
				}
			}

			visited[idx] = true; // 방문선언

			for (Node node : adjList[idx]) {
				if (!visited[node.v] && dist[node.v] > dist[idx] + node.w) {
					dist[node.v] = dist[idx] + node.w;

				}
			}
		}
	}

	static String input = "6 11\r\n" + "0 1 4\r\n" + "0 2 2\r\n" + "0 5 25\r\n" + "1 3 8\r\n" + "1 4 7\r\n"
			+ "2 1 1\r\n" + "2 4 4\r\n" + "3 0 3\r\n" + "3 5 6\r\n" + "4 3 5\r\n" + "4 5 12";
}
