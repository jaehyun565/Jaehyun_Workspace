package SWexpert_01_Array;

import java.util.Scanner;

public class Problem2_midAverage {

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int[] array = new int[10];
			for (int i = 0; i < 10; i++) {
				array[i] = sc.nextInt();
			}
			
			int max = array[0];
			int min = array[0];
			for (int i = 0; i < 10; i++) {
				if (array[i] > max) {
					max = array[i];
				}
				if (array[i] < min) {
					min = array[i];
				}
			}
			int mid_total = 0;
			for (int i = 0; i < 10; i++) {
				if(array[i]!=max && array[i]!=min) {
					mid_total+=array[i];
				}
			}
			
			System.out.printf("#"+test_case+" %.0f \n",(double)(Math.round(mid_total/8.0)));
			
		}
	}
}
