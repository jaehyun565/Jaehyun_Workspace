package class05;

public class Person {
    String name;
    int age;
    String hobby;
    
    void study(int time) {
    	System.out.println(time+"시간 만큼 공부합니다.");
    }

    void study(long time) {
    	System.out.println(time+"시간 만큼 공부합니다.");
    }
    
    // 메서드 오버로딩이란?
    // 메서드 명은 일치
    // 파라미터의 개수, 순서, 타입이 다르면
    // 똑같은 이름으로 메서드를 여러개 만들 수 있다.
    
    // int
    // long
    // String, int
    
    // 파라미터의 개수가 달라졌으므로 study 정의 가능
    void study(String subject, int time) {
    	System.out.println(subject+"를 "+time+"시간 만큼 공부합니다.");
    }
    
    // 파라미터의 순서가 달라졌으므로 study 정의 가능
    void study(int time, String subject) {
    	System.out.println(subject+"를 "+time+"시간 만큼 공부합니다.");
    }
    
    // 파라미터의 이름만 달라지는 경우는 오버로딩 불가
//    void study(String subject2, int time) {
//    	System.out.println(subject2+"를 "+time+"시간 만큼 공부합니다.");
//    }
    
    // 리턴타입만 다른 것은 의미가 없다.
//    int study(int time, String subject) {
//    	System.out.println(subject+"를 "+time+"시간 만큼 공부합니다.");
//    	return 0;
//    }
    
}
