package test07_탐색;

public class Array03_2차원배열_사방탐색_탐색끝까지 {
    public static void main(String[] args) {
        
        // 다음 배열에서 1이 들어있는 칸을 포함한 행과 열에 
        // 모두 2를 채워 넣는다.(1이 들어있는 칸 제외)
        
        int[][] arr = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        };
        
        int N = 7;
        
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        
        
        // 끝까지 가는 경우
        // while문을 쓰는게 좋음
        
        
        for (int r = 0;r<N;r++) {
        	for(int c=0;c<N;c++) {
        		if(arr[r][c] ==1) {
        			for(int d=0;d<4;d++) {
                    	
                    	int nr = r + dr[d];
                    	int nc = c + dc[d];
                    	
                    	while(nr>=0 && nr<N && nc>=0 && nc <N) { //경계 안에 있으면 
                    		arr[nr][nc] =2; // 상하좌우칸에 2를 채우고                		
                    		nr += dr[d]; // 상하좌우 방향으로 한번 더 가면서 2를 채워라.
                    		nc += dc[d];
                    		
                    	}
            		}
        		}
        		
        	}        
        }
        
        for(int r= 0;r<N;r++) {
        	for(int c = 0;c<N;c++) {
        		System.out.printf("%2d", arr[r][c]);
        	}
        	System.out.println();
        }
        
    }
}
