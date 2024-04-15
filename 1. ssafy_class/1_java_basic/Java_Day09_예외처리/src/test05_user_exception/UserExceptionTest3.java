package test05_user_exception;

public class UserExceptionTest3 {

	public static String[] fruits;

	public static void main(String[] args) {

		fruits = new String[] { "사과", "사과", "오렌지", "토마토" };
		
		try {
			eatFruit("사과");
			eatFruit("사과");
			eatFruit("사과");
			eatFruit("사과");
			eatFruit("사과");
			eatFruit("사과");
			eatFruit("사과");
		} catch (FruitNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void eatFruit(String name) throws FruitNotFoundException{ // 쓸 때는 throws도 함께.
		for (int i = 0; i < fruits.length; i++) {
			if (name.equals(fruits[i])) {
				fruits[i] = null;
				System.out.println(name + "(을)를 먹었습니다.");				
			}
		}
		// 사용자 정의 예외 발생 시키는 구문
		// throw new 예외클래스생성자();
		throw new FruitNotFoundException(name); // 유저정의 메서드 = throw
	}

}
