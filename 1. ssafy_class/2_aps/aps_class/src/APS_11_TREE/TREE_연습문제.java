package APS_11_TREE;

import java.util.Scanner;

class Node {
	int num;
	int data;
	Node left;
	Node right;

	Node() {
	}

	Node(int data) {
		this.data = data;
	}
}

public class TREE_연습문제 {

	static Node[] nodes = new Node[14]; // 1~13까지 노드)
	static int[] count = new int[14];
	static Node root = new Node(1);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i < 14; i++) {
			nodes[i] = new Node();
			nodes[i].num = i;
			
		}

		int V = sc.nextInt();
		for (int i = 0; i < V - 1; i++) {
			int parent = sc.nextInt();
			int child = sc.nextInt();

			// 루트를 모를 때 루트 찾는 용도
			count[child]++;

			if (nodes[parent].left == null) {
				nodes[parent].left = nodes[child];
			} else {
				nodes[parent].right = nodes[child];
			}
		}

		// 루트를 찾기
		int root = 0;
		for (int i = 0; i < 14; i++) {
			if (count[i] == 0) {
				root = i;
			}
		}
		System.out.println(root);
		preorder(nodes[root]);
	}
	
	// 전위순회
	static void preorder(Node node) {
		if(node == null) {
			return;
		}
		System.out.print(node.num+ " ");
		preorder(node.left);
		preorder(node.right);
	}
}
