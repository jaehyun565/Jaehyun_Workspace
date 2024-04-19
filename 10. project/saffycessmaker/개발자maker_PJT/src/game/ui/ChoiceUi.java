package game.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

import game.make.repository.ChoiceRepository;
import game.make.user.UserControl;
import game.make.user.UserControlImpl;
import game.util.GameUtil;

public class ChoiceUi {
	// 의존성 주입
	private static UserControl gm = UserControlImpl.getInstance();
	private static ChoiceRepository repository = ChoiceRepository.getInstance();
	// 저장소
	private static String[][] DB = repository.getDB();
	private static int[][][] change = repository.getChange();
	private static int[][][] condition = repository.getCondition();
	private static String[][] result = repository.getResult();

	public static void test() {
		StringTokenizer st = new StringTokenizer(input, "\n");
		for (int r = 0; r < 10; r++) {
			for (int c = 0; c < 4; c++) {
				DB[r][c] = st.nextToken(); 
			}
		}
	}
	
	public static String input = "개발자가 되기 위해 싸피를 지원한 당신_열심히 노력한 끝에 드디어 싸피인이 된다!_싸피에서의 생활을 잘 보내서 개발자가 되어보자.\r\n"
			+ "열정!!열정!!열정!!\r\n"
			+ "화이팅~\r\n"
			+ "설렌다-\r\n"
			+ "CS지식을 위해 계획을 세우는 당신_친한 동료가 함께 하자고 다가오는데..._배울 점도 많지만 놀기 좋아하는 동료_함께 할까? 혼자 공부할까?\r\n"
			+ "혼자 한다.\r\n"
			+ "동료와 함께 한다.\r\n"
			+ "\r\n"
			+ "봄이 되니 이쁜 옷이 많이 보인다,_옷 사려면 돈이 필요한데....\r\n"
			+ "알바를 한다.\r\n"
			+ "알바를 하지 않고 옷을 참는다.\r\n"
			+ "\r\n"
			+ "B형 테스트를 준비 하고 있던 당신,_오랜만에 친구로부터 저녁 한끼 하자는 연락이 왔다._당신의 선택은?\r\n"
			+ "모임에 참여하지 않는다.\r\n"
			+ "밥을 먹으러 간다. (재력 40 이상이어야 모임 가능)\r\n"
			+ "\r\n"
			+ "싸피 지원금 지급날\r\n"
			+ "야호~\r\n"
			+ "\r\n"
			+ "\r\n"
			+ "SSAFY에 합격한 당신, 집을 구해야 한다_(재력에 따라 선택할 수 있는 집이 달라진다)\r\n"
			+ "역삼/강남에 집 구한다._(재력 90 이상이어야 선택 가능)\r\n"
			+ "1시간 거리의 집을 구한다._(재력 70 이상이어야 선택 가능)\r\n"
			+ "본가(2시간)에서 다닌다.\r\n"
			+ "일과 대부분을 컴퓨터 앞에 앉아 지내는 당신. _잦은 소화불량과 역류성 식도염을 겪고 있습니다._유난히 배고픈 오늘 점심._든든한 제육덮밥과 건강한 샐러드 중 무엇을 드시겠습니까?\r\n"
			+ "제육덮밥을 선택한다.\r\n"
			+ "샐러드를 선택한다.\r\n"
			+ "\r\n"
			+ "오랜 취직준비로 당신은 몸이 약해짐을 느꼈습니다_알고리즘 공부를 하는 대신 운동을 하시겠습니까?\r\n"
			+ "PT등록 O (재력 30이상이어야 등록 가능)\r\n"
			+ "PT등록 X\r\n"
			+ "\r\n"
			+ "SSAFY 학습 후 집으로 돌아왔다_오늘 배운 다익스트라가 이해되지 않는데...\r\n"
			+ "내일 내용을 위해 복습 한다.\r\n"
			+ "하루 동안 고생했으니 자유시간을 갖는다.\r\n"
			+ "\r\n"
			+ "싸피 지원금 지급날.\r\n"
			+ "야호~\r\n"
			+ "\r\n"
			+ "\r\n"
			+ "어느새 저녁 식사 시간이네_뭐 먹지...?\r\n"
			+ "건강을 위해 재료를 사서 요리 해 먹는다.\r\n"
			+ "시간 아까우니 배달 시켜 먹는다.\r\n"
			+ "\r\n"
			+ "해커톤 대회가 열렸다_상금도 꽤나 큰 것 같은데...\r\n"
			+ "좋은 기회다 참가하자.\r\n"
			+ "아직은 공부할 때 이다, 참가하지 않는다.\r\n"
			+ "\r\n"
			+ "공통 프로젝트 마감 전날 밤_\"어...? 누가 코드를 이렇게 짰지...?\"_심각한 버그를 발견한 당신\r\n"
			+ "밤을 새서 버그를 픽스한다.\r\n"
			+ "지금까지도 고생했으니 못 본척 제출한다.\r\n"
			+ "\r\n"
			+ "싸피에서의 마지막 날.._오늘만 지나면 싸탈이야~!\r\n"
			+ "나는 어떤 개발자가 될까...?\r\n"
			+ "\r\n"
			+ "";

	public static void choice() {
		for (int i = 0; i < DB.length; i++) {
			// i번 문항 출력
			GameUtil.printQ(DB[i][0]);

			// 현재 유저 스탯
			int[] level = gm.getLevel();
			System.out.println(Arrays.toString(level));

			boolean flag = false;
			if (condition[i][0][0] != 0) { // 확률형 결과를 내놓는 선택지 번호
				flag = true; // 확률형 결과
			}

			// 선택지 j번의 스탯 제한 확인
			List<Integer> out = new ArrayList<>();
			for (int j = 1; j <= 4; j++) {
				for (int k = 0; k < 4; k++) {
					if (level[k] < condition[i][j][k]) {
						out.add(j);
					}
				}
			}

			// 선택지 출력 및 답변 입력
			int n;
			if (out.isEmpty()) {
				n = GameUtil.printMulti(DB[i]);
			} else {
				n = GameUtil.printMulti(DB[i], out);
			}

			// 결과 출력
			String res = "";
			if (!flag || (flag && n != condition[i][0][0])) {
				res = result[i][n];
			} else {
				res = repository.getChance(i, level);
			}

			// 결과 출력
			GameUtil.printMsg(res);
			GameUtil.printLine();

			// 변동 스탯 반영
			gm.changeStat(change[i][n]);
		}
	}

}
