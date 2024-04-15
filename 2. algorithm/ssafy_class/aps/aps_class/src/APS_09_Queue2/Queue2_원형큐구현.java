package APS_09_Queue2;

import java.util.Arrays;

public class Queue2_원형큐구현 {

	static String[] queue = new String[5];
	static int front = 0, rear = 0;

	public static void main(String[] args) {
		System.out.println(Arrays.toString(queue)); // 초기상태는 배열 5개가 null;
		enQueue("현경찬");
		enQueue("서상우");
		enQueue("최광림");
		enQueue("김영찬");
		System.out.println(Arrays.toString(queue));
		System.out.println(deQueue());
		System.out.println(deQueue());
		enQueue("가나다");
		enQueue("김재현");
		System.out.println(Arrays.toString(queue));
		System.out.println(front);
		System.out.println(rear);
		deQueue();
		enQueue("오레오");
		System.out.println(Arrays.toString(queue));
		deQueue();
		deQueue();
		deQueue();
		deQueue();
		System.out.println(front);
		System.out.println(rear);
		
	}
	
	// 공백상태
	// front 와 rear 가 같은 위치를 가리키고 있다
	public static boolean isEmpty() {
		return front == rear;
	}
	
	// 포화상태
	// front가 rear보다 한칸 앞서있는가?를 확인 > 모듈러도 사용
	public static boolean isFull() {
		return front == (rear + 1) % queue.length;
	}

	// 삽입
	public static void enQueue(String data) {
		if(isFull()) {
			System.out.println("큐가 포화상태입니다");
			return;
		}
		rear = (rear + 1) % queue.length;
		queue[rear] = data;
	}
	
	// 삭제
	public static String deQueue() {
		if(isEmpty()) {
			System.out.println("큐가 공백상태입니다");
			return null;
		}
		front = (front+1) % queue.length;
		return queue[front];
	}
	
	
}
