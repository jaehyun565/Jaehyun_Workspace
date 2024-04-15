package APS_15_Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 그래프_02_인접리스트 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int V = sc.nextInt();
		int E = sc.nextInt();
		
		// 인접리스트는 ArrayList의 배열
		List<Integer>[] adjList = new ArrayList[V];
		
		// 초기화 작업(참조자료형의 기본 값은 null이라서 초기화 해줘야함)
		for(int i = 0; i<V; i++) {
			adjList[i] = new ArrayList<>();
		}
		
		// 간선 입력받기
		for(int i = 0;i<E;i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int W = sc.nextInt();
			
			
			// 가중치를 함께 저장하고 싶으면 사용자 정의 클래스를 만들어 넣던지
			// int[] 형태를 넣던지 해야됨.
			adjList[A].add(B);
			adjList[B].add(A);
		}
	}
}
