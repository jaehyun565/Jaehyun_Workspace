package test06_multiple_implements;

public class Test {
    public static void main(String[] args) {
        Duck d = new Duck();
        Butterfly b = new Butterfly();
        Penguin p = new Penguin();
        
        b.fly();
        b.print(); // default 메서드(버터플라이에서 구현을 안 했는데도 가지고 있음)
        
        AbleToSwim.info(); // static메서드라 객체 생성안하고 바로 접근.
        
//        System.out.println(d instanceof AbleToSwim);
        
        AbleToFly[] flying = new AbleToFly[3];
        flying[0] = d;
        flying[1] = b;
        //flying[2] = p;
        
        for(AbleToFly f : flying) {
            if(f!= null) {
                f.fly();
                f.print();
            }
        }
        
        AbleToSwim[] swimming = new AbleToSwim[3];
        swimming[0] = d;
        // swimming[1] = b;
        swimming[2] = p;
        
        for(AbleToSwim s : swimming) {
            if(s != null) {
                s.swim();
                s.print();
            }
        }
    }
}
