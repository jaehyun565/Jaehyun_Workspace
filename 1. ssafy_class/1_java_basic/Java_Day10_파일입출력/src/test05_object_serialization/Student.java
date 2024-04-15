package test05_object_serialization;

public class Student extends Person {

	String name;
	String classNum;

	public Student() {
		super();
	}

	public Student(String name, String classNum) {
		super();
		this.name = name;
		this.classNum = classNum;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", classNum=" + classNum + "]";
	}
}
