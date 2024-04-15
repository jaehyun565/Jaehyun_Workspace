package D3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class swexpert_1873_상호의배틀필드 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testCase = Integer.parseInt(br.readLine());

		for (int t = 1; t <= testCase; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			char[][] map = new char[H][W];

			for (int r = 0; r < H; r++) {
				st = new StringTokenizer(br.readLine());
				String s = st.nextToken();
				for (int c = 0; c < W; c++) {
					map[r][c] = s.charAt(c);
				}
			}
			int pointR = 0;
			int pointC = 0;
			for (int r = 0; r < H; r++) {
				for (int c = 0; c < W; c++) {
					if (map[r][c] == '<' || map[r][c] == '>' || map[r][c] == '^' || map[r][c] == 'v') {
						pointR = r;
						pointC = c;
					}
				}
			}
			// N이 몇개인지 받기
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			// 실제 명령어 코드 받기
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();

			char command;
			for (int i = 0; i < N; i++) {
				command = s.charAt(i);
				if (command == 'U') {
					map[pointR][pointC] = '^';
					if (pointR - 1 >= 0 && map[pointR - 1][pointC] == '.') {
						map[pointR][pointC] = '.';
						map[pointR - 1][pointC] = '^';
						pointR = pointR-1;
					}
				} else if (command == 'D') {
					map[pointR][pointC] = 'v';
					if (pointR + 1 < H && map[pointR + 1][pointC] == '.') {
						map[pointR][pointC] = '.';
						map[pointR + 1][pointC] = 'v';
						pointR = pointR+1;
					}
				} else if (command == 'R') {
					map[pointR][pointC] = '>';
					if (pointC+1 < W && map[pointR][pointC + 1] == '.') {
						map[pointR][pointC] = '.';
						map[pointR][pointC + 1] = '>';
						pointC = pointC+1;
					}
				} else if (command == 'L') {
					map[pointR][pointC] = '<';
					if (pointC-1 >= 0 && map[pointR][pointC - 1] == '.') {
						map[pointR][pointC] = '.';
						map[pointR][pointC - 1] = '<';
						pointC = pointC-1;
					}
				} else if (command == 'S') {
					int nr = pointR;
					int nc = pointC;
					if (map[pointR][pointC] == '^') {
						while (nr > 0) {
							if (map[nr - 1][nc] == '*') {
								map[nr - 1][nc] = '.';
								break;
							} else if (map[nr - 1][nc] == '#') {
								break;
							}
							nr--;
						}
					} else if (map[pointR][pointC] == 'v') {
						while (nr < H - 1) {
							if (map[nr + 1][nc] == '*') {
								map[nr + 1][nc] = '.';
								break;
							} else if (map[nr + 1][nc] == '#') {
								break;
							}
							nr++;
						}
					} else if (map[pointR][pointC] == '>') {
						while (nc < W - 1) {
							if (map[nr][nc + 1] == '*') {
								map[nr][nc + 1] = '.';
								break;
							} else if (map[nr][nc + 1] == '#') {
								break;
							}
							nc++;
						}
					} else if (map[pointR][pointC] == '<') {
						while (nc > 0) {
							if (map[nr][nc-1] == '*') {
								map[nr][nc-1] = '.';
								break;
							} else if (map[nr][nc-1] == '#') {
								break;
							}
							nc--;
						}
					}
				}				
			}
			bw.write("#"+t+" ");
			for(int r = 0;r<H;r++) {
				for(int c = 0;c<W;c++) {
					bw.write(map[r][c]);
				}
				bw.write("\n");
			}
		}
		bw.close();
	}
}
