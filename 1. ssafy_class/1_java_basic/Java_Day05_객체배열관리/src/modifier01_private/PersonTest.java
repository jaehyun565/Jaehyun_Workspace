package modifier01_private;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        
        // 같은 패키지라도 클래스가 다르면 private는 접근 불가.
        p.age = 10;
       
        
        
    }
}
