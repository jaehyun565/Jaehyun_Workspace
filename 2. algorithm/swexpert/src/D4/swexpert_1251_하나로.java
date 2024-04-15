package D4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swexpert_1251_하나로 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int testCase = Integer.parseInt(br.readLine());

		for (int t = 1; t <= testCase; t++) {
			sb.append("#").append(t).append(" ");
			int num = Integer.parseInt(br.readLine());
			int[] x = new int[num];
			int[] y = new int[num];
			double[][] island = new double[num][num];

			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < num; i++) {
				x[i] = Integer.parseInt(st.nextToken());
			}
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < num; i++) {
				y[i] = Integer.parseInt(st.nextToken());
			}

			for (int i = 0; i < num; i++) {
				for (int j = 0; j < num; j++) {
					island[i][j] = island[j][i] = Math.sqrt(Math.pow(x[j] - x[i], 2) + Math.pow(y[j] - y[i], 2));
				}
			}
			
			double E = Double.parseDouble(br.readLine());
			
			// 입력 끝

			boolean[] visited = new boolean[num];
			double [] dist = new double [num];

			for (int i = 0; i < num; i++) {
				dist[i] = Integer.MAX_VALUE;
			}

			dist[0] = 0;
			double cost = 0;

			for (int i = 0; i < num; i++) {
				double min = Integer.MAX_VALUE;
				int idx = -1;

				for (int j = 0; j < num; j++) {
					if(!visited[j]  && dist[j] < min) {
						min = dist[j];
						idx = j;
					}
				}
				visited[idx] = true;
				
				for(int j = 0; j<num;j++) {
					if(!visited[j] && island[idx][j] != 0 && dist[j] > island[idx][j]) {
						dist[j] = island[idx][j];						
					}
				}
			}
			
			for(int i =0;i<num;i++) {
				cost += TotalCost(dist[i], E);
			}
			
			sb.append(Math.round(cost)).append("\n");
		}
		System.out.println(sb);
	}

	static double TotalCost(double d, double E) {
		return Math.pow(d,2) * E;
	}
}
