package test06_기타도형;

import java.util.Arrays;

public class Array06_2차원배열_평행사변형2 {
    public static void main(String[] args) {
        
    	
    	// 
//                     1  2  3  4  5 => 전체 행 : 0 ~ 4, 전체 열 : 0 ~ 8 , r = 0, c = 4 ~ 8
//                  6  7  8  9 10    => 전체 행 : 0 ~ 4, 전체 열 : 0 ~ 8 , r = 1, c = 3 ~ 7
//              11 12 13 14 15       => 전체 행 : 0 ~ 4, 전체 열 : 0 ~ 8 , r = 2, c = 2 ~ 6
//           16 17 18 19 20          => 전체 행 : 0 ~ 4, 전체 열 : 0 ~ 8 , r = 3, c = 1 ~ 5
//        21 22 23 24 25    		 => 전체 행 : 0 ~ 4, 전체 열 : 0 ~ 8 , r = 4, c = 0 ~ 4
       
       
    	int[][] arr = new int[5][9];    	
    	
    	int a = 0;
    	
    	for(int r = 0;r<5;r++ ) {
    		for(int c=4-r;c<9-r;c++ ) {
    			arr[r][c] = ++a;
    		}
    	}
    	for (int r = 0; r < 5; r++) {
			for (int c = 0; c < 9; c++) {
				if(arr[r][c] ==0) {
					System.out.print("    ");
				} else {
					System.out.printf("%4d", arr[r][c]);	
				}
				
			}
			System.out.println();
		}
    	
    	
    }
}
