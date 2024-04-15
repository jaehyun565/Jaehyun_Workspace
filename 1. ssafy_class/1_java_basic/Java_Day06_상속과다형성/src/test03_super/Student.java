package test03_super;

public class Student extends Person{
    String name;
    int age;
    String major;
    
    
    // 생성자 만들기
    // 부모클래스에서 생성자 상속(super)
    public Student(String name, int age, String major) {
    	super(name, age); // 부모 클래스의 생성자 호출.
    	this.major = major;
    }
    
    public void eat() {
        System.out.println("음식을 먹는다.");
    }
    
    public void study() {
        System.out.println("공부를 한다.");
    }
}
