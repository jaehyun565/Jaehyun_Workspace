package test05_user_exception;

// Exception을 상속받으면 -> checked Exception
// RuntimeException을 상속받으면 -> unchecked Execption

public class FruitNotFoundException extends Exception{

	// 생성자 생성
	public FruitNotFoundException(String name) {
		super(name + "에 해당하는 과일은 없습니다. ㅠㅠ"); 
		// Exception클래스에는 문자열을 받아서 에러메시지를 내보내는 생성자가 있음. 
	}
}
