package generics;

public class Apple2 extends Fruit {
	public Apple2(String name) {
	    super(name);
	  }
	
	@Override
	protected String getName() {
		return name;
	}
}
