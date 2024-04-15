package APS_01;
import java.util.Arrays;

public class Array01_버블정렬 {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 32, 67, 12, 46, 23, 10 };
		
		// 하나의 사이클만 생각해봅시다.
		for(int j=0; j< arr.length-1;j++) { // 싸이클은 -1만큼만 함.
			for(int i=0; i<arr.length-1-j;i++) { // 싸이클이 돌 때마다 순회를 한번 덜해도됨.
				if(arr[i] > arr[i+1]) {
					//왼쪽인덱스의 수가 더 크면 위치를 자리바꾸기(swap)
					int tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
				}
			}	
		}
		
		System.out.println(Arrays.toString(arr)); // 가장 큰 원소가 마지막으로 이동.
	}
}
