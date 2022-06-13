package zoo;

public class App {

	public static void main(String[] args) {
		Cat cat = new Cat("ミケ");
		cat.walk();
		cat.escape();
		
		Dog dog = new Dog("タロー");
		dog.walk();
		dog.escape();
	}

}
