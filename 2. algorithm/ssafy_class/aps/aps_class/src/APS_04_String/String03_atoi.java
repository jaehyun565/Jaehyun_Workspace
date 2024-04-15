package APS_04_String;

public class String03_atoi {
	public static void main(String[] args) {

		// str의 의 문자열을 정수형태로 만들어서 result에 저장하기.

		String str = "573918";

		// 방법1. parseInt 메서드를 활용.
		int result = Integer.parseInt(str);
		
		System.out.println("변환 후 : " + result);
		
		int result2 = atoi(str);
		
		System.out.println("변환 후 : " + result2);

	}

	// 방법2. atoi 프로세스(?)를 이용해보자.
	public static int atoi(String str) {
		int value = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i); // 문자열의 특정 인덱스를 찾아서 접근하는 방식.
			if (c >= '0' && c <= '9') { // c문자가 10진수의 정수 범주 안에 들어가는가
				value = value * 10 + (c- '0');
			} else {
				System.out.println("숫자가 아닙니다.");
				return - 1;
			}
		}
		return value;
	}
}
