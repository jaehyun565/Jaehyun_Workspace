package class02;

public class PersonTest {
    public static void main(String[] args) {
        // 방금 만든 설계도를 객체를 생성!
    	// 클래스는 변수의 타입으로 사용이 된다.
    	// => 클래스는 사용자 정의 자료형이다. 
        
        Person yang = new Person();
        
        // yang : instance
        // 객체의 멤버변수에 접근할 때는 .연산자 사용
        // . = 가지고 있는
        
        yang.name = "Yang";
        yang.age = 45;
        yang.hobby = "Youtube";
    }
}
