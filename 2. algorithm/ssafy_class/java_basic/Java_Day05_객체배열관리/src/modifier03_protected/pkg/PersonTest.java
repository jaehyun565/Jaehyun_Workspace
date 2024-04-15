package modifier03_protected.pkg;

import modifier03_protected.Person;

public class PersonTest {
    public static void main(String[] args) {
    	
    	Person p = new Person();
    	
    	// 다른 패키지에 있을 때는 protected는 접근 불가.    	
    	p.age = 10;

    }
}
