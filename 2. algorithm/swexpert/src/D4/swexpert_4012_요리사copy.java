package D4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class swexpert_4012_요리사copy {
	static int N, R, aSum, bSum, min;
	static int[] trueArr, falseArr, num;
	static Stack<Integer> stack = new Stack<>();
	static int[][] ingTable;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		for (int t = 1; t <= testCase; t++) {
			N = Integer.parseInt(br.readLine());
			// 재료테이블에 값 넣기
			ingTable = new int[N][N];
			for (int r = 0; r < ingTable.length; r++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int c = 0; c < ingTable[0].length; c++) {
					ingTable[r][c] = Integer.parseInt(st.nextToken());
				}
			}
			R = N / 2;

			// 조합이 2개가 필요하다
			// N 개 중에 N/2 개 뽑을 조합
			// 뽑은 갯수를 2개씩 묶을 조합
			trueArr = new int[R];
			falseArr = new int[R];
			num = new int[N];
			aSum = 0;
			bSum = 0;
			min = Integer.MAX_VALUE;
			for (int i = 0; i < N; i++) {
				num[i] = i;
			}
			for (int i = 0; i < N; i++) {
				stack.push(i);
			}

			combination(0, 0);
		}

	}

	private static void combination(int idx, int sidx) {
		// base case
		if (sidx >= R) {
			// System.out.println("tureArr : " + Arrays.toString(trueArr));
			int i=0;
			while (i==R) {				
				if(stack.peek() == trueArr[i]){
					trueArr[i] = stack.pop();
					i++;
				}				
			}
			System.out.println("true : "+Arrays.toString(trueArr));
			System.out.println(Arrays.toString(falseArr));
			for(int j=0;j<R;j++){
				falseArr[j]=stack.pop();
			}
			System.out.println("false : "+Arrays.toString(falseArr));
			
			falseArr = new int[R];
			// for(int i=0;i<R;i++){
			// for(int j=0;j<R;j++){
			// aSum+=ingTable[trueArr[i]][trueArr[j]];
			// bSum+=ingTable[falseArr[i]][falseArr[j]];
			// }
			// }
			// min = Math.min(min,Math.abs(aSum-bSum));
			// System.out.println(aSum);
			// System.out.println(bSum);
			// System.out.println(min);
			// aSum=0;
			// bSum=0;

			return;
		}

		// recursive case
		for (int i = idx; i <= N - R + sidx; i++) {
			trueArr[sidx] = num[i];
			combination(i + 1, sidx + 1);
		}
	}
}
