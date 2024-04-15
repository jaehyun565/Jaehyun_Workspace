package modifier05_getter_setter;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        
        // p.name = "Yang"; // => private으로 막아놔서 접근 불가
        // 위의 방법으로는 값을 할당하는 것 밖에 못함.
        // => 즉, 기타 로직(검증 로직)의 추가가 불가능하다.
        
        p.setName("Yang");
        
        p.setAge(-100);
    }
}
