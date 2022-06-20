package character;

import java.util.ArrayList;

public class App2 {

	public static void main(String[] args) {
		//配列 Array(imutable)
		//Character[] characters;
		
		//リスト(Collection)の定義 (mutable)
		ArrayList<Character> characterList = new ArrayList<>();

		//データ追加 add()
		characterList.add(new Wizard("アリス"));
		characterList.add(new Wizard("テリー"));
		characterList.add(new Warrior("ボブ"));

	}

}
