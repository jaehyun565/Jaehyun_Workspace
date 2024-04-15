package test03_map;

import test03_map.Person;

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
