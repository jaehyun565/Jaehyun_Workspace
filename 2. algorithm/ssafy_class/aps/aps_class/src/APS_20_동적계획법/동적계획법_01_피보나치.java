package APS_20_동적계획법;

import java.util.Arrays;
import java.util.Scanner;

public class 동적계획법_01_피보나치 {
	static int[] callFibo = new int[100]; // 몇 번 호출되는지 알아보기 위함
	static int[] memo;
	static {
		memo = new int[1000];
		Arrays.fill(memo, -1);
		memo[0] = 0;
		memo[1] = 1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
//		System.out.println(fibo1(N));
		System.out.println(fibo2(N));
		System.out.println(Arrays.toString(callFibo));
	}

	public static int fibo1(int n) {
//		if(n==0) return 0;
//		if(n==1) return 1;
		if (n <= 1)
			return n;
		return fibo1(n - 1) + fibo1(n - 2);

	}
	
	public static int fibo2(int n) {
		callFibo[n]++; // 실행을 해보면 작은 수들은 계속 중복해서 호출이 되는 걸 알 수 있음(비효율)
		if(memo[n] == -1) {
			memo[n] = fibo2(n-1)+fibo2(n-2);
		}
		return memo[n];
	}
	
	public static int fibo3(int n) {
		int [] dp = new int[n+1];
		dp[0]=0;
		dp[1]=1;
		for(int i=2;i<=n;i++) {
			dp[i] = dp[i-2]+dp[i-1];
		}			
		return dp[n];
	}
}
