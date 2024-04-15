package test05_user_exception;

public class FruitNotFoundRuntimeException extends RuntimeException{
	public FruitNotFoundRuntimeException(String name) {
		super(name + "에 해당하는 과일이 없습니다. ㅠㅠ");
	}
}
