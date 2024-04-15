package Lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Programmers_추억점수_lv1 {
	public static int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] answer = new int[photo.length];

		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < name.length; i++) {
			map.put(name[i], yearning[i]);
		}

		for (int r = 0; r < photo.length; r++) {
			for (int c = 0; c < photo[r].length; c++) {
				for(String k : map.keySet()) {
					if(photo[r][c].equals(k)) {
						answer[r] += map.get(k);
					}
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		String[] name = { "may", "kein", "kain", "radi" };
		int[] yearning = { 5, 10, 1, 3 };
		String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

		
		System.out.println(Arrays.toString(solution(name, yearning, photo)));
	}
}
