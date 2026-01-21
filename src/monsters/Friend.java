package monsters;

public abstract class Friend implements Character{

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
	
//	コンストラクタ
	public Friend() {
	}
//	メソッド
	public abstract void attack(Enemy e);
	public abstract void run();
	public abstract boolean die();

}
