package SWexpert_01_Array;

import java.util.Scanner;

public class Solution_View {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T;
		T = 10;

		for (int test_case = 1; test_case <= T; test_case++) {
			int count = sc.nextInt();
			int[] building_height = new int[count];
			int sight_num = 0;
			for (int i = 0; i < count; i++) {
				building_height[i] = sc.nextInt();
			}
			for (int i = 2; i < count - 2; i++) {
				int max = building_height[i];
				max = Math.max(building_height[i - 2], building_height[i - 1]);
				max = Math.max(max, building_height[i + 1]);
				max = Math.max(max, building_height[i + 2]);
				if (max < building_height[i]) {
					sight_num += (building_height[i] - max);
				}

			}
			System.out.println("#" + test_case + " " + sight_num);
		}

	}
}
