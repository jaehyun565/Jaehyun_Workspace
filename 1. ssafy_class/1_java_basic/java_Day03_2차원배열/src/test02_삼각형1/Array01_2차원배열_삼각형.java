package test02_삼각형1;

public class Array01_2차원배열_삼각형 {
	public static void main(String[] args) {
		int[][] arr = new int[4][4];

		int a = 0;

		// 행렬에 번호 매기기		
		for (int r = 0; r < arr.length; r++) {
			for (int c = r; c < arr[r].length; c++) {
				 arr[r][c] = ++a;
			}
		}
		// 행렬 출력하기
		
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) {
				if(arr[r][c] == 0) {
					System.out.print("   ");
				}else {
//					System.out.printf("%3d", arr[r][c]); // 띄어쓰기에 맞춰주기 위해 3칸차지하게 만듦
					System.out.printf("%-3d", arr[r][c]); // 맞춰주는 건데 왼쪽에 맞춰서 출력
				}				
			}
			System.out.println();
		}				

//         1  2  3  4  
//            5  6  7  
//               8  9  
//                  10 

	}
}
