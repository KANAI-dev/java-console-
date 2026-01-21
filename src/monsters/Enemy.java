package monsters;

public abstract class Enemy  implements Character{
	
//	フィールド
	private int hp;
	private int attack;
	private String name;

//	setter
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public void setName(String name) {
		this.name = name;
	}
//	getter
	public int getHp() {
		return this.hp;
	}
	public int getAttack() {
		return this.attack;
	}
	public String getName() {
		return this.name;
	}
	
//	メソッド
	public abstract void attack(Friend f);
	public abstract void run();
	public abstract boolean die();

}
