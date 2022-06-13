package zoo;

public class App {

	public static void main(String[] args) {
		Cat cat = new Cat("ミケ");
		cat.walk();
		cat.escape();
		cat.cry();
		//Catだけの機能
		cat.soloAction();
		
		Dog dog = new Dog("タロー");
		dog.walk();
		dog.escape();
		dog.cry();
		//Dogだけの機能
		dog.collectiveAction();
	}

}
