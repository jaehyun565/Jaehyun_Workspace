package D2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class swexpert_1959_두개의숫자열 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		for (int t = 1; t <= testCase; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int[] arrA = new int[A];
			int[] arrB = new int[B];

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < A; i++) {
				arrA[i] = Integer.parseInt(st.nextToken());
			}			
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < B; i++) {
				arrB[i] = Integer.parseInt(st.nextToken());
			}			
			int max = 0;
			
			if (A < B) {
				for (int i = 0; i <= B - A; i++) {
					int sum = 0;
					for (int j = 0; j < A; j++) {
						sum += arrA[j] * arrB[j + i];
					}					
					if(max < sum) {
						max = sum;
					}
				}
			} else if (A > B) {
				for (int i = 0; i < A - B; i++) {
					int sum = 0;
					for (int j = 0; j < B; j++) {
						sum += arrA[j+i] * arrB[j];
					}
					if(max < sum) {
						max = sum;
					}
				}
			} else {
				for(int i=0;i<A;i++) {
					max+= arrA[i]*arrB[i];
				}
			}
			
			System.out.println("#"+t+" "+max);
		}
	}
}
