package Gold;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Baekjoon_13335_트럭 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]); // 트럭의 총 대수
		int w = Integer.parseInt(s[1]); // 다리의 길이
		int L = Integer.parseInt(s[2]); // 다리 최대 하중
		int time = n * w + 1;

		String[] weight = br.readLine().split(" ");
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			queue.offer(Integer.parseInt(weight[i]));
			int nowWeight = queue.poll();
			if(nowWeight + queue.peek() < 10) {
				queue.peek();
			}
		}

	}
}
