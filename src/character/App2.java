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

		for (Character character : characterList) {
			System.out.println(character.name);
		}

		//データの個数: size()
		int dataCount = characterList.size();
		System.out.println(dataCount);
		
		//データの取得: get(index)
		Character selectCharacter = characterList.get(1);
		System.out.println(selectCharacter.name);
		
		//最後のデータ削除
		//最後のインデクスを取得
		int lastIndex = dataCount - 1;
		characterList.remove(lastIndex);

		System.out.println("--- データ削除 ---");
		for (Character character : characterList) {
			System.out.println(character.name);
		}
		
		//すべて削除
		characterList.clear();
		dataCount = characterList.size();
		System.out.println(dataCount);	
		
	}

}
