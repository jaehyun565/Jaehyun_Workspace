package test06_기타도형;

public class Array01_2차원배열_이등변삼각형 {
    public static void main(String[] args) {
                
        // 1 2 3 4 5
        //   6 7 8
        //     9
        
    	// 행 우선순회
    	// 1행 0 ~ 4 , 2행 1 ~ 3 , 3행 2 ~ 2
    	// c를 r ~ 4-r 까지로 잡으면 될 것 같다.
    	
    	int[][] arr = new int[3][5];        
    	int a = 0;
    	
    	    	
//    	방법 1
//    	
//    	int left = 0;
//    	int right = 5;
//    	
//    	for (int r = 0; r <3; r++) {
//    		for(int c = left; c<=right; c++) {
//    			arr[r][c] = ++a;
//    		}
//    		left++; right--;
//    	}
    	
    	//방법 2
    	
    	for (int r = 0; r <3; r++) {
    		for(int c = r; c<5-r; c++) {
    			arr[r][c] = ++a;
    		}
    	}    	
    	
    	for (int r = 0; r < 3; r++) {
			for (int c = 0; c < 5; c++) {
				if(arr[r][c] ==0) {
					System.out.print("  ");
				} else {
					System.out.printf("%2d", arr[r][c]);	
				}
				
			}
			System.out.println();
		}
    	
    	
    	
        
    }
}
