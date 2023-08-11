package rpg.living.monster;

import rpg.Dice;
import rpg.living.Living;

public abstract class Monster extends Living {

	// コンストラクタ
	public Monster(String name, String weapon) {
		// Livingクラスで定義したコンストラクタを利用する
		super(name, weapon);
	}

	// attackメソッドのオーバーライド
	@Override
	public void attack(Living target) {
		// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
		int num = Dice.get(1, 10);
		int damage = num * getOffensive();
		// 相手のHPをダメージ値だけ減らす
		target.setHp(target.getHp() - damage);
		// コンソールにステータスを表示
		System.out.println(getName() + "が" + getWeapon() + "で攻撃! " + target.getName() + "に" + damage + "のダメージを与えた。");
	}
}
