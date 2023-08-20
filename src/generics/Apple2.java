package generics;

public class Apple2 extends Fruit {
	public Apple2(String name, int price) {
	    super(name, price);
	}

	@Override
	protected String getName() {
	    return name;
	}

	@Override
	protected int getPrice() {
	    return price;
	}
}
