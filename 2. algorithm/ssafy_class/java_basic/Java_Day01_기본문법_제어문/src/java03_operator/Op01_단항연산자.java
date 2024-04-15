package java03_operator;

public class Op01_단항연산자 {

    public static void main(String[] args) {
       // 주석에 올바른 실행 결과 값을 채워 넣으시오.
    	
        int a = 5;
        System.out.println(a++); // 전위형, 5를 출력하고 a = 6이 됨.
        System.out.println(++a); // 후위형, a=7이 되고 이를 출력함.
        System.out.println(--a); // 
        System.out.println(a); // 
        System.out.println(a--); // 
        System.out.println(a++); // 
        
        System.out.println(-a); // 
        System.out.println(~a); //  
        
        System.out.println(!false); //
        
    }
    
}
