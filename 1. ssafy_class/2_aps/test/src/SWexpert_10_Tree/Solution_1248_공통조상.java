package SWexpert_10_Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Solution_1248_공통조상 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int vertexNum = Integer.parseInt(st.nextToken());
		int edgeNum = Integer.parseInt(st.nextToken());
		int vertex1 = Integer.parseInt(st.nextToken());
		int vertex2 = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int[] vertex = new int[edgeNum * 2];
		for (int i = 0; i < vertex.length; i++) {
			vertex[i] = Integer.parseInt(st.nextToken());
		}

		System.out.println(Arrays.toString(vertex));
		int[] parent = new int[vertex.length / 2];
		for (int i = 0; i < vertex.length; i++) {
			if (i % 2 == 0) {
				parent[i / 2] = vertex[i];
			}
		}
		System.out.println("parent :" + Arrays.toString(parent));
		int[] child = new int[vertex.length / 2];
		for (int i = 0; i < vertex.length; i++) {
			if (i % 2 == 1) {
				child[i / 2] = vertex[i];
			}
		}
		System.out.println("child : "+ Arrays.toString(child));

		int[] grandGroupLeft = new int[parent.length];
		int[] grandGroupRight = new int[parent.length];
		// 부모 자식은 각각 i로 이어짐
		searchGrand(parent, child, grandGroupLeft, vertex1,0);
		System.out.println("-----------------");
//		searchGrand(parent, child, grandGroupRight, vertex2,0);
	}

	static void searchGrand(int[] parent, int[] child, int[] grandGroup, int childNum, int a) {		
		if (childNum == 1) {
			return;
		}		
		while(a<4) {
			for (int i = 0; i < child.length; i++) {
				if (child[i] == childNum) {
					grandGroup[a++] = parent[i];
					childNum = parent[i];
					System.out.println(childNum);
					System.out.println(Arrays.toString(grandGroup));
				}
			}			
		}
		searchGrand(parent, child, grandGroup, childNum, a);
	}

}
