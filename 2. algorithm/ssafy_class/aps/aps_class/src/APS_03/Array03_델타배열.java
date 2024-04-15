package APS_03;

import java.util.Scanner;

public class Array03_델타배열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[5][5];
		int pr = 2;
		int pc = 2;
		
		arr[pr][pc] = 1;
		
		// 델타배열(상, 하, 좌, 우)
		int[] dr = {-1, 1, 0 ,0}; 
		int[] dc = {0, 0, -1, 1};
		
		System.out.println();
		
		while(true) {
			int d = sc.nextInt();
			
			if(!(pr+dr[d]>=0 && pr+dr[d] < arr.length && pc+dc[d] >=0 && pc+dc[d] < arr[0].length)) {
				continue;
			}
			pr = pr + dr[d];
			pc = pc + dc[d];
			
			arr[pr][pc] =1;
			
			for(int r = 0;r<arr.length;r++) {
				for(int c = 0;c<arr[r].length;c++) {
					if(r == pr && c == pc) {	
						
					}
					System.out.print(arr[r][c] + " ");
				}
				System.out.println();
			}
		
		
			
//			System.out.println(pr + " , " + pc);
			
		}
	}

}
