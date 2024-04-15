package test03_삼각형2;

public class Array01_2차원배열_삼각형 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        
//      4  3  2  1  
//         7  6  5  
//            9  8  
//              10 
        
        // 
        
        int a = 0;                
        
        for(int r=0;r<4;r++) {
        	for(int c=3;c>=r;c--) {
        		arr[r][c]=++a;
        	}
        }
        
        for (int r = 0; r < 4; r++) {
			for (int c = 0; c < 4; c++) {
				if(arr[r][c] ==0) {
					System.out.print("   ");
				} else {
					System.out.printf("%3d", arr[r][c]);	
				}
				
			}
			System.out.println();
		}


        
    }
}
