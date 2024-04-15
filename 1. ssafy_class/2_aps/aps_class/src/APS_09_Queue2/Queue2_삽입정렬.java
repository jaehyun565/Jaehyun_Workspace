package APS_09_Queue2;

import java.util.Arrays;

public class Queue2_삽입정렬 {
	public static void main(String[] args) {
		int[] data = { 69, 10, 30, 2, 7, 16, 8, 31, 22 };

		// 정렬되지 않은 집합의 원소를 하나씩 순회
		int j;
		for (int i = 1; i < data.length; i++) {
			System.out.println(i + "회차");
			int key = data[i];
			for (j = i - 1; j >= 0 && data[j] > key; j--) { // key값이 크거나 같으면 바로 중지됨.
				data[j + 1] = data[j]; // 비교해서 뒤의 값을 바꾸고
				System.out.println("i : " + i + ", j : " + j);
				System.out.println("key : " + key + ", data[j] :" + data[j]);
				System.out.println("1" + Arrays.toString(data));
			}
			data[j + 1] = key; // for문 다 돌렸으면 해당 위치를 key값으로 돌림.
			System.out.println("2" + Arrays.toString(data));
		}

	}
}
