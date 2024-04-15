package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1991_트리순회 {
	static class Node {
		char data;
		Node lc;
		Node rc;

		Node() {
		};

		Node(char data) {
			this.data = data;
		}

	}

	static Node[] nodes;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		nodes = new Node[num];
		char c = 'A';
		for (int i = 0; i < num; i++) {
			nodes[i] = new Node();
			nodes[i].data = c++;
		}
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String head = st.nextToken();
			for(int idx = 0; idx <num; idx++) {
				if(nodes[idx].data == head.charAt(0)) {
					String left = st.nextToken();
					for (int j = 0; j < num; j++) {
						if(left == ".") break;
						if(left.charAt(0) == nodes[j].data) {
							nodes[idx].lc = nodes[j];
						}
					}
					String right = st.nextToken();
					for (int j = 0; j < num; j++) {
						if(right == ".") break;
						if(right.charAt(0) == nodes[j].data) {
							nodes[idx].rc = nodes[j];
						}
					}
					
				}
			}			
		}		
		preorder(nodes[0]);
		System.out.println();
		inorder(nodes[0]);
		System.out.println();
		postorder(nodes[0]);
		
		

	}

	static void preorder(Node node) {
		// base Case
		if(node == null) {
			return;
		}
		// recursive Case
		System.out.print(node.data);
		preorder(node.lc);
		preorder(node.rc);
	}
	
	static void inorder(Node node) {
		// base Case
		if(node == null) {
			return;
		}
		// recursive Case
		inorder(node.lc);
		System.out.print(node.data);
		inorder(node.rc);
	}
	static void postorder(Node node) {
		// base Case
		if(node == null) {
			return;
		}
		// recursive Case
		postorder(node.lc);
		postorder(node.rc);
		System.out.print(node.data);
	}
}
