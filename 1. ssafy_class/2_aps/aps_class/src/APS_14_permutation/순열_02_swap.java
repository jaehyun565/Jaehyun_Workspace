package APS_14_permutation;

import java.util.Arrays;

public class 순열_02_swap {
	static int[] nums;
	static int N;

	public static void main(String[] args) {
		nums = new int[] { 0, 1, 2 };
		N = nums.length;

        perm(0);
	}

	// idx : 현재 판단하는 위치
	public static void perm(int idx) {
		if (idx == N) {
			System.out.println(Arrays.toString(nums));
			return;
		}

		// 재귀조건
		for (int i = idx; i < N; i++) {
			// (i, idx)의 위치를 swap
            swap(i, idx);
			perm(idx + 1);
			// (i, dix)의 위치를 swap(원상복구 하는 과정)
            swap(i, idx);
		}
	}

    public static void swap(int a, int b){
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }

}
