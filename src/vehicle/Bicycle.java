package vehicle;

public class Bicycle extends Vehicle {
	Bicycle(String modle, String color) {
		super(modle, color);
	}
	
	final int ADJUSTED_VALUE = 10;
	
	public void run(int distance) {
		System.out.println(distance + "km走ります");
		if ((distance * ADJUSTED_VALUE) <= this.getOwner().getEndurance()) {
			this.distance += distance;
			this.getOwner().setEndurance(this.getOwner().getEndurance() - (distance * ADJUSTED_VALUE));
		} else {
			System.out.println("体力が足りません");
		}
		System.out.println("走行距離：" + this.distance + "km");
	 }
}
