package generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Basket<Apple> appleBasket = new Basket<>(new Apple("ふじ"));
		System.out.println(appleBasket.get().getName());
		
		appleBasket.replace(new Apple("紅玉"));
		System.out.println(appleBasket.get().getName());
		
		// replaceの引数にPeachクラスのインスタンスを渡そうとするとコンパイルエラーとなります。
//		appleBasket.replace(new Peach("黄金桃"));
		
		Basket2<Apple2> appleBasket2 = new Basket2<>(new Apple2("ふじ", 100));
		System.out.println(appleBasket2.get().getName());
		
		Basket2<Apple2> appleBasket3 = new Basket2<>(new Apple2("ふじ", 200));
		Basket2<Peach> peachBasket = new Basket2<>(new Peach("黄金桃", 300));

		appleBasket3.printTotalPrice(); // 「ふじの入った籠は合計300円です」と出力
		peachBasket.printTotalPrice(); // 「黄金桃の入った籠は合計400円です」と出力
		
		// 境界ワイルドカード
//		List<Fruit> fruits = new ArrayList<>();
//		List<Apple2> apples = new ArrayList<>();
		// 以下は説明用の実現不可能なコードです。いずれもコンパイルエラーとなります。
//		fruits = apples // 要素は親子関係にあるが、この代入は成り立たずコンパイルエラー
//		fruits.add(new Peach("黄金桃", 300)); // 上記を許してしまうと、実体がAppleのListなのに別の型の要素を追加できてしまう
		
		List<? extends Fruit> fruits; // 型パラメータとして、Fruitを継承したクラスを指定
		List<Apple2> apples = new ArrayList<>();

		fruits = apples;// コンパイルエラーにならない
		
		List<Integer> intList = new ArrayList<>();
		List<? super Integer> wildCardIntList = new ArrayList<>();
		List<Number> numList = new ArrayList<>();

		wildCardIntList = numList; //OK
//		intList = numList; //コンパイルエラー
		
		// 確認問題2
		Set<Integer> set = new LinkedHashSet<>();
		set.add(1); // OK
//		set.add("Two"); // コンパイルエラー

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Taro"); // OK
		map.put(2, "Hanako"); // OK
//		int value = map.get(0); // コンパイルエラー

	}

}
