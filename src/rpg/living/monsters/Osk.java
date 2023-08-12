package rpg.living.monsters;

import rpg.Dice;

public class Osk extends Monster {
	public Osk(String name, String weapon) {
		super(name, weapon);
		setHp(Dice.get(170, 230));
		setOffensive(Dice.get(9, 15));
	}
}
