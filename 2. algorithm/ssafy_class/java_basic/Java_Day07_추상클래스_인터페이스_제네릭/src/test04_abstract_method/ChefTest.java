package test04_abstract_method;

public class ChefTest {
    public static void main(String[] args) {
        Chef[] chefs = new Chef[2];
        
        chefs[0] = new KFoodChef();
        chefs[1] = new JFoodChef();
        
        for(Chef chef : chefs) {
        	chef.eat();
        	chef.cook(); // 추상메서드로 만들었더니 접근이 가능해짐 = 다형성이 활용가능해짐.
        }
    }
}
