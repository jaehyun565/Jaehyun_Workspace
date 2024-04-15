package java03_operator;

public class Op02_산술연산자 {
    public static void main(String[] args) {
    	 // 주석에 올바른 실행 결과 값을 채워 넣으시오.
    	
        int a = 10;
        int b = 6;
        
        System.out.println(a + b); // 
        System.out.println(a - b); //  
        System.out.println(a * b); //
        
        // 정수끼리의 나눗셈 => 소수점 이하를 버림
        System.out.println(a / b); // 1 
        System.out.println(a % b); // 4
        
        //정수와 실수의 연산 => 실수가 나옴
        System.out.println((double)a / b); // 1.6666
        System.out.println(a / (double)b); // 1.6666
        
        // 정수끼리 먼저 연산 후에 실수로 바꿔줌. 값 1 을 실수화한 것.
        System.out.println((double)(a / b)); //
        
        double c = 2.3;
        
        System.out.println(a / c); //
        System.out.println(a / (int) c); //
        
        
    }
}
