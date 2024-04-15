package test02_set;

public class Person {
    String name;
    String id;
    
    public Person(String name, String id) {
        super();
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", id=" + id + "]";
    }
    
    // id가 일치한다면 같은 사람이다.
    // hashSet에서 는 hashCode와 equals의 두가지 일치여부를 확인하여 중복값을 제거하므로 
    // 두 가지 값을 오버라이드 해본다.
	@Override
	public int hashCode() {		
		return id.hashCode(); // object의 hashCode를 쓰는 중 => id의 해쉬코드를 쓰는걸로.
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person other = (Person) obj;
			return id.equals(other.id);
		}
		return false;
	}
	
	
    

    
}
