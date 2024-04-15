package modifier02_default;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        
        
        //default는 같은 패키지에서 접근 가능.
        p.age = 10;
        p.name = "yang";

       
        
    }
}
