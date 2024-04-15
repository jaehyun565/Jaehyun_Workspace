package class05;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.age = 45;
        p.name= "Yang";
        p.hobby="Youtube";
        
        p.study(10); // 형 변환 없이 int 형으로 호출
        
        // 우리가 전달하고자 하는 인자를 메서드로 넘겼을 때
        // 묵시적 형변환이 가능할 경우
        // 묵시적 형변환이 가능한 메서드가 호출된다.
        p.study((byte)1);
        p.study((short)1);
        p.study((char)2);
        // LONG형은 int 형으로 묵시적 형변환이 안됨.
        // long 형으로 동일한 이름의 메서드를 만들어서 처리 가능
        // == 메서드 오버로딩
        // - 동일한 이름의 메서드를 여러개 선언할 수 있다.
    
        p.study(100L); 
        
    }
}
