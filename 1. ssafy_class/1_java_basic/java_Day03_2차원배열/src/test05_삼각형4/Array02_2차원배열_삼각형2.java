package test05_삼각형4;

public class Array02_2차원배열_삼각형2 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        
//        4  7  9  10 
//        3  6  8     
//        2  5        
//        1       
        
        int cnt = 0;
        for(int c=0; c<4; c++) {
            for(int r=3-c; r>=0; r--) {
                arr[r][c] = ++cnt;
            }
        }
        
        for(int r=0; r<4; r++) {
            for(int c=0; c<4; c++) {
                if(arr[r][c] == 0)
                    System.out.print("   ");
                else
                    System.out.printf("%-3d", arr[r][c]);
            }
            System.out.println();
        }
    }
}
