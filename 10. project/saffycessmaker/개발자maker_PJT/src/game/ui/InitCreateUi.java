package game.ui;

import game.make.user.UserControl;
import game.make.user.UserControlImpl;
import game.util.GameUtil;

public class InitCreateUi {
	private static UserControl userDao = UserControlImpl.getInstance();
	
	public static void service() {
		GameUtil.printLine();
		System.out.println("교육생 정보 입력");
		GameUtil.printLine();
		System.out.print("이름을 입력해주세요 : ");
		String name = GameUtil.inputStr();
		GameUtil.printLine();
		System.out.println("여러분의 즐거운 SSAFY 생활을 응원하며 웰컴 키트를 준비했어요!\n"
				+ "아래의 옵션 중 두 가지의 선물을 선택해보세요.\n"
				+ "단, 중복 선택은 불가능하며 불이익이 발생할 수 있어요 ㅠㅅㅠ");
		System.out.println("\n[1. 커피] [2. 노트북] [3. 셀카봉] [4. 지갑]\n");
		System.out.println("첫 번째 선택 : ");
		int one = GameUtil.inputInt(4);
		System.out.println("두 번째 선택 : ");
		int two = GameUtil.inputInt(4);
		userDao.create(name, 30, 30, 30, 30);
		userDao.setLevel(one-1, 50);
		userDao.setLevel(two-1, 50);
		GameUtil.printLine();
		System.out.println("본인 확인 완료. 본격 싸피 입과를 축하합니다!(❁´◡`❁)");
		GameUtil.printLine();
		ChoiceUi.choice();
	}
}
