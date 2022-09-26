package character;

import java.util.Random;

import monster.Monster;

public class Warrior extends Character {

	public Warrior(String name) {
		// スーパークラスのコンストラクタを実行
		super(name);
		this.job = "warrior";
		this.hp = 30;
		this.mp = 0;
		this.attackPower = 10;
		this.defencePower = 8;
	}

	// オーバーライド（上書き）
	//	@ をつけて書く = アノテーション
	@Override
	public void attack(Monster monster) {
		System.out.println("オーバーライド");

		// 攻撃力をキャッシュ
		int attackPower = this.attackPower;

		// 1/5の確率（かくりつ）で、攻撃力を2倍
		Random rand = new Random();
		if (rand.nextInt(5) == 0) {
			this.attackPower *= 2;
		}
		
		//スーパークラスの attack()を実行
		super.attack(monster);
		
		//攻撃力を元（もと）に戻す
		this.attackPower = attackPower;
	}

}
