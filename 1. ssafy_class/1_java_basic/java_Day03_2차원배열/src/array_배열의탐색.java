
import java.util.Scanner;

public class array_배열의탐색 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] board = new int[3][3];
		
		int nowRow = 1;
		int nowColumn =1;
		
		int[] dr = {0, 0, 1, -1};
		int[] dc = {-1, 1, 0, 0};
		
		while(true) {
			String direction = sc.next();
			int d = -1;
			if(direction.equals("up")) {
				d = 3;
			}else if(direction.equals("down")) {
				d = 2;
			}else if(direction.equals("left")) {
				d = 0;
			}else if(direction.equals("right")) {
				d = 1;
			}else if(direction.equals("finish")){
				break;
			}else {			
				System.out.println("잘못된 입력값입니다.");
			}
			nowRow = nowRow + dr[d];
			nowColumn = nowColumn + dc[d];
			System.out.println(nowRow + " , " + nowColumn);
		}
	
}
}
