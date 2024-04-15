package test08_comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Person>{

	// Comparable 의 compareTo는 자기자신과 비교대상을 비교했다면
	// Comparator는 2가지 대상을 던져주고 비교하게 함.
	@Override
	public int compare(Person o1, Person o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
	
	
}
