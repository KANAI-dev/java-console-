package monsters;

public class Slime extends Enemy {

    public Slime() {
        this.setName("Slime");
        this.setHp(60);
        this.setAttack(20);// Slimeの攻撃力
    }

    @Override
    public void attack(Friend f) {
        System.out.println(this.getName() + "の攻撃！");
        f.setHp(f.getHp() - this.getAttack());
        System.out.println(f.getName() + "に" + this.getAttack() + "のダメージ！");
    
        try {
  			Thread.sleep(2000); // 画面更新間隔指定
  		} catch (Exception ex) {
  		}
    
    
    
    
    }
   
    
    @Override
    public void run() {
        System.out.println("サッサッサッと逃げた");
    }

    @Override
    public boolean die() {
        if (this.getHp() <= 0) {
            System.out.println(this.getName() + "は倒れた！");
            return true;
        }
        return false;
    }
}