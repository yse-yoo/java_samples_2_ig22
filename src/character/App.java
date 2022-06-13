package character;

import monster.Monster;

public class App {

	//メインメソッド
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
	}
	

}
