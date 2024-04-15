package D3;
import java.util.Arrays;
import java.util.Scanner;

public class swexpert_6808_규영이와인영이의카드게임강사님 {

	static int winCount, loseCount;
	static int[] yourCards, myCards, visit;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			yourCards = new int[9];
			myCards = new int[9];
			visit = new int[19];

			// 상대방이 고른 카드를 visit배열에 1을 넣고
			for (int i = 0; i < 9; i++) {
				yourCards[i] = sc.nextInt();
				visit[yourCards[i]] = 1;
			}
			// visit배열에 0인 값들을 myCards에 넣으면 반반 나눠짐
			int idx = 0;
			for (int i = 1; i < 19; i++) {
				if (visit[i] == 0) {
					myCards[idx++] = i;
				}
			}
			recursion(0);
			System.out.println("#"+tc+" " + winCount+" "+loseCount);
		}
	}

	// 순열을 계산하는 재귀함수
	public static void recursion(int idx) {
		if (idx == 9) {			
			int myScore = 0;
			int yourScore = 0;
			for (int i = 0; i < 9; i++) {
				if(myCards[i] > yourCards[i]) {
					myScore += myCards[i] + yourCards[i];
				} else if(myCards[i] < yourCards[i]) {
					yourScore += myCards[i] + yourCards[i];
				}
			}
			
			if(myScore > yourScore) {
				winCount++;
			} else if(myScore < yourScore) {
				loseCount++;
			}
		}

		for (int i = idx; i < 9; i++) {
			int tmp = myCards[i];
			myCards[i] = myCards[idx];
			myCards[idx] = tmp;

			recursion(idx + 1);
			// 원상복귀 과정
			tmp = myCards[i];
			myCards[i] = myCards[idx];
			myCards[idx] = tmp;
		}
	}
}
