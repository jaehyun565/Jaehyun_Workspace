package Lv2;

import java.util.Arrays;

public class Programmers_택배배달과수거하기 {
//	class Solution {
		public static long solution(int cap, int n, int[] deliveries, int[] pickups) {
			long answer = 0;
			int delivery_cnt = 0; //총 배달해야하는 갯수
			int pickup_cnt = 0; // 총 수거해야하는 갯수
			int box = 0; // 현재 싣고나가는(혹은 수거하는)box 수
			
			// 총 배달갯수와 총 수거갯수 계산
			for (int i = 0; i < n; i++) {
				delivery_cnt += deliveries[i];
				pickup_cnt += pickups[i];
			}
			
			// 반복문 돌면서, 배달수와 수거갯수가 둘다 0개 이하이면 반복문 멈춤.
			while (!(delivery_cnt <= 0 && pickup_cnt <= 0)) {
				int distance = 0;	
				// 싣고 나가는 box의 수를 계산해주자.
				// 배달할 갯수가 남아있으면 box(싣고나가는) 수는 cap과 총숫자 중 큰 수.
				if(delivery_cnt >0) {
					box = Math.min(cap, delivery_cnt);
					delivery_cnt -= box;
				} 
					else {
					box = 0;
				}
				
				// 배달할 일이 남아있는 가장 먼집부터 돌기.
//				for (int i = n - 1; i >= 0; i--) {
//					while (box > 0 && deliveries[i] > 0) {
//						deliveries[i]--;
//						box--;
//						distance = Math.max(distance, i+1);				
//					}
//				}				
				int j=n-1;
				
				while (box > 0 && deliveries[j] > 0 && j>=0) {					
					deliveries[j]--;
					box--;
					distance = Math.max(distance, j+1);
					if(deliveries[j] ==0) {
						j--;
					}
					System.out.println(box);
					System.out.println(Arrays.toString(deliveries));
				}
				
				
				for (int i = n - 1; i >= 0; i--) {					
					while (box < cap && pickups[i] > 0) {						
						pickups[i]--;
						box++;			
						distance = Math.max(distance, i+1);						
					}
				}
				pickup_cnt -= box;	
				answer+=distance *2;
			}
			return answer;
		}		
//	}
		public static void main(String[] args) {
			int[] a = {1,0,3,1,2};
			int[] b = {0,3,0,4,0};
			System.out.println(solution(4,5,a,b));
				
		}
	
}