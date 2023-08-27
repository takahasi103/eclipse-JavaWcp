package vehicle;

public class Bicycle extends Vehicle {
	Bicycle(String modle, String color) {
		super(modle, color);
	}
	
	public void run(int distance) {
		System.out.println(distance + "km走ります");
		if (distance <= this.getOwner().getEndurance()) {
			this.distance += distance;
			this.getOwner().setEndurance(this.getOwner().getEndurance() - distance);
		} else {
			System.out.println("体力が足りません");
		}
		System.out.println("走行距離：" + this.distance + "km");
	  }
}
