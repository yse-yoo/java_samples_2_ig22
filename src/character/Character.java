package character;

public class Character {

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
	public void greet(String message) {
		System.out.println(message);
	}
	
	public void showStatus() {
		System.out.println("Name: " + this.name);
	}
	
}
