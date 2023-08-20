package generics;

public class Basket<E> {
	private E elem;

	public Basket(E e) {
		elem = e;
	}

	public void replace(E e) {
	    elem = e;
	}

	public E get() {
	    return elem;
	}
}
