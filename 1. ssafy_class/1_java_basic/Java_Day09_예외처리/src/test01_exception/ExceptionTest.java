package test01_exception;

public class ExceptionTest {
	public static void main(String[] args) {

		// UncheckedException
		// - 컴파일 시간에 확인x -> 빨간줄이 그어지지 않음
		// - 실행중에 발생함.
		// - 예외 처리를 강제 하지 않음, but 할 수 있음.
		// - 예외 처리 : try ~ catch를 사용해서 직접처리 함.
		int[] nums = {10};		
		System.out.println(nums[1]);
				
		// Checked Exception
		// - 컴파일 시간에 확인 -> 빨간 줄이 그어짐
		// - 예외 처리를 강제한다는 특징
		// - 예외 처리 방법 : try ~ catch를 사용해서 직접처리, throws 선언해서 예외처리 위임(간접처리)
		Thread.sleep(1000); // 컴파일이 안된다!
	}
}
