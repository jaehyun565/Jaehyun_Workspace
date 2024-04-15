package test08_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTest2 {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

     
        persons.add(new Person("BBB", 22));
        persons.add(new Person("BBB", 23));
        persons.add(new Person("AAA", 23));
        persons.add(new Person("AAA", 11));
        
        System.out.println(persons);
        
        // Compartor를 만들 때, 클래스를 만들어도 되지만
        // Comparator는 인터페이스라서 객체 생성이 안됨 => 얘가 가지고 있는 추상메서드를 구현해줘서 1회용 객체로 사용한다!
        // 1. 익명 클래스를 만들어도 된다! > 1회용으로 한번만 사용하고 없어지는 친구.
        
        // 2. 람다 표현식으로도 구현할 수 있다.
        // - 이름이 없는 함수(메서드)
        // - 파라미터로 전달하기 위한 함수
        // - 주로 함수의 길이가 짧을 때 임시적으로 사용.
        
        // 람다표현식의 문법
        // (매개변수..) -> {함수 본문내용}
        // 매개변수가 없을 때는? 빈 괄호
        // 매개변수가 1개 일때는? 괄호생략가능
        // 본문내용이 1문장만 있을 때는? 중괄호 생략가능.
        // 매개변수의 타입을 생략할 수 있음.        
        Collections.sort(persons, (Person o1, Person o2)->{
        	if(o1.name.equals(o2.name)) {
        		return o1.age - o2.age;
        	}
        	return o1.name.compareTo(o2.name);
        });
       
        System.out.println(persons);
         
    }
}
