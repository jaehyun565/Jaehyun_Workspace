package SWexpert_07_Queue1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solution_1225_암호생성기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = 10;

		next: for (int testCase = 1; testCase <= t; testCase++) {
			Queue<Integer> queue = new LinkedList<>();
			br.readLine();
			String[] s = br.readLine().split(" ");

			for (int i = 0; i < s.length; i++) {
				queue.offer(Integer.parseInt(s[i]));
			}
			while (true) {
				for (int i = 0; i < 5; i++) {
					int num = queue.poll() - (i + 1);
					if (num <= 0) {
						queue.offer(0);
						System.out.print("#" + testCase + " ");
						for (int j = 0; j < s.length; j++) {

							System.out.print(queue.poll() + " ");
						}
						System.out.println();
						continue next;
					}
					queue.offer(num);
				}

			}

		}
	}

}
