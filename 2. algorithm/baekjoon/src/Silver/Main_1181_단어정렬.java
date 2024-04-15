package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main_1181_단어정렬 {
	public static class Com implements Comparable<Com>{
		String s;

		public Com(String s) {
			this.s = s;
		}



		@Override
		public int compareTo(Com o) {
			if(this.s.length() == o.s.length()) {
				return this.s.compareTo(o.s);
			}
			return this.s.length() - o.s.length();
		}
		
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());	
		List<Com> c = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			c.add(new Com(br.readLine()));
		}
		
		Collections.sort(c);
		
		for(int i=0;i<N;i++) {
			if(i>=1 && c.get(i).s.equals(c.get(i-1).s)) {
				continue;
			}
			System.out.println(c.get(i).s);
		}
	}

}