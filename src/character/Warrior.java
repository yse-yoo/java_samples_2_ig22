package character;

public class Warrior extends Character {

	public Warrior(String name) {
		//スーパークラスのコンストラクタを実行
		super(name);
		this.job = "warrior";
		this.hp = 30;
		this.mp = 0;
		this.attackPower = 10;
		this.defencePower = 8;
	}

}
