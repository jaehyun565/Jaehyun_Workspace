package test02_set;

import java.util.HashSet;
import java.util.Set;

public class SetTest1 {
    public static void main(String[] args) {
        //Set
    	// 1. 집합
    	// 2. 중복을 허용하지 않음.
    	// 3. 순서가 보장되지 않는다.
    	
    	// HashSet
    	// - Hashtable, 성능면에서 우수하다고 알려져 있음.
    	
    	Set<String> sets = new HashSet<>();
    	
    	sets.add("정상영");
    	sets.add("현경찬");
    	sets.add("양지웅");
    	sets.add("김도은");
    	sets.add("양지웅");
    	sets.add("양지웅");
    	
    	System.out.println(sets); // [정상영, 양지웅, 김도은, 현경찬]
    	System.out.println(sets.size()); // 사이즈는 4가 출력됨.
    }
}  
