package APS_10_LinkedList.singly;

class Node{
	String data;
	Node link;
	
	Node(){}
	
	Node(String data){
		this.data = data;
		// link = null; 어차피, 참조자료형의 초기값은 null
	}
}

class SinglyLinkedList{
	Node head;
	int size;
	
	// '헤드' 범위노드를 하나 만들어준다.
	SinglyLinkedList(){
		head = new Node();
	}
	
	// 데이터 삽입
	
	// 가장 앞쪽에 삽입
	void addFirst(String data) {
		Node newNode = new Node(data); // 노드를 하나 만들어주고
		newNode.link = head.link; // 뉴노드의 다음 = 기존의 헤드의 다음노드와 연결(기존에 가장 앞에 있던 노드)
		head.link = newNode; // 헤드의 링크를 뉴노드와 연결. 
		
		size++;
	}
	
	// 가장 뒤쪽에 삽입
	void addLast(String data) {
		Node newNode = new Node(data); // 노드를 하나 만들어주고		
		Node curr = head; // current 변수를 하나 만들어서, 현재 노드의 위치를 담아줌.(현재는 헤드)
		while(curr.link != null) { // current 다음이 없을 때까지 계속 반복해서
			curr = curr.link; // current의 위치를 한칸씩 이동해줌
		}		
		curr.link = newNode; // 이동이 다 끝나고 나면 현재 위치의 뒤에 뉴노드를 연결해줌.
		size++;
	}
	
	// 중간부분 삽입
	// 지정하기 나름인데, idx번호의 앞에 삽입된다고 하자.
	void add(int idx, String data) {
		if(idx<0 || size < idx) { // idx가 0보다 작거나, size보다 크면 삽입불가, size와 같으면 addLast와 동일.
			System.out.println("삽입할 수 없는 위치입니다.");
			return;
		}
		
		// curr가 삽입하고자 하는 위치의 앞의 노드를 가리킴.
		Node curr = head;
		for (int i=0; i<idx; i++) {
			curr=curr.link;
		}
		
		Node newNode = new Node(data); // 노드를 하나 만들고
		newNode.link = curr.link; // 뉴노드의 다음은 curr의 다음노드와 연결
		curr.link = newNode; // curr의 다음은 뉴노드와 연결
		
		size++;
	}
	
	
	// 데이터 삭제
	void remove(int idx) {
		if(idx<0 || size <= idx) { // idx가 0이하이거나, size이상이면 삭제할 수 없음.
			System.out.println("삭제할 수 있는 범위를 벗어났습니다.");
			return;
		}
		
		// 중간삽입과 마찬가지로, 반복문 이후에 curr가 삭제하고자 하는 노드의 앞부분에 위치.
		Node curr = head;  
		for (int i=0; i<idx; i++) {
			curr=curr.link;
		}
		
		curr.link = curr.link.link; // 현재의 다음은 그 다다음과 연결함 -> 하나를 스킵함 = 스킵된것은 삭제.
		size--;
	}
	// 데이터 조회
	void printList() {
		Node curr = head.link;
		while( curr != null) {
			System.out.print(curr.data + " -> ");
			curr = curr.link;
		}
		System.out.println();
	}
	
	int getSize() {
		Node curr = head;
		int size=0;
		while(curr.link!= null) {
			curr = curr.link;
			size++;
		}
		return size;
	}
}

public class LinkedList_단순연결리스트 {
	public static void main(String[] args) {
	
		SinglyLinkedList list = new SinglyLinkedList();
		
		list.addFirst("7반 송창용");
		list.addLast("5반 현경찬");
		list.addFirst("8반 박영빈");
		list.addLast("5반 김광현");
		list.printList();
		list.add(1, "8반 엄소현");
		list.printList();
		
	}
}
