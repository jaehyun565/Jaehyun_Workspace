package APS_02;

public class Array02_이진검색 {
	public static void main(String[] args) {
		
		int[] arr = {23, 44,55,77,84,91};
		int result = binarySearch(arr, 77);
		System.out.println(result);
	}
	
	
	public static int binarySearch(int[] arr, int key) {
		int left = 0; // 배열의 처음 인덱스
		int right = arr.length-1; // 배열의 끝 인덱스
		
		
		while(left<=right) { // right가 left보다 크거나 같은 경우에만 시행, 같거나 역전되면 더 이상 값이 없다는 것.
			int mid = (left + right)/2;
			System.out.println(mid);
			if(key == arr[mid]) {
				return mid;
			} else if(key < arr[mid]) { //찾으려는 키가 mid의 원소보다 더 작으면?
				right = mid - 1; 		// => 오른쪽을 배제
			} else{ 					// 찾으려는 키가 mid의 원소보다 크면? => 왼쪽 배제
				left = mid +1; 			// =>왼쪽은 다 날림.
			}
		}
		return -1;
	}
}
