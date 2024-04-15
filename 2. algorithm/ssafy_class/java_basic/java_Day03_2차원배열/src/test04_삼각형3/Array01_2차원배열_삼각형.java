package test04_삼각형3;

public class Array01_2차원배열_삼각형 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        
//        1           
//        2  5        
//        3  6  8     
//        4  7  9  10
        
        // 열 우선 순회
        // c는 정상적으로 순회하고 r은 c에 값 만큼만 딱 값이 들어감
        
        int a = 0;
        
        
        for(int c=0;c<4;c++) {
        	for(int r=c;r<4;r++) {
        		arr[r][c] = ++a;
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
