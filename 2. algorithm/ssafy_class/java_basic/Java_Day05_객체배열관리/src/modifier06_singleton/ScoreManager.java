package modifier06_singleton;

// 싱글턴 패턴을 이용해 구현해라!

public class ScoreManager {
	// 객체의 멤버 변수;
	private int score;
	// 객체는 유일하게 하나만 만들어져야 한다.
	// 1. 생성자를 private으로 막아서 외부 생성 차단!	
	private ScoreManager() {
		
	}
	
	// 2. 내부적으로 객체를 한번만 생성해서 객체를 갖고 있자. 
	private static ScoreManager instance = new ScoreManager();
	
	// 3. 외부에서 접근할 수 있는 합법적 생성자 통로를 열어주자.	
	// 4. static으로 만들어서 객체 생성 없이 접근가능하도록 제어 한다.
	public static ScoreManager getInstance() {
		return instance;
	}
	
	
    
}
