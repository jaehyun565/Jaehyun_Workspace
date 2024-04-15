package class06;

public class PersonTest {
    public static void main(String[] args) {
    	
    	// 기존에는 인스턴스를 만들고
    	// 필드를 따로 초기화 시켜줬었음
        Person yang = new Person();
        yang.age = 45;
        yang.name= "Yang";
        yang.hobby="Youtube";
                
        // 위 방법 대신에 인스턴스를 생성하면서 생성자를 통해 바로 필드 초기화
    	Person hong = new Person("Hong", 25, "Golf");
    	Person kang = new Person("Kang",40);
    	
    	yang.info();
    	hong.info();
    	kang.info();
    }
}
