package class06;

public class Person {
    String name;
    int age;
    String hobby;
    
    // 생성자 : 클래스명과 일치,
    // 반환형이 없다.
    
    // 1. 기본생성자
    public Person() {    	
    }
    
    // 2. 파라미터를 받을 수 있는 생성자
    public Person(String n, String h) {
    	name = n;
    	hobby = h;    			
    }
    
    // !!생성자 오버로딩!!
    // 매개변수의 타입, 개수, 순서가 달라지면 => 오버로딩 가능
    // 매개변수의 이름만 다르게 해서는 오버로딩 불가
//    public Person(String n, int a) {
//    	name = n;
//    	age = a;
//    	hobby = "따로 취미가 없어요..";
//    }
    
    // this()를 첫 줄에 사용하면, 다른 생성자를 호출할 수 있다.
    public Person(String n, int a) {
    	this(n, a, "따로 취미가 없어요..");
    }
    
    public Person(int a) {
    	this("무명", a, "취미 없음");
    }
    
    // this 는 멤버 변수와 파라미터를 구분하기 위해서 사용되기도 한다.
    Person(String name, int age, String hobby){
    	// this. 객체가 가지고 있는
    	// 멤버 변수 또는 멤버 메서드 접근에 사용
    	this.name = name;
    	this.age = age;
    	this.hobby = hobby;
    }
    
    
    // 메서드임.
    void info() {
    	System.out.println("이름은 "+name+"이고, 나이는"+age+"세, 취미는 "+hobby+" 입니다.");
    }
}
