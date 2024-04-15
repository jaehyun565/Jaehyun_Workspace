package test05_user_exception;

public class UserExceptionTest {

	public static String[] fruits;

	public static void main(String[] args) {

		fruits = new String[] { "사과", "사과", "오렌지", "토마토" };

		boolean result = eatFruit("사과");
		System.out.println(result);
		result = eatFruit("사과");
		System.out.println(result);
		result = eatFruit("사과");
		System.out.println(result);

	}
		// 항상 실행결과를 true/ flase 확인해야 한다.
		// 어떤 이유에서 false인지 확인할 수 없다.
		// 변수가 따로 있어야 되고, 매번 체크해야 한다.
		// try ~ catch 문을 쓸 수 없고, if문을 복잡하게 써야 한다.
	
	
	// 예외처리를 이용핮히 않는다면 아래처럼 작성.
	// 성공했다면 true를 반환하고, 작업이 실패했다면 false를 반환한다.
	public static boolean eatFruit(String name) {
		for (int i = 0; i < fruits.length; i++) {
			if (name.equals(fruits[i])) {
				fruits[i] = null;
				System.out.println(name + "(을)를 먹었습니다.");
				return true;
			}
		}
		return false;
	}

}
