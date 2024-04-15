package modifier06_singleton;

public class ScoreTest {
    public static void main(String[] args) {

    	ScoreManager sm = ScoreManager.getInstance();
    	ScoreManager sm2 = ScoreManager.getInstance();
    	// 변수를 여러개 만들어도 같은 객체를 가져오고 있으므로
    	// 둘은 완전히 동일한 변수이다.
    	
    	
    	System.out.println(sm2.hashCode());
    	System.out.println(sm.hashCode());
    	
    	
    	// ScoreManager sm2 = new // => 이런 형태로 생성 불가.

    }
}
