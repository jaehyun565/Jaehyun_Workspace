package test10_generic_restriction;


// 제네릭 타입에서 Number로 제한을 걸었음.
// Number나 Number의 자손만 올 수 있음.
class Box<T extends Number>{ 
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

        
        Box<Integer> intBox = new Box<>();
        intBox.setT(111);
        
        // String은 Number의 자손이 아니므로 사용 불가.
        Box<String> strBox = new Box<>();
        strBox.setT("Hello");
        
        // Double은 Number의 자손이므로 사용 가능.
        Box<Double> dblBox = new Box<>();
        dblBox.setT(42.21);
        
        
    }
}
