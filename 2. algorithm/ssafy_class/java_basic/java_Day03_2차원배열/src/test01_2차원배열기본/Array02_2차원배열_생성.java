package test01_2차원배열기본;

public class Array02_2차원배열_생성 {
	public static void main(String[] args) {
		// 자료형의 기본값으로 초기화
		int[][] arr1 = new int[3][4];

		// 내가 지정한 값으로 초기화 하는 방법.
		int[][] arr2 = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		
		//배열 선언과 동시에 값을 지정하는 방법.
		int[][] arr3 = { { 1, 2, 3, 4 }, { 5, 6, 7 }, { 8 } };

	}
}
