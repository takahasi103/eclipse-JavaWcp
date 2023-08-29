package vehicle;

public class Bus extends Car {
	private int passenger = 0;
	private int capacilty = 30;
	
	Bus(String name, String color) {
		super(name, color);
	}
	
	public int getPassenger() {
		return this.passenger;
	}
	
	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}
	
}
