package class03;

import java.util.Random;

public class FunctionTest4 {
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
        boolean homework = 교육();
        이동("집","대중교통");
        
        if(homework)
        	System.out.println("과제를 해결한다.");
        else
        	System.out.println("쉰다.");
       
        System.out.println("잔다.");
        
        System.out.println("아침에 일어난다.");
        이동("교육장","버스");
        homework = 교육();
        이동("교육장","지하철");
        if(homework)
        	System.out.println("과제를 해결한다.");
        else
        	System.out.println("쉰다.");
        
        System.out.println("잔다.");            
        
    }
    
    // static 메서드는 static 메서드만 호출이 가능하다.
    // main 메서드가 static 이라서 static 씀.
    static boolean 교육() {
    	System.out.println("오전 수업을 듣는다.");
        System.out.println("점심을 먹는다.");
        System.out.println("오후 수업을 듣는다.");
        
        // 예를 들어서 과제를 다 못 했따면 => 숙제가 있고 (true)
        // 오후 시간에 과제를 다 했다면 => 숙제가 없다 (false)
        Random random = new Random();
        
        return random.nextBoolean(); // 랜덤하게 true/ false 반환.
    }
    
    static void 이동(String 장소, String 탈것) {
    	System.out.println(장소+"(으)로 "+탈것+"을(를) 이용하여 이동한다.");
    }
    
}
