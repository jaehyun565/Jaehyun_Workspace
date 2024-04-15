package SWexpert_08_Queue2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_1860_진기의최고급붕어빵 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());
		next: for (int testCase = 1; testCase <= t; testCase++) {
			// 변수 받는 과정
			String[] s1 = br.readLine().split(" ");
			String[] s2 = br.readLine().split(" ");
			int num = 0, time = 0, count = 0;

			for (int i = 0; i < 3; i++) {
				num = Integer.parseInt(s1[0]);
				time = Integer.parseInt(s1[1]);
				count = Integer.parseInt(s1[2]);
			}

			int[] person = new int[num];
			for (int i = 0; i < num; i++) {
				person[i] = Integer.parseInt(s2[i]);
			}
			// 변수 받는 과정 끝.
			
			// person 배열을 오는 시간순서대로 정렬 -> 삽입정렬 사용.
			for (int i = 1; i < num; i++) {
				int key = person[i];
				int j;
				for (j = i - 1; j >= 0 && person[j] > key; j--) {
					person[j+1] = person[j];
				}
				person[j+1] = key;
			}
			// 삽입정렬 끝.
			
			// 가능여부 계산
			// 1. 손님이 올때마다 그 손님이 왔을 때를 기준으로 붕어빵 생산량을 계산한다
			// 2. 그 손님을 포함하여 그 손님 앞전까지 총 팔린 붕어빵 갯수를 계산한다.
			// 3. 붕어빵 생산량 - 팔린(그 손님포함) 붕어빵 갯수가 0이상이면 가능
			bw.write("#"+testCase+" ");
			int supply_count = 0; // 손님이 올 당시에 총 생산된 붕어빵
			int sell_count = 0; // 손님이 도착할 당시에 팔린 붕어빵
			for (int i = 0; i < num; i++) {
				supply_count = (person[i] / time) * count; // (해당 손님이 온 시간 / 생산시간) * 생산시간당 생산수량
				sell_count++;
				if (supply_count - sell_count < 0) {
					bw.write("Impossible\n");
					continue next;
				}
			}
			bw.write("Possible\n");
		}
		bw.close();
	}
}