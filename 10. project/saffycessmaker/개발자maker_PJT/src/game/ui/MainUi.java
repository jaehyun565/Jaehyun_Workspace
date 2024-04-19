package game.ui;

import game.util.GameUtil;

public class MainUi {
	public static void service() {
		GameUtil.printLine();
		System.out.println("1. 게임 시작");
		System.out.println("2. 종료");
		GameUtil.printLine();
		int inputNum = GameUtil.inputInt(2);
		if (inputNum == 1) {
			System.out.println("Best 11기 여러분 환영합니다.");
			InitCreateUi.service();
		} else {
			exit();
			return;
		}
	}

	private static void exit() {
		System.out.println("수고하셨습니다.");
	}

}
