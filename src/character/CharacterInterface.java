package character;

import item.Item;
import monster.Monster;

public interface CharacterInterface {

	public void attack(Monster monster);

	public boolean isAlive();

	public void magic(Monster monster, String key);
	
	//アイテムを装備
	public void equip(Item item);

}
