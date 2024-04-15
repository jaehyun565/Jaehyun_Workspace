package java03_operator;

public class Op03_비교연산자 {

    public static void main(String[] args) {
    	 // 주석에 올바른 실행 결과 값을 채워 넣으시오.
        int a = 10;
        
        System.out.println(a > 10); // fFalse
        System.out.println(a <= 10); // True
        System.out.println(a >= 10); // True
        System.out.println(a == 10); // True
        System.out.println(a != 10); // False
        
        // 문자열은 어떻게 비교하는가?
        String c=  "Hi";
        String d = "Hi";
        String e = new String("Hi");
        
        // java에서 문자열의 비교는 ==, != 연산자로 하지 않는다.
        // 문자열에서 ==, != : 참조(주소)값 비교
        // 문자열에서 .equals : 값 비교
        
        // c와 d는 같은 주소를 참조하므로 True	
        System.out.println(c == d); 
        // e는 new를 통해서 새로 메모리 공간을 할당시켰으므로 주소가 다름. False
        System.out.println(c == e); 
        // 문자열이 같은지
        System.out.println(c.equals(e)); 
        // 문자열이 다른지 
        System.out.println(!c.equals(e));
    }
}
