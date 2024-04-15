package APS_14_permutation;

import java.util.Arrays;

public class 순열_04_비트마스킹 {
	static int[] nums;
	static int N;
	static int[] result; // 순열결과 저장

	public static void main(String[] args) {
		nums = new int[] { 0, 1, 2 };
		N = nums.length;
		result = new int[N];

		perm(0, 0);

	}

	// idx : 결과배열에 저장할 위치
	// visited : 사용할 원소를 기록하기 위한 정수
	public static void perm(int idx, int visited) {
		if (idx == N) {
			System.out.println(Arrays.toString(result));
			return;
		}

		// 모든 원소를 돌면서 판단하겠다.
		for (int i = 0; i < N; i++) {
			if ((visited & (1 << i)) != 0) {
				continue;
			}
			// 이 코드가 수행 된다는건 i번째 원소 사용안함.
			result[idx] = nums[i];
			// 재귀를 다시 함
			perm(idx + 1, visited | (1 << i));
		}
	}
}
