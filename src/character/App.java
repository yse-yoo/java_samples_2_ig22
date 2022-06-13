package character;

public class App {

	//メインメソッド
	public static void main(String[] args) {
		Wizard wizard = new Wizard("アリス");
		wizard.greet("こんにちは");
		wizard.showStatus();
		
		Warrior worrior = new Warrior("ボブ");
		worrior.greet("どーも");
		worrior.showStatus();
	}
	

}
