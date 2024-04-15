package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main_1929_소수구하기 {
	public static void main(String[] args) throws IOException {
		long beforeTime = System.currentTimeMillis(); // 코드 실행 전에 시간 받아오기

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int[] arr = new int[N / 2 + 1];
		List<Integer> list = new ArrayList<>();

		// 최초의 소수 2 넣음
		arr[0] = 2;
//		list.add(2);
		int idx = 1;

		for (int i = 2; i <= N; i++) {
			System.out.println("i"+i);
			System.out.println(idx);
			for (int j = 0; j < idx; j++) {
				if (i % arr[j] == 0) {
					break;
				}
				if (j == idx - 1) {
					arr[j] = i;
					idx++;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
			
			
//		// 2 ~ 마지막 수(N) 까지 돌면서 이전의 소수로 나눠지는지 판별 
//		for (int i = 2; i <= N; i++) {
//			for (int j = 0; j < list.size(); j++) {
//				// 이전에 저장된 소수로 나눠진다면 그 수는 소수가 아님
//				if (i % list.get(j) == 0) {
//					break;
//				}
//				// 소수 list에 있는 모든 수를 봤는데도 나눠진 적이 없으면 그 수는 소수임
//				if (j == list.size() - 1) {
//					list.add(i);
//				}
//			}
//		}
//		// 출력을 위해 idx를 지정
//		int idx = 0;
//		// 소수 리스트를 돌면서 M이 그 리스트의 수 이상일 때의 idx값을 저장함
//		for (int i = 0; i < list.size(); i++) {
//			if (M >= list.get(i)) {
//				idx = i;
//			}
//		}
//
//		// 위에서 저장한 idx부터 소수 리스트의 값들을 모두 출력
//		for (int i = idx; i < list.size(); i++) {
//			sb.append(list.get(i)).append("\n");
//		}
//		System.out.println(sb);
		// 실험할 코드 추가

		long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		long secDiffTime = (afterTime - beforeTime); // 두 시간에 차 계산
		System.out.println("시간차이(m) : " + secDiffTime);

	}
}
