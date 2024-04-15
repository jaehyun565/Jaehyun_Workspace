package test01_2차원배열기본;

public class Array05_2차원배열_실습문제 {
    public static void main(String[] args) {
        int[][] grid = {
                {2, 3, 1, 5, 6},
                {8, 13, 3, 33, 1},
                {7, 4, 5, 80, 12},
                {17, 9, 11, 5, 4},
                {4, 5, 91, 27, 7}
        };
        // 전체를 순회하면서 3의 배수의 개수와 총합을 구해보자.
        
        int count = 0;
        int sum = 0;
        
        for(int r=0;r<grid.length;r++) {
        	for(int c=0;c<grid[r].length;c++) {
        		if(grid[r][c] % 3 == 0) {
        			count++;        			
        			sum+= grid[r][c];
        		}
        	}
        }
        System.out.println("3의 배수의 개수 = "+ count + ", 3의 배수의 총합 = "+sum);
    }
}
