package character;

import item.Item;

public class App4 {

	public static void main(String[] args) {
		//コンパイルエラー
//		CharacterAbstract character = new CharacterAbstract();
		
		//キャラクター作成
		Wizard wizard = new Wizard("アリス");

		//アイテム作成
		Item item = new Item();
		item.setName("ブロンズナイフ");

		//アイテムを装備
		wizard.equip(item);
	}

}
