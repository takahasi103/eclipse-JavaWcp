package vehicle;

public abstract class Vehicle {
	private String modle;
	private String color;
	protected int distance = 0;

	Vehicle(String modle, String color) {
		this.modle = modle;
		this.color = color;
	}

	public String getModle() {
		return this.modle;
	}

	public String getColor() {
		return this.color;
	}

	public int getDistance() {
		return this.distance;
	}

	public void setModle(String modle) {
		this.modle = modle;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void printData() {
		System.out.println("車種：" + this.modle);
		System.out.println("色：" + this.color);
		System.out.println("走行距離：" + this.distance + "km");
	}

	public abstract void run(int distance);
}
