package test09_binding_test;
import java.util.Scanner;

class Parent {
    String x = "parent x";
    
    public void method() {
        System.out.println("parent method.");     
        
    }
}

class Child extends Parent{
    String x = "child x"; // Hiding 하는 중.
    
    @Override
    public void method() {
        System.out.println("child method.");
    }
}

public class BindingTest {
    
    public static void main(String[] args) {
        Parent a = new Parent();
        Child b = new Child();
        
        System.out.println(a.x);
        a.method();
        
        System.out.println(b.x); // Hiding하는 중.
        b.method(); // Overriding 하는 중.
        
        
        // 다형성
        // 실제 행위는 그 객체가 하는 행위가 나옴. (메서드는 오버라이딩 했을 때 자식 객체를 따름)

        Parent c = new Child();        
        c.method(); // 메서드는 실제 그 객체를 따름.
        System.out.println(c.x); // 하지만 멤버 변수는 그걸 바라보고 있는 시점의 멤버변수로 나옴.
        
        // 이를 우리는 동적바인딩 이라고 부름
        
        // 행위는 실제 객체의 행위가 나온다! => 이걸 다형성이라고 함.
        // 멤버 변수는 다형성을 따르지 않는다. => 부모의 관점으로 바라보면 부모의 것을 참조한다.
   
        
    }

}
