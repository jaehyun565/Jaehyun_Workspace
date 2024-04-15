package APS_10_LinkedList.doubly;

class Node{
	String data;
	Node prev;
	Node next;
	
	Node(){}
	
	Node(String data){
		this.data = data;		
	}
}

class DoubleLinkedList{
	Node head;
	Node tail;
	int size;
	
	// 초기상태, 헤드의 next가 tail을, tail의 prev가 head를 가리키게.
	// 이렇게 만들어 놓으면, 모든 삽입/삭제 연산이 중간삽입/중간삭제임.(분기할 필요없어서 구현의 편리)
	DoubleLinkedList(){
		head = new Node();
		tail = new Node();
		head.next = tail;
		tail.prev = head;
	}
	
	// 삽입
	// 마지막에 삽입
	void addLast(String data) {
		Node newNode = new Node(data);
		//newNode를 연결
		newNode.next = tail;
		newNode.prev = tail.prev;
		
		// new Node 양 옆에 있는 노드가 newNode를 가리키도록 바꿈.
		newNode.next.prev = newNode;
		newNode.prev.next = newNode;
		
		size++;
	}
	
	// 삭제	
	void remove(int idx) {
		if(!(idx>=0 || idx<size)) {
			System.out.println("삭제할 수 없는 범위입니다.");
			return;
		}
		Node rmNode = head.next;
		for(int i = 0; i<idx ; i++) {
			rmNode = rmNode.next;
		}
		//반복문이 끝나면 rmNode가 삭제할 노트 자체를 가리킴.
		rmNode.prev.next = rmNode.next;
		rmNode.next.prev = rmNode.prev;
	}
	
	//조회
	
	void printList() {
		Node curr = head.next;
		while(curr!= tail) {
			System.out.print(curr.data + "->");
			curr = curr.next;
		}
		System.out.println();
	}
}



public class LinkedList_양방향연결리스트 {
	public static void main(String[] args) {
		
	}
}
