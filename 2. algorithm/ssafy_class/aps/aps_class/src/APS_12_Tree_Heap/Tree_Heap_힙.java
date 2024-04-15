package APS_12_Tree_Heap;

import java.util.Arrays;

public class Tree_Heap_힙 {

	static int[] heap = new int[100];
	static int heapSize;// 마지막 노드의 위치를 알기 위한 인덱스

	public static void main(String[] args) {
		heapPush(55);
		heapPush(1);
		heapPush(54);
		heapPush(32);
		heapPush(2);
		heapPush(11);
		heapPush(100);
		heapPush(73);

		System.out.println(Arrays.toString(heap));

		System.out.println(heapPop());
		System.out.println(heapPop());
		System.out.println(heapPop());
		System.out.println(heapPop());
		System.out.println(heapPop());
		System.out.println(heapPop());

	}
	// 스왑 메서드 
	static void swap(int a, int b) {
		int tmp = heap[a];
		heap[a] = heap[b];
		heap[b] = tmp;
	}

	// 삽입
	static void heapPush(int data) {
		// 마지막 위치에 노드 추가
		// 트리에서 0번 위치는 더미로 두므로 1번부터 채움
		heap[++heapSize] = data;

		// 부모와 비교하면서 swap
		int ch = heapSize;
		int pa = heapSize / 2;

		while (pa > 0 && heap[ch] > heap[pa]) { // ch가 루트노드 가 되면 멈춰야함. -> 이 때 기준은 pa>0으로.
			swap(pa,ch);
			ch = pa;
			pa = ch / 2;
		}
	}

	// 삭제
	static int heapPop() {
		// 최대힙 기준 루트노드는 최댓값이고 그 루트노드를 삭제하자.
		int popItem = heap[1];
		// 마지막에 있는 원소를 루트로 옮기자.
		heap[1] = heap[heapSize--];

		int pa = 1;
		int ch = pa * 2;		

		// 리프노드로 가면 자식이 없을 수도 있으니까 ch가 heapSize 이하인지 확인
		while (ch <= heapSize && heap[pa] < heap[ch]) {
			// 오른쪽 값이 존재하면서 좌,우를 비교했을 때 오른쪽이 크면
			// ch++ -> 오른쪽 자식과 비교할거임.
			if (ch + 1 <= heapSize && heap[ch] < heap[ch + 1]) {
				ch++;
			}
			swap(pa,ch);
			pa = ch;
			ch = pa * 2;

		}
		return popItem;
	}
}
