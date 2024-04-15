package APS_08_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_API {
	public static void main(String[] args) {

			Queue<Integer> queue = new LinkedList<>();
			
			// 삽입
			queue.add(1); // 연산이 실패했을 때 예외를 발생
			queue.offer(1); // 연산이 실패했을 때 false를 반환
			
			System.out.println(queue);
			
			// 삭제
			queue.remove(); // 연산이 실패했을 때 예외를 발생
			queue.poll(); // 연산이 실패했을 때 null을 반환
			
			System.out.println(queue);
			
			// 조회
//			queue.element(); // 연산이 실패했을 때 예외를 발생
			queue.peek(); // 연산이 실패했을 때 null을 반환
			
	}
}
