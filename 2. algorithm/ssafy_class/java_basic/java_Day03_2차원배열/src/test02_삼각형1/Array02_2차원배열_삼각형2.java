package test02_삼각형1;

public class Array02_2차원배열_삼각형2 {
	public static void main(String[] args) {
		int[][] arr = new int[4][4];

//      1  2  3  4
//      5  6  7   
//      8  9      
//     10         

		// 행 우선순위
		// 열이 움직이는 범위 0 ~ 3 // 0 ~ 2 // 0 ~ 1 // 0 번
		// 원래는 c가 0 부터 3 까지 다 출력했는데 이 범위를 0 부터 3 -r 까지 값을 받으면 될 것 같음.

		int a = 0;

		for (int r = 0; r < 4; r++) {
			for (int c = 0; c < 4 - r; c++) {
				arr[r][c] = ++a;
			}
		}

		for (int r = 0; r < 4; r++) {
			for (int c = 0; c < 4; c++) {
				if(arr[r][c] ==0) {
					System.out.print("   ");
				} else {
					System.out.printf("%-3d", arr[r][c]);	
				}
				
			}
			System.out.println();
		}

	}
}
