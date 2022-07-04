package character;

import java.util.ArrayList;

public class App2 {

	public static void main(String[] args) {
		//CRUD
		//C: Create
		//R: Read
		//U: Update
		//D: Delete(Destroy)

		//配列 Array(imutable)
		//Character[] characters;
		
		//リスト(Collection)の定義 (mutable)
		ArrayList<Character> characterList = new ArrayList<>();

		//データ追加 add() => create
		characterList.add(new Wizard("アリス"));
		characterList.add(new Wizard("テリー"));
		characterList.add(new Warrior("ボブ"));

		//繰り返し => read
		for (Character character : characterList) {
			System.out.println(character.name);
		}

		//データの個数: size()
		int dataCount = characterList.size();
		System.out.println(dataCount);
		
		//データの取得: get(index) => read
		Character selectCharacter = characterList.get(1);
		System.out.println(selectCharacter.name);
		
		//最後のデータ削除: remove() => delete
		//最後のインデクスを取得
		int lastIndex = dataCount - 1;
		characterList.remove(lastIndex);

		System.out.println("--- データ削除 ---");
		for (Character character : characterList) {
			System.out.println(character.name);
		}
		

		//データ更新: set() => update
		System.out.println("--- データ更新 ---");
		characterList.set(0, new Warrior("スミス"));
		for (Character character : characterList) {
			System.out.println(character.name);
		}

		//すべて削除
		System.out.println("--- データ全削除 ---");
		characterList.clear();
		dataCount = characterList.size();
		System.out.println(dataCount);	
		
	}

}
