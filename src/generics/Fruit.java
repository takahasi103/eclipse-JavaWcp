package generics;

public abstract class Fruit {
	String name;

	public Fruit(String name) {
	    this.name = name;
	}

	abstract protected String getName();
}
