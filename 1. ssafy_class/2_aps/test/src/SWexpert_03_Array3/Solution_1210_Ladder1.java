package SWexpert_03_Array3;

public class Solution_1210_Ladder1 {
	public static void main(String[] args) {

		int[][] arr = { { 1, 0, 0, 0, 1, 0, 1, 0, 0, 1 }, { 1, 0, 0, 0, 1, 0, 1, 1, 1, 1 },
				{ 1, 0, 0, 0, 1, 0, 1, 0, 0, 1 }, { 1, 0, 0, 0, 1, 1, 1, 0, 0, 1 }, { 1, 0, 0, 0, 1, 0, 1, 0, 0, 1 },
				{ 1, 1, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 0, 1, 0, 0, 1 }, { 1, 1, 1, 1, 1, 0, 1, 0, 0, 1 },
				{ 1, 0, 0, 0, 1, 1, 1, 0, 0, 1 }, { 1, 0, 0, 0, 1, 0, 1, 0, 0, 1 } };

		// 델타배열 좌, 우, 하
		int[] dr = { 1, 0, 0 };
		int[] dc = { 0, -1, 1 };

		int r = 0;
		for (int c = 0; c < arr[0].length; c++) {
			if (arr[r][c] == 0) {
				for (int d = 0; d < 3; d++) {
					int nr = r + dr[d];
					int nc = c + dc[d];
					while (nr >= 0 && nr < arr.length && nc >= 0 && nc < arr[0].length
							&& !(arr[nr][c + dc[0]] == 1 || arr[nr][c + dc[1]] == 1)) {
						nr += dr[d];
						r = nr;
					}
					
					while (nc >= 0 && nc < arr[0].length) {

					}
				}

			}
		}
		System.out.println();

		for (r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[0].length; c++) {
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}
	}
}
