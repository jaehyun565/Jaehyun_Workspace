package test09_generic_box;

// 제네릭 클래스
// <> : 타입 파라미터
class Box<T>{ // T 자리 > String, Double, Integer, .... 등이 들어올 수 있음.
    private T t;
    
    public T getT() {
        return t;
    }
    
    public void setT(T t) {
        this.t = t;
    }
}

public class BoxTest {
    public static void main(String[] args) {
        Box<Integer> intBox1 = new Box<Integer>(); // 생성하는 시점에 그 클래스의 타입이 결정됨.
        intBox1.setT(11);        
        int num = intBox1.getT(); // 꺼낼 때 형 변환 따로 할 필요가 없음        
        System.out.println(num); // 11 출력
        
        Box<String> strBox1 = new Box<String>(); // String이 들어가는 박스임
        strBox1.setT("Hi");
        String str = strBox1.getT();
        System.out.println(str);
        
        Box<Double>[] doubox1 = new Box[5]; // 배열도 만들 수 있음. 문법은 좌측과 같이.
        
    }
}
