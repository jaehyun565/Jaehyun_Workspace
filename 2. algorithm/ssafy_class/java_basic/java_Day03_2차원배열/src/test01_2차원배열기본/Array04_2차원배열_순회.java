package test01_2차원배열기본;

public class Array04_2차원배열_순회 {
	public static void main(String[] args) {

		int[][] arr1 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		// 2차원 배열의 순회는 2중 for 문을 사용한다.
		// 1. 행 우선 순회
		// - 바깥쪽 for문 : 행, 안쪽 for문 : 열

		for (int r = 0; r < arr1.length/* =3 */; r++) {
			for (int c = 0; c < 4; c++) {
				System.out.print(arr1[r][c] + " ");
			}
			System.out.println();
		}

		System.out.println("-----");

		// 2. 열 우선 순회
		// - 바깥쪽 for문 : 열, 안쪽 for문 : 행
		for (int c = 0; c < 4; c++) {
			for (int r = 0; r < 3; r++) {
				System.out.print(arr1[r][c] + " ");
			}
			System.out.println();
		}

		System.out.println("-----");

		// 3. 지그재그 순회
		// 기본이 행 우선 순회
		// - 바깥쪽 for문 : 행, 안쪽 for문 : 열
		// - 0,2,4...번 행은 정방향 진행(index기준 짝수, 실은 홀수 행)
		// - 1,3,5... 행은 역방향 진행(index기준 홀수, 실은 짝수 행)

		for (int r = 0; r < 3; r++) {
			if (r % 2 == 0) {
				for (int c = 0; c < 4; c++) {
					System.out.print(arr1[r][c] + " ");
				}
			} else {
				for (int c = 3; c >= 0; c--) {
					System.out.print(arr1[r][c] + " ");
				}
			}
			System.out.println();
		}
		
		
		// 4. 열의 길이가 다른 2차원 배열의 순회
		
		int [][] arr2 = new int[3][];
		
		arr2[0] = new int[] {1,2,3};
		arr2[1] = new int[] {4,5,6,7,8};
		arr2[2] = new int[] {9,10};
		
		System.out.println(arr2.length); // => 1차원 배열의 참조값을 갖는 배열
		System.out.println(arr2[0].length);
		System.out.println(arr2[1].length);
		System.out.println(arr2[2].length);
		
		for (int r = 0; r < arr2.length/* =3 */; r++) {
			for (int c = 0; c < arr2[r].length; c++) {
				System.out.print(arr2[r][c] + " ");
			}
			System.out.println();
		}
	}
}
