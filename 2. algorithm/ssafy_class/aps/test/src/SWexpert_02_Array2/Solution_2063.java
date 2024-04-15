package SWexpert_02_Array2;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_2063 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int[N];

		for (int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}

		int[] count = new int[200];

		// count함수를 사용해서 정렬.
		for (int i = 0; i < num.length; i++) {
			count[num[i]]++;
		}

		// count함수를 누적합 형태로 변형
		for (int i = 1; i < count.length; i++) {
			count[i] += count[i - 1]; // 원소에 0이 있다면 count[0]은 위에서 이미 카운트됐으므로, i = 1부터 누적합해도 무관.
		}
		
		// num배열을 뒤에서부터 돌리면서, 해당 원소의 누적값 번호를 확인하고
		// 그 수에서 1을 뺀 인덱스번호에 num[i]의 값을 넣어줌.
		int[] tmp = new int[num.length];
		for (int i = num.length - 1; i >= 0; i--) {			
			tmp[--count[num[i]]] = num[i];
		}
		System.out.println(Arrays.toString(tmp));

		System.out.println(tmp[N/2]);
	}

}
