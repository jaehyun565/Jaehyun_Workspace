package SWexpert_07_Queue1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Solution_3499_퍼펙트셔플 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());

		next : for (int testCase = 1; testCase <= t; testCase++) {
			Queue<String> queue1 = new LinkedList<>();
			Queue<String> queue2 = new LinkedList<>();
			int num = Integer.parseInt(br.readLine()); // 문자의 개수
			String[] s = br.readLine().split(" ");
			bw.write("#"+testCase+" ");

			if (num % 2 == 0) {
				for (int i = 0; i < num / 2; i++) {
					queue1.offer(s[i]);
				}
				for (int i = num / 2; i < num; i++) {
					queue2.offer(s[i]);
				}

				for (int i = 0; i < (num/2); i++) {
					bw.write(queue1.poll() + " ");
					bw.write(queue2.poll()+" ");
				}

			} else {
				for (int i = 0; i < (num + 1) / 2; i++) {
					queue1.offer(s[i]);
				}
				for (int i = (num + 1) / 2; i < num; i++) {
					queue2.offer(s[i]);
				}

				for (int i = 0; i < (num + 1) / 2; i++) {
					bw.write(queue1.poll()+" ");
					if(queue2.peek() == null) {
						bw.write("\n");
						continue next;
					}
					bw.write(queue2.poll()+" ");
				}
			}
			bw.write("\n");
		}
		bw.close();
	}
}
