package class03;

public class FunctionTest3 {
    public static void main(String[] args) {
    	
    	// 함수?
    	// - 특정한 작업(기능)을 수행하는 문장들을 한 단위로 묶은 것.
    	
    	// 함수의 정의
    	// 반환형 함수명(매개변수1, 매개변수2, ..) {
    	// 문장1; 문장2; ..
    	// return 반환값;
    	// }
    	// - 반환되는 결과값이 없다면 반환형은 void;
    	
        System.out.println("아침에 일어난다.");
        System.out.println("교육장으로 대중교통을 이용하여 이동한다.");
        교육();
        System.out.println("집으로 대중교통을 이용하여 이동한다.");
        System.out.println("과제를 해결한다.");
        System.out.println("잔다.");
        
        System.out.println("아침에 일어난다.");
        System.out.println("교육장으로 대중교통을 이용하여 이동한다.");
        교육();
        System.out.println("집으로 대중교통을 이용하여 이동한다.");
        System.out.println("과제를 해결한다.");
        System.out.println("잔다.");            
        
    }
    
    // static 메서드는 static 메서드만 호출이 가능하다.
    // main 메서드가 static 이라서 static 씀.
    static void 교육() {
    	System.out.println("오전 수업을 듣는다.");
        System.out.println("점심을 먹는다.");
        System.out.println("오후 수업을 듣는다.");
    }
}
