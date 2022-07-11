package character;

import monster.Monster;

public class Character extends CharacterAbstract{

	//フィールド
	public String name;
	public String job;
	public int hp;
	public int mp;
	public int level;
	public int exp;
	public int attackPower;
	public int defencePower;

	//コンストラクタ	
	public Character(String name) {
		super();
		this.name = name;
		this.level = 1;
		this.exp = 0;
	}

	//インスタンスメソッド
	public void attack(Monster monster) {
		int damage = this.attackPower - monster.defencePower;
		//ダメージが 0より大きかったら、MonsterのHPを減らす
		if (damage > 0) monster.hp -= damage;
	}

	public void greet(String message) {
		System.out.println(message);
	}
	
	public void showStatus() {
		System.out.println("---- Status ----");
		System.out.println("Name: " + this.name);
		System.out.println("Job: " + this.job);
		System.out.println("HP: " + this.hp);
		System.out.println("MP: " + this.mp);
		System.out.println("Lv: " + this.level);
		System.out.println("Exp: " + this.exp);
		System.out.println("Attack: " + this.attackPower);
		System.out.println("Defence: " + this.defencePower);
		System.out.println("--------");
	}

	@Override
	public boolean isAlive() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public void magic(Monster monster, String key) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	
}
