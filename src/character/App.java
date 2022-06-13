package character;

public class App {

	//メインメソッド
	public static void main(String[] args) {
		Wizard wizard = new Wizard("アリス");
		wizard.greet("こんにちは");
		
		Warrior worrior = new Warrior("ボブ");
		worrior.greet("どーも");
	}
	

}
