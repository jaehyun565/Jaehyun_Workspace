package test06_final;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("hong", 25);
        // p.
        Student st = new Student("Yang", 45, "Computer");
        // st.
        
        Student st2 = new Student("Yang", 45, "Computer");
        st.eat();
        p.eat();        
        
        System.out.println(p.toString());
        System.out.println(st.toString()); // 따로 정의를 안 해주면 Obejct의 toString()이 실행됨.
        
        System.out.println(st.equals(st2.name)
        		);
        
        
        // 메모리에 생성되는 순서
        // 1. object의 생성자가 만들어지고
        // 2. Person의 생성자가 만들어지고
        // 3. Student의 생성자가 만들어진다.
    }
}
