package test02_try_catch;

public class ExceptionTest3 {
	public static void main(String[] args) {
		// try ... catch 문을 사용한 예외처리
		
		int[] nums = {10};
		
		try {
			// 예외가 발생할 수 있는 코드를 try문 안에 넣음.
			System.out.println("정상코드 1");
			System.out.println(nums[0]);
			int num = 4 / 0;
			System.out.println("정상코드 2");
		} catch(ArrayIndexOutOfBoundsException e){ //  catch()문 안에서 예외를 파라미터로 받음.
			// 예외 대처 코드 작성
			System.out.println("배열의 인덱스 범위를 벗어났습니다.");
		} catch(ArithmeticException e) {
			System.out.println("계산 오류가 발생했습니다.");
		}
		System.out.println("프로그램 종료");
		
		
		// 1. 예외가 발생했고, 예외를 잘 처리한 경우.
		// - 1, 4, 5
		// 2. 예외가 발생했는데 예외를 처리하지 못했을 때
		// - 1 하고 2번하다가 에러남. => 비정상적인 종료
		// 3. 예외가 발생하지 않는 경우
		// - 1, 2, 3, 5
	}

}
