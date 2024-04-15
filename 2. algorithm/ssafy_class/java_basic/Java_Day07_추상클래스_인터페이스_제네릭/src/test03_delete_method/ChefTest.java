package test03_delete_method;

public class ChefTest {
    public static void main(String[] args) {
        Chef[] chefs = new Chef[2];
        
        chefs[0] = new KFoodChef();
        chefs[1] = new JFoodChef();
        
        // Chef 설계도에서, 쓰이지 않는다고 생각한 cook()메서드를 삭제했더니
	    // 자식객체가 cook() 메서드를 갖고 있다 하더라도 접근 불가
        // => 다형성 활용 불가, 동적바인딩 불가.	
        // 그럼 안 쓰는 부모 메서드를 평생 가져 가야해?! => 이를 해결하기 위해 추상 클래스를 정의한다!
 
        // 부모클래스에서 cook이 안 쓰인다고 지워버리면 자식객체에서도 쓸 수가 없다!
        
        for(Chef chef : chefs) {
        	chef.eat();
        	chef.cook(); 
        	        	
        }
    }
}
