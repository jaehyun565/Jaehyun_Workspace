package APS_08_Queue;

public class Queue_구현 {
	
	// createQueue 메서드와 동일 -> 비어있는 큐 생성
	static int[] queue = new int[10];
	static int front = -1, rear = -1;		
	
	// 데이터를 삽입하는 메서드
	// 지금은 void지만 삽입할 때 실패여부 확인을 위해 boolean타입으로 반환가능
	public static void enQueue(int data) {		
		if(isFull()) {
			System.out.println("큐가 가득차있습니다.");;
			return;
		}
		// 삽입할 때는 rear의 값이 바뀌니까 
		queue[++rear] = data;
		
	}
	
	// 데이터 삭제 메서드
	public static int deQueue() {
		// 삭제할 때는 front의 값이 바뀜.
		if(isEmpty()) {
			System.out.println("큐가 비어있어요.");
			// 큐에 들어갈 수 없는 범위의 데이터
			return -1;
		}
		return queue[++front];
	}
	
	// 데이터 픽
	public static int Qpeek() {
		if(isEmpty()) {
			System.out.println("큐가 비어있어요.");
		}		
		return queue[front+1];
	}
	
	// 포화상태 확인
	public static boolean isFull() {
		return rear == queue.length-1; 		
	}
	
	// 공백상태 확인
	public static boolean isEmpty() {
		return front == rear;
	}
	
	public static void main(String[] args) {
		
		for(int i=0;i<11;i++) {
			enQueue(100);
		}
		
		int peekData = Qpeek();
		System.out.println(peekData);

		for(int i = 0;i<11;i++) {
			int data = deQueue();
			System.out.println(i+" "+data);
		}
		
		
	}
}
