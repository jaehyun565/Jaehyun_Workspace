package APS_15_Graph;

import java.util.Scanner;

public class 그래프_01_인접행렬 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int V = sc.nextInt(); // 정점의 개수
		int E = sc.nextInt(); // 간선의 개수
		
		// 문제에 따라 V * V로 만들수도 있고
		// V+1 * V+1 로 만들수도 있다.
		int[][] adjArr = new int[V][V]; 
		
		for(int i = 0; i < E;i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			// int W = sc.nextInt(); // 경우에 따라 가중치 입력받을 수도 있음
			
			adjArr[A][B] = 1;
			adjArr[B][A] = 1; // 이 코드는 무향일때만 작성할 것.
			
		}
	}
}
