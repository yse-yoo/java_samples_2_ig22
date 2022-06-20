package zoo;

//サブクラス
public class Dog extends Animal {

	public Dog(String name) {
		super(name);
		this.type = "dog";
		this.crying = "わん";
	}

	//オーバーライド
	@Override
	public void walk() {
		String message = this.name + "が楽しそうに歩いてます。";
		System.out.println(message);
	}
	
	//群れで行動する
	public void collectiveAction() {
		System.out.println("集団行動する");
	}
	
}
