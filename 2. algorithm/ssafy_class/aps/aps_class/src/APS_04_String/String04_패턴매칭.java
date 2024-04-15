package APS_04_String;

public class String04_패턴매칭 {
	public static void main(String[] args) {
		String text = "This iss a book";
		String pattern = "iss";

		int result = patternMatching(text.toCharArray(), pattern.toCharArray());
		for (int i = 0; i < text.toCharArray().length; i++) {
//			System.out.println(text.toCharArray()[i]);
		}

		System.out.println(result);
	}

	public static int patternMatching(char[] text, char[] pattern) {
		start: for (int i = 0; i < text.length - pattern.length + 1; i++) {
			pattern: for (int j = 0; j < pattern.length; j++) {
				if (text[i + j] != pattern[j]) {
					continue start;
				}

			}
			return i;
		}
		return -1;
	}

}
