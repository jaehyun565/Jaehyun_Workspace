package game.make.user;

// 게임 유저 캐릭터 컨트롤
public class UserControlImpl implements UserControl {
	
	// 싱글턴
	private static UserControl instance = new UserControlImpl();
	private UserControlImpl() {
	}
	public static UserControl getInstance() {
		return instance;
	}
	
	private User user = new User();

	// 캐릭터 생성
	@Override
	public void create(String name, int health, int algo, int social, int money) {
		user.name = name;
		user.health = health;
		user.algo = algo;
		user.social = social;
		user.money = money;
	}

	// 캐릭터 스탯 수정1
	@Override
	public void changeStat(int[] change) {
		for(int i = 0; i < change.length; i++) {
			if(change[i]==0) {
				continue;
			}
			setLevel(i, change[i]);
		}
	}
	
	// 캐릭터 스탯 수정2
	@Override
	public void setLevel(int idx, int stat) {
		if(idx==0) {
			user.setHealth(stat);
		} else if(idx==1) {
			user.setAlgo(stat);
		} else if(idx==2) {
			user.setSocial(stat);
		} else if(idx==3) {
			user.setMoney(stat);
		}
	}

	// 캐릭터 스탯 보기
	@Override
	public int[] getLevel() {
		return user.getUserLevel();
	}
	
}
