package APS_11_TREE;

public class TREE_순회 {
	// 트리 배열로 표현
	// \0 은 null 문자., ASCII CODE로 0이라서 그냥 0 써도 됨.
	static char[] tree = new char[] { '\0', 'A', 'B', 'C', 'D', 'E', 'F', 'G', '\0', '\0', 'H', 'I' };

	public static void main(String[] args) {
		preorder(1);
		System.out.println();
		inorder(1);
		System.out.println();
		postorder(1);
	}
	
	
	// 전위 순회 함수
	// VLR
	static void preorder(int i) { // 방문할 노드 번호를 받음
		// 기저조건
		// 1. 인덱스 범위가 넘어갈 경우
		// 2. 찾아간 배열의 값이 null인 경우
		if(i >= tree.length||tree[i]==0) {
			return;
		}
		
		// 부모 노드 방문
		System.out.print(tree[i] + " ");
		// 왼쪽 자식 방문
		preorder(i * 2);
		// 오른쪽 자식 방문
		preorder(i * 2 + 1);
	}
	
	// 중위 순회 함수
	// LVR
	static void inorder(int i) { // 방문할 노드 번호를 받음
		// 기저조건
		// 1. 인덱스 범위가 넘어갈 경우
		// 2. 찾아간 배열의 값이 null인 경우
		if(i >= tree.length||tree[i]==0) {
			return;
		}

		// 왼쪽 자식 방문
		inorder(i * 2);
		// 부모 노드 방문(출력)
		System.out.print(tree[i] + " ");
		// 오른쪽 자식 방문
		inorder(i * 2 + 1);
	}
	
	// 후위 순회 함수
	// LRV
	static void postorder(int i) { // 방문할 노드 번호를 받음
		// 기저조건
		// 1. 인덱스 범위가 넘어갈 경우
		// 2. 찾아간 배열의 값이 null인 경우
		if(i >= tree.length||tree[i]==0) {
			return;
		}
		
		// 왼쪽 자식 방문
		postorder(i * 2);
		// 오른쪽 자식 방문
		postorder(i * 2 + 1);
		// 부모 노드 방문(출력)
		System.out.print(tree[i] + " ");
	}
	
	
}
