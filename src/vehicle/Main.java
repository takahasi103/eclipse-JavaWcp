package vehicle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Car car1 = new Car("自動車", "赤");
		car1.printData();
		
		System.out.println();
		
		Bicycle bicycle1 = new Bicycle("自転車", "青");
		bicycle1.printData();
		
		System.out.println();
		
		System.out.println(car1.getModle());
		car1.run(20);
		car1.charge(10);
		
		System.out.println();
		
		System.out.println(bicycle1.getModle());
		bicycle1.run(10);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("車種:");
		String carModle = scanner.next();
		System.out.print("車の色:");
		String carColor = scanner.next();
		
		System.out.println();
		
		Car car2 = new Car(carModle, carColor);
		car2.printData();
		
		System.out.println("何km走りますか？");
		int carDistance = scanner.nextInt();
		car2.run(carDistance);
		
		car2.checkFuel();
		System.out.println("何L給油しますか?");
		int carFuel = scanner.nextInt();
		car2.charge(carFuel);
		
		System.out.println();
		
		System.out.println("色を変更しますか？[Yes or No]");
		String Answer = scanner.next();
		switch (Answer) {
		case "Yes":
			System.out.println("何色にしますか？");
			String newColor = scanner.next();
			car2.setColor(newColor);
			car2.printData();
			break;
		case "No":
			System.out.println("変更をしません");
			break;
		default:
			System.out.println("YesかNoで選択してください");
			break;
		}

	}

}
