package APS_19_위상정렬;

import java.util.Scanner;
import java.util.Stack;

public class 위상정렬_Stack {
	public static String[] cook = { "", "재료구매", "양념장만들기", "고기재우기", "고기손질", "제육볶음만들기", "식사", "뒷정리", "채소손질", "밥하기" };
	static int V, E;
	static int[][] adj;
	static int[] degree;
	static boolean[] visited;
	static Stack<Integer> stack;
	public static void main(String[] args) {
		Scanner sc = new Scanner(input);
		StringBuilder sb = new StringBuilder();

		V = sc.nextInt(); // 정점의 수
		E = sc.nextInt(); // 간선의 수

		adj = new int[V + 1][V + 1]; // 정점의 번호가 1번부터 시작하겠다는 의미
		degree = new int[V + 1]; // 진입차수 저장
		visited = new boolean[V+1];
		stack = new Stack<>();

		for (int i = 0; i < E; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			adj[A][B] = 1; // 가중치가 따로 없기 때문에 1로 표기, 유향이니 반대방향은 처리하지 않음

			degree[B]++;
		}
		
		for(int i = 1;i<V+1;i++) {
			if(degree[i] == 0) {
				DFS(i);
			}
		}
		
		while(!stack.isEmpty()) {
			System.out.println(cook[stack.pop()]);
		}
	}
	
	static void DFS(int v) {
		visited[v] = true;
		
		for(int i = 1; i<V+1;i++) {
			if(adj[v][i] == 1 && !visited[i]) {
				DFS(i);
			}
		}
		
		// 이게 실행된다는 건 더 이상 할일이 없다는 뜻임
		stack.add(v);
		
	}

	static String input = "9 9\r\n" + "1 4\r\n" + "1 8\r\n" + "2 3\r\n" + "4 3\r\n" + "8 5\r\n" + "3 5\r\n" + "5 6\r\n"
			+ "9 6\r\n" + "6 7\r\n" + "";
}
