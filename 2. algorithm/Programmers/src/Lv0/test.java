package Lv0;

import java.util.*;

public class test {
	public static void main(String[] args) {
		int answer = 0;
		String numbers = "12345678";
		char[] c = numbers.toCharArray();
		Integer[] arr = new Integer[c.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = c[i] - 48;
		}

		Arrays.sort(arr, Collections.reverseOrder());
		int l = arr.length;
		int number = 0;
		for (int i = 0; i < l; i++) {
			number += arr[i] * Math.pow(10, (l - 1 - i));
		}

		for (int i = 0; i < number; i++) {
			
		}

	}
}