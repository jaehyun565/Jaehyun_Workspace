package test04_overriding;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("hong", 25);
        // p.
        Student st = new Student("Yang", 45, "Computer");
        // st.
        
        st.eat();
        p.eat();
        
        
        // 메모리에 생성되는 순서
        // 1. object의 생성자가 만들어지고
        // 2. Person의 생성자가 만들어지고
        // 3. Student의 생성자가 만들어진다.
    }
}
