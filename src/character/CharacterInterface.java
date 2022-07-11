package character;

import monster.Monster;

public interface CharacterInterface {

	public void attack(Monster monster);

	public boolean isAlive();

	public void magic(Monster monster, String key);
}
