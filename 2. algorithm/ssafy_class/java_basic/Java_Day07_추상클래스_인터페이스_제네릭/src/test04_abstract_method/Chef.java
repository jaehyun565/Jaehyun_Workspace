package test04_abstract_method;

// 추상메서드가 하나라도 있으면, 추상클래스가 된다.
// 따라서 클래스의 선언부에 abstract를 추가해줘서 추상클래스로 만들어준다.
public abstract class Chef {
    String name;
    int age;
    String speciality;
    
    public void eat() {
        System.out.println("음식을 먹는다.");
    }
    
    // 추상메서드는 구현부를 ; 으로 대체하고 선언부에 abstract를 추가해준다.
    public abstract void cook();        
    
}
