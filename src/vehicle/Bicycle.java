package vehicle;

public class Bicycle extends Vehicle {
	Bicycle(String modle, String color) {
		super(modle, color);
	}
	
	public void run(int distance) {
	    System.out.println(distance + "km走ります");
	    this.distance += distance;
	    System.out.println("走行距離：" + this.distance + "km");
	  }
}
