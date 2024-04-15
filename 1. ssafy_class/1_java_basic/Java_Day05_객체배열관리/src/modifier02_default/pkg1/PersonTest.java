package modifier02_default.pkg1;

import modifier02_default.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        
        // 얘는 다른 패키지 안에 있으므로 default 로 선언된 필드에 접근불가.
        p.age = 10;

    }
}
