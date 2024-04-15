package APS_04_String;

public class String01_문자열 {
	public static void main(String[] args) {
		
		// 리터럴 방식 선언
		String str1 = "abc";
		// new 키워드 사용 선언
		String str2 = new String("abc");
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		// 오브젝트를 == 으로 비교한다는 건
		// 두 인스턴스가 동일한 인스턴스인지를 물어보는 것. 
		if(str1 == str2) {
			System.out.println("두 문자열이 같습니다.");			
		} else {
			System.out.println("다릅니다.");
		}
		
		// 문자열의 값을 비교하기 위해서는 == 이 아닌
		// equals 메서드를 통해서 비교한
		if(str1.equals(str2)) {
			System.out.println("두 문자열이 같습니다.");
		}
		
		
		// 새로운 문자열 str3를 생성
		
		String str3 = "abc";
		
		// 분명 오브젝트 == 은 인스턴스가 동일한 인스턴스인지를 물어본다 그랬는데
		// 왜 str1 == str3 은 참임?
		// str3가 만들어질 때 힙 인스턴스의 문자열 상수풀에 "abc"가 있는지 보고 있으면 같은 "abc"를 참조하도록 인스턴스가 생성됨
		
		if(str1 == str3) {
			System.out.println("두 문자열이 같습니다.");			
		} else {
			System.out.println("다릅니다.");
		}
				
		if(str1.equals(str3)) {
			System.out.println("두 문자열이 같습니다.");
		}
	
		
		System.out.println(System.identityHashCode(str1));System.out.println(System.identityHashCode(str2));System.out.println(System.identityHashCode(str3));
		
	}
}
