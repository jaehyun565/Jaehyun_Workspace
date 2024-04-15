package test07_polymorphism;

public class Test {
    public static void main(String[] args) {
    	
    	// 다형성
        // 조상클래스의 타입으로 자식객체를 참조할 수 있음. 
        Student st = new Student();
        Person p = new Student(); // 실제 메모리에 생성된 객체는 Student이지만, Person으로 바라보겠다.
        Object obj = new Student(); // 실제 메모리에 생성된 객체는 Student이지만, Object로 바라보겠다.
        
        st.age = 45;
        st.major = "1";
        st.name = "2";
        
        p.age = 45;
        p.name = "1";
//        p.major = "2"; // p 는 Person으로 바라보고 있기 때문에 Student의 필드인 major를 사용할 수 없음.
        
        
        // Person에서 toString을 오버라이드 했음.        
        Object o2 = new Object(); // Object까지 메모리에 있음.
        Object o3 = new Person(); // Object와 Person의 속성까지 메모리에 있지만, Object로 바라보고 있는 것.
        
        
        
        System.out.println(o2.toString()); // 원래 Object의 toString이 실행됨.
        System.out.println(o3.toString()); // Person에 오버라이드 된 toString이 실행됨. why???
        // Object로 o3를 바라본다고 하더라도 얘의 실제 객체는 사람이다!!
        // 메서드를 실행하면 사람의 행동을 한다!
        
        // 즉, 부모클래스의 타입으로 자식 객체를참조하더라도,
        // 실제 객체가 자식 클래스의 객체라면, 자식 클래스에서 오버라이드 한 메서드가 실행된다.
        
      
    }
}
