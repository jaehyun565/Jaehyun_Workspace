package APS_03;

public class Array03_2차원배열순회 {
	public static void main(String[] args) {
		// 2차원 배열 초기화

		int[][] arr = new int[3][3];

		// 행 우선순회 하면서 값을 초기화 해보기
		System.out.println("-----행 우선순회-----");
		int num = 1;
		for (int r = 0; r < arr.length; r++) { // 행의 길이는 arr.length로 컨트롤
			for (int c = 0; c < arr[r].length; c++) { // 해당 행에 해당하는 1차원 배열의 길이로 컨트롤
				arr[r][c] = num++;
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}

		// 열 우선순회 해보기
		System.out.println("-----열 우선순회-----");
		for (int c = 0; c < arr[0].length; c++) {
			for (int r = 0; r < arr.length; r++) {
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}

		// 지그재그 순회
		System.out.println("-----지그재그 우선순회-----");
		for (int r = 0; r < arr.length; r++) {
			if (r % 2 == 0) { // 행이 짝수일때는
				for (int c = 0; c < arr[r].length; c++) { // 정방향 순회
				System.out.print(arr[r][c] + " ");
				}
			} else { // 행이 홀수일 때는
				for (int c = arr[r].length-1;c>=0;c--) { // 역방향 순회
					System.out.print(arr[r][c] + " ");
				}
			}
			System.out.println();
		}
	}
}
