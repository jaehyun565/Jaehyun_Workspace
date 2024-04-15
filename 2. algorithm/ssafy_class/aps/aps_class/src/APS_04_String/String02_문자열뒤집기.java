package APS_04_String;

import java.util.Arrays;

public class String02_문자열뒤집기 {
	public static void main(String[] args) {
		String str = "Hello SSAFY!!";
		
		// 문자열을 문자의 배열로 바꿔줄 수 있음. (toCharArray()메서드)
		char[] charArr = str.toCharArray();
		
		int len = str.length();		
		for(int i = 0 ; i<len/2;i++) {
			char temp;
			temp = charArr[i];
			charArr[i] = charArr[len-1-i];
			charArr[len-1-i] = temp;
			
		}
		System.out.println(Arrays.toString(charArr));
	}
}
