package D3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class swexpert_2817_부분수열의합 {
	static int[] arr;
	static int N, K, cnt, sum;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testCase = Integer.parseInt(br.readLine());

		for (int t = 1; t <= testCase; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			
			arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			cnt = 0;
			sum = 0;
			count(0);
			
			bw.write("#"+t+" "+cnt+"\n");
		}
		bw.close();

	}

	private static void count(int idx) {
		// base case
		if(idx >= N) {
			if(sum==K) {				
				cnt++;
			}
			return;
		}
		// recursive case
		sum += arr[idx];
		count(idx + 1);
		sum -= arr[idx];
		count(idx + 1);

	}
}
