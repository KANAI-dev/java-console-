package monsters;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	boolean runFlg = false;
    	//名前を入力してください
    	 System.out.println("勇者の名前を入力してください");
    	String name = new Scanner(System.in).nextLine();
        Hero h = new Hero(200, name);
        Matango m = new Matango();
        Oak o = new Oak();
        Slime s = new Slime();

        Enemy[] enemies = {s, m, o};
        Random rand = new Random();

        for (Enemy enemy : enemies) {
        	try {
    			Thread.sleep(3000); // 画面更新間隔指定
    		} catch (Exception e) {
    		}
            System.out.println("\n"+ enemy.getName() + "が現れた！");

            int enemyMaxHp = enemy.getHp(); // 初期HPを記録

            while (true) {
                // Heroの逃走判定
                if (h.getHp() <= 100 && rand.nextBoolean()) {
                    h.run();
                    runFlg = true;
                    break; // 次の敵へ
                }

                // Enemyの逃走判定
                if (enemy.getHp() <= (enemyMaxHp / 2) && rand.nextBoolean()) {
                    enemy.run();
                    h.karaage();
                   
                    break; // 次の敵へ
                }

                // Heroの攻撃
                h.attack(enemy);
                if (enemy.die()) {
                    System.out.println(h.getName() + "の勝利！" + enemy.getName() + "を倒した！");
                     h.karaage();
                     
                    
                    
                    break;
                    
                }

                // 敵の攻撃
                enemy.attack(h);
                if (h.die()) {
                    System.out.println(enemy.getName() + "は" + h.getName() + "を倒した！" + h.getName() + "は死んでしまった。");
                    return; // 戦闘終了
                }
            }
      //      if(runFlg) {
        //    	break;
         //   }
        }
        if(runFlg) {
        	System.out.println(h.getName() + "は逃げ出した！冒険は続く…");
        }else {
        System.out.println(h.getName() + "は全ての敵を倒した！冒険は続く…");
        }
    }
}