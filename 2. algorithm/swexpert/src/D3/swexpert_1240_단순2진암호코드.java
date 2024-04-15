package D3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class swexpert_1240_단순2진암호코드 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		for (int t = 1; t <= testCase; t++) {
			int answer = 0;
			int max = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			for (int i = 0; i < N; i++) {
				Stack<Integer> stack1 = new Stack<>();
				st = new StringTokenizer(br.readLine());
				String a = st.nextToken();
				int j = M - 1;
				while (j >= 0) {
					if (a.charAt(j) == '1') {
						String num = a.substring(j - 6, j + 1);
						stack1.push(Code(num));
						j -= 7;
						if (a.charAt(j) == '0') {
							break;
						}
						continue;
					}
					j--;
				}
				int idx = 1;
				int evenSum = 0;
				int oddSum = 0;
				while (!(stack1.isEmpty())) {
					if (idx % 2 == 0) {
						evenSum += stack1.pop();
					} else {
						oddSum += stack1.pop();
					}
					idx++;
				}

				if ((oddSum * 3 + evenSum) % 10 == 0 && oddSum+evenSum!=0) {
					answer = oddSum + evenSum;					
				}

			}
			System.out.println("#" + t + " "+answer);
		}
	}

	static int Code(String num) {
		int answer = 0;
		switch (num) {
		case "0001101": {
			answer = 0;
			break;
		}
		case "0011001": {
			answer = 1;
			break;
		}
		case "0010011": {
			answer = 2;
			break;
		}
		case "0111101": {
			answer = 3;
			break;
		}
		case "0100011": {
			answer = 4;
			break;
		}
		case "0110001": {
			answer = 5;
			break;
		}
		case "0101111": {
			answer = 6;
			break;
		}
		case "0111011": {
			answer = 7;
			break;
		}
		case "0110111": {
			answer = 8;
			break;
		}
		case "0001011": {
			answer = 9;
			break;
		}

		}

		return answer;
	}
}
