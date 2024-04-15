package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swexpert_1970_쉬운거스름돈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int testCase = Integer.parseInt(br.readLine());
		int[] table = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };

		for (int t = 1; t <= testCase; t++) {
			sb.append("#").append(t).append("\n");
			int[] answer = new int[table.length];
			int money = Integer.parseInt(br.readLine());
			for (int i = 0; i < table.length; i++) {
				answer[i] = money / table[i];
				money %= table[i];
			}

			for (int i = 0; i < answer.length; i++) {
				sb.append(answer[i]).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);

	}

}
