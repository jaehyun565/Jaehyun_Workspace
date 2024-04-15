package test06_multiple_implements;

public class Butterfly implements AbleToFly, AbleToSwim {

    @Override
    public void fly() {
        System.out.println("나비는 날 수 있어요.");
        
    }
    
    @Override
	public void swim() {
		System.out.println("수영 할 수 있어요.");
	}


    @Override
	public void print() {
		System.out.println("사실 나비는 누구의 것도 아니야");
	}

	// default method는 구현할 필요가 없음.
    public static void main(String[] args) {
    	Butterfly bf1 = new Butterfly();
    	bf1.print();
    	bf1.fly();
    	AbleToSwim.info();
    	
	}
}
