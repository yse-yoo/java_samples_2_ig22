package zoo;

//サブクラス
public class Cat extends Animal {

	public Cat(String name) {
		super(name);
		setType("cat");
		setCrying("にゃー");

	}

	@Override
	public void walk() {
		String message = getName() + "警戒して歩いています。";
		System.out.println(message);
	}
	
	//単独行動
	public void soloAction() {
		System.out.println("単独行動する");
	}
	
}
