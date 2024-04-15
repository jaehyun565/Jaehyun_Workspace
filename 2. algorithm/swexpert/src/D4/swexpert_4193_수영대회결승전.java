package D4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class swexpert_4193_수영대회결승전 {
	static int[][] ocean, timetable;
	static boolean[][] visited;
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };
	static int N;
	static int time = 0;
	static int answer;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int testCase = Integer.parseInt(st.nextToken());

		for (int t = 1; t <= testCase; t++) {
			sb.append("#").append(t).append(" ");
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			ocean = new int[N][N];
			timetable = new int[N][N];
			visited = new boolean[N][N];
			answer = 0;
			// 바다 정보 저장
			for (int r = 0; r < N; r++) {
				st = new StringTokenizer(br.readLine());
				for (int c = 0; c < N; c++) {
					ocean[r][c] = Integer.parseInt(st.nextToken());
				}
			}

			// 출발지 위치 입력
			int[] start = new int[2];
			st = new StringTokenizer(br.readLine());
			start[0] = Integer.parseInt(st.nextToken());
			start[1] = Integer.parseInt(st.nextToken());
			// 도착지 위치 입력
			int[] goal = new int[2];
			st = new StringTokenizer(br.readLine());
			goal[0] = Integer.parseInt(st.nextToken());
			goal[1] = Integer.parseInt(st.nextToken());

			bfs(start, goal);
			if(answer==0) {
				sb.append(-1).append("\n");
			} else {
				sb.append(answer).append("\n");				
			}
		}
		System.out.println(sb);
	}

	static void bfs(int[] start, int[] goal) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(start);
		while (!queue.isEmpty()) {
			int[] curr = queue.poll();
			// bfs를 계속 돌다가 목표지점에 해당하는 수를 받으면 answer값으로 저장
			// 최종 완탐이 끝났을 때의 값이 최종적으로 저장 될 것.
			if (curr[0] == goal[0] && curr[1] == goal[1]) {
				answer = timetable[curr[0]][curr[1]];
			}
			
			int curr_r = curr[0];
			int curr_c = curr[1];
			for (int d = 0; d < 4; d++) {
				int nr = curr_r + dr[d];
				int nc = curr_c + dc[d];
				// 현재 위치에서 사방탐색을 하면서 그 사방탐색이
				// 1) 경계면을 넘지않고 2) 방문할 수있는 상태이고(visited[nr][nc] > 0), 3) 현재 내 위치에서 나갈 수 있는
				// 상태라면(visited[curr_r][curr_c]>0)
				// 아래 문장을 실행한다
				if (nr >= 0 && nr < N && nc >= 0 && nc < N && ocean[nr][nc] != 1 && (!visited[nr][nc]	|| (timetable[nr][nc] > 0 && timetable[nr][nc] > timetable[curr_r][curr_c] + 1))) {
					timetable[nr][nc] = timetable[curr_r][curr_c] + 1;

					visited[nr][nc] = true;
					// 새로 도착하는 위치의 좌표 값을 저장
					queue.offer(new int[] { nr, nc });
					// 만일 해당 위치가 토네이도라면 토네이도가 잠잠할 때까지 타임테이블을 증가시킴
					if (ocean[nr][nc] == 2) {
						while ((timetable[nr][nc]) % 3 != 0) {
							timetable[nr][nc]++;
						}
					}

				}
			}
		}
	}

}
