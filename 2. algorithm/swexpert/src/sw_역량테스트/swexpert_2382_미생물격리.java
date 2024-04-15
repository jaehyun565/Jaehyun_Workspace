package sw_역량테스트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swexpert_2382_미생물격리 {
	static int[][] map, direction, check;
	static boolean[][] move;
	static int[] dr = { 0, -1, 1, 0, 0 };
	static int[] dc = { 0, 0, 0, -1, 1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());

		for (int t = 1; t <= testCase; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); // 셀의 크기
			int M = Integer.parseInt(st.nextToken()); // 결리 시간
			int K = Integer.parseInt(st.nextToken()); // 군집의 갯수

			map = new int[N][N];
			direction = new int[N][N];
			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					if (r == 0 || c == 0 || r == N - 1 || c == N - 1) {
						map[r][c] = -1;
						continue;
					}
				}
			}

			// 맵과, 방향배열에 미생물 수와 해당 미생물의 이동방향 기재
			for (int i = 0; i < K; i++) {
				st = new StringTokenizer(br.readLine());
				int tmp_r = Integer.parseInt(st.nextToken());
				int tmp_c = Integer.parseInt(st.nextToken());
				int count = Integer.parseInt(st.nextToken());
				int way = Integer.parseInt(st.nextToken());
				for (int r = 0; r < N; r++) {
					for (int c = 0; c < N; c++) {
						if (r == tmp_r && c == tmp_c) {

							map[r][c] = count;
							direction[r][c] = way;
						}
					}
				}
			}

			for (int a = 0; a < N; a++) {
				for (int b = 0; b < N; b++) {
					System.out.print(map[a][b] + " ");
				}
				System.out.println();
			}
			System.out.println("--------------------------------");

			for (int time = 0; time < M; time++) {
				check = new int[N][N];
				move = new boolean[N][N];
				for (int r = 0; r < N; r++) {
					for (int c = 0; c < N; c++) {
						if (map[r][c] > 0) {
							for (int d = 1; d < 5; d++) {
								if (d == direction[r][c]) {
									int nr = r + dr[d];
									int nc = c + dc[d];
									if (nr >= 0 && nr < N && nc >= 0 && nc < N) {
										// 경계 선에 닿는다면
										if (nr == 0 || nr == N - 1 || nc == 0 || nc == N - 1) {
											// 미생물수 : 새로운 곳에 가는 미생물은 현재의 절반
											map[nr][nc] = map[r][c] / 2;
											// 미생물방향 : direction이 1 또는 3(상 또는 좌)인 경우에는 +1
											if (direction[r][c] % 2 == 1) {
												direction[nr][nc] = direction[r][c] + 1;
												// direction이 2 또는 4(하 또는 우) 인 경우에는 -1
											} else {
												direction[nr][nc] = direction[r][c] - 1;
											}
											// 가려는 곳에 이미 다른 미생물이 있다면
										} else if (check[nr][nc] > 0) {
											// 미생물 숫자를 합치고
											// 기존의 미생물보다 지금 내가 미생물이 더 많다면 방향도 내 방향으로 바꿔
											if (map[nr][nc] <= map[r][c]) {
												direction[nr][nc] = direction[r][c];
											}
											map[nr][nc] += map[r][c];
											// 경계도 아니고 아무것도 없는 빈 공간이면
										} else if (check[nr][nc] == 0) {
											// 미생물 숫자는 내 숫자
											// 방향도 내 방향으로 바꿔
											map[nr][nc] = map[r][c];
											direction[nr][nc] = direction[r][c];
										}
										// 기존 미생물자리의 숫자와 방향은 0으로 초기화
										check[nr][nc]++;
										move[nr][nc] = true;
										map[r][c] = direction[r][c] = 0;
										for (int a = 0; a < N; a++) {
											for (int b = 0; b < N; b++) {
												System.out.print(map[a][b] + " ");
											}
											System.out.println();
										}
										System.out.println();
										for (int a = 0; a < N; a++) {
											for (int b = 0; b < N; b++) {
												System.out.print(direction[a][b] + " ");
											}
											System.out.println();
										}
										System.out.println();
									}

									}
								}
							}
						}

					}
				}

		}
	}
}
