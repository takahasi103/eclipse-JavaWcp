package vehicle;

import java.util.Scanner;

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
	
	Scanner scanner = new Scanner(System.in);
	
	public void changeColor() {
		System.out.println("色を変更しますか？[Yes or No]");
		String Answer = scanner.next();
		switch (Answer) {
		case "Yes":
			System.out.println("何色にしますか？");
			String newColor = scanner.next();
			this.setColor(newColor);
			this.printData();
			break;
		case "No":
			System.out.println("変更をしません");
			break;
		default:
			System.out.println("YesかNoで選択してください");
			this.changeColor();
			break;
		}
	}
}
