package class04;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        
        // p 라는 단위에 데이터도 있고, 메서드도 있다!
        // 이것이 곧 객체
        p.age = 45;
        p.name= "Yang";
        p.hobby="Youtube";
        
        p.info();
        Person.hello();
    }
}
