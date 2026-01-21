package monsters;

public class Matango extends Enemy implements Character {
	 public Matango() {
	        this.setName("Matango");
	        this.setHp(100);
	        this.setAttack(40);
	    }
	public void attack(Friend f) {
		f.setHp(f.getHp() - this.getAttack());
		System.out.println("Matangoは攻撃をした！");
		System.out.println("Matangoは" + f.getName() + "に" + this.getAttack() + "ポイントのダメージをあたえた！");
		
		 try {
	  			Thread.sleep(2000); // 画面更新間隔指定
	  		} catch (Exception ex) {
	  		}
			
		
		
		
	}	
	public void run() {
		System.out.println("Matangoはサーっと逃げた！");
	}	
	public boolean die() {
		if(this.getHp() < 0) {
			System.out.println("Matangoは倒された！");
			return true;
		}
		return false;
	}	
}