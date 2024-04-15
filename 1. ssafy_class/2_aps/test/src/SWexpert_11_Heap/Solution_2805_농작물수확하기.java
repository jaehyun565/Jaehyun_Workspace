package SWexpert_11_Heap;

public class Solution_2805_농작물수확하기 {
	public static void main(String[] args) {

		int N = 7;
		int[][] arr = new int[N][N];

		for (int r = 0; r <= N / 2; r++) {
			for (int c = (N - 1) / 2 - r; c <= (N - 1) / 2 + r; c++) {
				arr[r][c] = 1;
			}
		}
		for (int r = ((N - 1) / 2) + 1; r < N; r++) {
			for (int c =  r- 3; c < N-r-3; c++) {
				arr[r][c] = 1;
			}
		}

		for (int r = 0; r < N; r++) {
			for (int c = 0; c < N; c++) {
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}
	}
}
