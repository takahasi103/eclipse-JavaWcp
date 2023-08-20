package generics;

public class Basket2<E extends Fruit> {
	private E elem;
	private final int PRICE = 100;

	public Basket2(E e) {
	    elem = e;
	}

	public void replace(E e) {
	    elem = e;
	}

	public E get() {
	    return elem;
	}

	public void printName() {
	    // EはFruitのサブクラスなので、getNameが使えると保証されている
	    System.out.println("籠の中身は" + elem.getName() + "です");
	}
	
	public void printTotalPrice() {
	    int totalPrice = PRICE + elem.getPrice();
	    System.out.println(elem.getName() + "の入った籠は合計" + totalPrice + "円です");
	}
}
