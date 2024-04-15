package D3;
import java.util.Scanner;

public class swexpert_2806_NQueen강사님 {
	static int N, answer;
	static int[] queen;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			queen = new int[N];
			answer = 0;

			recursion(0);
			
			System.out.println("#" + tc + " " + answer);
		}
	}

	// 백트래킹용 함수
	public static void recursion(int r) {// 현재 보고 있는 행의 번호를 매개변수로 받음.
		// base Case
		if(r == N) {
			answer++;
			return;
		}
		// recusrion Case
		column :for (int c = 0; c < N; c++) {
			// r, c 에 퀸을 놓는다고 가정하자.
			// 현재까지 놓인 퀸과 값을 비교.
			for (int i = 0; i < r; i++) {
				// => 새로놓은 퀸 c 와 지금까지 놓인 퀸의 열번호가 하나라도 같으면 중지
				// 대각선상에 놓인 퀸들은 직각이등변삼각형이므로 |x1-x2| == |y1-y2| 면 대각선임 => 이 때도 안 되니까 중지
				if(c == queen[i] || Math.abs(r-i) == Math.abs(c-queen[i])) {
					continue column;
				}
			}
			queen[r] = c;
			recursion(r + 1);
		}
	}

}
