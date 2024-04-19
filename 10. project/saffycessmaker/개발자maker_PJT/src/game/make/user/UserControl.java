package game.make.user;

public interface UserControl {
	
	public abstract void create(String name, int health, int algo, int social, int money);
	
	public abstract void changeStat(int[] change);
	
	public abstract void setLevel(int idx, int stat);
	
	public abstract int[] getLevel();
	
}
