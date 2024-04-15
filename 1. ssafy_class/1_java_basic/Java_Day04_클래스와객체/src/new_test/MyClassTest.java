package new_test;


public class MyClassTest {

	public static void main(String[] args) {
		
		MyClass test = new MyClass();
		MyClass test2 = new MyClass(1, "문자",true);		

		test.printFiled();
		MyClass.main(args);
		MyClass.myFunction();
	}

}
