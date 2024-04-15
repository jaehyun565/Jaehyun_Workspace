package SWexpert_04_String;

public class Solution_1213_String {
	public static void main(String[] args) {
		Buffered
	}

	public static int searchString(char[] str, char[] pattern) {
		// 보이어 무어 알고리즘으로 탐색
		
		char[] skip = new char[pattern.length];
		for(int i=0;i<pattern.length;i++) {
			skip[i] = pattern[pattern.length-1-i];
		}
		
		for (int i = 0; i < str.length - pattern.length; i++) {
			for (int j = pattern.length-1; j >= 0; j--) {
				while (str[i] == pattern[0]) {
					if(str[i] == pattern[j]) {
						i = i+pattern.length-1-j;
					}
				}
			}
		}
	}

}
