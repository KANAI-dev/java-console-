package monsters;

public class Oak extends Enemy {

	public Oak() {
		this.setHp(250);
		this.setName("オーク");
		this.setAttack(40);

	}

	@Override
	public void attack(Friend f) {
		System.out.println("オークは" + f.getName() + "にやりで攻撃し" + this.getAttack() + "ダメージを与えた！");
		f.setHp(f.getHp() - this.getAttack());

		 try {
	  			Thread.sleep(2000); // 画面更新間隔指定
	  		} catch (Exception ex) {
	  		}
		
		

	}

	@Override
	public void run() {
		System.out.println("オークはスタスタ…と逃げた！");

	}

	@Override
	public boolean die() {
		if (this.getHp() <= 0) {

			System.out.println(this.getName() + "は倒れた");
			return true;
		}
		return false;

	}

}
