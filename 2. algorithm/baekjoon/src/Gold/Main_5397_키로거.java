package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node{
	char data;
	Node next;
	Node prev;
	
	Node(){}
	
	Node(char data){
		this.data = data;
	}
}

class DoubleLinkedList{
	Node head;
	Node tail;	
	int size;	
	
	DoubleLinkedList(){
		head = new Node();
		tail = new Node();
		
		head.next = tail;
		tail.prev = head;
		
	}
	
	Node curr = head;
	void addLast(char data) {
		Node newNode = new Node(data);		
		newNode.next = tail;
		newNode.prev = tail.prev;
		
		newNode.next.prev = newNode;
		newNode.prev.next = newNode;
		
		curr = curr.next;	
		
		size++;
	}
	
	void remove() {
		if(size<0) {
			System.out.println("삭제불가");
			return;
		}
		curr.prev = curr.next;
		curr.next = curr.prev;
//		curr = curr.prev;
	}	
	
	void left() {
		if(curr!=null&&curr!=head.next&&curr!=head) {
			System.out.println(curr);
			System.out.println("이게 왜 돌아감?");
			curr=curr.prev;
		}
	}
	
	void right() {
		if(curr!=tail.prev&&curr!=tail&&curr!=null) {
			System.out.println("< 돌아갔어요");
			curr=curr.next;
		}
	}
	
	void getList() {
		curr = head.next;
		while(curr!=null) {
			System.out.print(curr.data);
			curr = curr.next;
		}
		System.out.println();
	}
}

public class Main_5397_키로거 {
	public static void main(String[] args) throws IOException {
		DoubleLinkedList list = new DoubleLinkedList();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		for(char c : s.toCharArray()) {
			System.out.println("이번 문자는" +c);
			if(!(c=='<'||c=='>'||c=='-')) {
				list.addLast(c);
			} else if(c =='<') {
				list.left();
			} else if(c == '>') {
				list.right();
			} else if(c =='-') {
				list.remove();
			}
		}
		
		list.getList();
	}
}
