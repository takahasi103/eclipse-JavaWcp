package vehicle;

public class Bus extends Car {
	private int passenger = 0;
	private int capacilty;
	private int remainingSeats;
	
	Bus(String name, String color, int capacilty) {
		super(name, color);
		this.capacilty = capacilty;
		this.remainingSeats = capacilty;
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
	
	public int getRemainingSeats() {
		return this.remainingSeats;
	}
	public void setRemainingSeats() {
		this.remainingSeats -= this.passenger;
	}
	
	public void ride(int passenger) {
		if (this.remainingSeats >= passenger) {
			this.setPassenger(passenger);
			this.setRemainingSeats();
			System.out.println("残り" + this.remainingSeats + "人乗車可能です");
		} else {
			int overCapacilty = (this.passenger + passenger) - this.capacilty;
			System.out.println(overCapacilty + "人オーバーです。");
			System.out.println("これ以上乗る事はできません");
		}
	}
	
}
