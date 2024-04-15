package APS_12_Tree_Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Tree_Heap_PriorityQueue {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				if (a < b) {
					return 1;
				} else if (a == b) {
					return 0;
				}
				return -1;
			}
		});

		// 우선순위 큐 : 기본 정렬 순서는 오름차순
		// 내림차순으로 쓰고 싶으면 값을 넣을때 - 붙여서 넣고
		// 값을 출력할 때도 - 붙여서 출력하자.
		queue.add(12);
		queue.add(23);
		queue.add(32);
		queue.add(8);
		queue.offer(73);

		System.out.println(queue.peek());
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

		
	}

}
