package test02_inheritance;

public class ChefTest {
	public static void main(String[] args) {

		// 다형성
		// 부모클래스의 타입으로 자식객체를 참조할 수 있다.
		Chef[] chefs = new Chef[2];

		chefs[0] = new KFoodChef();
		chefs[1] = new JFoodChef();

		for (Chef chef : chefs) {
			chef.eat(); // 부모클래스 타입으로 참조 중. > 자식클래스에서 오버라이드 한 메서드가 실행된다.
			chef.cook(); // 부모클래스 타입으로 참조 중. > 자식클래스에서 오버라이드 한 메서드가 실행된다.
		}

	}
}
