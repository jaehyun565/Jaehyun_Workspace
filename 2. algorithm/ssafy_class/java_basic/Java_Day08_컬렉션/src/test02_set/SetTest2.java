package test02_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest2 {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<Person>();
        // Set에서 중복을 판단하는 요소는 2가지가 있음!
        // 1. hashCode(); 가 일치하는가?
        // 2. eqauls() 오버라이드
        Person p1 = new Person("사람1", "111111");
        Person p2 = new Person("사람1", "111111");
        
        set.add(p1);
        set.add(p2);        
        
        // 사람이 한 사람만? 아니면 두 사람?
        System.out.println(set);
        
        // 새로 만든 객체는 hashCode가 기본적으로 다름.
        // 오브젝트로 물려받는 계산 로직을 쓰는 것이 아니라
        // 따로 person에서 hashCode를 오버라이드 해서 쓰자 => id가 같으면 hashCode도 동일하도록.
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
