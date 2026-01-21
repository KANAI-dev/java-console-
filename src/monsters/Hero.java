package monsters;

public class Hero extends Friend  {
	Hero(int hp ,String name){
		this.setHp(hp);
		this.setName(name);
		this.setAttack(50);
		
	}
	private String name;
	
	public void run() {
		System.out.println(this.getName() +"は泣きべそをかきながら逃げた");
	}
	
	public void attack(Enemy e) {
		System.out.println(this.getName() +"の攻撃！");
        e.setHp(e.getHp() - this.getAttack());
       
		System.out.println(e.getClass().getSimpleName() +"に" + this.getAttack() + "のダメージ！");
		
		 try {
  			Thread.sleep(2000); // 画面更新間隔指定
  		} catch (Exception ex) {
  		}
		
		
		
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	@Override
	//public boolean die() {
		//return false;
//	}
	
	public boolean die() {
        if (this.getHp() <= 0) {
            System.out.println(this.name + "は倒れた！");
            return true;
        }
        return false;
    }
	public void karaage() {
		int heal = 50;
		System.out.println(this.name +"は唐揚げを食べて"+ heal + "回復した");
		this.setHp(this.getHp() + heal);

	
	}
}

