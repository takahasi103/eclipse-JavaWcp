package rpg.living.monsters;

import rpg.Dice;

public class Slime extends Monster {
	public Slime(String name, String weapon) {
		super(name, weapon);
		setHp(Dice.get(70, 130));
		setOffensive(Dice.get(5, 11));
	}
}
