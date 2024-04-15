package test04_overriding;

public class Person {
    String name;
    int age;
    
    public Person(String name, int age) {
    	// 모든 생성자의 첫줄에는 super(); 생략되어 있다.
    	// super()(부모생성자호출)는 항상 첫줄에 와야한다.
    	// this()(자신의 다른생성자호출)도 항상 첫줄에 와야한다.
    	// => super()나 this() 둘 중에 하나만 쓸 수 있음.
    	this.name = name;
    	this.age = age;
    	
    	System.out.println("Person의 생성자입니다.");
    }
    
    public void eat() {
        System.out.println("음식을 먹는다.");
    }
}
