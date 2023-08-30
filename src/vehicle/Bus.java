package vehicle;

public class Bus extends Car {
	private int passenger = 0;
	private int capacilty;
	private int remainingSeats;
	
	Bus(String name, String color, int capacilty) {
		super(name, color);
		this.capacilty = capacilty;
	}
	
	public void printData() {
		super.printData();
		System.out.println("定員人数:" + this.capacilty + "人");
		System.out.println("乗客数:" + this.passenger + "人");
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
	
	public void ride(int passenger) {
		if (this.capacilty >= passenger) {
			this.setPassenger(passenger);
		} else {
			System.out.println("これ以上乗る事はできません");
		}
	}
	
}
