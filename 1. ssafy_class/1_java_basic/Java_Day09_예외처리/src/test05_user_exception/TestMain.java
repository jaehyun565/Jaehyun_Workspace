package test05_user_exception;

public class TestMain {
	
	public static void testMethod() throws UserTest1 {
		
			int a = 1;
			int b = 1;
			
			if ( a == 1 && b == 1) {
				throw new UserTest1();	
			}
			int c = a + b;
			
			System.out.println(c);
						
	}
	
		
	public static void main(String[] args) throws UserTest1 {
//		try {
			testMethod();	
//		}
//		catch(Exception e){
//			System.out.println(e);
//		}
		System.out.println(5);
		
	
	}
}
