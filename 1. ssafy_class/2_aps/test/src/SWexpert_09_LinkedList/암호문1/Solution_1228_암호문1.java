package SWexpert_09_LinkedList.암호문1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Node {
	String data;
	Node link;

	Node() {
	}

	Node(String data) {
		this.data = data;
	}
}

class SingleLinkedList {
	Node head;
	int size;

	SingleLinkedList() {
		head = new Node();
	}

	// 삽입
	// 맨 앞에 삽입
	void addFirst(String data) {
		Node newNode = new Node(data);
		newNode.link = head.link;
		head.link = newNode;

		size++;
	}

	// 맨 뒤 삽입
	void addLast(String data) {
		Node newNode = new Node(data);
		Node curr = head;
		while (curr.link != null) {
			curr = curr.link;
		}
		curr.link = newNode;
		size++;
	}

	// 중간삽입
	void add(int idx, String data) {
		if (idx < 0 || idx > size) {
			System.out.println("중간삽입 불가능합니다.");
			return;
		}
		Node curr = head;

		for (int i = 0; i < idx; i++) {
			curr = curr.link;
		}
		Node newNode = new Node(data);
		newNode.link = curr.link;
		curr.link = newNode;

		size++;
	}

	void addList(int idx, String SingleLinkedList) {
		if (idx < 0 || idx > size) {
			System.out.println("중간삽입 불가능합니다.");
			return;
		}
		Node curr = head;
		for (int i = 0; i < idx; i++) {
			curr = curr.link;
		}
	}

	// 삭제(이 문제에서는 필요 없지만 구현연습을 위해 구현)
	void remove(int idx) {
		if (idx < 0 || idx >= size) {
			System.out.println("삭제 불가능합니다.");
			return;
		}
		Node curr = head;
		for (int i = 0; i < idx; i++) {
			curr = curr.link;
		}
		curr.link = curr.link.link;
		size--;
	}

	// 조회
	void getList() {
		int cnt = 0;
		Node curr = head.link;
		while (curr != null && cnt != 10) {
			System.out.print(curr.data + " ");
			curr = curr.link;
			cnt++;
		}
		System.out.println();
	}

}

public class Solution_1228_암호문1 {

	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(int testCase = 1;testCase<=10;testCase++) {
			SingleLinkedList list = new SingleLinkedList();			
			br.readLine(); // 최초 암호문자열 개수			
			String[] origin = br.readLine().split(" "); // 최초 암호문자열
			for (String s : origin) {
				list.addLast(s);
			}
			int taskCnt = Integer.parseInt(br.readLine()); // 수정할 명령어 개수			
	
			StringTokenizer st = new StringTokenizer(br.readLine()); // 수정할 명령어
			for (int i = 0; i < taskCnt; i++) {				
				if (st.nextToken().equals("I")) {
					int idx = Integer.parseInt(st.nextToken());
					int num = Integer.parseInt(st.nextToken());
					for (int j = 0; j < num; j++) {
						list.add(idx, st.nextToken());
						idx++;
					}
	
				}
			}
			System.out.print("#"+testCase+" ");
			list.getList();
		}
	}
}
