package zoo;

//サブクラス
public class Dog extends Animal {

	public Dog(String name) {
		super(name);
		this.type = "dog";
		this.crying = "わん";
	}

	//群れで行動する
	public void collectiveAction() {
		System.out.println("集団行動する");
	}
	
}
