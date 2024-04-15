package test03_map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapTest2 {
    public static void main(String[] args) {
        Map<Person, Integer> map = new HashMap<>();
        
        Person p1 = new Person("사람1", "111111");
        Person p2 = new Person("사람1", "111111");
        
        // set과 동일하게 key의 중복값 여부를 hashCode와 equals로 동일여부로 판단한다.
        // 따라서 key값의 객체에 override를 해줘야 중복값 판단이 잘 됨.
        
        map.put(p1, 100);
        map.put(p2, 98);
        
        // 사람이 한 사람만? 아니면 두 사람?
        System.out.println(map);
    }
}
