package test08_comparator;

// Comparable 인터페이스를 구현하고 있지 않기 때문에
// 기본적으로 정렬이 불가능하다!
// Comparator가 있다면, Comparable을 구현하지 않아도 sort 할 수 있다!
public class Person {
    String name;
    int age;
    
    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    
}
