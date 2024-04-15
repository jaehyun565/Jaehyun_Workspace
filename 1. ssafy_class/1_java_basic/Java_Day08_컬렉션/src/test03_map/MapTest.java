package test03_map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        
    	//Map
    	// - 사전과 같은 자료구조    	
    	// - 키& 값의 쌍으로 저장
    	// - 키로 구별(중복X), 값(중복 가능)
    	// - 키가 set과 유사하게 순서가 보장되지 않음.
    	
    	Map<String, String> map = new HashMap<>();
    	
    	// Map은 add가 아닌 put을 사용.
    	map.put("서울5반", "현경찬");
    	map.put("서울6반", "옥진석");
    	map.put("서울7반", "육예진");
    	map.put("서울8반", "서경덕");
    	map.put("대전3반", "허지영");
    	map.put("대전4반", "김범규");
    	
    	System.out.println(map);
    	
    	// 값을 꺼낼 때는 get(Key값)으로 가져올 수 있음.
    	System.out.println(map.get("대전3반"));
    	
    	// 중복된 키 값에 값만 다르게 넣으면 해당 키값의 값이 바뀜.(대체)
    	map.put("서울6반", "송예진");
    	System.out.println(map);
    	
    	// 이 맵에 해당 키가 있나?
    	System.out.println(map.containsKey("대전4반"));
    	// 이 맵에 해당 값이 있나??
    	System.out.println(map.containsValue("현경찬"));
    	
    	
    	// 맵의 순회
    	// 1. keySet()
    	// => keySet은 Key만 가져오겠다.
    	for (String key:map.keySet()) {
    		System.out.printf("%s : %s \n", key, map.get(key));
    	}
    	
    	// 2. entrySet()
    	// entry = key와 value를 묶어서 가져오겠다.
    	for(Map.Entry<String, String> entry : map.entrySet()) {
    		System.out.println(entry.getKey()+" : "+entry.getValue());
    	}
    }
}
