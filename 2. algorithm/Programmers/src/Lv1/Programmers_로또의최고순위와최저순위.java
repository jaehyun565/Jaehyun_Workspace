package Lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Programmers_로또의최고순위와최저순위 {

	public static int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
		
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 6);
		map.put(1, 6);
		map.put(2, 5);
		map.put(3, 4);
		map.put(4, 3);
		map.put(5, 2);
		map.put(6, 1);
		
		int rank = 0;
		int zerocnt = 0;
		for (int i : lottos) {
			for (int j = 0; j < 6; j++) {
				if (i == win_nums[j]) {
					rank++;
				}
			}
			if( i == 0 ) {
				zerocnt++;
			}
		}
		answer[0] = map.get(rank + zerocnt);				
		answer[1] = map.get(rank);
		
		
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		
		System.out.println(Arrays.toString(solution(lottos, win_nums)));
	}
}
