package modifier03_protected.pkg;

import modifier03_protected.Person;

public class PersonChild extends Person {
    public static void main(String[] args) {
        PersonChild pc = new PersonChild();
        
        // 다른 패키지라고 해도 상속관계의 클래스라면 protected는 접근 가능.
        pc.name = "Park";
        pc.age = 20;
    }
}
