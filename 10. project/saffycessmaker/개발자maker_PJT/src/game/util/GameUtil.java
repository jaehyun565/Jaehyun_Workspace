package game.util;

import java.util.List;
import java.util.Scanner;

public class GameUtil {
	private static Scanner sc = new Scanner(System.in);

	public static void printLine() {
		System.out.println("----------------------------------------------------");
	}

	// 숫자 입력
	public static int inputInt() {
		int n = 0;
		try {
			n = sc.nextInt();
		} catch (Exception e) {
			System.out.println("올바른 숫자를 입력해주세요.");
			n = inputInt();
		}
		return n;
	}

	// 제한 범위 있는 숫자 입력
	public static int inputInt(int idx) {
		int n = 0;
		try {
			n = sc.nextInt();
		} catch (Exception e) {
			System.out.println("올바른 숫자를 입력해주세요.");
			n = inputInt();
		}
		if (n > idx || n < 1) {
			System.out.println("선택지 내에서 골라주세요.");
			n = inputInt(idx);
		}
		return n;
	}

	// 선택 불가 번호가 있는 숫자 입력
	public static int inputInt(int idx, List<Integer> multi) {
		int n = 0;
		try {
			n = sc.nextInt();
		} catch (Exception e) {
			System.out.println("올바른 숫자를 입력해주세요.");
			n = inputInt();
		}
		if (n > idx || n < 1 || !multi.contains(n)) {
			System.out.println("선택지 내에서 골라주세요.");
			n = inputInt(idx);
		}
		return n;
	}

	// 문장 입력
	public static String inputStr() {
		return sc.next();
	}

	// 문항 출력
	public static void printQ(String Question) {
		System.out.println(Question);
		System.out.println();
	}

	// 선택지 출력
	public static int printMulti(String[] choice) {
		for (int i = 0; i < choice.length; i++) {
			System.out.println((i + 1) + ". " + choice[i]);
		}
		System.out.println();
		return inputInt(choice.length);
	}

	// 선택 불가 선택지 출력
	public static int printMulti(String[] choice, List<Integer> multi) {
		for (int i = 0; i < choice.length; i++) {
			if (multi.contains(i + 1)) {
				System.out.println((i + 1) + ". " + choice[i]);
			} else {
				System.out.println("[선택불가] " + (i + 1) + ". " + choice[i]);
			}

		}
		System.out.println();
		return inputInt(choice.length, multi);
	}
	
	// 결과 및 선택지 출력
	public static void printMsg(String msg) {
		try {
			System.out.print(". ");
			Thread.sleep(500);
			System.out.print(". ");
			Thread.sleep(500);
			System.out.print(". " + "\n");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(msg);
	}

}
