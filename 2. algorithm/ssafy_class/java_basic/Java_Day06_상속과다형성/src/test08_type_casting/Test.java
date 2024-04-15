package test08_type_casting;

public class Test {
    public static void main(String[] args) {
        // 기초자료형의 형변환.
        // - 묵시적 형변환, 명시적 형변환.
        
        // 객체의 형변환.
        // 1. 묵시적 형변환 : 자손 객체의 타입 => 조상 타입
        Person p =new Person();
        Object obj = p; // 자손을 부모로 바라보는 것 = 가능.
        Student st = new Student();
        Object obj2 = st; // 자손을 부모로 바라보는 것 = 가능.
   
        
        // 2. 명시적 형변환 : 조상 타입 => 자손 타입
        Person p2 = (Person)obj; // 현재 obj는 Object로 바라본 상태. 얘를 다시 Person으로 바라보는 것.
        Student st2 = (Student)obj2;
        p2.eat(); // 명시적 형변환으로 Person으로 바라보게 만들었으므로 eat사용 가능하게 됨.
        st2.study();
        
        Student st3 = (Student) p; // p 는 Person객체였으므로, 자식객체로 명시적형변환함.
        st3.study(); // 명시적 형변환을 해서 자식객체의 study 메서드를 볼 수 있지만, 실제로 p의 메모리에는 study가 없으므로 에러 남.
        

        // 형변환을 안전하게 하기 위해서 instanceof 연산자를 사용.
        
        // 객체 instanceof 클래스
        // 클래스가 자신 클래스이거나 부모클래스이면 true가 나온다.
        
        if(obj instanceof Person) // obj가 Person클래스 본인이거나 Person의 자식이냐?
            ((Person)obj).eat();

        
        if(obj2 instanceof Student)
            ((Student)obj2).eat();

        
        if(obj2 instanceof Person)
            ((Person)obj2).eat();
        
        
        
        
    }
}
