package APS_15_Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 그래프_03_간선배열 {

	static class Edge {
		int A, B; // 시작과 끝 노드

		public Edge(int a, int b) {
			A = a;
			B = b;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int V = sc.nextInt();
		int E = sc.nextInt();

		// 1. 객체로 만들기
		Edge[] edges = new Edge[E]; 
		List<Edge> edges2 = new ArrayList<>();

		for (int i = 0; i < E; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			edges[i] = new Edge(A, B);
		}
	}
}
