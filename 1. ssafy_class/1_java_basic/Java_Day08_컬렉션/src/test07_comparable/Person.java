package test07_comparable;

// Person이 컬렉션프레임워크에서 정렬가능하도록 만들려면
// Comparable 인터페이스를 적어줘야한다.
public class Person implements Comparable<Person> { // 제네릭은 자기 자신
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

	// 양수면 자리 바꿈
	// 음수면 그대로
	// 0이면 그대로

	// 자기 자신하고 파라미터로 넘어오는 o 객체를 비교해서 => 정수값을 반환해주는 메서드

//	@Override
//	public int compareTo(Person o) {
//		// 나이 오름차순으로 정렬해보기!
//		// 3,8,11, 22
//		// -> 앞의 숫자가 작고, 뒤의 숫자가 크다.
//		// -> 앞 - 뒤 하면 음수가 나오는게 자연스러움
//		
//		// 만약 나이가 같다면..? 이름 순서로 오름차순 하기를 원한다!
//		// 이름은 문자열임. String은 compareTo가 기본적으로 되어있음(자동 오름차순)
//		
//		if(this.age == o.age) {
//			return this.name.compareTo(o.name);
//		}
//		return this.age - o.age;
//	}

	
	@Override
	public int compareTo(Person o) {
		// 먼저 이름순으로 정렬하고
		// 이름이 같다면 나이 순으로 정렬해보기!
		if(this.name.equals(o.name)) {
			return this.age - o.age;
		}
		
		return this.name.compareTo(o.name);
	}
	
}
