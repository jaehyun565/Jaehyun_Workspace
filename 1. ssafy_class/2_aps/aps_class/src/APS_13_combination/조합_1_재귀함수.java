// 재귀호출을 이용한 조합 생성
package APS_13_combination;

import java.util.Arrays;

public class 조합_1_재귀함수{
		// 데이터 배열
		static String[] 속 = {"상추", "패티", "치즈", "피클"};
		static int N,R; // N은 재료 개수, r은 조합할 개수
		static String[] sel;

		public static void main(String[] args){
				N = 4;
				R = 2;
				// 조합을 받을 임시 배열
				sel = new String[R];

				combination(0,0);
		}

		// idx : 현재 내가 판단할 재료의 번호
		// sidx : sel[] 에서 몇 번째 자리를 판단할 것인지
		private static void combination(int idx, int sidx){
				// base case

				// 우선순위를 생각 했을 때, 햄버거 완성을 먼저 파악하고
				// 그 다음에 재료고려를 하는게 맞다.(1,2를 반대로 하면 덜 나옴)
				// 1. sidx가 R까지 갔어!(== 햄버거 완성)
				if(sidx >= R){
						System.out.println(Arrays.toString(sel));
						return;
				}
				// 2. idx가 N까지 갔어!(== 속 다 봤어)
				if(idx >= N){
						System.out.println(Arrays.toString(sel));
						return;
				}
				// recursive case

				// 1. 해당 idx번째 재료를 sidx위치에 넣었을 때,
				sel[sidx] = 속[idx];
				combination(idx+1, sidx+1); // 다음 재료를 판단해줘.

				// 2. 해당 idx번째 재료를 sidx위치에 안 넣었을 때,				
				combination(idx+1, sidx); // 다음 재료를 판단해줘.(sidx에 안 넣었으니까 증가하면 안됨)

		}
}