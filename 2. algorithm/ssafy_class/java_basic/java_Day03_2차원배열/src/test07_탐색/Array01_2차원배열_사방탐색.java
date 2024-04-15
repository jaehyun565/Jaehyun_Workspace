package test07_탐색;

public class Array01_2차원배열_사방탐색 {
    public static void main(String[] args) {
        
        // 다음 배열에서 1이 들어있는 칸의 상하좌우에 인접한 칸에
        // 2를 채워 넣으시오.
        
        int[][] arr = {
                {0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 0, 0, 1},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0}
        };
        
        // 배열의 크기
        int N = 5;
        
        // 델타배열 만들기
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        
        // 1. 행 우선 순회
        for(int r = 0; r<N; r++) {
        	for(int  c=0; c<N;c++) {
        		if(arr[r][c] == 1) { // 이 때의 (r,c)가 1인 원소의 좌표가 되고 이게 곧 기준점!
        			System.out.println("r :"+r+", c : "+c);
        			// (r,c)를 기준으로 해서 상하좌우의 인접 좌표를 만든다!
        			// 델타배열을 이용해서!
        			
        			for (int d=0; d<4 ; d++) {
        				// 새로운 좌표(인접 원소의 좌표)
        				int nr = r + dr[d];
        				int nc = c + dc[d];
        				
        		        // 위 방법의 문제점은 경계 조건을 고려하지 않음. (경계에 숫자가 위치할 경우 out of bound 에러가 됨.
        				// 새로운 좌표가 기존 행렬의 index 범위 안에 있다면 작업을 해라~ 가 추가가 되어야 함. ==> 경계 조건
        				
        				if(nr>=0 && nr<N && nc>=0 && nc <N) { // 이것이 경계 조건
        					arr[nr][nc]=2;
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
