package character;

import monster.Monster;

public class App {

	// メインメソッド
	public static void main(String[] args) {
		Wizard wizard = new Wizard("アリス");
		wizard.greet("こんにちは");
		wizard.showStatus();

		Warrior worrior = new Warrior("ボブ");
		worrior.greet("どーも");
		worrior.showStatus();

		Monster monster = new Monster();
		worrior.attack(monster);

		System.out.println(monster.hp);
		System.out.println(monster.isAlive());

		// キャラクター３人
		Wizard wizard1 = new Wizard("アリス");
		Wizard wizard2 = new Wizard("テリー");
		Warrior warrior1 = new Warrior("ボブ");

		// キャラクターのArray
		Character[] characters = { wizard1, wizard2, warrior1 };

		// モンスター登場
		Monster monster1 = new Monster();
		System.out.println("--- Battle ---");

		// 繰り返し（リピート）処理
		for (Character character : characters) {
			System.out.println(character.name + "の攻撃");
			character.attack(monster1);
			System.out.println(monster1.isAlive());
		}
		
	}

}
