package APS_21_패턴매칭;

import java.util.Arrays;

public class 패턴매칭_KMP {
	public static void main(String[] args) {
		String text = "ABABABACABAABABACACA";
		String pattern = "ABABACA";

		KMP(text, pattern);
	}

	private static void KMP(String T, String P) {
		int[] pi = getPi(P);
		System.out.println(Arrays.toString(pi));

		int j = 0; // j : 패턴의 인덱스
		// i : 텍스트의 인덱스
		for (int i = 0; i < T.length(); i++) {
			// 달랐을 때
			while (j > 0 && T.charAt(i) != P.charAt(j)) {
				j = pi[j - 1]; // jump
			}
			// 같았을 때
			if (T.charAt(i) == P.charAt(j)) {
				// 패턴을 찾았따!
				if(j==P.length()-1) {
					System.out.println((i-P.length()+1)+"에서 시작하면 패턴을 찾습니다.");
					j=pi[j];
				} else {
					j++;
				}
			}

		}
	}

	private static int[] getPi(String P) {
		// 부분문자열 중 접두사와 접미사가 일치하는 최대길이를 담을 배열
		int[] pi = new int[P.length()]; // 0~i까지의 부분문자열을 뽑아내겠다
		int j = 0; // j : 여기까지는 접두사와 접미사가 동일하다

		for (int i = 1; i < P.length(); i++) {
			// 지금 두 개의 포인트가 가리키는 값이 다르면
			while (j > 0 && P.charAt(i) != P.charAt(j)) {
				j = pi[j - 1];
			}

			// 지금 두개의 포인트가 가리키는 값이 같다면 저장
			if (P.charAt(i) == P.charAt(j)) {
				// i 번째의 최대 길이는 ++j 한 값
				pi[i] = ++j;
			}
		}
		return pi;
	}
}
