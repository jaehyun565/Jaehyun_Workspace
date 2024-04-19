package game.test;

import game.ui.MainUi;
import game.util.GameUtil;

public class DevMakerApplication {
	public static void main(String[] args) {
		GameUtil.printLine();
		System.out.println("█▀▀ █▀▀ █▀▀█ █▀▀ █░░█ █▀▀ █▀▀ █▀▀ █▀▀   █▀▄▀█ █▀▀█ █░█ █▀▀ █▀▀█\r\n"
				+ "▀▀█ ▀▀█ █▄▄█ █▀▀ █▄▄█ █░░ █▀▀ ▀▀█ ▀▀█   █░▀░█ █▄▄█ █▀▄ █▀▀ █▄▄▀\r\n"
				+ "▀▀▀ ▀▀▀ ▀░░▀ ▀░░ ▄▄▄█ ▀▀▀ ▀▀▀ ▀▀▀ ▀▀▀   ▀░░░▀ ▀░░▀ ▀░▀ ▀▀▀ ▀░▀▀");
		MainUi.service();
	}
}
