package vehicle;

public class Car extends Vehicle {
	private int fuel = 100;
	
	Car(String name, String color) {
		super(name, color);
	}
	
	public void printData() {
		super.printData();
		System.out.println("ガソリン量：" + this.fuel + "L");
	}
	
	public void run(int distance) {
		System.out.println(distance + "km走ります");
		if (distance <= this.fuel) {
			this.distance += distance;
			this.fuel -= distance;
		} else {
			System.out.println("ガソリンが足りません");
		}
		System.out.println("走行距離：" + this.distance + "km");
		System.out.println("ガソリン量：" + this.fuel + "L");
	}
}
