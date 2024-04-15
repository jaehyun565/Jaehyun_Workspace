package test06_기타도형;

public class Array03_2차원배열_모래시계 {
    public static void main(String[] args) {
        
//         1  2  3  4  5 전체 = 4, r = 0, c = 0 ~ 4
//            6  7  8   
//               9      
//           10 11 12     전체 = 4, r = 3, c = 1 ~ 3
//        13 14 15 16 17
        
       // 2등변 삼각형을 나눠서 그려보기
    	
    	int[][] arr = new int[5][5];
    	int a = 0;
    	
    	for (int r=0;r<5;r++) {
    		if(r<=2) {
    			for(int c=r;c<=4-r;c++) {
    				arr[r][c] = ++a;
    			}
    		} else {
    			for(int c=4-r;c<=r;c++) {
    				arr[r][c] = ++a;
    			}
    		}
    	}
    	
    	for (int r = 0; r < 5; r++) {
			for (int c = 0; c < 5; c++) {
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
