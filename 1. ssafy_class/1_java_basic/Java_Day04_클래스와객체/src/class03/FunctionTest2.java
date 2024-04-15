package class03;

public class FunctionTest2 {
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
        이동("교육장","대중교통");
        교육();
        이동("집","대중교통");
        System.out.println("과제를 해결한다.");
        System.out.println("잔다.");
        
        System.out.println("아침에 일어난다.");
        이동("교육장","버스");
        교육();
        이동("교육장","지하철");
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
    
    // 함수 내에 바뀔 수 있는 값들은 매개변수를 활용할 수 있다.
    // 함수를 호출할 때도 매개변수를 넣어서 호출.
    static void 이동(String 장소, String 탈것) {
    	System.out.println(장소+"(으)로 "+탈것+"을(를) 이용하여 이동한다.");
    }
}
