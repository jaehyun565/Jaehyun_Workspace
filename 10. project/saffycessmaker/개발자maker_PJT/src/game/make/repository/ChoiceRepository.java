package game.make.repository;

import java.util.Random;

// 문항 및 선택지와 결과 저장소
public class ChoiceRepository {
	
	// 문항과 선택지
	private String[][] choiceDB = new String[30][4]; // [r][0]: r번 문항, [r][1~3]열: r번 문항 선택지
	// 문항과 선택지의 제한 스탯
	private int[][][] condition = new int[30][4][]; // [r][0][]: r번 문항 결과가 확률 선택지인지 표시, [r][c][]: r번 문항 c번 선택지 제한 스탯
	// 선택지 별 스탯 변동치
	private int[][][] change = new int[30][][]; // [r][c][]: r번 문항 c번 선택지 스탯 변동 결과
	// 문항 선택지에 따른 결과
	private String[][] result = new String[30][];
	// 확률
	private int[][][] chance = new int[30][4][]; // 기준 스탯 (각 스탯에 따른 성공실패 확률 배열) //
	
	// 싱글턴
	private static ChoiceRepository instance = new ChoiceRepository();
	private ChoiceRepository() {
	}
	public static ChoiceRepository getInstance() {
		return instance;
	}	
	
	// 저장소 불러오기
	public String[][] getDB() {
		return choiceDB;
	}

	public int[][][] getChange() {
		return change;
	}

	public int[][][] getCondition() {
		return condition;
	}
	
	public String[][] getResult() {
		return result;
	}
	
	// 확률형 결과 불러오기
	public String getChance(int Q, int[] level) {
		int stat = chance[Q][0][0];
		int[] per = new int[3];
		Random random = new Random();
		
		for(int i = 1; i < 4; i++) {
			if(chance[Q][i] == null || stat < chance[Q][i][0]) {
				break;
			}
			if(stat >= chance[Q][i][0]) {
				per = chance[Q][i];
			}
		}
		
		int r = random.nextInt(100) + 1;
		int res = 0;
		for(int i = 0; i < 3; i++) {
			if(r < per[i]) {
				res = i - 1; /////// 확인하기
			}
		}
		
		return result[Q][res];
	}
	
}
