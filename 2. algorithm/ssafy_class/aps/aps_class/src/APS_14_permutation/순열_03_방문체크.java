package APS_14_permutation;

import java.util.Arrays;

public class 순열_03_방문체크 {
	static int[] nums;
	static int N;
	static boolean[] visited; // 해당 원소 사용 유무
	static int[] result; // 순열결과 저장

	public static void main(String[] args) {
		nums = new int[] { 0, 1, 2 };
		N = nums.length;
		visited = new boolean[N];
		result = new int[N];
		
		perm(0);
	}

	// idx : 결과 배열에 저장할 위치
	public static void perm(int idx) {
		if (idx == N) { // 다 뽑았어~~
			System.out.println(Arrays.toString(result));
			return;
		}

		// recursive case
		// N개의 원소를 가지고 판단하려고!
		for (int i = 0; i < N; i++) {
			// i 번째 사용했어! 그니까 쓰면 안돼
			if (visited[i]) {
				continue;
			}
			// 아래 코드가 실행 된다 = i 번째 사용이 안됐다는 뜻
			result[idx] = nums[i];
			visited[i] = true; // 인제 이거 씀.
			perm(idx + 1); // 다음 자리 판단.
			visited[i] = false; // 원상복구			
			
		}
	}
}
