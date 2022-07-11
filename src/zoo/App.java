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
		
		
		// Cat & Dog
		Cat cat1 = new Cat("ミケ");
		Cat cat2 = new Cat("シェリー");
		Dog dog1 = new Dog("タロー");
		Dog dog2 = new Dog("マイケル");
		
		
		// AnimalのArray
		Animal[] animals = { cat1, cat2, dog1, dog2 };
		
		//for文で繰り返し
		for (Animal animal : animals) {
			animal.cry();
			animal.walk();
			animal.eat("リンゴ");
		}
	}

}
