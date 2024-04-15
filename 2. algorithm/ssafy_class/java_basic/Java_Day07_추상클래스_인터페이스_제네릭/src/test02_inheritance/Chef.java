package test02_inheritance;

public class Chef {
    String name;
    int age;
    String speciality;
    
    public void eat() {
        System.out.println("음식을 먹는다.");
    }
    
    public void cook() {
        System.out.println("전공에 맞는 조리한다."); // 자식객체에서 오버라이드 해서 쓰는데, 얘가 필요한가???
    }
}
