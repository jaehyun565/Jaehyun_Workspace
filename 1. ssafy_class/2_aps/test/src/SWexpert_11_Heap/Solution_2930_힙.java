package SWexpert_11_Heap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Solution_2930_힙 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {				
				return o2-o1;
			}
			
		});

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testCase = Integer.parseInt(br.readLine());

		for (int t = 1; t <= testCase; t++) {
			pq.clear();
			int taskNum = Integer.parseInt(br.readLine());
			bw.write("#" + t + " ");
			for (int i = 0; i < taskNum; i++) {				
				StringTokenizer st = new StringTokenizer(br.readLine());
				int actionNum = Integer.parseInt(st.nextToken());			
				
				if (actionNum == 1) {
					pq.add(Integer.parseInt(st.nextToken()));
//					bw.write(String.valueOf(pq));
				} else if (actionNum == 2) {
					if (pq.isEmpty()) {
						bw.write(-1 + " ");					
//						bw.write(String.valueOf(pq));
					} else {
						bw.write(pq.poll() + " ");
//						bw.write(String.valueOf(pq));
					}
				}
			}
			bw.write("\n");
		}
		bw.close();

	}
}
