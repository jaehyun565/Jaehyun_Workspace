package java05_loop;

public class Loop04_break_continue {
	public static void main(String[] args) {

		// 다음은 무슨 의미?
		// i 가 홀수면 아래 실행식을 시행하지 않고 다음 반복차례로 넘어감
		// 즉 i = 1이면 실행안하고 i = 2일때 반복 적용.
		for (int i = 2; i <= 9; i++) {
			if (i % 2 == 1)
				continue;
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}

		// 다음은 무슨 의미? 
		// i가 5보다 크면 아예 이 블록을 빠져나옴.
		// i=2 ~ 5까지 반복문이 실행되고, 6이 되면 바로 멈춤.
		for (int i = 2; i <= 9; i++) {
			if (i > 5)
				break;
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}

		// 다음은 무슨 의미?
		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				if (j > 5)
					break;
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}

		// 다음은 무슨 의미?
		// 원래 break를 쓰면 그냥 그 블록만 멈추고 바깥의 for문은 돌아감
		// label을 달아줘서 원하는 for문을 멈추게 할 수 있음.
		// 아래는 out 이라는 label을 달아서 바깥의 for문을 멈추게 함.
		out: for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				if (j > 5)
					break out;
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}

		// 다음은 무슨 의미?
		out: for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				if (j > 5)
					continue out;
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}

	}
}