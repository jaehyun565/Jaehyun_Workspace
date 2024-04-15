package test01_list;

import java.util.ArrayList;
import java.util.List;

public class ListTest1 {
	public static void main(String[] args) {
		// List
		// 1. 순서가 있다.
		// 2. 중복이 허용된다.

		List<String> names = new ArrayList<String>();

		// 원소 추가
		names.add("현경찬");
		names.add("배태용");
		names.add("양지웅");
		names.add("송창용");
		names.add("배태용"); // 중복 가능

		System.out.println(names);

		// 리스트가 비어있는지 체크하기
		System.out.println(names.isEmpty()); // false

		// 삭제
		// 1. 인덱스를 이용한 삭제
		names.remove(0); // 0번 인덱스 삭제
		System.out.println(names);

		// 2. 값을 이용한 삭제
		names.remove("배태용"); // 값으로 삭제, 중복된 값을 제거 명령시 앞에 값만 삭제
		System.out.println(names);

		// 3. 전부 삭제
		names.clear();
		System.out.println(names);
		System.out.println(names.isEmpty()); // true

		// 삭제 시에 주의할 점
		names.add("학생1");
		names.add("학생1");
		names.add("학생2");
		System.out.println(names);
		// 학생 1을 다 삭제 하고 싶다! 할 때
		for (int i = 0; i < names.size(); i++) { // names.size => 현재 크기, 지금은 3이 나올 것.
			if (names.get(i).equals("학생1")) // 특정 인덱스의 값을 가져올 때는 get을 사용.
				names.remove(i);
		}
		System.out.println(names); // 학생1이 다 삭제 되지 않음!! why??
		// 원소값 삭제시, 리스트 크기도 바뀌고, 각 원소들의 index도 바뀐다!
		// 앞의 학생1이 remove가 되면서 index가 바뀌어서 [1] index가 [0]이 되어서 제대로 삭제가 안됨.
		// 그럼 어떻게 해야하나??!

		for (int i = names.size() - 1; i >= 0; i--) { // 배열의 뒤에서부터 파악하면서 제거하면 된다!
			if (names.get(i).equals("학생1"))
				names.remove(i);
		}
		System.out.println(names);
	}
}
