package SWexpert_01_Array;

import java.util.Scanner;

public class find_max {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		int i =0;
		while(i<cnt) {
			int[] testCase= new int[10];
			for(int j=0;j<10;j++) {
				testCase[j] = sc.nextInt();
			}
			int max = testCase[0];
			for(int j =0 ; j<10;j++) {
				if(testCase[j] > max) {
					max = testCase[j];
				}
			}
			System.out.println("#"+(i+1)+" "+max);
			i++;
		}
		
	}
}
