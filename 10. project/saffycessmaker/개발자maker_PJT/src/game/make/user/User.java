package game.make.user;

// 키우는 캐릭터
public class User {
	String name;
	int health;
	int algo;
	int social;
	int money;
	
	public User() {
	}
	
	public User(String name, int health, int algo, int social, int money) {
		this.name = name;
		this.health = health;
		this.algo = algo;
		this.social = social;
		this.money = money;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getAlgo() {
		return algo;
	}

	public void setAlgo(int algo) {
		this.algo = algo;
	}

	public int getSocial() {
		return social;
	}

	public void setSocial(int social) {
		this.social = social;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", health=" + health + ", algo=" + algo + ", social=" + social + ", money="
				+ money + "]";
	}
	
	public int[] getUserLevel() {
		int[] lev = {health, algo, social, money};
		return lev;
	}
}
