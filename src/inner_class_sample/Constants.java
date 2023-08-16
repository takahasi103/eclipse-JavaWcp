package inner_class_sample;

//	定数クラスを読みやすくする
//	以下の4つを定数化するとします。
//	
//	猫の名前
//	猫の足の本数
//	タコの名前
//	タコの足の本数
//	これを、内部クラスを使わずに定数化します

public class Constants {
	public static final String CAT_NAME = "猫";

	public static final int CAT_LEG_COUNT = 4;

	public static final String OCTOPUS_NAME = "タコ";

	public static final int OCTOPUS_LEG_COUNT = 8;
	
//	この定数を扱うコードは以下の通りです
//	System.out.println(Constants.CAT_NAME);
//	System.out.println(Constants.CAT_LEG_COUNT);
//	System.out.println(Constants.OCTOPUS_NAME);
//	System.out.println(Constants.OCTOPUS_LEG_COUNT);
	
	//内部クラスCatの中に、猫関係の定数を定義
	public static class Cat {
		public static final String NAME = "猫";
		public static final int LEG_COUNT = 4;
	}

  //内部クラスOctopusの中に、タコ関係の定数を定義
	public static class Octopus {
		public static final String NAME = "タコ";
		public static final int LEG_COUNT = 8;
	}
	
//	この定数を扱うコードは以下の通りです。
//	System.out.println(Constants.Cat.NAME);
//	System.out.println(Constants.Cat.LEG_COUNT);
//	System.out.println(Constants.Octopus.NAME);
//	System.out.println(Constants.Octopus.LEG_COUNT);
}

