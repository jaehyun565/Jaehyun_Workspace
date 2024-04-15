package D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class swexpert_9367_점점커지는당근의개수 {
	public static void main(String[] args) throws IOException {
//		double time1 = System.currentTimeMillis();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		for (int t = 1; t <= testCase; t++) {
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int cnt = 1;
			
			Stack<Integer> carrot = new Stack<>();
			for (int i = 0; i < N; i++) {
				carrot.push(Integer.parseInt(st.nextToken()));
			}
			
			
			int answer = 0;
			int a = carrot.pop();
			while (!(carrot.isEmpty())) {
				if (a > carrot.peek()) {
					cnt++;
				} else {
					cnt = 1;
				}
				answer = Math.max(answer, cnt);				
				a = carrot.pop();				
			}
			System.out.println("#" + t + " " + answer);
		}
//		double time2 = System.currentTimeMillis();
//		System.out.println((time2-time1)/1000);
	}
}
