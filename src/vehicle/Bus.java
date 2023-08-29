package vehicle;

public class Bus extends Car {
	private int passenger = 0;
	private int capacilty;
	
	Bus(String name, String color, int capacilty) {
		super(name, color);
		this.capacilty = capacilty;
	}
	
	public int getPassenger() {
		return this.passenger;
	}
	
	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}
	
	public int getCapacilty() {
		return this.capacilty;
	}
	
	public void setCapacilty(int capacilty) {
		this.capacilty = capacilty;
	}
	
}
