package SWexpert_11_Heap;

import java.util.Scanner;

public class etst {

	public static void main(String[] args) {
		int[] start = {1,1};
		int[] end = {-2,-2};
		
		int a = end[0]-start[0];
		int b = end[1]-start[1];
		
		double c = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		
		double radian = Math.atan(b/a);
		double radian2 = Math.atan2(a, b);
		double degree2 = Math.toDegrees(radian2);
		double degree = Math.toDegrees(radian);
		
		System.out.println(degree);
		System.out.println(degree2);
		
				
	}
}
