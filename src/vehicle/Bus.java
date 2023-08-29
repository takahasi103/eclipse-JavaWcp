package vehicle;

public class Bus extends Car {
	private int passenger = 0;
	
	Bus(String name, String color) {
		super(name, color);
	}
	
	public int getPassenger() {
		return this.passenger;
	}
	
}
