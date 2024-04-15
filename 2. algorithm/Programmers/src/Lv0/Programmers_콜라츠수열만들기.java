package Lv0;

import java.util.Arrays;

public class Programmers_콜라츠수열만들기 {
	public static void main(String[] args) {
		int num = 3;
		int total = 12;
		int[] answer = new int[num];
		int a;
		int b = 0;
		for (int i = 1; i < num; i++) {
			b += i;
		}
		a = (total - b) / num;
		System.out.println(a);
		System.out.println(a+num);
		int idx = 0;
		for (int i = a; i < a + num; a++) {
			answer[idx++] = i;
		}
		System.out.println(answer);
	}
}
