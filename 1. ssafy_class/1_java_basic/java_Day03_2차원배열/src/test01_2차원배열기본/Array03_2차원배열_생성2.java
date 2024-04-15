package test01_2차원배열기본;

public class Array03_2차원배열_생성2 {
	public static void main(String[] args) {

		int[][] arr1 = new int[3][4];
		// 2차원 배열의 크기만 정하고, 내부에 들어가는 1차원 배열의 크기는 표시 x
		// 1차원 배열은 아직 생성되지 않았고, 연결되지도 않음.
		int[][] arr2 = new int[3][];

		System.out.println(arr1[0]); // 1차원 배열의 참조값이 출력됨
		System.out.println(arr2[0]); // null 값이 출력됨.

		arr2[0] = new int[] { 4, 5, 6, 7, 8 };
		arr2[1] = new int[] { 1, 2, 3 };
		arr2[2] = new int[] { 9, 10 };

		// 2차원 배열의 원소에 접근하는 법
		// 행의 번호를 지정 한 다음 1차원 배열안에서의 각 원소의 index를 지정
		// 위의 arr2에서 8 값을 지정하는 방법

		System.out.println(arr2[0][4]);// 8이 출력됨.

	}
}
