package test06_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();

     
        names.add("EEE");
        names.add("BBB");
        names.add("CCC");        
        names.add("AAA");
        names.add("DDD");
        
        System.out.println(names);
        
        // Collections.sort(); 를 사용 (static메서드라 바로 사용)
        
        Collections.sort(names); // 정렬해본다!
        
        System.out.println(names); // 정렬 된 값이 출력 됨.

    }
}
