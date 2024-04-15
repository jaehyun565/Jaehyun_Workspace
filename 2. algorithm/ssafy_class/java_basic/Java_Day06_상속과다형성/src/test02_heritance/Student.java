package test02_heritance;

public class Student extends Person{
    
	//Person 을 상속 받았음
	// 이는 Person의 멤버변수와 메서드를 상속받았음을 의미
	// Person의 멤버변수 : name과 age
	// Person의 메서드 : eat 
	// 2가지를 모두 Student에서도 사용할 수 있다는 의미.
	
    String major;    
    
    public void study() {
        System.out.println("공부를 한다.");
    }

	@Override
	public String toString() {
		return "Student [major=" + major + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		
		// 이름(String)이 같으면 같은 객체라고 반환할 수 있게 override하기.
		return name.equals(((Student)obj).name);
		
	}
	
	
}
