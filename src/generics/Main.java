package generics;

public class Main {

	public static void main(String[] args) {
		Basket<Apple> appleBasket = new Basket<>(new Apple("ふじ"));
		System.out.println(appleBasket.get().getName());
		
		appleBasket.replace(new Apple("紅玉"));
		System.out.println(appleBasket.get().getName());
		
		// replaceの引数にPeachクラスのインスタンスを渡そうとするとコンパイルエラーとなります。
//		appleBasket.replace(new Peach("黄金桃"));
		
		Basket2<Apple2> appleBasket2 = new Basket2<>(new Apple2("ふじ"));
		System.out.println(appleBasket2.get().getName());

	}

}
