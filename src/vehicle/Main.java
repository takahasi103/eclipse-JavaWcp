package vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Car car1 = new Car("自動車", "赤");
//		car1.printData();
//		
//		System.out.println();
//		
//		Bicycle bicycle1 = new Bicycle("自転車", "青");
//		bicycle1.printData();
//		
//		System.out.println();
//		
//		System.out.println(car1.getModle());
//		car1.run(20);
//		car1.charge(10);
//		
//		System.out.println();
//		
//		System.out.println(bicycle1.getModle());
//		bicycle1.run(10);
		
		Scanner scanner = new Scanner(System.in);
		
//		System.out.print("車種:");
//		String carModle = scanner.next();
//		System.out.print("車の色:");
//		String carColor = scanner.next();
//		
//		System.out.println();
//		
//		Car car2 = new Car(carModle, carColor);
//		car2.printData();
//		
//		System.out.println("何km走りますか？");
//		int carDistance = scanner.nextInt();
//		car2.run(carDistance);
//		
//		car2.checkFuel();
//		System.out.println("何L給油しますか?");
//		int carFuel = scanner.nextInt();
//		car2.charge(carFuel);
//		
//		System.out.println();
//		
//		System.out.println("色を変更しますか？[Yes or No]");
//		String Answer = scanner.next();
//		switch (Answer) {
//		case "Yes":
//			System.out.println("何色にしますか？");
//			String newColor = scanner.next();
//			car2.setColor(newColor);
//			car2.printData();
//			break;
//		case "No":
//			System.out.println("変更をしません");
//			break;
//		default:
//			System.out.println("YesかNoで選択してください");
//			break;
//		}
//		
//		System.out.println("車種を変更しますか？[Yes or No]");
//		Answer = scanner.next();
//		if (Answer.equals("Yes")) {
//			System.out.println("車種を入力してください");
//			String newModle = scanner.next();
//			car2.setModle(newModle);
//			car2.printData();
//		} else if (Answer.equals("No")) {
//			System.out.println("変更をしません");
//		} else {
//			System.out.println("YesかNoで選択してください");
//		}
		
//		Bike bike1 = new Bike("テスト", "黒");
//		bike1.printData();
//		
//		bike1.run(50);
//		bike1.run(60);
//		
//		bike1.checkFuel();
//		
//		bike1.charge(30);
//		bike1.charge(200);
		
//		bike1.changeColor();
//		bike1.changeModle();
		
//		Person person1 = new Person("山田", "太郎", 25);
//		System.out.println("==" + bicycle1.getModle() + "のオーナー情報==");
//		person1.printData();
//		System.out.println("=====================");
//		Person person2 = new Person("ジョン", "F", "ケネディ", 40);
//		person2.printData();
//		
//		person1.buy(bike1);
//		System.out.println("==" + bike1.getModle() + "のオーナー情報==");
//		bike1.getOwner().printData();
		
//		person1.buy(bicycle1);
//		System.out.println(bicycle1.getOwner().getEndurance());
//		bicycle1.run(50);
//		bicycle1.run(60);
//		System.out.println(bicycle1.getOwner().getEndurance());
//		bicycle1.getOwner().charge(600);
//		bicycle1.run(70);
		
//		Bus bus1 = new Bus("大型バス", "緑", 30);
//		bus1.printData();
//		System.out.println("=====================");
//		System.out.println(bus1.getRemainingSeats());
//		bus1.ride(20);
//		bus1.printData();
//		System.out.println("=====================");
//		bus1.ride(20);
//		bus1.printData();
		
//		person1.printData();
//		person1.setWallet(2000);
//		person1.printData();
		
//		Ship ship1 = new Ship("豪華客船", "白", 300);
//		ship1.printData();
//		System.out.println("=====================");
//		System.out.println(ship1.getRemainingSeats());
//		ship1.ride(20);
//		ship1.printData();
//		System.out.println("=====================");
//		ship1.ride(20);
//		ship1.printData();
		
		
//		System.out.println("名前を入力してください");
//		System.out.print("[姓] ");
//		String firstName = scanner.next();
//		System.out.print("[名] ");
//		String lastName = scanner.next();
//		System.out.print("[年齢] ");
//		int age = scanner.nextInt();
//		
//		Person person2 = new Person(firstName, lastName, age);
//		person2.printData();
		
		ArrayList<Person> people = new ArrayList<Person>();
		System.out.println(people);
		
		System.out.print("何人ですか？");
		int n = scanner.nextInt();
	
		for (int i = 1; i <= n; i++) {
			System.out.println("====================");
			System.out.println(i + "人目");
			System.out.print("[姓] ");
			String firstName = scanner.next();
			System.out.print("[名] ");
			String lastName = scanner.next();
			System.out.print("[年齢] ");
			int age = scanner.nextInt();
			
			Person person = new Person(firstName, lastName, age);
			people.add(person);
			person.printData();
		}
		
		System.out.println(people);
		
		
		
		

	}

}
