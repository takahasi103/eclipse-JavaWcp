package generics;

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

	}

}
