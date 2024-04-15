package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2747_피보나치수 {
	static int num, ans;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(br.readLine());
		ans = 0;
		pivo(0,1,1);
		System.out.println(ans);
		
	}
	
	static void pivo(int first, int second, int idx) {
		// base Case
		if(idx == num) {
			ans = second;
			return;
			
		}
		// recursive Case
		pivo(second, first+second, idx+1);
	}
	
}
