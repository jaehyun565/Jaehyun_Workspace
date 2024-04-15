package SWexpert_10_Tree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_1231_중위순회 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int testCase = 1; testCase<=10; testCase++) {
			int length = Integer.parseInt(br.readLine());
			String[] arr = new String[length + 1];
			
			for (int i = 1; i <= length; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				st.nextToken();
				arr[i] = st.nextToken();
			}		
			bw.write("#"+testCase+" ");
			bw.flush();
			inorder(arr, 1);
			bw.write("\n");
			bw.flush();
		}
		bw.close();
	}

	static void inorder(String[] arr, int i) {
		if (i > arr.length-1) {
			return;
		}
		inorder(arr, i * 2);
		System.out.print(arr[i]);
		inorder(arr, i * 2 + 1);
	}
}
