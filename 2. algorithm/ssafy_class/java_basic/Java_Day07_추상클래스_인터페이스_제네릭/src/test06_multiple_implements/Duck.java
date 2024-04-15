package test06_multiple_implements;

// 다중구현이 가능하다!
public class Duck implements AbleToFly, AbleToSwim {

    @Override
    public void swim() {
        System.out.println("오리는 수영을 합니다.");
        
    }

    @Override
    public void fly() {
        System.out.println("오리는 날 수도 있어요.");
        
    }

    @Override
    public void print() {
        System.out.println("오리입니다.");
    }

}
