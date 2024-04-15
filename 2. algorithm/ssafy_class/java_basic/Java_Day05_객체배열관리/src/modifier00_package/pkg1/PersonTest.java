package modifier00_package.pkg1;

import modifier00_package.pkg1.pkg2.Person;


public class PersonTest {
    public static void main(String[] args) {

    	
    	// 기본적으로는 같은 패키지의 클래스를 사용함
    	// 이 때, 특정 패키지의 클래스를 쓰고 싶으면 import를 하면 그 패키지의 클래스를 사용함. 	

    	Person p = new Person();
    	System.out.println(p.pkg);
    	
    	// 만일 다른 패키지에 있는 같은 이름의 클래스를 사용하고 싶으면??
    	// => 풀 패키지명을 사용하면 된다.
    	// 풀 패키지명 = 패키지명.클래스명
    	
    	modifier00_package.pkg1.pkg2.pkg3.Person p3 = new modifier00_package.pkg1.pkg2.pkg3.Person();
    	modifier00_package.pkg1.Person p1 = new modifier00_package.pkg1.Person();
    	
    }
}
