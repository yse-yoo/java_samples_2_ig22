package character;

import item.Item;
import monster.Monster;

//抽象クラス(Abstract Class)
public abstract class CharacterAbstract {

	//抽象メソッド(Abstract Method)
	public abstract void attack(Monster monster);

	public abstract boolean isAlive();

	public abstract void magic(Monster monster, String key);

	public abstract void equip(Item item);
}
