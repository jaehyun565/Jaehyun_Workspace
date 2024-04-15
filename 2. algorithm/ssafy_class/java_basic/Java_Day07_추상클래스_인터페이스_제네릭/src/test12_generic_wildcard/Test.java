package test12_generic_wildcard;

class Box<T> {
    T t;
    void setT(T t) {
        this.t = t;
    }
    
    T getT() {
        return t;
    }
}



public class Test {
    public static void main(String[] args){
    
    	// 변수를 만들 때
    	// 제네릭을 참조할 때!
       Box<?> b1; 
//       Box<? extends Bird> b1;
//       Box<? super Duck> b1;
       
       Box<Duck> b2 = new Box<>(); // Duck의 박스
       b2.setT(new Duck());
       
       Box<Butterfly> b3 = new Box<>(); // Butterfly의 박스
       b3.setT(new Butterfly());
       
       Box<Bird> b4 = new Box<>(); // Bird의 박스
       b4.setT(new Bird());
       
       Box<String> b5 = new Box<>(); // String의 박스
       b5.setT("Hahaha");
       
       
       // 우리가 그 박스의 구체적인 타입을 모른다고 가정할 때,
       // ?는 모든 타입을 다 참조 할 수 있다는 얘기! 그래서 아래 다 가능.
       Box<?> b6 = new Box<Bird>(); 
       Box<?> b7 = new Box<String>();
       Box<?> b8 = new Box<Integer>();
       
       b1 = b2;
       System.out.println(b1.getT().toString());       
       
       b1 = b3;
       System.out.println(b1.getT().toString());
       
       b1 = b4;
       System.out.println(b1.getT().toString());
       
       b1 = b5;
       System.out.println(b5.getT().toString());
        
    }
}
