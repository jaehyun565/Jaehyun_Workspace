package APS_17_Grpah비용;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 크루스칼알고리즘 {
	static int[] p; // 대표를 저장할 배열

	public static void main(String[] args) {
		Scanner sc = new Scanner(input);

		int V = sc.nextInt(); // 정점의 개수
		int E = sc.nextInt(); // 간선의 개수

		// 간선의 배열을 이용
		// 1. 클래스 / 2. 2차원 배열

		int[][] edges = new int[E][3]; // [0] : 시작정점, [1] : 끝정점, [2] : 가중치
		for (int i = 0; i < E; i++) {
			edges[i][0] = sc.nextInt();
			edges[i][1] = sc.nextInt();
			edges[i][2] = sc.nextInt();
		}

		// 크루스칼 제 1장 : 가중치를 기준으로 정렬
		Arrays.sort(edges, new Comparator<int[]>() {

			@Override
			public int compare(int[] e1, int[] e2) {
				return e1[2] - e2[2];
			}
		});		
		
		// 크루스칼 제 2장 : V-1개의 간선을 뽑아야 한다(사이클이 발생 안하게)
		// 상호 배타집합을 활용해보자
		p = new int[V];
		// Make-set하는 과정(반복문으로 간략하게 진행)
		for (int i = 0; i < V; i++) {
			p[i] = i;
		}
		
		int ans = 0; // 최소비용의 합
		int pick = 0; // 내가 뽑은 간선의 수

		for (int i = 0; i < E; i++) {
			// i 번째 간선을 뽑아 두 정점의 대표를 확인
			int x = edges[i][0];
			int y = edges[i][1];
			
			// x와 y의 대표가 다르다면(사이클이 아니라면)
			if(findset(x) != findset(y)){
				union(x,y);
				ans += edges[i][2]; // 현재 간선을 선택했으니 가중치를 추가
				pick++;
			}
			
			// 아래의 문장이 있든 없든 답은 같지만 효율성을 위해 추가
			if(pick == (V-1)) break;

		}		
		System.out.println(ans);		
	}

	static void union(int x, int y) {
		// rank를 고려하지 않기 때문에 냅다 집어넣기
		p[findset(y)] = findset(x);
	}

	static int findset(int x) {
		// 정석
//		if(x==p[x]) {
//			return x;
//		}
//		return findset(p[x]);

		// Path Compression
		if (x != p[x]) {
			p[x] = findset(p[x]);
		}
		return p[x];
	}
	
	static int makeset(int x) {
		return p[x] = x;
	}
	
	
	static String input = "7 11\r\n"
			+ "0 1 32\r\n"
			+ "0 2 31\r\n"
			+ "0 5 60\r\n"
			+ "0 6 51\r\n"
			+ "1 2 21\r\n"
			+ "2 4 46\r\n"
			+ "2 6 25\r\n"
			+ "3 4 34\r\n"
			+ "3 5 18\r\n"
			+ "4 5 40\r\n"
			+ "4 6 51\r\n"
			+ "";
}
