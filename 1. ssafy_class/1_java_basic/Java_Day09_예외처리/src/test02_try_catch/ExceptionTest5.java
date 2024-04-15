package test02_try_catch;

public class ExceptionTest5 {
	public static void main(String[] args) {
		// try ... catch 문을 사용한 예외처리
		
		int[] nums = {10};
		
		try {
			// 예외가 발생할 수 있는 코드를 try문 안에 넣음.
			System.out.println("정상코드 1"); 
			System.out.println(nums[2]); 
			int num = 4 / 1;
			System.out.println("정상코드 2");
			String str = null;
			str.length(); // null 이라서 length를 할 수 없음 => 예외!		
		} catch(ArrayIndexOutOfBoundsException e){ //  catch()문 안에서 예외를 파라미터로 받음.
			// 예외 대처 코드 작성
			System.out.println("배열의 인덱스 범위를 벗어났습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch(ArithmeticException e) {
			System.out.println("계산 오류가 발생했습니다.");
		} catch(Exception e){
			System.out.println( "모든 오류 처리 가능...");
		} 
		System.out.println("프로그램 종료"); 		
		
	}

}
