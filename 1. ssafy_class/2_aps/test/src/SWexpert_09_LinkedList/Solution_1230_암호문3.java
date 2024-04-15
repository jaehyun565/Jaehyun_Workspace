package SWexpert_09_LinkedList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Node {
	String data;
	Node next;
	Node prev;

	Node() {
	}

	Node(String data) {
		this.data = data;
	}
}

class DoubleLinkedList {
	Node head;
	Node tail;
	int size;

	DoubleLinkedList() {
		head = new Node();
		tail = new Node();
		head.next = tail;
		tail.prev = head;
	}

	// 삽입
	// 맨 앞 삽입
	void addFirst(String data) {
		Node newNode = new Node(data);
		newNode.prev = head;
		newNode.next = head.next;

		newNode.prev.next = newNode;
		newNode.next.prev = newNode;
		size++;
	}

	// 맨 뒤 삽입
	void addLast(String data) {
		Node newNode = new Node(data);
		newNode.next = tail;
		newNode.prev = tail.prev;

		newNode.next.prev = newNode;
		newNode.prev.next = newNode;

		size++;
	}

	// 중간 삽입
	void add(int idx, int num, StringTokenizer st) {
		if (idx < 0 || idx > size) {
			System.out.println("삽입 불가합니다");
			return;
		}
		Node curr = head;
		for (int i = 0; i < idx; i++) {
			curr = curr.next;
		}

		for (int i = 0; i < num; i++) {
			Node newNode = new Node(st.nextToken());
			newNode.prev = curr;
			newNode.next = curr.next;

			newNode.prev.next = newNode;
			newNode.next.prev = newNode;
			curr = newNode;
		}
		size+=num;		
	}

	// 삭제
	void remove(int idx, int num) {
		if (idx < 0 || idx >= size) {
			System.out.println("삭제 불가능합니다.");
			return;
		}
		Node curr = head;
		for (int i = 0; i < idx; i++) {
			curr = curr.next;
		}

		for (int i = 0; i < num; i++) {
			curr.prev.next = curr.next;
			curr.next.prev = curr.prev;
			curr = curr.next;
		}
		size-=num;
	}

	// 조회
	void getList() {
		int cnt=0;
		Node curr = head.next;
		while (curr.next != null && cnt!=10) {
			System.out.print(curr.data + " ");
			curr = curr.next;
			cnt++;
		}
		System.out.println();
	}
}

public class Solution_1230_암호문3 {
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("input2.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		DoubleLinkedList list = new DoubleLinkedList();		

		
		for(int testCase=1;testCase<=10;testCase++) {
			// 1. 처음 암호문의 길이(originCnt)
			int originCnt = Integer.parseInt(br.readLine());
			// 2. 암호문자열(origin)
			StringTokenizer origin = new StringTokenizer(br.readLine());
			for (int i = 0; i < originCnt; i++) {
				list.addLast(origin.nextToken());
			}
			// 3. 명령어의 길이(taskCnt)
			int taskCnt = Integer.parseInt(br.readLine());
			// 4. 명령어(task)
			StringTokenizer task = new StringTokenizer(br.readLine());
			for (int i = 0; i < taskCnt; i++) {
				String s = task.nextToken();
				
				if(s.equals("I")) {
					int idx = Integer.parseInt(task.nextToken());
					int insertNum = Integer.parseInt(task.nextToken());
					list.add(idx, insertNum, task);				
					continue;
				}
				if(s.equals("D")) {
					int idx = Integer.parseInt(task.nextToken());
					int deleteNum = Integer.parseInt(task.nextToken());
					list.remove(idx, deleteNum);				
					continue;
				}
				if(s.equals("A")) {				
					int insertNum = Integer.parseInt(task.nextToken());
					list.add(list.size, insertNum, task);				
					continue;
				}
			}
			bw.write("#"+testCase+" ");
			bw.flush();
			list.getList();		
			
		}
		bw.close();
	}

}
