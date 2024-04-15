package APS_03;

public class Array03_전치행렬 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		System.out.println("----기본행렬----");
		printArr(arr);

		// 전치행렬로 바꾸기
//		for (int r = 0; r < arr.length; r++) {
//			for (int c = 0; c < arr[0].length; c++) {
//				if(r<c) {
//					int tmp = arr[r][c];
//					arr[r][c] = arr[c][r];
//					arr[c][r] = tmp;					
//				}
//			}			
//		}
//		System.out.println("----전치행렬----");
//		printArr(arr);
		
		// 90 도 시계방향 회전
		int[][] newArr = new int[arr.length][arr[0].length];
		
		for(int r= 0;r<newArr.length;r++) {
			for(int c =0;c<newArr[0].length;c++) {
				newArr[r][c] = arr[newArr.length - c - 1][r];
			}
		}
		System.out.println("----90도 시계방향 회전----");
		printArr(newArr);
		
		
	}
	
	
	public static void printArr(int[][] arr) {
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[0].length; c++) {
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}
	}
}
