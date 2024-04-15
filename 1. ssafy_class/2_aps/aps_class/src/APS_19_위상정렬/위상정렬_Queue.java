package APS_19_위상정렬;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 위상정렬_Queue {
	public static String[] cook = { "", "재료구매", "양념장만들기", "고기재우기", "고기손질", "제육볶음만들기", "식사", "뒷정리", "채소손질", "밥하기" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(input);
		StringBuilder sb = new StringBuilder();

		int V = sc.nextInt(); // 정점의 수
		int E = sc.nextInt(); // 간선의 수

		int[][] adj = new int[V + 1][V + 1]; // 정점의 번호가 1번부터 시작하겠다는 의미
		int[] degree = new int[V + 1]; // 진입차수 저장

		for (int i = 0; i < E; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			adj[A][B] = 1; // 가중치가 따로 없기 때문에 1로 표기, 유향이니 반대방향은 처리하지 않음

			degree[B]++;
		}

		Queue<Integer> queue = new LinkedList<>();

		// 큐로 위상정렬 구현
		// 1. 진입차수가 0인 정점들을 넣기
		for (int i = 1; i < V + 1; i++) {
			if (degree[i] == 0) {
				queue.offer(i);
			}
		}
		// 2. 큐가 공백상태가 될 때까지 반복한다
		while (!queue.isEmpty()) {
			// 2-1. 하나 꺼내기
			int curr = queue.poll();
			sb.append(cook[curr]).append("->");
			// 2-2. 연결되어 있는 간선의 진입차수를 줄여준다
			for (int i = 0; i < V + 1; i++) {
				if (adj[curr][i] == 1) {
					degree[i]--; // 진입차수를 하나 깎는다
//					adj[curr][i]=0 이라고 하면 진짜로 연결까지 끊는 것
					
					// 2-3. 진입차수가 새로 0이 되었다면 큐에 넣기
					if(degree[i] == 0) {
						queue.offer(i);
					}
				}
			}
		}
		System.out.println(sb);

	}

	static String input = "9 9\r\n" + "1 4\r\n" + "1 8\r\n" + "2 3\r\n" + "4 3\r\n" + "8 5\r\n" + "3 5\r\n" + "5 6\r\n"
			+ "9 6\r\n" + "6 7\r\n" + "";
}
